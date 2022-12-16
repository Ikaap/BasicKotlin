
fun main(){
    println()
    println("Program Kasir")
    println()
    println("Daftar nama barang yang tersedia")
    println("1. Laptop   - Rp. 11.000.000")
    println("2. Kamera   - Rp. 5.000.000")
    println("3. Notebook - Rp. 7.000.000")
    println("4. Komputer - Rp. 15.000.000")
    println()

    print("Inputkan nama anda : ")
    var nama = readLine()
    print("Anda ingin berbelanja berapa kali ?  ")
    var tanya = readLine()!!.toInt()
    println()

    var jml = 0
    var harga = 0
    var biaya: (Int,Int) -> Int = {jml: Int, harga: Int ->
        jml*harga
    }
    var bayar = biaya(jml,harga)
    var total = 0

    for (x in 1..tanya){
        println("Pilihan ke - $x")
        print("Masukan nomor barang yang akan anda beli : ")
        var barang = readLine()!!.toInt()
        print("ingin membeli berapa ? ")
        var jml = readLine()!!.toInt()
        println("-->")

        if(barang == 1){
            println("Nama barang : Laptop")
            println("  -- Rp. 11.000.000")
            println("  -- $jml buah")
            println()
            harga = 11000000
            bayar = jml * harga
        }
        else if(barang == 2){
            println("Nama barang : Kamera")
            println("  -- Rp. 5.000.000")
            println("  -- $jml buah")
            println()
            harga = 5000000
            bayar = jml * harga
        }
        else if(barang == 3){
            println("Nama barang : Notebook")
            println("  -- Rp. 7.000.000")
            println("  -- $jml buah")
            println()
            harga = 7000000
            bayar = jml * harga
        }
        else if(barang == 4){
            println("Nama barang : Komputer")
            println("  -- Rp. 15.000.000")
            println("  -- $jml buah")
            println()
            harga = 15000000
            bayar = jml * harga
        }
        else{
            println("Nomor barang yang anda masukan tidak tersedia")
            harga = 0
        }
        total = total + bayar
    }
    println("Total biaya anda : $total")
    println()
    println("-- Terima Kasih --")
    println()
    println("21.12.2138 - IKA PURWANTI")
    println("21 S1SI 05 - Bahasa Pemrograman I")

}