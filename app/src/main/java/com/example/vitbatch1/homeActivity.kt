package com.example.vitbatch1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homeActivity : AppCompatActivity() {
    //lateinit var brake:Int?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //if(intent.extras !=null) {
            var data = intent.extras?.getString(key:"nkey")
        Log.i(tag: "homeActivity",msg:"data is ="+data)
        val homeTextView:TextView=findViewById(R.id.tyHome)
        homeTextView.setText(data)


    }
}