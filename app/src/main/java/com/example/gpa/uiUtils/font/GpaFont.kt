package com.example.gpa.uiUtils.font

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.gpa.R

object GpaFont {
    private fun fontWrapper(onSelect: () -> Int): FontFamily =
        FontFamily(Font(onSelect()))

    fun boldFont() =
        fontWrapper {
            R.font.quicksand_bold
        }

    fun regularFont() =
        fontWrapper {
            R.font.quicksand_regular
        }

    fun lightFont() =
        fontWrapper {
            R.font.quicksand_light
        }

    fun mediumFont() =
        fontWrapper {
            R.font.quicksand_medium
        }

    fun semiBoldFont() =
        fontWrapper {
            R.font.quicksand_semi_bold
        }

    fun pacificoRegularFont() =
        fontWrapper {
            R.font.pacifico_regular
        }

}