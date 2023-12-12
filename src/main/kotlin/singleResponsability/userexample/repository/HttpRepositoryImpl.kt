package singleResponsability.userexample.repository

import singleResponsability.userexample.User
import singleResponsability.userexample.interfaces.HttpService

class HttpRepositoryImpl : HttpService {
    override fun getUserById(id: Int): User? {
        return User("Juan", "Perez", "juan.perez@gmail.com")
    }
}