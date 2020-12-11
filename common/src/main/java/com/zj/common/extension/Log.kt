package com.zj.common.extension

import android.util.Log
import com.zj.common.BuildConfig

/**
 *
 * @Author： zhangjin
 * @Time： 2020/12/11
 * @description：日志调试工具类
 */
private const val VERBOSE = 1
private const val DEBUG = 2
private const val INFO = 3
private const val WARN = 4
private const val ERROR = 5
private const val TAG = "openEyes"
private val level = if (BuildConfig.DEBUG) VERBOSE else WARN

fun logV(tag: String = TAG, msg: String) {
    if (level <= VERBOSE) {
        Log.v(tag, msg)
    }
}

fun logD(tag: String = TAG, msg: String) {
    if (level <= DEBUG) {
        Log.d(tag, msg)
    }
}

fun logI(tag: String = TAG, msg: String) {
    if (level <= INFO) {
        Log.i(tag, msg)
    }
}

fun logW(tag: String = TAG, msg: String) {
    if (level <= WARN) {
        Log.w(tag, msg)
    }
}

fun logE(tag: String = TAG, msg: String) {
    if (level <= ERROR) {
        Log.e(tag, msg)
    }
}