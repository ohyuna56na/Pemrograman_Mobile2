package com.oyn.eligibilityapp

class User(val name: String, val email: String, val age: Int) {

    fun getUserInfo(): String {
        return "Nama: $name \nEmail: $email\n Usia: $age"
    }
}