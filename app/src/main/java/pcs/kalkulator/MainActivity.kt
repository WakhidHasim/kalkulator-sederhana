package pcs.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMultiplication = findViewById<AppCompatButton>(R.id.btnMultiplication)
        val buttonDivision = findViewById<AppCompatButton>(R.id.btnDivision)
        val buttonAddition = findViewById<AppCompatButton>(R.id.btnAddition)
        val buttonReduction = findViewById<AppCompatButton>(R.id.btnReduction)
        val resultValue = findViewById<TextView>(R.id.tvOutputValue)
        val inputFirstValue = findViewById<EditText>(R.id.etInputFirstValue)
        val inputSecondValue = findViewById<EditText>(R.id.etInputSecondValue)

        buttonMultiplication.setOnClickListener{
            val firstValue : Int = inputFirstValue.text.toString().toInt()
            val secondValue : Int = inputSecondValue.text.toString().toInt()

            val result : Int = firstValue * secondValue

            resultValue.setText(result.toString());
        }

        buttonDivision.setOnClickListener{
            val firstValue : Int = inputFirstValue.text.toString().toInt()
            val secondValue : Int = inputSecondValue.text.toString().toInt()

            //  Output Float
            //  val result : Double = firstValue.toDouble() / secondValue.toDouble()

            //  Output Int
            val result = firstValue / secondValue

            resultValue.setText(result.toString());
        }

        buttonAddition.setOnClickListener{
            val firstValue : Int = inputFirstValue.text.toString().toInt()
            val secondValue : Int = inputSecondValue.text.toString().toInt()

            val result : Int = firstValue + secondValue

            resultValue.setText(result.toString());
        }

        buttonReduction.setOnClickListener{
            val firstValue : Int = inputFirstValue.text.toString().toInt()
            val secondValue : Int = inputSecondValue.text.toString().toInt()

            val result : Int = firstValue - secondValue

            resultValue.setText(result.toString());
        }
    }
}
