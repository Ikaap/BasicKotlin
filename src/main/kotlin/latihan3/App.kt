/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package latihan3


/**
 *  TODO
 *  Lengkapi fungsi di bawah ini agar dapat mengembalikkan tipe nilai sesuai dengan
 *  parameter yang dilampirkan. Contohnya seperti berikut:
 *
 *  input: checkType(10)
 *  output: "Yes! it's Integer"
 *
 *  Berikut adalah beberapa tipe nilai yang wajib ada.
 *  • Integer
 *  • String
 *  • Boolean
 *  • Double
 *  • List<String>
 *  • Map<String, String>
 *
 */
fun <T> checkType(args: T): String {
    return when(args){
        is Int -> "Yes! it's Integer"
        is String -> "Yes! it's String"
        is Boolean -> "Yes! it's Boolean"
        is Float -> "Yes! it's Float"
        is Double -> "Yes! it's Double"
        is List<*> -> "Yes! it's List"
        is Map<*, *> -> "Yes! it's Map"
        else -> "Argumen tidak dikenali"
    }
}


fun main() {

    println(
        """
        ${checkType(10)}
        ${checkType("Dicoding Indonesia")}
        ${checkType(true)}
        ${checkType(2.1f)}
        ${checkType(listOf("Mawar", "Melati", "Anggrek"))}
        ${checkType(mapOf("Ika" to "Purwanti"))}
    """.trimIndent()
    )
}


