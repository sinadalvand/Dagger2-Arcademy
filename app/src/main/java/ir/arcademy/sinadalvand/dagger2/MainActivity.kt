package ir.arcademy.sinadalvand.dagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ir.arcademy.sinadalvand.dagger2.DaggerApplication.Companion.zcript


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        zcript.decrypt("")

    }
}
