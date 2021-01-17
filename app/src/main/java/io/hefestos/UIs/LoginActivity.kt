package io.hefestos.UIs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.hefestos.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login: Button = findViewById(R.id.btn_login)
        login.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }

        val register: Button = findViewById(R.id.btn_sign_up)
        register.setOnClickListener {
            startActivity(Intent(applicationContext, RegisterActivity::class.java))
        }
    }
}