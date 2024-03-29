package com.tjoeun.a20191201_02_loginbasicpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tjoeun.a20191201_02_loginbasicpractice.datas.UserData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inputId = idEdt.text.toString()
        var inputPw = pwEdt.text.toString()
        loginBtn.setOnClickListener {


//            id : admin => pw123 관리자입니다.  비번이 틀리면 "관리자 비번이 틀렸습니다."

            if (inputId=="admin"){

                if(inputPw=="pw123"){
                    Toast.makeText(this, "관리자입니다.",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"관리자 비번이 틀렸습니다.",Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this,"일반사용자입니다.",Toast.LENGTH_SHORT).show()
            }
        }

        val intent =Intent(this,UserInfoActivity::class.java)
        val loginUser =UserData()
        loginUser.userLoginId=inputId
        loginUser.userLoginPw=inputPw


        intent.putExtra("userData",loginUser)

        intent.putExtra("userId" , inputId)
        intent.putExtra("userPw" , inputPw)
//        intnet.putExtra("userHeight", 123.4)

        startActivity(intent)

    }

}

