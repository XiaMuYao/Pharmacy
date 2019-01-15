package com.xiamuyao.pharmacy.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.net.LL
import com.yzq.zxinglibrary.android.CaptureActivity
import com.yzq.zxinglibrary.common.Constant
import kotlinx.android.synthetic.main.activity_chukuandruku.*
import android.text.format.DateUtils
import android.widget.DatePicker
import android.app.DatePickerDialog
import android.support.v4.app.FragmentActivity
import java.util.*
import android.widget.TimePicker
import android.app.TimePickerDialog
import android.content.Context
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.xiamuyao.pharmacy.bean.down.yaodianxinxidown
import com.xiamuyao.pharmacy.bean.down.yaolinListDown
import com.xiamuyao.pharmacy.bean.up.churukuchaxunUp
import com.xiamuyao.pharmacy.bean.up.huoquyaopinListUp
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_inoroutinfo.*
import kotlinx.android.synthetic.main.layout_title.view.*
import org.jetbrains.anko.sdk27.coroutines.onItemSelectedListener
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


class OutOrInActivity : BaseActivity() {
    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")
    var listString = mutableListOf<String>()
    var list = mutableListOf<yaolinListDown.ContentBean.ProductsBean>()
    var productid = ""
    override fun initParameter() {
    }

    override fun initViewState() {
        if (intent.getStringExtra("type").equals("InStockQuery")) {
            include58.title.text = "入库查询"
            include58.back.setOnClickListener {
                finish()
            }
        } else {
            include58.title.text = "出库查询"
            include58.back.setOnClickListener {
                finish()
            }
        }
    }

    override fun initLintener() {

//        saomiaoerweima.setOnClickListener {
//            startActivityForResult(Intent(this, CaptureActivity::class.java), 1)
//        }

        selectstarttime.setOnClickListener {
            showDialogPick(selectstarttime)
        }

        selectEndTime.setOnClickListener {
            showDialogPick(selectEndTime)
        }
        //去详情界面
        button2.setOnClickListener {
            InOrOutInfoActivity.start(
                this,
                intent.getStringExtra("type"),
                productid,
                selectstarttime.text.toString().trim(),
                selectEndTime.text.toString().trim()
            )
        }
        editText.onItemSelectedListener {
            onItemSelected { adapterView, view, i, l ->
                productid = list[i].productId

            }
        }
    }

    companion object {
        fun start(context: Context, type: String) {
            val starter = Intent(context, OutOrInActivity::class.java)
            starter.putExtra("type", type)
            context.startActivity(starter)
        }
    }

    override fun initData() {

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
                            this@OutOrInActivity,
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

    override fun getlayoutID(): Int {
        return R.layout.activity_chukuandruku
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
//            }
//        }
//
//    }

    private fun showDialogPick(timeText: TextView) {
        val time = StringBuffer()
        //获取Calendar对象，用于获取当前时间
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        //实例化DatePickerDialog对象
        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                //选择完日期后会调用该回调函数
                //因为monthOfYear会比实际月份少一月所以这边要加1
                time.append(year.toString() + "-" + (monthOfYear + 1) + "-" + dayOfMonth)
                //选择完日期后弹出选择时间对话框
                timeText.text = time
            }, year, month, day
        )
        //弹出选择日期对话框
        datePickerDialog.show()
    }


}
