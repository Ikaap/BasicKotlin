
fun main(){
    println("Responsi Pra UTS Bahasa Pemrograman I")
    println("PROGRAM OLAH NILAI SEDERHANA")
    println("===============================================")
    println()

    var ulang = true
    while(true){
        print("Masukan nama Anda = ")
        var nama = readLine()
        print("Masukan NIM Anda = ")
        var nim = readLine()
        print("Masukan nilai tugas Anda = ")
        var ntugas = readLine()!!.toDouble()
        print("Masukan nilai responsi Anda = ")
        var nrespon = readLine()!!.toDouble()
        print("Masukan nilai UTS Anda = ")
        var nuts = readLine()!!.toDouble()
        print("Masukan nilai UAS Anda = ")
        var nuas = readLine()!!.toDouble()
        println()

        println("Nama Anda  = $nama")
        println("NIM Anda   = $nim")
        var nilaiangka = hitungnilaiangka(ntugas, nrespon, nuts, nuas)
        println("Nilai angka Anda   = $nilaiangka")
        var nilaihuruf = konversinilaihuruf(nilaiangka)
        println("Nilai huruf Anda   = $nilaihuruf")


        print("Apakah anda ingin mengulang program ini? (Ketik Y = untuk mengulang) = ")
        var aksi = readLine()
        if (aksi != "Y"){
            ulang = false
        }
        println("==============================================================================")
        println()
        println()
    }
}

fun hitungnilaiangka(ntugas:Double, nrespon:Double, nuts:Double, nuas:Double):Double{
    var nilai_angka = (0.15*ntugas)+(0.20*nrespon)+(0.30*nuts)+(0.35*nuas)
    return nilai_angka
}
fun konversinilaihuruf(nilai_angka:Double):String{
    when{
        nilai_angka >=81 && nilai_angka<=100 -> return "A"
        nilai_angka >=61 && nilai_angka<=80 -> return "B"
        nilai_angka >=41 && nilai_angka<=60 -> return "C"
        nilai_angka >=21 && nilai_angka<=40 -> return "D"
        nilai_angka >=0 && nilai_angka<=20 -> return "E"
        else ->return "EROR"
    }
}