package cm.zena.jilbabshop.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import cm.zena.jilbabshop.R

class SplashActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        @Suppress("DEPRECATION")
        Handler().postDelayed(
                {
                    // launch the main Activity
                    startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                    finish()// cal this when your activity is done and should be closed
                },
                1500
        )

        //val typeface: Typeface = Typeface.createFromAsset(assets, "montserrat.bold.ttf")

    }
}
