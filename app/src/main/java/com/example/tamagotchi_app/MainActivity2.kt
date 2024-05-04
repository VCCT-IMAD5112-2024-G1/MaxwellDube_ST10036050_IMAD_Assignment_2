package com.example.tamagotchi_app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val FeedBtn: Button = findViewById(R.id.feedBtn)
        val CleanBtn: Button = findViewById(R.id.CleanBtn)
        val PlayBtn: Button = findViewById(R.id.PlayBtn)
        var imageView: ImageView = findViewById(R.id.imageView)
        var hungryCount: TextView = findViewById(R.id.hungerCount)
        val cleanCount: TextView = findViewById(R.id.cleanCount)
        val happyCount: TextView = findViewById(R.id.happyCount)

//These are the declarations for the progress bars
        var hungerPB: ProgressBar = findViewById(R.id.hungerPB)
        var cleanPB: ProgressBar = findViewById(R.id.cleanPB)
        var happyPB: ProgressBar = findViewById(R.id.happyPB)
//Initializing the count for each progress bar
        var hunCount = 0
        var cleCount = 0
        var hapCount = 0
        FeedBtn.setOnClickListener {
            //this line of code displays a specific picture depending on the button pressed
            imageView.setImageResource(R.drawable.eating)

            //everytime this feed button is clicked the progress bar increments by ten until one hundred
            //Once the progress reaches 100 a message is presented to the user in form of a toast
            hungerPB.incrementProgressBy(10)
            if (hunCount != 100) {
                hunCount += 10
                hungryCount.text = hunCount.toString()
            }
            else {
                Toast.makeText(this@MainActivity2, "Noodle can't eat any more!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        CleanBtn.setOnClickListener {
            imageView.setImageResource(R.drawable.wash)
            cleanPB.incrementProgressBy(10)
            if (cleCount != 100) {
                cleCount += 10
                cleanCount.text = cleCount.toString()
            }
            else {
                Toast.makeText(this@MainActivity2, "Noodle is now very Clean!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        PlayBtn.setOnClickListener {
            imageView.setImageResource(R.drawable.play)
            happyPB.incrementProgressBy(10)
            if (hapCount != 100) {
                hapCount += 10
                happyCount.text = hapCount.toString()
            }
            else {
                Toast.makeText(this@MainActivity2, "Noodle is very happy!", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}