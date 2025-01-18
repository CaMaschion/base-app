package com.camila.baseapp.service

interface SampleService {
    fun getSample(): String
}

class SampleServiceImpl : SampleService {
    override fun getSample(): String {
        return "Hello from Service"
    }
}