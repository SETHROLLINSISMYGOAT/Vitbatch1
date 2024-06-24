package com.example.vitbatch1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier

class MainActivity<Dp> : AppCompatActivity() {
    private fun height(dp: Dp) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            TranslateAppTheme {
                Box {
                    Column(
                        modifier = Modifier
                            .fieldModifiers()

                    )

                }

            }


    }

    private fun Column(modifier: Int) {

    }

}

class TranslateAppTheme(function: @Composable () -> Unit) {

}
