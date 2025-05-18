package ar.edu.ort.miprimeraplicacion.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import ar.edu.ort.miprimeraplicacion.ui.theme.poppinsFontFamily
import androidx.compose.ui.unit.sp as sp

/**
 * TODO: document your custom view class.
 */
@Composable
fun InputField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    isPassword: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(
            text = label,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF626262),
            fontFamily = poppinsFontFamily
        ) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),

        colors = TextFieldDefaults.colors(

        ),

        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None

    )
}
