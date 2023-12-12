package singleResponsability.userexample.interfaces

import singleResponsability.userexample.User

interface EmailService {
    fun sendEmail(user: User, subject: String, body: String)
}