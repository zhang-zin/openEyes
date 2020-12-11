package com.zj.openeyes.view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.zj.openeyes.R
import com.zj.openeyes.util.TypeFaceUtil
import java.lang.reflect.Type

/**
 * 带有自定义字体的TextView
 *
 * @Author： zhangjin
 * @Time： 2020/12/11
 */
class TypefaceTextView : AppCompatTextView {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, null)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int?) {
        attrs?.let {
            val typeArray = context.obtainStyledAttributes(it, R.styleable.TypefaceTextView, 0, 0)
            val textTypeface = typeArray.getInt(R.styleable.TypefaceTextView_typeface, 0)
            typeface = getTypeface(textTypeface)
            typeArray.recycle()
        }
    }

    companion object {

        fun getTypeface(textTypeface: Int): Typeface = when (textTypeface) {
            TypeFaceUtil.FZLL_TYPEFACE -> TypeFaceUtil.getFzlLTypeface()
            TypeFaceUtil.FZDB1_TYPEFACE -> TypeFaceUtil.getFzdb1Typeface()
            TypeFaceUtil.FUTURA_TYPEFACE -> TypeFaceUtil.getFuturaTypeface()
            TypeFaceUtil.DIN_TYPEFACE -> TypeFaceUtil.getDinTypeface()
            TypeFaceUtil.LOBSTER_TYPEFACE -> TypeFaceUtil.getLobsterTypeface()
            else -> Typeface.DEFAULT
        }
    }
}