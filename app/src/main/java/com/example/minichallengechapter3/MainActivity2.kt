package com.example.minichallengechapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.minichallengechapter3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        intent.getStringExtra("KEY_NAME1")?.let {
            val name1 = intent.getStringExtra("KEY_NAME1")
            val name2 = intent.getStringExtra("KEY_NAME2")
            val usia = intent.getIntExtra("KEY_USIA", 18)
            val alamat = intent.getStringExtra("KEY_ALAMAT")
            binding.textView.text = "Hi My name is $name1 \nyou can call me $name2 \nI am $usia years old \nMy Address : $alamat"
        }

        intent.getStringExtra("KEY_NAME3")?.let {
            val bundle = intent.extras
            val name1 = bundle?.getString("KEY_NAME3")
            val name2 = bundle?.getString("KEY_NAME4")
            val usia = bundle?.getInt("KEY_USIA")
            val alamat = bundle?.getString("KEY_ALAMAT")
            binding.textView.text = "Hi My name is $name1 \nyou can call me $name2 \nI am $usia years old \nMy Address : $alamat"
        }

        intent.getSerializableExtra("PERSON")?.let {
            val person = intent.getSerializableExtra("PERSON") as Person
            binding.textView.text = "Hi My name is ${person.nama_lengkap} \nyou can call me ${person.nama_panggilan} \nI am ${person.usia} years old \nMy Address : ${person.alamat}"
        }

        intent.getParcelableExtra<Data>("DATA")?.let {
            val data = intent.getParcelableExtra<Data>("DATA")
            binding.textView.text = "Hi My name is ${data?.nama_lengkap} \nyou can call me ${data?.nama_panggilan} \nI am ${data?.usia} years old \nMy Address : ${data?.alamat}"
        }
    }
}