package com.cookandroid.zerozone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cookandroid.zerozone.course.CourseFragment
import com.cookandroid.zerozone.databinding.ActivityMainBinding
import com.cookandroid.zerozone.main.StudyFragment
import com.cookandroid.zerozone.mypage.MypageFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomnavigationMain.run{
            setOnItemSelectedListener {
                when(it.itemId){
                    R.id.bottomnavigation_main_study-> {
                        supportFragmentManager.beginTransaction().replace(R.id.framelayout_main, StudyFragment()).commit()
                    }
                    R.id.bottomnavigation_main_course->{
                        supportFragmentManager.beginTransaction().replace(R.id.framelayout_main, CourseFragment()).commit()
                    }
                    R.id.bottomnavigation_main_mypage->{
                        supportFragmentManager.beginTransaction().replace(R.id.framelayout_main, MypageFragment()).commit()
                    }
                }
                true
        }
            selectedItemId=R.id.bottomnavigation_main_study
        }
    }
}