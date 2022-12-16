//NAMA ANGGOTA KELOMPOK :
//1.ABDI MAULANA 21.12.2160
//2.IKA PURWANTI 21.12.2138
//3.DHINA BASTARI ROCHIM 21.12.2132

interface jualbeliemas  {
    var hargapergram :Float
    var jumlahjualbeli : Float
    fun transaksi (hargaperpergram :Float ,jumlahemas :Float,) : Float
    //INTERFACE DIGUNAKAN UNTUK MENJADI CETAKAN UNTUK MEMBUAT CLASS TURUNAN ATAU WARISAN DISINI
    // TERDAPAT BEBERAPA PROPERTIES YAITU VARIABEL HARGAPERGRAM ,JUMLAHJUALBELI DAN FUNGSI TRANSAKSI
}
internal class jualpunyanpwp(override var hargapergram: Float, override var jumlahjualbeli: Float):jualbeliemas{
    override fun transaksi(hargapergram:Float, jumlahemas: Float): Float {

        var hargajual : Float =   hargapergram * jumlahemas
        return hargajual
        //KAMI MENGGUNAKAN VISIBILITY MODIFIER JENIS INTERNAL YAITU CLASS BISA HANYA DIAKSES JIKA BERADA DALAM SATU PROJECT
        //MEMBUAT CLASS JUALPUNYANPWP DARI CETAKAN INTERFACE JUALBELI DAN MEMBUAT BODY DARI FUNGSI TRANSAKSI
    }



}
internal class belipunyanpwp (override var jumlahjualbeli: Float, override var hargapergram: Float, ): jualbeliemas{
    override fun transaksi(hargapergram: Float , jumlahemas: Float):Float {

        var hargabeli : Float=   hargapergram * jumlahemas
        return  hargabeli
        //KAMI MENGGUNAKAN VISIBILITY MODIFIER JENIS INTERNAL YAITU CLASS BISA HANYA DIAKSES JIKA BERADA DALAM SATU PROJECT
        //MEMBUAT CLASS BELIPUNYANPWP DARI CETAKAN INTERFACE JUALBELI DAN MEMBUAT BODY DARI FUNGSI TRANSAKSI
    }


}

internal class belitanpanpwp (override var jumlahjualbeli: Float, override var hargapergram: Float ): jualbeliemas {
    override fun transaksi(hargapergram: Float, jumlahemas: Float): Float {

        var hargabeli:Float = hargapergram * jumlahemas
        return hargabeli
        //KAMI MENGGUNAKAN VISIBILITY MODIFIER JENIS INTERNAL YAITU CLASS BISA HANYA DIAKSES JIKA BERADA DALAM SATU PROJECT
        //MEMBUAT CLASS BELITANPANPWP DARI CETAKAN INTERFACE JUALBELI DAN MEMBUAT BODY DARI FUNGSI TRANSAKSI
    }

}
internal  class jualtanpanpwp (override var jumlahjualbeli:Float, override var hargapergram: Float ): jualbeliemas {
    override fun transaksi(hargapergram: Float, jumlahemas: Float): Float {

        var hargajual:Float = hargapergram * jumlahemas
        return hargajual
        //KAMI MENGGUNAKAN VISIBILITY MODIFIER JENIS INTERNAL YAITU CLASS BISA HANYA DIAKSES JIKA BERADA DALAM SATU PROJECT
        //MEMBUAT CLASS JUALTANPANPWP DARI CETAKAN INTERFACE JUALBELI DAN MEMBUAT BODY DARI FUNGSI TRANSAKSI
    }

}
class jualbeliminimalmaksimal(message:String) :Throwable(message)
//MEMBUAT CLASS EXCEPTION
fun beliminimalmaksimal(jumlahjualbeli: Float){
    if (jumlahjualbeli  < 0.05   ){
        throw jualbeliminimalmaksimal("JUMLAH YANG ANDA INGINKAN TIDAK MEMENUHI SYARAT")
    }
    else if (jumlahjualbeli >= 80 ){
        throw jualbeliminimalmaksimal("JUMLAH YANG ANDA INGINKAN TIDAK MEMENUHI SYARAT")}
    //MEMBUAT FUNGSI BELIMINIMALMAKSIMAL UNTUK MENGECEK APABILA JUMLAHJUALBELI LEBIH KECIL DARI 0.05 ATAU LEBIH DARI 80 MAKA AKAN TERJADI EROR
}

