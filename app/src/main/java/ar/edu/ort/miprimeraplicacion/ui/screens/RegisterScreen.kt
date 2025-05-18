package ar.edu.ort.miprimeraplicacion.ui.screens
/**
 * TODO: document your custom view class.
 */
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import ar.edu.ort.miprimeraplicacion.ui.components.InputField
import ar.edu.ort.miprimeraplicacion.ui.components.PrimaryButton
import ar.edu.ort.miprimeraplicacion.R
import ar.edu.ort.miprimeraplicacion.ui.theme.poppinsFontFamily


@Composable
fun RegisterScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Create Account",
                fontSize = 30.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F41BB)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                "Create an account so you can explore all the existing jobs",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                fontFamily = poppinsFontFamily,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            InputField(label = "Email", value = email, onValueChange = { email = it })
            InputField(
                label = "Password",
                value = password,
                onValueChange = { password = it },
                isPassword = true
            )
            InputField(
                label = "Confirm Password",
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                isPassword = true
            )

            Spacer(modifier = Modifier.height(16.dp))
            PrimaryButton(text = "Sign up", onClick = {

            })

            Spacer(modifier = Modifier.height(16.dp))
            Text("Already have an account", fontSize = 14.sp, color = Color.Black,fontWeight = FontWeight.SemiBold, fontFamily = poppinsFontFamily )

            Spacer(modifier = Modifier.height(16.dp))
            Text("Or continue with", fontSize = 14.sp, color = Color(0xFF1F41BB), fontWeight = FontWeight.SemiBold, fontFamily = poppinsFontFamily)

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                SocialIcon(R.drawable.icono_google)
                SocialIcon(R.drawable.icono_facebook)
                SocialIcon(R.drawable.icono_apple)
            }
        }
    }
}
