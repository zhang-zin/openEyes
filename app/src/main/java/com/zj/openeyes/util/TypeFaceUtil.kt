package com.zj.openeyes.util

import android.graphics.Typeface
import com.zj.openeyes.OpenEyesApplication
import java.lang.RuntimeException

/**
 * 自定义字体工具类
 *
 * @Author： zhangjin
 * @Time： 2020/12/11
 */
object TypeFaceUtil {

    const val FZLL_TYPEFACE = 1

    const val FZDB1_TYPEFACE = 2

    const val FUTURA_TYPEFACE = 3

    const val DIN_TYPEFACE = 4

    const val LOBSTER_TYPEFACE = 5

    private val fzlLTypeface: Typeface? = null

    private val fzdb1Typeface: Typeface? = null

    private val futuraTypeface: Typeface? = null

    private val dinTypeface: Typeface? = null

    private val lobsterTypeface: Typeface? = null

    fun getFzlLTypeface(): Typeface = fzlLTypeface
        ?: try {
            Typeface.createFromAsset(
                OpenEyesApplication.context.assets,
                "fonts/FZLanTingHeiS-L-GB-Regular.TTF"
            )
        } catch (e: RuntimeException) {
            Typeface.DEFAULT
        }

    fun getFzdb1Typeface(): Typeface = fzdb1Typeface
        ?: try {
            Typeface.createFromAsset(
                OpenEyesApplication.context.assets,
                "FZLanTingHeiS-DB1-GB-Regular.TTF"
            )
        } catch (e: RuntimeException) {
            Typeface.DEFAULT
        }

    fun getFuturaTypeface(): Typeface = futuraTypeface
        ?: try {
            Typeface.createFromAsset(
                OpenEyesApplication.context.assets,
                "fonts/Futura-CondensedMedium.ttf"
            )
        } catch (e: RuntimeException) {
            Typeface.DEFAULT
        }

    fun getDinTypeface(): Typeface = dinTypeface
        ?: try {
            Typeface.createFromAsset(
                OpenEyesApplication.context.assets,
                "fonts/DIN-Condensed-Bold.ttf"
            )
        } catch (e: RuntimeException) {
            Typeface.DEFAULT
        }

    fun getLobsterTypeface(): Typeface = lobsterTypeface
        ?: try {
            Typeface.createFromAsset(
                OpenEyesApplication.context.assets,
                "fonts/Lobster-1.4.otf"
            )
        } catch (e: RuntimeException) {
            Typeface.DEFAULT
        }

}