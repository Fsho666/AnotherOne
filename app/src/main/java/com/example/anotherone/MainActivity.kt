package com.example.anotherone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        //ボタンをクリックしたときに行う動作
        rollButton.setOnClickListener {
            //toastを表示
            val toast = Toast.makeText(this, "OK!!", Toast.LENGTH_SHORT)
            toast.show()
            //ブラウザを立ち上げる
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://192.168.1.3/api/websocket/"))
            startActivity(intent)
        }
    }
}