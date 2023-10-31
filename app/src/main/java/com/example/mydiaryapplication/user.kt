package com.example.mydiaryapplication

data class user(
    var userKey: String,
    var userName: String
) {
    constructor(): this("", "")
}
