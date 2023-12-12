package singleResponsability.userexample.interfaces

import singleResponsability.userexample.User

interface HttpService {
    fun getUserById(id: Int): User?
}