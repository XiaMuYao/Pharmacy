package com.xiamuyao.pharmacy.base

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.WindowManager
import com.gyf.barlibrary.ImmersionBar

/**
 * ================================================
 * 作    者：夏沐尧  Github地址：https://github.com/XiaMuYaoDQX
 * 版    本：1.0
 * 创建日期： 2018/11/14
 * 描    述：
 * 修订历史：
 * ================================================
 */
abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getlayoutID())
        ImmersionBar.with(this)
            .transparentStatusBar()
            .transparentNavigationBar()
            .transparentBar().init()
        initParameter()
        initViewState()
        initLintener()
        initData()

    }

    /**
     * 初始阿虎
     */
    abstract fun initParameter()

    /**
     * 初始View状态
     */
    abstract fun initViewState()

    /**
     * 初始化监听
     */
    abstract fun initLintener()

    /**
     * 初始化数据
     */
    abstract fun initData()


    /**
     * 返回布局Id
     */
    abstract fun getlayoutID(): Int

    override fun onDestroy() {
        super.onDestroy()
        ImmersionBar.with(this).destroy()
    }



}