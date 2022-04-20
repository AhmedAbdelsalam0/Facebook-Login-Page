package com.example.facebook_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), TextWatcher {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgLogo()


    }

    fun imgLogo() {

        imgLogo.visibility =
            View.VISIBLE   // the logo is invisible , so we need it visible when we start the app

        imgLogo.animate()
            .translationYBy(-700f)
            .scaleX(0.8f)
            .scaleY(0.8f)
            .duration = 1000

        etEmail.addTextChangedListener(this)
        etPassword.addTextChangedListener(this)

    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun afterTextChanged(p0: Editable?) {

        btnLogin.isEnabled = etEmail.text.isNotEmpty() && etPassword.text.isNotEmpty()

    }


}