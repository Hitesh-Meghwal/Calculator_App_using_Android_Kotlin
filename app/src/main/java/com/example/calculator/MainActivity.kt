package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.mozilla.javascript.Context
import org.mozilla.javascript.Scriptable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val solutiontext = findViewById<TextView>(R.id.text_one)
        val resultext = findViewById<TextView>(R.id.text_two)

        val plusbtn = findViewById<Button>(R.id.plus_btn)
        val minusbtn = findViewById<Button>(R.id.minus_btn)
        val dividebtn = findViewById<Button>(R.id.divide_btn)
        val multibtn = findViewById<Button>(R.id.multiply_btn)
        val ninebtn = findViewById<Button>(R.id.nine_btn)
        val eightbtn = findViewById<Button>(R.id.eight_btn)
        val sevenbtn = findViewById<Button>(R.id.seven_btn)
        val clearbtn = findViewById<Button>(R.id.clear_btn)
        val sixbtn = findViewById<Button>(R.id.six_btn)
        val fivebtn = findViewById<Button>(R.id.five_btn)
        val fourbtn = findViewById<Button>(R.id.four_btn)
        val openbrckbtn = findViewById<Button>(R.id.openbrck_btn)
        val threebtn = findViewById<Button>(R.id.three_btn)
        val twobtn = findViewById<Button>(R.id.two_btn)
        val onebtn = findViewById<Button>(R.id.one_btn)
        val closebrckbtn = findViewById<Button>(R.id.closebrck_btn)
        val zerobtn = findViewById<Button>(R.id.zero_btn)
        val dotbtn = findViewById<Button>(R.id.dot_btn)
        val powerbtn = findViewById<Button>(R.id.power_btn)
        val equalbtn = findViewById<Button>(R.id.equal_btn)

        var data : String


        plusbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "+"
        }
        minusbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "-"
        }
        dividebtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "/"
        }
        multibtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "*"
        }
        ninebtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "9"
        }
        eightbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "8"
        }
        sevenbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "7"
        }
        clearbtn.setOnClickListener{
            solutiontext.text =""
            resultext.text =""
        }
        sixbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "6"
        }
        fivebtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "5"
        }
        fourbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "4"
        }
        openbrckbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "("
        }
        threebtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data +"3"
        }
        twobtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "2"
        }
        onebtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "1"
        }
        closebrckbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + ")"
        }
        zerobtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data +"0"
        }
        dotbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "."
        }
        powerbtn.setOnClickListener{
            data = solutiontext.text.toString()
            solutiontext.text = data + "%"
        }
        equalbtn.setOnClickListener{
            data = solutiontext.text.toString()
            val rhino = Context.enter()
            rhino.optimizationLevel = -1
            var finalresult =""

            val scriptable: Scriptable = rhino.initStandardObjects()
            finalresult = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString()

            if(finalresult.endsWith(".0")){
                finalresult = finalresult.replace(".0","")
            }
            resultext.text = finalresult


        }



}
}