package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rahul.common.Addition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            var addition = Addition()
            var sum = addition.sum(59, 2)
            Log.w("AAAAAAAA", sum.toString() + "")
            Toast.makeText(this, sum.toString(), Toast.LENGTH_LONG).show()
        }

    }
}