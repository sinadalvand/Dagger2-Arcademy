package ir.arcademy.sinadalvand.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ir.arcademy.sinadalvand.dagger2.DaggerApplication.Companion.zcript

class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        zcript.decrypt("")
    }
    
}
