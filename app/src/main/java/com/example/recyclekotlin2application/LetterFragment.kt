package com.example.recyclekotlin2application

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclekotlin2application.databinding.FragmentLetterBinding

class LetterFragment : Fragment() {

    private lateinit var binding: FragmentLetterBinding
    private var letterList: ArrayList<String> = arrayListOf()
    private lateinit var letterAdapter: LetterAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLetterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setupRecyclerView()
    }

    private fun loadData() {

        letterList.clear()
        for (char in 'A'..'Z') {
            letterList.add(char.toString())
        }
    }

    private fun setupRecyclerView() {
        letterAdapter = LetterAdapter(letterList)
        binding.rvLetter.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = letterAdapter
        }
    }
}
