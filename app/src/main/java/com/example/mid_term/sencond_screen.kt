package com.example.mid_term

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mid_term.databinding.ActivityMainBinding
import com.example.mid_term.databinding.ActivitySencondScreenBinding
import com.example.mid_term.recyclerview.Capital
import com.example.mid_term.recyclerview.CapitalAdapter
import kotlin.random.Random

class sencond_screen : AppCompatActivity() {

    companion object {
        const val KEY_NAME_VALUE = "key_name_value"
        const val KEY_EMAIL_VALUE = "key_email_value"
        const val KEY_PHONE_VALUE = "key_phone_value"
    }
    private lateinit var binding: ActivitySencondScreenBinding


    @OptIn(ExperimentalStdlibApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding= ActivitySencondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showinfo()




        val listCapital = buildList<Capital> {
            add(Capital("Ha Noi"))
            add(Capital("New York"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))
            add(Capital("Ha Noi"))




        }


        binding.listCapital.run{
            layoutManager = LinearLayoutManager(this@sencond_screen)
            setHasFixedSize(true)
            adapter = CapitalAdapter(listCapital)

        }
        }








    private fun showinfo() {
        val phone = intent.getStringExtra(KEY_PHONE_VALUE)
        val name = intent.getStringExtra(KEY_NAME_VALUE)
        val email = intent.getStringExtra(KEY_EMAIL_VALUE)
        binding.textname.text = name
        binding.textemail.text = email
        binding.textphone.text = phone
    }
}