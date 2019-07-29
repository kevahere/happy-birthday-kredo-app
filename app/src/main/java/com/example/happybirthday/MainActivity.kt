package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.happybirthday.BuyAirtime

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
/**might be a point of failure because this does not match project details.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**Called wen the user taps the purchase button*/
    fun buyAirtime(view: View) {
        val intent = Intent(this, BuyAirtime::class.java).apply {
            putExtra(EXTRA_MESSAGE, "Hello Kevin")
        }
        startActivity(intent)
    }

    fun buyBundles(view: View){
        val intent = Intent(this, BuyBundles::class.java).apply {
            putExtra(EXTRA_MESSAGE,  "Hello Kevin")
        }
        startActivity(intent)
    }
}
