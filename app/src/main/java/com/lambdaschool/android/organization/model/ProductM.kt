package com.lambdaschool.android.organization.model

import java.util.*


class ProductM (
    val productName: String= "",
    val productDescription: String= "",
    val productPrice: Double = 23.55,
    val productTax: Double = productPrice * .6,
    val productDiscount: Double = .20,
    val orderDate: Date= Date()
)


