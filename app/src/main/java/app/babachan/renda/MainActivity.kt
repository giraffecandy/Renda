package app.babachan.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tapCountTextView: TextView = findViewById(R.id.tapCount)
        var tapCountText: Int = 0
        var countTextView:Int = 10
        val timer: CountDownTimer = object :CountDownTimer(10000, 1000){}

        tapButton.setOnClickListener {
            tapCountText += 1
            tapCountTextView.text = tapCountText.toString()
        }

        startButton.setOnClickListener {

            tapCountText == 0
            tapCountTextView.text = tapCountText.toString()
            startButton.isVisible = false


        }
    }
}