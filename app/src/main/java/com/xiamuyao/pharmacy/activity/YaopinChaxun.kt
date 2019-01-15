package com.xiamuyao.pharmacy.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.net.LL
import com.yzq.zxinglibrary.android.CaptureActivity
import com.yzq.zxinglibrary.common.Constant
import kotlinx.android.synthetic.main.activity_kucun_cha_xunone.*
import kotlinx.android.synthetic.main.layout_title.view.*
import org.jetbrains.anko.toast

class YaopinChaxun : BaseActivity() {

    var messageCode = ""
    override fun initParameter() {
    }

    override fun initViewState() {
        include.title.text = "药品查询"
        include.back.setOnClickListener {
            finish()
        }
    }

    override fun initLintener() {
        saomiaoerweima.setOnClickListener {
            startActivityForResult(Intent(this, CaptureActivity::class.java), 1)
        }
        button2.setOnClickListener {
            if (!editText.text.toString().trim().isEmpty()) {

                YaoPinMessageActivity.start(this, editText.text.toString().trim())
            } else {
                toast(
                    "请输入代码"
                )
            }

        }

    }

    override fun initData() {

    }

    override fun getlayoutID(): Int {
        return R.layout.activity_kucun_cha_xunone
    }

    @SuppressLint("ShowToast")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                val content = data.getStringExtra(Constant.CODED_CONTENT)
                LL.d("扫描结果为：$content")
                messageCode = content
                editText.setText(content)
            }
        }

    }
}
