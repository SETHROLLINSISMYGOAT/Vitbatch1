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
        setContent {
            TranslateAppTheme {
                Box {
                    Column(
                        modifier = Modifier
                            .fieldModifiers()
                            .padding()
                    )

                }

        }

    }

    fun Column(modifier: Modifier) {

    }
}

    private fun Column(modifier: Modifier) {
        TODO("Not yet implemented")
    }

    private fun Column(modifier: Modifier) {

    }


}

private fun Int.padding(): Modifier {

}

private fun setContent(function: () -> Unit) {

    }

}

class Colomn(modifier: Any, function: () -> Unit) {

}

class TranslateAppTheme(function: @Composable () -> Unit) {

}
