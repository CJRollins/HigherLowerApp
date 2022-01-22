package com.example.higherlower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.example.higherlower.Randomizer.Randomizer

class MainActivity : AppCompatActivity() {
    private var randomizer = Randomizer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomizer.decideRandom()
    }

    fun guess(v: View){
        val editText: EditText = findViewById(R.id.userGuess)
        if(BuildConfig.DEBUG){
            Log.i("Entered Value: ", editText.text.toString())
            Log.i("Target Number: ", randomizer.choiceNumber.toString())
        }
        randomizer.compare(editText.text.toString().toInt(), this)
    }
}