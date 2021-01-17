package io.hefestos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class SplashScreenActivity : AppCompatActivity() {
    private val parentJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + parentJob)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        coroutineScope.launch(Dispatchers.Main){
            delay(1000)
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }
    }
}