package singleResponsability.userexample.interfaces

import singleResponsability.userexample.User

interface UserService{
    fun save(user: User): User
    fun findById(id: Int): User?
    fun delete(user: User)
}