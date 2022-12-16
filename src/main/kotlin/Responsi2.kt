
interface Pegawai {
    var nama : String
    fun hitungTunjanganProyek(jumlah_keterlibatan_proyek : Int) : Int
}

class Desainer (override var nama: String) : Pegawai {
    override fun hitungTunjanganProyek(jumlah_keterlibatan_proyek: Int): Int {
        var bonus = jumlah_keterlibatan_proyek * 500000
        return bonus
    }
}

class Programmer (override var nama : String) : Pegawai{
    override fun hitungTunjanganProyek(jumlah_keterlibatan_proyek: Int): Int {
        var bonus = jumlah_keterlibatan_proyek * 700000
        return bonus
    }
}

fun main(){
    println("--------------------------------------")
    println("PROGRAM HITUNG TUNJANGAN PROYEK PEGAWAI")
    println("--------------------------------------")

    println("Profesi : ")
    println("1. Desainer ")
    println("2. Programmer ")
    println()
    print("Pilih Profesi ( 1 atau 2 )                   = ")
    val profesi = readLine()!!.toString()
    print("Masukkan Nama                                = ")
    val nama = readLine()!!.toString()
    print("Masukkan Jumlah Keterlibatan Proyek          = ")
    val jml = readLine()!!.toString()

    when(profesi){
        "1" -> {
            val designer = Desainer(nama)
            val tunjangan = designer.hitungTunjanganProyek(jml.toInt())
            println("Bonus Designer ${designer.nama} = ${tunjangan}")
        }
        "2" -> {
            val programmer = Programmer(nama)
            val tunjangan = programmer.hitungTunjanganProyek(jml.toInt())
            println("Bonus Programmer ${programmer.nama} = ${tunjangan}")
        }
        else -> {
            println("Anda hanya boleh memasukkan profesi 1 atau 2")
        }
    }
}