fun jualminimalmaksimal(jumlahjualbeli :Float){
    if(jumlahjualbeli <1 ){
        throw jualbeliminimalmaksimal("JUMLAH YANG ANDA INGINKAN TIDAK MEMENUHI SYARAT")
    }
    else if (jumlahjualbeli>100){
        throw jualbeliminimalmaksimal("JUMLAH YANG ANDA INGINKAN TIDAK MEMENUHI SYARAT")
    }
    //MEMBUAT FUNGSI JUALMINIMALMAKSIMAL UNTUK MENGECEK APABILA JUMLAHJUALBELI LEBIH KECIL DARI 1 ATAU LEBIH DARI 100 MAKA AKAN TERJADI EROR
}



fun main(){
    do {
        println("=====================================")
        println("       PROGRAM JUAL BELI EMAS        ")
        println("=====================================")
        println("Daftar Transaksi")
        println("1.JUAL EMAS")
        println("2.BELI EMAS")
        println("=====================================")
        println("NOTE :")
        println("1.Penjualan minimal 1 gram dan maksimal 100 gram")
        println("2.Pembelian minimal 0,05 gram dan maksimal 80 gram")
        println("=====================================")
        //MENAMPILKAN FITUR  DAN KETENTUAN PROGRAM JUAL BELI EMAS
        println()
        print("PILIH TRANSAKSI YANG INGIN ANDA LAKUKAN      :")
        var pilih = readLine()!!.toInt()
        //MENGINPUTKAN PLILIHAN KE VARIABEL PILIH MENGGUNAKAN READLINE TO INT
        if (pilih == 1) {
            //KAMI MENGGUNAKAN CONTROL FLOW YAITU IF ELSE UNTUK MENETUKAN TRANSAKSI MANA YANG DIINGINKAN USER JIKA VAR PILIH ADALAH 1 MAKA PROGRAM
            //AKAN MEJALANKAN BAGIAN PENJUALAN DAN APABILA VAR PILIH ADALAH 2 MAKA AKAN MENJALANKAN BAGIAN PEMBELIAN
            print("APAKAH ANDA MEMPUNYAI NPWP (y/t)             :")
            var npwp = readLine()!!.toString()
            //MENGINPUTKAN KETERANGAN NPWP APAKAH USER MEMILIKI NPWP ATAU TIDAK
            if (npwp == "y" || npwp == "Y") {
                //JIKA NPWP = Y MAKA OBJECT DARI CLASS JUALPUNYANPWP AKAN DIBUAT YANG DIBUAT DENGAN NAMA TRANSAKSI
                print("MASUKAN JUMLAH EMAS YANG INGIN DIJUAL (GRAM) :")
                try {
                    //TRY DIGUNAKAN UNTUK MENGECEK APAKAH AKAN TERJADI EROR DI BAGIAN BLOK TRY DISINI KITA MENGGUNAKAN FUNGSI JUALMINIMALMAKSIMAL
                    // DENGAN PARAMETER JUMLAHJUALBELI YANG BERTIPE FLOAT
                    var jumlahjualbeli = readLine()!!.toFloat()
                    jualminimalmaksimal(jumlahjualbeli)
                    var hargapergram = 900000
                    var transaksi = jualpunyanpwp(hargapergram.toFloat(), jumlahjualbeli)
                    var hargajual: Float = transaksi.transaksi(hargapergram.toFloat(), jumlahjualbeli)
                    //DISINI KAMI MEMBUAT VARIABEL HARGAJUAL DINISIALISASI DENGAN HASIL DARI FUNGSI TRANSAKSI DARI OBJECT TRANSAKSI DENGAN MEMBAWA
                    // PARAMETER HARGAPERGRAM DAN JUMLAHJUALBELI
                    var pajak: Float = (hargajual * 1.5 / 100).toFloat()
                    //KAMI MEMBUAT VARIABEL PAJAK DINISIALISASI DENGAN HASIL DARI HARGAJUAL  * 1.5/100
                    var hargatotaljual = hargajual - pajak
                    println()
                    println("=======================================")
                    println("            NOTA PENJUALAN             ")
                    println("=======================================")
                    println("Harga Jual      = Rp.${hargajual}")
                    println("Pajak           = Rp.${pajak}")
                    println("Harga Penjualan = Rp.${hargatotaljual}")
                    // DISINI KAMI MENAMPILKAN NOTA PENJUALAN DENGAN MEMANGGIL VARIABEL HARGAJUAL,PAJAK,HARGATOTALJUAL
                } catch (eror: jualbeliminimalmaksimal) {
                    println("TERJADI KESALAHAN ${eror.message}")
                    //CATCH DIGUNAKAN UNTUK MENANGKAP EROR YANG KITA INGINKAN SESUAI EROR YANG TELAH KITA BUAT
                }


            } else if (npwp == "t" || npwp == "T") {
                //JIKA NPWP == T MAKA OBJECT DARI CLASS JUALTANPANPWP AKAN DIBUAT YANG DIBUAT DENGAN NAMA TRANSAKSI
                print("MASUKAN JUMLAH EMAS YANG INGIN DIJUAL (GRAM) :")
                try {
                    //TRY DIGUNAKAN UNTUK MENGECEK APAKAH AKAN TERJADI EROR DI BAGIAN BLOK TRY DISINI KITA MENGGUNAKAN FUNGSI JUALMINIMALMAKSIMAL
                    // DENGAN PARAMETER JUMLAHJUALBELI YANG BERTIPE FLOAT
                    var jumlahjualbeli = readLine()!!.toFloat()
                    jualminimalmaksimal(jumlahjualbeli)
                    var hargapergram = 900000
                    var transaksi = jualtanpanpwp(hargapergram.toFloat(), jumlahjualbeli)
                    var hargajual: Float = transaksi.transaksi(hargapergram.toFloat(), jumlahjualbeli)
                    //DISINI KAMI MEMBUAT VARIABEL HARGAJUAL DINISIALISASI DENGAN HASIL DARI FUNGSI TRANSAKSI DARI OBJECT TRANSAKSI DENGAN MEMBAWA
                    // PARAMETER HARGAPERGRAM DAN JUMLAHJUALBELI
                    var pajak: Float = (hargajual * 3 / 100).toFloat()
                    //KAMI MEMBUAT VARIABEL PAJAK DINISIALISASI DENGAN HASIL DARI HARGAJUAL  * 3/100
                    var hargatotaljual = hargajual - pajak
                    println()
                    println("=======================================")
                    println("            NOTA PENJUALAN             ")
                    println("=======================================")
                    println("Harga Jual      = Rp.${hargajual}")
                    println("Pajak           = Rp.${pajak}")
                    println("Harga Penjualan = Rp.${hargatotaljual}")
                    println("=======================================")
                    // DISINI KAMI MENAMPILKAN NOTA PENJUALAN DENGAN MEMANGGIL VARIABEL HARGAJUAL,PAJAK,HARGATOTALJUAL
                } catch (eror: jualbeliminimalmaksimal) {
                    println("TERJADI KESALAHAN ${eror.message}")
                    //CATCH DIGUNAKAN UNTUK MENANGKAP EROR YANG KITA INGINKAN SESUAI EROR YANG TELAH KITA BUAT
                }


            }
        } else if (pilih == 2) {
            print("APAKAH ANDA MEMPUNYAI NPWP (y/t)             :")
            var npwp = readLine()!!.toString()
            if (npwp == "y" || npwp == "Y") {
                //JIKA NPWP = Y MAKA OBJECT DARI CLASS BELIPUNYANPWP AKAN DIBUAT YANG DIBUAT DENGAN NAMA TRANSAKSI
                print("MASUKAN JUMLAH EMAS YANG INGIN DIBELI (GRAM) :")
                try {
                    //TRY DIGUNAKAN UNTUK MENGECEK APAKAH AKAN TERJADI EROR DI BAGIAN BLOK TRY DISINI KITA MENGGUNAKAN FUNGSI BELIMINIMALMAKSIMAL
                    // DENGAN PARAMETER JUMLAHJUALBELI YANG BERTIPE FLOAT
                    var jumlahjualbeli = readLine()!!.toFloat()
                    beliminimalmaksimal(jumlahjualbeli)
                    var hargapergram = 850000
                    var transaksi = belipunyanpwp(jumlahjualbeli, hargapergram.toFloat())
                    var hargabeli: Float = transaksi.transaksi(hargapergram.toFloat(), jumlahjualbeli)
                    //DISINI KAMI MEMBUAT VARIABEL HARGABELI DINISIALISASI DENGAN HASIL DARI FUNGSI TRANSAKSI DARI OBJECT TRANSAKSI DENGAN MEMBAWA
                    // PARAMETER HARGAPERGRAM DAN JUMLAHJUALBELI
                    var pajak: Float = (hargabeli * 0.45 / 100).toFloat()
                    //KAMI MEMBUAT VARIABEL PAJAK DINISIALISASI DENGAN HASIL DARI HARGABELI  * 0.45/100
                    var hargatotalbeli = hargabeli + pajak
                    println()
                    println("=======================================")
                    println("            NOTA PEMBELIAN             ")
                    println("=======================================")
                    println("Harga Beli      = Rp.${hargabeli}")
                    println("Pajak           = Rp.${pajak}")
                    println("Harga Pembelian = Rp.${hargatotalbeli}")
                    // DISINI KAMI MENAMPILKAN NOTA PENJUALAN DENGAN MEMANGGIL VARIABEL HARGAJUAL,PAJAK,HARGATOTALJUAL
                } catch (eror: jualbeliminimalmaksimal) {
                    println("TERJADI KESALAHAN ${eror.message}")
                    //CATCH DIGUNAKAN UNTUK MENANGKAP EROR YANG KITA INGINKAN SESUAI EROR YANG TELAH KITA BUAT
                }
            } else if ((npwp == "t" || npwp == "T")) {
                //JIKA NPWP = T MAKA OBJECT DARI CLASS BELITANPANPWP AKAN DIBUAT YANG DIBUAT DENGAN NAMA TRANSAKSI
                print("MASUKAN JUMLAH EMAS YANG INGIN DIBELI (GRAM) :")
                try {
                    //TRY DIGUNAKAN UNTUK MENGECEK APAKAH AKAN TERJADI EROR DI BAGIAN BLOK TRY DISINI KITA MENGGUNAKAN FUNGSI BELIMINIMALMAKSIMAL
                    // DENGAN PARAMETER JUMLAHJUALBELI YANG BERTIPE FLOAT
                    var jumlahjualbeli = readLine()!!.toFloat()
                    beliminimalmaksimal(jumlahjualbeli)
                    var hargapergram = 850000
                    var transaksi = belitanpanpwp(jumlahjualbeli, hargapergram.toFloat())
                    var hargabeli: Float = transaksi.transaksi(hargapergram.toFloat(), jumlahjualbeli)
                    //DISINI KAMI MEMBUAT VARIABEL HARGABELI DINISIALISASI DENGAN HASIL DARI FUNGSI TRANSAKSI DARI OBJECT TRANSAKSI DENGAN MEMBAWA
                    // PARAMETER HARGAPERGRAM DAN JUMLAHJUALBELI
                    var pajak: Float = (hargabeli * 0.9 / 100).toFloat()
                    //KAMI MEMBUAT VARIABEL PAJAK DINISIALISASI DENGAN HASIL DARI HARGABELI  * 0.9/100
                    var hargatotalbeli = hargabeli + pajak
                    println()
                    println("=======================================")
                    println("            NOTA PEMBELIAN            ")
                    println("=======================================")
                    println("Harga Beli      = Rp.${hargabeli}")
                    println("Pajak           = Rp.${pajak}")
                    println("Harga Pembelian = Rp.${hargatotalbeli}")
                    // DISINI KAMI MENAMPILKAN NOTA PENJUALAN DENGAN MEMANGGIL VARIABEL HARGAJUAL,PAJAK,HARGATOTALJUAL
                } catch (eror: jualbeliminimalmaksimal) {
                    println("TERJADI KESALAHAN ${eror.message}")
                    //CATCH DIGUNAKAN UNTUK MENANGKAP EROR YANG KITA INGINKAN SESUAI EROR YANG TELAH KITA BUAT
                }
            }


        } else {
            println("PILIHAN ANDA INVALID")
        }
        println()
        print("Apakah anda ingin mengulang program (y/n) : ")
        var ulang = readLine()
        println("---------------------------------------------------")
        println()
    }while (ulang == "y");
}