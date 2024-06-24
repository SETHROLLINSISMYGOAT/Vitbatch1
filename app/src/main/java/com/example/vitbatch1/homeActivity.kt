package com.example.vitbatch1

import android.content.ClipData.Item
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vitbatch1.database.Item
import com.example.vitbatch1.database.ItemDao
import com.example.vitbatch1.database.ItemRoomDatabase
import com.example.vitbatch1.databinding.ActivityHomeBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,
    AdapterView.OnItemClickListener {
    class HomeActivity<Spinner> : AppCompatActivity() {
        var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"

        lateinit var myListview: ListView
        private lateinit var binding: ActivityHomeBinding
        lateinit var dao: ItemDao

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_home)

            myListview.isClickable = true
            binding = ActivityHomeBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)



            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets

                }


                //get intent which sttarted this activity
                //get the extras from that intent
                //get the string with mykey
                /*  var data = intent.extras?.getString("mykey")
                  Log.i("homeactivity",data.toString())
                  //put the data either in a log or on the textview
                  var homeTextView:TextView = findViewById(R.id.tvHome)
                  homeTextView.setText(data)*/
            }

