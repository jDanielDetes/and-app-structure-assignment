package com.lambdaschool.android.organization.util

import java.text.NumberFormat

class TextUtils {
    companion object {
        // TODO: format the currency using NumberFormat.getCurrencyInstance - refer to the docs
        fun formatCurrency(price : Double) : String {
            NumberFormat.getCurrencyInstance()
            return ""
        }

        // TODO: format the percent using NumberFormat.getPercentInstance - refer to the docs
        fun formatPercent(discount : Double) : String {
            NumberFormat.getPercentInstance()
            return ""
        }
    }
}