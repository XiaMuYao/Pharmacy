package com.xiamuyao.pharmacy.activity

import android.annotation.SuppressLint
import android.app.Activity
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.yzq.zxinglibrary.android.CaptureActivity
import android.content.Intent
import com.xiamuyao.pharmacy.R.id.*
import com.xiamuyao.pharmacy.bean.down.yaodianxinxidown
import com.xiamuyao.pharmacy.bean.up.yaodianxinxi
import com.xiamuyao.pharmacy.net.LL
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.StringUtil
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import com.yzq.zxinglibrary.common.Constant
import io.reactivex.Observer
import io.reactivex.disposables.Disposable


class MainActivity : BaseActivity() {
    private var usernameSp: String by SPreference("usernameSp", "")

    override fun initParameter() {
    }

    override fun initViewState() {
    }

    override fun initLintener() {

        //药品查询
        yaopinchaxun.setOnClickListener {

            startActivity(Intent(this@MainActivity, YaopinChaxun::class.java))

        }
        //库存查询
        kucunchaxun.setOnClickListener {
            startActivity(Intent(this@MainActivity, KuCunChaXunActivity::class.java))
        }
        //入库
        yaopinruku.setOnClickListener {
            YaoPinInOrOutActivity.start(this,1)
        }
        //出库
        yaopinchuku.setOnClickListener {
            YaoPinInOrOutActivity.start(this,2)
        }
        //入库查询
        rukuchaxun.setOnClickListener {
            OutOrInActivity.start(this, "InStockQuery")
        }
        //出库查询
        chukuchaxun.setOnClickListener {
            OutOrInActivity.start(this, "OutStockQuery")
        }

    }

    override fun initData() {

        val accountManagerup = yaodianxinxi()
        val contentBean = yaodianxinxi.ContentBean()

        accountManagerup.ownerClass = "AccountManager"
        accountManagerup.opid = "GetTeminalProfile"
        accountManagerup.token = StringUtil.getToken()
        accountManagerup.fromFlag = 1

        contentBean.teminal_id = usernameSp
        contentBean.teminal_type = 1

        accountManagerup.content = contentBean

        RetrofitManager.service.shoujihaodenglu(accountManagerup)
            .compose(SchedulerUtils.ioToMain())
            .subscribe(object : Observer<yaodianxinxidown> {

                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                }

                override fun onNext(t: yaodianxinxidown) {

                    if (t.isIsOK) {
                        textView3.text = t.content.teminal.teminalName
                        textView4.text = t.content.userProfile.mobile
                        address.text = t.content.teminal.address
                    }

                }

            })


    }

    override fun getlayoutID(): Int {
        return R.layout.activity_main
    }

    @SuppressLint("ShowToast")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                val content = data.getStringExtra(Constant.CODED_CONTENT)
                LL.d("扫描结果为：$content")
            }
        }

    }

}