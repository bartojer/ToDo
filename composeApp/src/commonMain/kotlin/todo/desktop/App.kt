// Roger Manzano, Austin Eaquinto, Jeremy Barton

package todo.desktop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.singleWindowApplication
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import todo.desktop.data.FirestoreToDoRepository
import todo.desktop.domain.ToDo
import todo.desktop.domain.ToDoRepository
import todo.desktop.presentation.LoginScreen
//import todo.desktop.presentation.LoginScreen
import todo.desktop.presentation.Screen
import todo.desktop.presentation.ToDoScreen


@Composable
@Preview
fun App() {
    val todoRepository = remember { FirestoreToDoRepository() }
    var isLoggedIn by remember { mutableStateOf(false) }

    if (isLoggedIn) {
        ToDoScreen(todoRepository)
    } else {
        LoginScreen(onLogin = { isLoggedIn = true })
    }
}

//@Composable
//fun ToDoScreen(repository: ToDoRepository) {
//    val scope = rememberCoroutineScope()
//    val todos by repository.getToDos().collectAsState(emptyList())
//
//    Scaffold(
//        topBar = {
//            TopAppBar(title = { Text("To-Do List") })
//        }
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            // Display the to-do list
//            // Austin Eaquinto did much of the following code
//
//            if (todos.isEmpty()) {
//                Text("Your to-do list is empty.")
//            } else {
//                todos.forEachIndexed { index, item ->
//                    Row(
//                        modifier = Modifier.fillMaxWidth(),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Checkbox(
//                            checked = item.done,
//                            onCheckedChange = {
//                                scope.launch { repository.updateToDo(item.copy(done = it)) }
//                            }
//                        )
//                        Spacer(modifier = Modifier.width(8.dp))
//                        Text(
//                            text = item.title,
//                            style = TextStyle(fontSize = 18.sp),
//                            modifier = Modifier.weight(1f)
//                        )
//                        TextButton(onClick = { scope.launch { repository.deleteToDo(item) } }) {
//                            Text("Delete")
//                        }
//                    }
//                }
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Add new to-do item
//            var newItemTitle by remember { mutableStateOf("") }
//            var newItemDescription by remember { mutableStateOf("") }
//            TextField(
//                value = newItemTitle,
//                onValueChange = { newItemTitle = it },
//                label = { Text("New To-Do Item Title") },
//                modifier = Modifier.fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            TextField(
//                value = newItemDescription,
//                onValueChange = { newItemDescription = it },
//                label = { Text("New To-Do Item Description") },
//                modifier = Modifier.fillMaxWidth()
//            )
//            Spacer(modifier = Modifier.height(8.dp))
//            Button(
//                onClick = {
//                    if (newItemTitle.isNotBlank() && newItemDescription.isNotBlank()) {
//                        scope.launch {
//                            repository.addToDo(
//                                ToDo(
//                                id = "", // Generate or handle ID as needed
//                                title = newItemTitle,
//                                description = newItemDescription,
//                                done = false
//                            )
//                            )
//                        }
//                        newItemTitle = ""
//                        newItemDescription = ""
//                    }
//                }
//            ) {
//                Text("Add Item")
//            }
//        }
//    }
//}

fun main() = singleWindowApplication {
    App()
}










//fun App(repository: FirestoreToDoRepository = FirestoreToDoRepository()) {
//    var isLoggedIn by remember { mutableStateOf(false) }
//
//    if (isLoggedIn) {
//        ToDoScreen(repository)
//    } else {
//        LoginScreen(onLogin = { isLoggedIn = true })
//    }
//
//    fun main() = singleWindowApplication {
////        val repository = ToDoRepository()
//        App(repository)
//    }
//}