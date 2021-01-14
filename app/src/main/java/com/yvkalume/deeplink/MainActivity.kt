package com.yvkalume.deeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent.data != null) {
            val uri = intent.data
            val params = uri?.pathSegments
            if (params != null && params.size > 0) {
                val id = params[params.size - 1]
                Toast.makeText(baseContext, id,Toast.LENGTH_LONG).show()
            }
        }
    }
}