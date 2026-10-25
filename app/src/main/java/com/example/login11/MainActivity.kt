package com.example.login11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val edPassword: EditText
        get() = findViewById<EditText>(R.id.edt_password)
    val btnIngresar: Button
        get() = findViewById<Button>(R.id.btn_ingresar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar.setOnClickListener {
            val password = edPassword.text.toString().trim()

            if (password == PASSWORD_CORRECTA) {
                startActivity(Intent(this, BienvenidaActivity::class.java))
            } else {
                Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        const val PASSWORD_CORRECTA = "1234"
    }
}
