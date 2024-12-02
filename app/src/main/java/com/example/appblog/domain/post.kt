package com.example.appblog.domain

import com.google.firebase.Timestamp


data class post (val profile_picture: String="",
    val profile_name: String="",
    val post_timestamp: Timestamp?=null,
    val post_image:String="")