package oop_00000163690_RajaSalomoLumbanTobing.week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)

    val inital = testUser!!.name.substring(0, 1)

    check(inital == "T") { " Test Failed! Initial is wrong."}
    println("Test Passed: Inital is  T")
}