package com.example.huanxindemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.hyphenate.EMCallBack
import com.hyphenate.chat.EMClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            EMClient.getInstance().login("123", "123", object : EMCallBack {
                //回调
                override fun onSuccess() {
                    // 将自己服务器返回的环信账号、昵称和头像URL设置到帮助类中。 这样聊天才会显示头像信息
//                    DemoHelper.getInstance().getUserProfileManager().updateCurrentUserNickName(userMsg.nickname);
//                    DemoHelper.getInstance().getUserProfileManager().setCurrentUserAvatar(userMsg.avatar);
//                    DemoHelper.getInstance().setCurrentUserName(userMsg.userId); // 环信Id

                    EMClient.getInstance().groupManager().loadAllGroups()
                    EMClient.getInstance().chatManager().loadAllConversations()
//                    Toast.makeText(this@MainActivity,"登录聊天服务器成功！",Toast.LENGTH_SHORT).show()
                    Log.d("main", "登录聊天服务器成功！")
                }

                override fun onProgress(progress: Int, status: String) {

                }

                override fun onError(code: Int, message: String) {
                    Log.d("main", "登录聊天服务器失败！")
                }
            })
        }
        talk.setOnClickListener {
            startActivity(Intent(this, TalkActivity::class.java))
        }
    }
}
