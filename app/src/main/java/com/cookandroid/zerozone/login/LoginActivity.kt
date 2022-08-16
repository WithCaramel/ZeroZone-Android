package com.cookandroid.zerozone.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.zerozone.MainActivity
import com.cookandroid.zerozone.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginSignup.setOnClickListener {
            val intent= Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        binding.textviewLoingSearchpwd.setOnClickListener{
            val intent=Intent(this, FindPasswordActivity::class.java)
            startActivity(intent)
        }

        binding.btnLoginLogin.setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}