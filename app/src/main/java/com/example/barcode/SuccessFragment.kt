package com.example.barcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class SuccessFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_success, container, false)

        val safeArgs: SuccessFragmentArgs by navArgs()
        val code = safeArgs.code

        v.fragment_success_text_view_code.text = code

        v.fragment_success_button_back_to_scanner.setOnClickListener {
            findNavController().navigateUp()
        }

        return v
    }

}