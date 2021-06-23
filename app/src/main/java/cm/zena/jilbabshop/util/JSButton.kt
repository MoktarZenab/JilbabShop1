package cm.zena.jilbabshop.util

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class JSButton(context: Context, attributeSet: AttributeSet): AppCompatButton (context, attributeSet) {

    init {
        //Call a function to apply the font to components.
        applyFont()
    }

    private fun applyFont() {
        // This is used to get the file from the assets folder and set it to the title textView.
        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "montserrat.bold.ttf")
        setTypeface(typeface)
    }
}