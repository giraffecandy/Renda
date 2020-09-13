package app.babachan.renda

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tapCountTextView: TextView = findViewById(R.id.tapCount)
        var tapCountText: Int = 0
        var countTime: Int = 10
        val timer: CountDownTimer = object : CountDownTimer(10000, 1000) {
            override fun onFinish() {
                startButton.isVisible = true
                tapButton.setBackgroundResource(R.drawable.tap_button)
                countTime = 10
                tapCountText = 0
            }

            override fun onTick(p0: Long) {

                tapButton.setBackgroundResource(R.drawable.tap_button)
                countTime = countTime - 1
                countTimeNumber.text = countTime.toString()
            }
        }

        tapButton.setOnClickListener {
            if (countTime < 10) {
                tapCountText += 1
                tapCountTextView.text = tapCountText.toString()
            }
        }

        startButton.setOnClickListener {

            tapCountTextView.text = tapCountText.toString()
            startButton.isVisible = false

            timer.start()

        }
    }
}