package com.lambdaschool.android.organization.util

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun formatDate(date: Date) : String {
            val format = SimpleDateFormat("08/08/2019")
            return format.format(date)
        }

        // TODO: Other date formatting util methods here...
    }
}