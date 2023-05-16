package com.dersarco.petpalplaces.ui.screens.login.components

import android.util.Log
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.dersarco.petpalplaces.ui.theme.SpecialPurple
import com.dersarco.petpalplaces.ui.theme.quickSandFamily

@Composable
fun MyClickableText() {
    val annotatedString = buildAnnotatedString {
        pushStringAnnotation(tag = "register", annotation = "goToRegister")
        withStyle(
            style = SpanStyle(
                fontWeight = FontWeight.Medium,
                fontFamily = quickSandFamily
            )
        ) {
            append("Don't have an account? ")
        }
        withStyle(
            style = SpanStyle(
                color = SpecialPurple,
                fontWeight = FontWeight.Bold,
                fontFamily = quickSandFamily,
            )
        ) {
            append("Register")
        }
        pop()
    }

    ClickableText(text = annotatedString, onClick = { offSet ->
        annotatedString.getStringAnnotations(tag = "register", start = offSet, end = offSet)
            .firstOrNull()?.let {
                Log.d("registerTag", it.item)
            }
    })
}


@Preview
@Composable
fun MyCliclableTextPrev() {
    MyClickableText()
}