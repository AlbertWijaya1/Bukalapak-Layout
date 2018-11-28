package com.example.christopher.dsc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.christopher.dsc.R.id.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                Home ->{
                }
                BukaMall ->{
                }
                Keranjang -> {
                }
                Transaksi ->{
                }
                Akun -> {
                }
            }
            true
        }
        bottom_navigation.selectedItemId = Home
    }
}
