package com.example.calculadora
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }



//AHora podemoso acceder al los id de xml sin problema


    fun pulsarelboton1(view: View) {
    }
    fun pulsarelboton2(view: View) {}
    fun pulsarelboton3(view: View) {}
    fun pulsarsuma(view: View) {}
    fun pulsarboton7(view: View) {}
    fun signo(view: View) {}
    fun pulsarbotonocho(view: View) {}
    fun pulsarboton9(view: View) {}
    fun multiplicalo(view: View) {}
    fun pulsarboton4(view: View) {}
    fun pulsarboton5(view: View) {}
    fun pulsarboton6(view: View) {}
    fun pulsarelboton0(view: View) {}
    fun dividelo(view: View) {}
    fun ponenlacoma(view: View) {}
    fun igualalo(view: View) {}
    fun patras(view: View) {}

}


