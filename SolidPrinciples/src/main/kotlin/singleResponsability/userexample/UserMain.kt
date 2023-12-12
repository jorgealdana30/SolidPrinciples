package singleResponsability.userexample

import singleResponsability.userexample.repository.HttpRepositoryImpl

fun main(args: Array<String>) {
    //val repoUser = UserRepositoryImpl()
   // val repoEmail = EmailRepositoryImpl()

    //val user = User("Jorge", "Aldana", "jorge@gmail.com")
    //repoEmail.sendEmail(user, "Hola", "Como estás")
    //repoUser.save(user)
    val httpRepo = HttpRepositoryImpl()
    print("Usuario obtenido: ${httpRepo.getUserById(1)}")
}