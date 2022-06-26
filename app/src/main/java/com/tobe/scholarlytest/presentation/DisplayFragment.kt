package com.tobe.scholarlytest.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.tobe.scholarlytest.R
import com.tobe.scholarlytest.databinding.FragmentDisplayBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DisplayFragment : Fragment() {

    private var _binding :FragmentDisplayBinding? = null
    private val binding get() = _binding!!
    private val viewModel: DisplayViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDisplayBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recordRv.apply {

        }
    }
}