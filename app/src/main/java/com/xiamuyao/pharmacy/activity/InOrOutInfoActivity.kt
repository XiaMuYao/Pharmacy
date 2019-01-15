package com.xiamuyao.pharmacy.activity

import android.content.Intent
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.bean.down.OutchaXuBean
import com.xiamuyao.pharmacy.bean.down.inKuchaxunBean
import com.xiamuyao.pharmacy.bean.up.churukuchaxunUp
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_inoroutinfo.*
import kotlinx.android.synthetic.main.layout_title.view.*
import org.jetbrains.anko.toast

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/12/20
 * 描    述：
 * 修订历史：
 * ================================================
 */
class InOrOutInfoActivity : BaseActivity() {
    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")


    override fun initParameter() {

    }

    override fun initViewState() {
    }

    override fun initLintener() {

    }

    companion object {

        fun start(context: OutOrInActivity, type: String, prouductId: String, staettime: String, endtime: String) {
            val starter = Intent(context, InOrOutInfoActivity::class.java)
            starter.putExtra("type", type)
            starter.putExtra("staettime", staettime)
            starter.putExtra("prouductId", prouductId)
            starter.putExtra("endtime", endtime)
            context.startActivity(starter)
        }
    }

    override fun initData() {
        val type = intent.getStringExtra("type")
        val staettime = intent.getStringExtra("staettime")
        val endtime = intent.getStringExtra("endtime")
        val prouductId = intent.getStringExtra("prouductId")

        val accountManagerup = churukuchaxunUp()
        val contentBean = churukuchaxunUp.ContentBean()

        accountManagerup.ownerClass = "ScanManager"
        accountManagerup.opid = type
        accountManagerup.token = token
        accountManagerup.fromFlag = 1

        contentBean.teminal_id = usernameSp

        contentBean.teminal_type = 1

        contentBean.start_date = staettime
        contentBean.end_date = endtime
        contentBean.product_id = prouductId

        accountManagerup.content = contentBean


        if (type.equals("OutStockQuery")) {
            include.title.text = "出库查询"
            include.back.setOnClickListener {
                finish()
            }
            RetrofitManager.service.chuku(accountManagerup)
                .compose(SchedulerUtils.ioToMain())
                .subscribe(object : Observer<OutchaXuBean> {

                    override fun onComplete() {
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(t: OutchaXuBean) {

                        if (t.isIsOK) {
                            yaopinmingcheng.text = t.content.product.productName
                            chaxunshijian.text = t.content.queryPeriod
                            xiugaidewenzi.text = t.content.outNumber.toString()
                        } else {
                            toast(t.errorMessage)
                        }

                    }

                })
        } else {
            include.title.text = "入库查询"
            include.back.setOnClickListener {
                finish()
            }
            RetrofitManager.service.dddddddd(accountManagerup)
                .compose(SchedulerUtils.ioToMain())
                .subscribe(object : Observer<inKuchaxunBean> {

                    override fun onComplete() {
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onNext(t: inKuchaxunBean) {

                        if (t.isIsOK) {
                            yaopinmingcheng.text = t.content.product.productName
                            chaxunshijian.text = t.content.queryPeriod
                            xiugaidewenzi.text = t.content.inNumber.toString()
                        } else {
                            toast(t.errorMessage)
                        }

                    }

                })
        }


    }

    override fun getlayoutID(): Int {
        return R.layout.activity_inoroutinfo
    }

}
