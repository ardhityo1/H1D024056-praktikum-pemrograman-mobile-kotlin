package com.example.johanesardhityo.data.dummy

import com.example.johanesardhityo.data.model.Category
import com.example.johanesardhityo.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Kategori 1: Makanan (category_id = 1, categories[0])
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik Gurih", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Tempe Mendoan", price = 20000.0, stock = 15, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale Manis", price = 25000.0, stock = 10, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk Khas", price = 30000.0, stock = 40, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Kue Nopia", price = 22000.0, stock = 25, img = "dummy_product"),

        // Kategori 2: Minuman (category_id = 2, categories[1])
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Manis Segar", price = 10000.0, stock = 30, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Es Kuwut", description = "Segar Asam", price = 12000.0, stock = 20, img = "dummy_product"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Hangat", price = 8000.0, stock = 50, img = "dummy_product"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Es Badeg", description = "Khas Banyumas", price = 5000.0, stock = 35, img = "dummy_product"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Kopi Slompret", description = "Kopi Hitam", price = 15000.0, stock = 25, img = "dummy_product"),

        // Kategori 3: Kerajinan (category_id = 3, categories[2])
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain Batik", price = 150000.0, stock = 10, img = "dummy_product"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Ban Jebol", price = 35000.0, stock = 40, img = "dummy_product"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu Lantai", price = 20000.0, stock = 30, img = "dummy_product"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Bambu Anyam", description = "Kerajinan Bambu", price = 45000.0, stock = 15, img = "dummy_product"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Miniatur Ebeg", description = "Kuda Lumping", price = 75000.0, stock = 20, img = "dummy_product")
    )
}