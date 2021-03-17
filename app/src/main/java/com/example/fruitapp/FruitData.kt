package com.example.fruitapp

object FruitData {
    private val fruitNames = arrayOf("Alpukat",
        "Apel",
        "Delima",
        "Jeruk",
        "Lemon",
        "Mangga",
        "Nanas",
        "Pepaya",
        "Pisang",
        "Stroberi")

    private val fruitDetails = arrayOf("Avokad atau alpukat adalah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.",
    "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan, namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
    "Delima adalah tanaman buah-buahan yang dapat tumbuh hingga 5–8 m. Tanaman ini diperkirakan berasal dari Iran, namun telah lama dikembangbiakkan di daerah Mediterania. Bangsa Moor memberi nama salah satu kota kuno di Spanyol, Granada berdasarkan nama buah ini.",
    "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae. Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis.",
    "Sitrun, jeruk sitrun, atau limun, limau, atau lemon adalah sejenis jeruk yang buahnya biasa dipakai sebagai penyedap dan penyegar dalam banyak seni boga dunia. Pohon berukuran sedang ini dapat mencapai 6 m dan tumbuh di daerah beriklim tropis dan sub-tropis serta tidak tahan akan cuaca dingin.",
    "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dari suku Anacardiaceae. Nama \"mangga\" berasal dari bahasa Tamil, mankay, yang berarti man \"pohon mangga\" + kay \"buah\".",
    "Nanas, nenas, atau ananas adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan. Perawakan tumbuhannya rendah, herba dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal. ",
    "Pepaya, atau betik adalah tumbuhan yang berasal dari Meksiko bagian selatan dan bagian utara dari Amerika Selatan, dan kini menyebar luas dan banyak ditanam di seluruh daerah tropis untuk diambil buahnya. C. papaya adalah satu-satunya jenis dalam genus Carica.",
    "Pisang adalah nama umum yang diberikan pada tumbuhan terna raksasa berdaun besar memanjang dari suku Musaceae. Beberapa jenisnya menghasilkan buah konsumsi yang dinamakan sama. Buah ini tersusun dalam tandan dengan kelompok-kelompok tersusun menjari yang disebut sisir.",
    "Stroberi atau tepatnya stroberi kebun adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria, buah ini berada dalam keluarga Rosaceae.")

    private val fruitImages = intArrayOf(R.drawable.alpukat,
        R.drawable.apel,
        R.drawable.delima,
        R.drawable.jeruk,
        R.drawable.lemon,
        R.drawable.mangga,
        R.drawable.nanas,
        R.drawable.pepaya,
        R.drawable.pisang,
        R.drawable.strawberry)

    val listData: ArrayList<Fruit>
        get() {
            val list = arrayListOf<Fruit>()
            for (position in fruitNames.indices) {
                val fruit = Fruit()
                fruit.name = fruitNames[position]
                fruit.detail = fruitDetails[position]
                fruit.photo = fruitImages[position]
                list.add(fruit)
            }
            return list
        }
}