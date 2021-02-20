package com.example.modulegradleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnAdmin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Seteamos visibilidad dependiendo build compilation
        btnAdmin = findViewById(R.id.btbAdmin)
        btnAdmin.visibility = if (BuildConfig.SHOW_ADMIN_BUTTON) View.VISIBLE else View.GONE
    }
}