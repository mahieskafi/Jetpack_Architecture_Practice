package com.example.jetpackarchitecturepractice.ui.auth

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpackarchitecturepractice.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherFragment : Fragment(R.layout.fragment_launcher) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.register).setOnClickListener {
            navRegistration()
        }

        view.findViewById<TextView>(R.id.login).setOnClickListener {
            navLogin()
        }

        view.findViewById<TextView>(R.id.forgot_password).setOnClickListener {
            navForgotPassword()
        }

        view.findViewById<TextView>(R.id.focusable_view).requestFocus() // reset focus
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)
    }

    private fun navRegistration() {
        findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }

    private fun navForgotPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_forgetPasswordFragment)
    }
}