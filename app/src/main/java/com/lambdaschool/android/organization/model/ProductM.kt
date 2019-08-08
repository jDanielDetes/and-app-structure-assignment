package com.lambdaschool.android.organization.model


class ProductM (
    val productName: String= "",
    val productDescription: String= "",
    val productPrice: Double = 23.55,
    val productTax: Double = productPrice * .6,
    val productDiscount: Double = .20
)


    