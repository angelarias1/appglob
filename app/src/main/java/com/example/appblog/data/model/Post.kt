package com.example.appblog.data.model

import com.google.firebase.Timestamp

data class Post(val profile_picture:String="",
    val profile_name:String="",
    val post_timestramp: Timestamp?=null,
    val post_image:String="")
