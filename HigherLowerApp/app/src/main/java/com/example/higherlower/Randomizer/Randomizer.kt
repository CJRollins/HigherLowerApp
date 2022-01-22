package com.example.higherlower.Randomizer

import android.content.Context
import android.widget.Toast

class Randomizer {
    var choiceNumber = 0
    fun decideRandom(){
        choiceNumber = (1..20).shuffled().random()
    }

    fun compare(passedValue: Int, context: Context){
        when {
            passedValue < choiceNumber -> {
                Toast.makeText(context, "Higher!", Toast.LENGTH_SHORT).show()
            }
            passedValue > choiceNumber -> {
                Toast.makeText(context, "Lower!", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(context, "You Got it! Guess again?", Toast.LENGTH_SHORT).show()
                decideRandom()
            }
        }
    }
}