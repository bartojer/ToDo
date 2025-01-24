// Jeremy Barton

package todo.desktop.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import java.lang.module.ModuleDescriptor


@Composable
fun LoginScreen(
    onLogin: () -> Unit
) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                style = androidx.compose.material.MaterialTheme.typography.h4,
                color = Color(0xFF6200EE)
            )
            Spacer(modifier = Modifier.height(16.dp))
            androidx.compose.material3.TextField(
                modifier = Modifier.fillMaxWidth(),
                value = username,
                onValueChange = { username = it },
                singleLine = true,
                label = { androidx.compose.material3.Text("Username") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            androidx.compose.material3.TextField(
                modifier = Modifier.fillMaxWidth(),
                value = password,
                onValueChange = { password = it },
                label = { androidx.compose.material3.Text("Password") }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { onLogin() },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("Login")
            }
        }
    }
}

//@Composable
//fun LoginScreen(onNavigateToLogin: () -> Unit) {
//    var username by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//
//    Column {
//        TextField(
//            value = username,
//            onValueChange = { username = it },
//            label = { Text("Username") }
//        )
//        TextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Password") },
//            visualTransformation = PasswordVisualTransformation()
//        )
//        Button(onClick = { /* Handle login logic here */ })
//        {
//            Text("Login")
//        }
//    }
//}