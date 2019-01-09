package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Student {
    @Id
    @GeneratedValue
    private val id: Long? = null
    private val name: String? = null
    private val Address: String? = null
    private val Pincode: Long?= null
    private val Mobileno: String?= null
    private val DeliveryAvailablepincodes:Long?= null
    private val OwnerName:String?= null
}