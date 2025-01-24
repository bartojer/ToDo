package todo.desktop.presentation

import androidx.compose.runtime.Composable
//import todo.desktop.presentation.LoginScreen
import todo.desktop.presentation.ToDoScreen

sealed class Screen {
//    object LoginScreen : Screen()
    object TodoScreen : Screen()
}