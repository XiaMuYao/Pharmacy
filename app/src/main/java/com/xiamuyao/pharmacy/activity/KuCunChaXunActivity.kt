package com.xiamuyao.pharmacy.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.R.id.*
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.bean.down.yaolinListDown
import com.xiamuyao.pharmacy.bean.up.huoquyaopinListUp
import com.xiamuyao.pharmacy.net.LL
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import com.yzq.zxinglibrary.android.CaptureActivity
import com.yzq.zxinglibrary.common.Constant
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_kucun_cha_xun.*
import kotlinx.android.synthetic.main.layout_title.view.*
import org.jetbrains.anko.sdk27.coroutines.onItemSelectedListener
import org.jetbrains.anko.toast

class KuCunChaXunActivity : BaseActivity() {

    var listString = mutableListOf<String>()
    var list = mutableListOf<yaolinListDown.ContentBean.ProductsBean>()
    var productid = ""
    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")
    override fun initParameter() {
    }

    override fun initViewState() {
        include.title.text = "库存查询"
        include.back.setOnClickListener {
            finish()
        }
    }

    override fun initLintener() {
//        saomiaoerweima.setOnClickListener {
//            startActivityForResult(Intent(this, CaptureActivity::class.java), 1)
//        }
        button2.setOnClickListener {
            KuCunMessage.start(this, productid)
        }
        editText?.onItemSelectedListener {
            onItemSelected { adapterView, view, i, l ->
                productid = list[i].productId

            }
        }

    }

    override fun initData() {
        getyaopinList()
    }

    override fun getlayoutID(): Int {
        return R.layout.activity_kucun_cha_xun
    }

//    @SuppressLint("ShowToast")
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
//            if (data != null) {
//                val content = data.getStringExtra(Constant.CODED_CONTENT)
//                LL.d("扫描结果为：$content")
//                messageCode = content
//                editText.setText(content)
//
//
//            }
//        }
//
//    }

    fun getyaopinList(): Unit {
        val accountManagerup = huoquyaopinListUp()
        val contentBean = huoquyaopinListUp.ContentBean()

        accountManagerup.ownerClass = "ScanManager"
        accountManagerup.opid = "GetProducts"
        accountManagerup.token = token
        accountManagerup.fromFlag = 1

        contentBean.teminal_id = usernameSp

        contentBean.teminal_type = 1


        accountManagerup.content = contentBean

        RetrofitManager.service.dddddddd(accountManagerup)
            .compose(SchedulerUtils.ioToMain())
            .subscribe(object : Observer<yaolinListDown> {

                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                }

                override fun onNext(t: yaolinListDown) {

                    if (t.isIsOK) {
                        list = t.content.products
                        listString.clear()
                        for (product in t.content.products) {
                            listString.add(product.productName)
                        }
                        val adapter = ArrayAdapter<String>(
                            this@KuCunChaXunActivity,
                            android.R.layout.simple_spinner_item,
                            listString
                        )
                        editText.adapter = adapter

                    } else {
                        toast(t.errorMessage)
                    }

                }

            })
    }


}
