package com.tobe.customUi

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.card.MaterialCardView
import com.tobe.scholarlytest.R

class CustomOptionCard (context: Context, attr: AttributeSet): MaterialCardView(context,attr) {

    init {
          setup(attr)
    }

    private fun setup(attr: AttributeSet){
        inflate(context, R.layout.question_option,this)


        val optionText : TextView = findViewById(R.id.option_letter)
        val answerText : TextView = findViewById(R.id.option_answer)

        val attributes = context.obtainStyledAttributes(attr, R.styleable.OptionView)

       optionText.text = attributes.getString(R.styleable.OptionView_option)
        answerText.text = attributes.getString(R.styleable.OptionView_text)



        attributes.recycle()


    }


}