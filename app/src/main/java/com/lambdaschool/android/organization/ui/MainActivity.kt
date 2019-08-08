package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.ProductM
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)

    }

    private fun displayProductDetails(productM: ProductM) {

        productName.text = TextUtils.formatProductName(productM.productName)
        productDescription.text= TextUtils.formatProductDescription(productM.productDescription)
        productPrice.text= TextUtils.formatPercent(productM.productPrice)
        productTax.text= TextUtils.formatPercent(productM.productTax)
        productDiscount.text=TextUtils.formatPercent(productM.productDiscount)
        orderDate.text=DateUtils.formatDate(productM.orderDate)

        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields

    }
}
