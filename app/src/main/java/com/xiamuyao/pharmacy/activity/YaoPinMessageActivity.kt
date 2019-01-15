package com.xiamuyao.pharmacy.activity

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import com.bumptech.glide.Glide
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.adapter.yaopinxinxiAdapter
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.bean.down.yaopinchaxundown
import com.xiamuyao.pharmacy.bean.up.yaopinchaxunUP
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_yao_pin_message.*
import org.jetbrains.anko.toast
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kucun_cha_xun.*
import kotlinx.android.synthetic.main.layout_title.view.*


class YaoPinMessageActivity : BaseActivity() {
    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")
    override fun initParameter() {
    }

    override fun initViewState() {
        include2.title.text = "药品信息"
        include2.back.setOnClickListener {
            finish()
        }
    }

    companion object {
        fun start(context: Context,package_code:String){
            val starter = Intent(context,YaoPinMessageActivity::class.java)
            starter.putExtra("package_code",package_code)
            context.startActivity(starter)
        }
    }
    override fun initLintener() {
    }

    override fun initData() {


        val accountManagerup = yaopinchaxunUP()
        val contentBean = yaopinchaxunUP.ContentBean()

        accountManagerup.ownerClass = "ScanManager"
        accountManagerup.opid = "SingleCodeQuery"
        accountManagerup.token = token
        accountManagerup.fromFlag = 1

        contentBean.teminal_id = usernameSp
        contentBean.teminal_type = 1
            contentBean.package_code = intent.getStringExtra("package_code")

        accountManagerup.content = contentBean


        RetrofitManager.service.yaopinchaxun(accountManagerup)
            .compose(SchedulerUtils.ioToMain())
            .subscribe(object : Observer<yaopinchaxundown> {

                override fun onComplete() {
                }

                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                }

                override fun onNext(t: yaopinchaxundown) {

                    if (t.isIsOK) {
                        toast(t.content.stockStatus)
                        val product = t.content.product
                        textView6.text = "【药品名称】 ${product.productName}"
                        textView7.text = "【批准文号】 ${product.approvalNumber}"
                        textView8.text = "【生产企业】 ${product.manufacturer}"
                        textView9.text = "【进口药品注册号】 ${product.registration}"
                        textView10.text = "【规格型号】 ${product.specification}"
                        youxiaoqi.text = "【有效期】 ${product.expiredDate}"
                        Glide.with(this@YaoPinMessageActivity).load(product.productUrl).into(yaopintupian)

                        var madapter = yaopinxinxiAdapter(t.content.tracker, this@YaoPinMessageActivity)
                        yaopinxinxilist.adapter = madapter
                        yaopinxinxilist.layoutManager = LinearLayoutManager(this@YaoPinMessageActivity)

                    } else {
                        toast(t.errorMessage)
                    }

                }

            })

    }

    override fun getlayoutID(): Int {
        return R.layout.activity_yao_pin_message
    }

}
