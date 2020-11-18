package jp.techacademy.hideyuki.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = ""
        button.text = "ボタン"
        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (hour > 2 && hour < 9){
                    textView.text = "おはよう"
                }else if(hour >= 9 && hour < 18){
                    textView.text = "こんちゃ"
                }else{
                    textView.text = "ばんわ"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}