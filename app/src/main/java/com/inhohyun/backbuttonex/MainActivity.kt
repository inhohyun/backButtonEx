package com.inhohyun.backbuttonex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var isDouble = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    //뒤로가기 버튼을 눌렀을때
    override fun onBackPressed() {
        Log.d("MainActivity ", "backbutton")
        //한번씩 클릭하면 앱이 종료되지않고 두 번 연속 클릭하면 앱이 종료되도록

        if (isDouble == true){
            finish()
        }
        isDouble = true

        Toast.makeText(this, "종료하실려면 더블클릭", Toast.LENGTH_SHORT).show()

        //2초 뒤에 자동으로 false로 변환
        Handler().postDelayed({
            isDouble = false
        }, 2000)
    }
}