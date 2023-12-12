package singleResponsability.userexample.repository

import singleResponsability.userexample.User
import singleResponsability.userexample.interfaces.UserService

class UserRepositoryImpl() : UserService {

    override fun save(user: User): User {
        println("Saving user...")
        Thread.sleep(1000)
        println("Saved")
        return user
    }

    override fun findById(id: Int): User? {
        TODO("Not yet implemented")
    }

    override fun delete(user: User) {
        TODO("Not yet implemented")
    }
}