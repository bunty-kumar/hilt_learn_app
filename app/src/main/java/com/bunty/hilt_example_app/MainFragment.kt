package com.bunty.hilt_example_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    @Named("firebase")
    lateinit var userRepository: UserRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        userRepository.saveUser("Bunty kumar", "bunty@123Gmail.com")

        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}