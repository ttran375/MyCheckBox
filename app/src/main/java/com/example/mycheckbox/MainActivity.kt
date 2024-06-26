package com.example.mycheckbox
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assigning id of the submit button
        val b1 : Button = findViewById(R.id.submitButton)
        val c1: CheckBox = findViewById(R.id.checkBox)
        val c2: CheckBox = findViewById(R.id.checkBox2)
        val c3: CheckBox = findViewById(R.id.checkBox3)
        var s1: String
        var s2: String
        var s3: String

        // Actions to be performed
        // when Submit button is clicked
        b1.setOnClickListener{
            if (c1.isChecked)
                s1 = c1.text.toString()
            else
                s1 = ""

            if (c2.isChecked)
                s2 = c2.text.toString()
            else
                s2 = ""
            if (c3.isChecked)
                s3 = c3.text.toString()
            else
                s3 = ""

           val str = s1+s2+s3
            // Display toast message
            Toast.makeText(this,
                "$str Check Box is selected", Toast.LENGTH_SHORT).show()
        }

    }
}
