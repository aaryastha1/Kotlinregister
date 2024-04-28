package com.example.registration

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var imageView: ImageView
    lateinit var textView: TextView
    lateinit var editText: EditText
    lateinit var spinner: Spinner
    var hobbies= arrayOf("Drawing","Dancing","Singing","Travelling","Reading")
    lateinit var button: Button
    lateinit var radioGroup: RadioGroup
    lateinit var radioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView=findViewById(R.id.imageView)
        textView=findViewById(R.id.textView)
        textView=findViewById(R.id.Name)
        textView=findViewById(R.id.password)
        textView=findViewById(R.id.Email)
        textView=findViewById(R.id.hobbies)
        editText=findViewById(R.id.editName)
        editText=findViewById(R.id.Editemail)
        editText=findViewById(R.id.editPassword)
        radioGroup=findViewById(R.id.radiogroup)
        radioButton=findViewById(R.id.Male)
        radioButton=findViewById(R.id.Female)
        spinner=findViewById(R.id.spinner)
        button=findViewById(R.id.button2)
        button.setOnClickListener {
            Toast.makeText(this,"Registration is complete",Toast.LENGTH_LONG)
                .show()
        }
        spinner.onItemSelectedListener=this
        var adapter= ArrayAdapter(this@MainActivity,
            android.R.layout.simple_spinner_item,hobbies)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}