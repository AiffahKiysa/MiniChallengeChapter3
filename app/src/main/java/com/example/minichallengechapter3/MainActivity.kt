package com.example.minichallengechapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.set
import com.example.minichallengechapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.intent.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("KEY_NAME1", binding.namaLengkap.text.toString())
            intent.putExtra("KEY_NAME2", binding.namaPanggilan.text.toString())
            intent.putExtra("KEY_USIA", binding.usia.text.toString())
            intent.putExtra("KEY_ALAMAT", binding.alamat.text.toString())
            startActivity(intent)
        }

        binding.bundle.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()

            bundle.putString("KEY_NAME3", binding.namaLengkap.text.toString())
            bundle.putString("KEY_NAME4", binding.namaPanggilan.text.toString())
            bundle.putInt("KEY_USIA", binding.usia.text.toString().toInt())
            bundle.putString("KEY_ALAMAT", binding.alamat.text.toString())
            intent.putExtras(bundle)
            startActivity(intent)
        }

        binding.serializable.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            val person = Person(binding.namaLengkap.text.toString(), binding.namaPanggilan.text.toString(), binding.usia.text.toString().toInt(), binding.alamat.text.toString())
            intent.putExtra("PERSON", person)
            startActivity(intent)
        }

        binding.parcelable.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            val data = Data(binding.namaLengkap.text.toString(), binding.namaPanggilan.text.toString(), binding.usia.text.toString().toInt(), binding.alamat.text.toString())
            intent.putExtra("DATA", data)
            startActivity(intent)
        }
    }
}
