package io.hefestos.UIs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import io.hefestos.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val cpf: EditText = findViewById(R.id.editText_cpf)
        val cpfChecked: ImageView = findViewById(R.id.imageView_cpf_checked)
        val textWatcher = object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                if(s.toString().length == 11){
                    cpfChecked.visibility = View.VISIBLE
                }else{
                    cpfChecked.visibility = View.GONE
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        cpf.addTextChangedListener(textWatcher)

        val register: Button = findViewById(R.id.btn_register)
        register.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}