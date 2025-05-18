package ar.edu.ort.miprimeraplicacion.ui.screens

/**
 * TODO: document your custom view class.
 */

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.navigation.NavController
import ar.edu.ort.miprimeraplicacion.ui.components.InputField
import ar.edu.ort.miprimeraplicacion.ui.components.PrimaryButton
import ar.edu.ort.miprimeraplicacion.R
import ar.edu.ort.miprimeraplicacion.ui.theme.poppins
import ar.edu.ort.miprimeraplicacion.ui.theme.poppinsFontFamily


@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
                "Login here",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F41BB),
                fontFamily = poppinsFontFamily
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text("Welcome back you've been missed!", textAlign = TextAlign.Center, color = Color.Black,fontSize = 20.sp,fontFamily = poppinsFontFamily,fontWeight = FontWeight.Medium)

            Spacer(modifier = Modifier.height(24.dp))

            InputField(label = "Email", value = email, onValueChange = { email = it })
            InputField(
                label = "Password",
                value = password,
                onValueChange = { password = it },
                isPassword = true
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Forgot your password?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 4.dp),
                textAlign = TextAlign.End,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F41BB)
            )

            Spacer(modifier = Modifier.height(16.dp))
            PrimaryButton(text = "Sign in", onClick = {
            })

            Spacer(modifier = Modifier.height(16.dp))
            Text("Create new account", fontSize = 14.sp, color = Color(0xFFFFFFFF))

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Or continue with",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F41BB),
                fontFamily = poppinsFontFamily
            )

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
@Composable
fun SocialIcon(resId: Int) {
    IconButton(onClick = { }) {
        Image(painter = painterResource(id = resId), contentDescription = null)
    }
}
