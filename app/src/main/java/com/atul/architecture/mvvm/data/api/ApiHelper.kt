package com.atul.architecture.mvvm.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers() = apiService.getUsers()
}