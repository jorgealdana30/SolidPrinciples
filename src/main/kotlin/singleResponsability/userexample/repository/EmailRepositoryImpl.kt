package singleResponsability.userexample.repository

import singleResponsability.userexample.User
import singleResponsability.userexample.interfaces.EmailService

class EmailRepositoryImpl : EmailService {
    override fun sendEmail(user: User, subject: String, body: String) {
        println("Sending to ${user.nombre}...")
        Thread.sleep(1000)
        println("Sent!")
    }
}