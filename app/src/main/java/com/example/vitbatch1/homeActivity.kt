package com.example.vitbatch1

import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vitbatch1.database.Item
import com.example.vitbatch1.database.ItemDao
import com.example.vitbatch1.database.ItemRoomDatabase
import com.example.vitbatch1.databinding.ActivityHomeBinding
import kotlinx.coroutines.GlobalScope


class HomeActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,
    AdapterView.OnItemClickListener {
    class HomeActivity : AppCompatActivity() {
        var TAG = HomeActivity::class.java.simpleName    //"HomeActivity"
        lateinit var mySpinner: Spinner
        lateinit var myListview:ListView
        private lateinit var binding: ActivityHomeBinding
        lateinit var dao: ItemDao

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_home)
            mySpinner = findViewById(R.id.spinner) //taking handle
            myListview = findViewById(R.id.listView)
            myListview.isClickable = true
            binding = ActivityHomeBinding.inflate(layoutInflater)
            val view = binding.root
            setContentView(view)
            var  database = ItemRoomDatabase.getDatabase(this)
            dao = database.itemDao()

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
                binding.btnDbInsert.setOnClickListener{
                    insertDataDb()
                }

                mySpinner.onItemSelectedListener = this
                myListview.setOnItemClickListener(this)
                //get intent which sttarted this activity
                //get the extras from that intent
                //get the string with mykey
                /*  var data = intent.extras?.getString("mykey")
                  Log.i("homeactivity",data.toString())
                  //put the data either in a log or on the textview
                  var homeTextView:TextView = findViewById(R.id.tvHome)
                  homeTextView.setText(data)*/
            }

            override fun onItemSelected(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
                var item:String = adpater?.getItemAtPosition(position).toString()
                Log.i(TAG, item )
                private fun insertDataDb() {
                    GlobalScope.launch {
                        var item = Item(21,"fruits",11.11,11)
                        dao.insert(item)
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

                override fun onItemClick(adpater: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    var item:String = adpater?.getItemAtPosition(position).toString()
                    Log.i(TAG, item )    }
            }


