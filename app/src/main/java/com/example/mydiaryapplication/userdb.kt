package com.example.mydiaryapplication

import com.google.android.gms.tasks.Task
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class userdb {
    private var databaseReference: DatabaseReference? = null

    init {
        val db = FirebaseDatabase.getInstance()
        databaseReference = db.getReference("user")
    }

    //등록
    fun add(user: user?): Task<Void>{
        return databaseReference!!.push().setValue(user)
    }
}