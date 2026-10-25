package com.example.task1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ProfileActivity : AppCompatActivity() {
    private var isSubscribed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val subscribeButton = findViewById<Button>(R.id.subscribeButton)

        subscribeButton.setOnClickListener {
            isSubscribed = !isSubscribed

            if (isSubscribed) {
                subscribeButton.text = getString(R.string.subscribed)
                subscribeButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_gray))
            } else {
                subscribeButton.text = getString(R.string.subscribe)
                subscribeButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_blue))
            }
        }
    }
}