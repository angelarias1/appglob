package com.example.appblog.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appblog.R
import com.example.appblog.data.model.Post
import com.example.appblog.databinding.FragmentHomeScreenBinding
import com.example.appblog.ui.home.adapter.HomeScreenAdapter
import com.google.firebase.Timestamp

class HomeScreenFragment : Fragment(R.layout.fragment_home_screen) {
    private lateinit var binding: FragmentHomeScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeScreenBinding.bind(view)
        val postList = listOf(Post("https://cdn-icons-png.flaticon.com/512/9131/9131529.png","Angel Arias",
            Timestamp.now(),"https://cdn-icons-png.flaticon.com/512/9131/9131529.png"),
            )
        binding.ryHome.adapter = HomeScreenAdapter(postList)
    }


}
