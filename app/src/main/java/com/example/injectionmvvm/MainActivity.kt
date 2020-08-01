package com.example.injectionmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.injectionmvvm.models.Body
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var body : Body
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as App).getComponent().inject(this)

        body


    }
}