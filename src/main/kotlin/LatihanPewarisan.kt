
open class User {
    var id : String = "initID"
    var email : String = "initEmail"
    var password : String = "initPassword"
    var no_wa : String = "initWA"

    constructor(id : String, email : String, password : String, no_wa : String){
        this.id = id
        this.email = email
        this.password = password
        this.no_wa = no_wa

    }

    open fun sayHello (){
        println("Hallo email anda ${this.email}")
    }
}

class Mahasiswa (id : String, email : String, password : String, no_wa : String, nim : String ) : User (id, email, password, no_wa){
    var nim : String = nim

    override fun sayHello() {
        println("Hallo Mahasiswa email anda ${this.email}")
    }
}

class Dosen (id :String, email : String, password : String, no_wa : String, nik : String ) : User (id, email, password, no_wa){
    var nik : String = nik

    override fun sayHello() {
        println("Hallo Dosen email anda ${this.email}")
    }
}

fun main(){
    val joko = User ("1","donni@amikom.ac.id", "123456", "08511111111");
    println(joko.id)
    joko.sayHello()
    val siswa = Mahasiswa ("2", "siswa@amikom.ac.id", "123456", "08511111111", "20.12.2000");
    println(siswa.nim)
    siswa.sayHello()
    val dosen = Dosen ("3", "dosen@amikom.ac.id", "123456", "085111111111", "190302253");
    println(dosen.nik)
    dosen.sayHello()
}