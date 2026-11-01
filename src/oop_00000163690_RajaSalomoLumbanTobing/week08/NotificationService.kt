package oop_00000163690_RajaSalomoLumbanTobing.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email !=  null) {

            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} Tidak Memiliki Email")
        }
    }
}