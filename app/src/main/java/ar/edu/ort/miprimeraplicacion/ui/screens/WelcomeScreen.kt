package ar.edu.ort.miprimeraplicacion.ui.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ar.edu.ort.miprimeraplicacion.R
import ar.edu.ort.miprimeraplicacion.ui.components.PrimaryButton
import ar.edu.ort.miprimeraplicacion.ui.components.Screen
import ar.edu.ort.miprimeraplicacion.ui.theme.poppinsFontFamily

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.job_search),
                contentDescription = null,
                modifier = Modifier
                    .width(385.dp)
                    .height(422.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(modifier = Modifier.height(20.dp))

            Text("Discover Your", fontSize = 35.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1F41BB), fontFamily = poppinsFontFamily)
            Text("Dream Job here", fontSize = 35.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1F41BB), fontFamily = poppinsFontFamily)

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Explore all the existing job roles based on your interest and study major",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.SemiBold

            )

            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                PrimaryButton(
                    text = "Login",
                    onClick = {
                        navController.navigate(Screen.Login.route) {
                            popUpTo(Screen.Welcome.route) { inclusive = true }
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                )

                PrimaryButton(
                    text = "Register",
                    onClick = {
                        navController.navigate(Screen.Register.route) {
                            popUpTo(Screen.Welcome.route) { inclusive = true }
                            launchSingleTop = true
                        }
                    },
                    modifier = Modifier.weight(1f)
                )

            }
        }
    }
}

