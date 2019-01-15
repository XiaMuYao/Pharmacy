package com.xiamuyao.pharmacy.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.bean.down.kucunchaxunDown
import com.xiamuyao.pharmacy.bean.down.yaodianxinxidown
import com.xiamuyao.pharmacy.bean.down.yaolinListDown
import com.xiamuyao.pharmacy.bean.up.huoquyaopinListUp
import com.xiamuyao.pharmacy.bean.up.kucunchaxunUp
import com.xiamuyao.pharmacy.bean.up.yaodianxinxi
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.StringUtil
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import com.xiamuyao.pharmacy.ytli.DateUtil
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_chukuandruku.*
import kotlinx.android.synthetic.main.activity_ku_cun_message.*
import kotlinx.android.synthetic.main.activity_kucun_cha_xun.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_title.view.*
import org.jetbrains.anko.toast

class KuCunMessage : BaseActivity() {

    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")

    override fun initParameter() {
    }

    override fun initViewState() {
        include3.title.text = "库存信息"
        include3.back.setOnClickListener {
            finish()
        }
    }

    override fun initLintener() {
    }

    companion object {
        fun start(context: Context, product_id: String) {
            val starter = Intent(context, KuCunMessage::class.java)
            starter.putExtra("product_id", product_id)
            context.startActivity(starter)
        }
    }

    override fun initData() {


        val accountManagerup = kucunchaxunUp()
        val contentBean = kucunchaxunUp.ContentBean()

        accountManagerup.ownerClass = "ScanManager"
        accountManagerup.opid = "StockQuery"
        accountManagerup.token = token
        accountManagerup.fromFlag = 1

        contentBean.teminal_id = usernameSp
        contentBean.teminal_type = 1
        contentBean.product_id =intent.getStringExtra("product_id")
        contentBean.search_period = DateUtil.getNowDateTime()

        accountManagerup.content = contentBean

        RetrofitManager.service.kucunchaxun(accountManagerup)
            .compose(SchedulerUtils.ioToMain())
            .subscribe(object : Observer<kucunchaxunDown> {
                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onNext(t: kucunchaxunDown) {
                    if (t.isIsOK) {
                        dizhi.text = t.content.teminal.teminalName
                        liang.text = t.content.stockNumber.toString()
                        yaopinmingcheng.text = t.content.product.productName
                    } else {
                        toast(t.errorMessage)
                    }
                }

                override fun onError(e: Throwable) {
                }


            })


    }

    override fun getlayoutID(): Int {
        return R.layout.activity_ku_cun_message
    }


}
