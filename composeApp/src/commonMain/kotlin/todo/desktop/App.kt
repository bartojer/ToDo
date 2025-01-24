// Roger Manzano, Austin Eaquinto, Jeremy Barton

package todo.desktop

import androidx.compose.runtime.*
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.compose.ui.tooling.preview.Preview
import todo.desktop.data.FirestoreToDoRepository
import todo.desktop.domain.ToDoRepository
import todo.desktop.presentation.LoginScreen
//import todo.desktop.presentation.LoginScreen
import todo.desktop.presentation.Screen
import todo.desktop.presentation.ToDoScreen

@Composable
@Preview
fun App(repository: FirestoreToDoRepository = FirestoreToDoRepository()) {
    var isLoggedIn by remember { mutableStateOf(false) }

    if (isLoggedIn) {
        ToDoScreen(repository)
    } else {
        LoginScreen(onLogin = { isLoggedIn = true })
    }

    fun main() = singleWindowApplication {
//        val repository = ToDoRepository()
        App(repository)
    }

//    ToDoScreen(ToDoRepository)
//    LoginScreen()

    // Add other screens here
//    var currentScreen by remember { mutableStateOf<Screen>(Screen.LoginScreen) }
//    when (currentScreen) {
//        is Screen.LoginScreen -> LoginScreen(
//            onNavigateToLogin = { currentScreen = Screen.TodoScreen })
//
//        is Screen.TodoScreen -> ToDoScreen(ToDoRepository)
//    }
}

