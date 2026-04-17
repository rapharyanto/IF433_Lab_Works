package practice_Mid

interface Userr {
    val name: String
    fun password(pw: String) {
        println("password default") //default implementation
    }
}

interface playing {
    fun play()
}

class Login(): Userr, playing {
    override val name: String = "Rapi"
    override fun password(pw: String){
        val pass = pw
    }

    override fun play() { println("Let's play!!")}
}