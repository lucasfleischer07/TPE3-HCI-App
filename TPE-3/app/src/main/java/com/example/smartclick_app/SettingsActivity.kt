package com.example.smartclick_app

import android.content.DialogInterface
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.smartclick_app.databinding.ActivitySettingsBinding
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

//    TODO: Hardcodeado, estoy hay que cambiarlo por las casas que esten en la API
    private val housesOptions = arrayOf("Casa 1", "Casa 2", "Casa 3")

//    Esto es para que siempre haya alguna seleccionada
    private var defaultHouse = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val buttonHouseSelector = findViewById<View>(R.id.openHouseSelectorButton)
        buttonHouseSelector.setOnClickListener {
            var builderSingle = AlertDialog.Builder(this)
            builderSingle.setTitle(getString(R.string.title_select_house))
            builderSingle.setPositiveButton(getString(R.string.confirm_house_selected), DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(applicationContext, R.string.selected_house, Toast.LENGTH_SHORT).show()
            })
            builderSingle.setNegativeButton(getString(R.string.cancel_house_selected), null)
            builderSingle.setSingleChoiceItems(housesOptions, defaultHouse) {dialog, which ->
                defaultHouse = which
                houseSelected.text = housesOptions[which]
            }
        builderSingle.show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

