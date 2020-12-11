package com.zj.common.ui

import android.content.Intent
import android.os.Bundle
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.gyf.immersionbar.ImmersionBar
import com.zj.common.R
import com.zj.common.extension.logD

/**
 *
 * @Author： zhangjin
 * @Time： 2020/12/11
 * @description：所有activity 的基类
 */
abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    private val TAG = "openEyes" + this.javaClass.simpleName

    lateinit var dataBinding: ViewDataBinding

    /**
     * 判断当前activity是否在前台
     */
    protected var isActive = false

    @LayoutRes
    abstract fun getLayoutID(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logD(TAG, "onCreate")
        dataBinding = DataBindingUtil.setContentView<T>(this, getLayoutID())
        dataBinding.executePendingBindings()
        setStatusBasBackground(R.color.design_default_color_background)
        initView()
    }

    override fun onRestart() {
        super.onRestart()
        logD(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        logD(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        logD(TAG, "onResume")
        isActive = true
    }

    override fun onPause() {
        super.onPause()
        logD(TAG, "onPause")
        isActive = false
    }

    override fun onStop() {
        super.onStop()
        logD(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        logD(TAG, "onDestroy")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        logD(TAG, "onNewIntent")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        logD(TAG, "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        logD(TAG, "onRestoreInstanceState")
    }

    /**
     * 设置状态栏颜色
     */
    fun setStatusBasBackground(@ColorRes statusBarColor: Int) {
        ImmersionBar.with(this)
            .autoNavigationBarDarkModeEnable(true, 0.2f)
            .statusBarColor(statusBarColor)
            .fitsSystemWindows(true)
            .init()
    }

    protected open fun initView() {

    }

}