package com.xiamuyao.pharmacy.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.support.v4.app.ActivityCompat
import com.xiamuyao.pharmacy.R
import com.xiamuyao.pharmacy.base.BaseActivity
import com.xiamuyao.pharmacy.net.RetrofitManager
import com.xiamuyao.pharmacy.net.SPreference
import com.xiamuyao.pharmacy.net.scheduler.SchedulerUtils
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_login.*
import android.view.View
import com.google.gson.Gson
import com.lzy.okgo.OkGo
import com.lzy.okgo.callback.StringCallback
import com.lzy.okgo.model.Response
import com.xiamuyao.pharmacy.bean.down.AccountManagerdown
import com.xiamuyao.pharmacy.bean.down.shoujihaojieshou
import com.xiamuyao.pharmacy.bean.hh
import com.xiamuyao.pharmacy.bean.up.AccountManagerup
import com.xiamuyao.pharmacy.bean.up.SenVerifyCode
import com.xiamuyao.pharmacy.bean.up.shoujihao
import com.xiamuyao.pharmacy.constant.ProjectConstant
import com.xiamuyao.pharmacy.net.LL
import com.xiamuyao.pharmacy.net.StringUtil
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.Callback
import okhttp3.OkHttpClient
import org.jetbrains.anko.db.INTEGER
import org.jetbrains.anko.toast
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class LoginActivity : BaseActivity() {
    private var now = true
    private var token: String by SPreference("token", "")
    private var usernameSp: String by SPreference("usernameSp", "")

    override fun initParameter() {
    }

    override fun initViewState() {
        if (now) {
            textView.text = "用户名"
            mimazu.visibility = View.VISIBLE
            yanzhengmazu.visibility = View.GONE

        } else {
            textView.text = "手机号"
            mimazu.visibility = View.GONE
            yanzhengmazu.visibility = View.VISIBLE
        }
    }

    override fun initLintener() {


        denglu.setOnClickListener {
            //            startActivity(Intent(this@LoginActivity, MainActivity::class.java))

            if (now) {
                val accountManagerup = AccountManagerup()
                val contentBean = AccountManagerup.ContentBean()

                accountManagerup.ownerClass = "AccountManager"
                accountManagerup.opid = "AccountBind"
                accountManagerup.token = StringUtil.getToken()
                accountManagerup.fromFlag = 1

                contentBean.teminal_id = username.text.toString().trim()

                contentBean.password =
                        StringUtil.getPasswor(editText2.text.toString().trim(), System.currentTimeMillis().toString())
                contentBean.username = username.text.toString().trim()


                accountManagerup.content = contentBean

                RetrofitManager.service.login(accountManagerup)
                    .compose(SchedulerUtils.ioToMain())
                    .subscribe(object : Observer<AccountManagerdown> {

                        override fun onComplete() {
                        }

                        override fun onSubscribe(d: Disposable) {
                        }

                        override fun onError(e: Throwable) {
                        }

                        override fun onNext(t: AccountManagerdown) {
                            if (t.isIsOK) {
                                usernameSp = username.text.toString().trim()

                                LL.d("我的token${t.token}")
                                toast(token)
                                token = t.token
                                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                            } else {
                                toast(t.errorMessage)
                            }
                        }

                    })
            } else {
                val shoujihao = shoujihao()
                val contentBean = com.xiamuyao.pharmacy.bean.up.shoujihao.ContentBean()
                shoujihao.ownerClass = "AccountManager"
                shoujihao.opid = "MobileBind"
                shoujihao.token = StringUtil.getToken()
                shoujihao.fromFlag = 1
                contentBean.mobile = username.text.toString().trim()
                contentBean.verify_code = yanzhengma.text.toString().trim()
                contentBean.teminal_id = username.text.toString().trim()
                contentBean.wechat_name = ""

                shoujihao.content = contentBean


                RetrofitManager.service.shoujihaodenglu(shoujihao)
                    .compose(SchedulerUtils.ioToMain())
                    .subscribe(object : Observer<shoujihao> {

                        override fun onComplete() {
                        }

                        override fun onSubscribe(d: Disposable) {
                        }

                        override fun onError(e: Throwable) {
                        }

                        override fun onNext(t: shoujihao) {
                            if (t.isIsOK) {
                                usernameSp = username.text.toString().trim()
                                LL.d("我的token${t.token}")
                                toast(token)
                                token = t.token
                                startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                            } else {
                                toast(t.errorMessage)
                            }
                        }

                    })

            }
        }
        button.setOnClickListener {
            if (username.text.isEmpty()) {
                toast("请输入手机号")
                return@setOnClickListener
            }
            val accountManagerup = SenVerifyCode()
            val contentBean = SenVerifyCode.ContentBean()

            accountManagerup.ownerClass = "AccountManager"
            accountManagerup.opid = "SendVerifyCode"
            accountManagerup.token = StringUtil.getToken()
            accountManagerup.fromFlag = 1

            contentBean.mobile = username.text.toString().trim()


            accountManagerup.content = contentBean

            RetrofitManager.service.fasongshoujihao(accountManagerup)
                .compose(SchedulerUtils.ioToMain())
                .subscribe(object : Observer<shoujihaojieshou> {

                    override fun onComplete() {
                    }

                    override fun onSubscribe(d: Disposable) {
                    }

                    override fun onError(e: Throwable) {
                    }

                    @SuppressLint("ShowToast")
                    override fun onNext(t: shoujihaojieshou) {
                        if (t.isIsOK) {


                            toast("我们正在为您发送验证码")


                            var count_time = 60
                            Observable.interval(0, 1, TimeUnit.SECONDS)
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .take((count_time + 1).toLong())
                                .map { along ->
                                    count_time - along
                                }.doOnSubscribe { button.isClickable = false }
                                .subscribe(object : Observer<Long> {
                                    override fun onComplete() {
                                        button.isClickable = true
                                        button.text = "发送验证码"

                                    }

                                    override fun onSubscribe(d: Disposable) {
                                    }

                                    @SuppressLint("SetTextI18n")
                                    override fun onNext(t: Long) {
                                        button.text = "重获($t)"
                                    }

                                    override fun onError(e: Throwable) {
                                    }

                                })


                        }


                    }

                })


        }
        imageView3.setOnClickListener {
            username.text = null
            yanzhengma.text = null
            editText2.text = null
            now = true
            initViewState()
        }

        imageView4.setOnClickListener {
            username.text = null
            editText2.text = null
            yanzhengma.text = null

            now = false
            initViewState()
        }
    }

    override fun initData() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.CAMERA),
            1
        )

//        OkGo.get<String>("http://47.52.41.206:8009/mobile?accountId=accountId")//
//            .tag(this)
//            .execute(object : StringCallback() {
//                override fun onSuccess(response: Response<String>?) {
//                    var gson = Gson()
//                    val fromJson = gson.fromJson(response?.body(), hh::class.java)
//                    if (fromJson.code != 200) {
//                        Integer.parseInt("12534asd123")
//                    }
//                }
//
//                override fun onError(response: Response<String>?) {
//                    super.onError(response)
//                    Integer.parseInt("12534asd123")
//                }
//
//            })


    }

    override fun getlayoutID(): Int {
        return R.layout.activity_login
    }
}
