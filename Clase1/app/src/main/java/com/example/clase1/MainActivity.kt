package com.example.clase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Example()
        }
    }
}

@Composable
fun Example() {
    var entryText by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("") }
    val nameButton = "Imprimir"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = entryText,
                onValueChange = { newText ->
                    // Solo permitir caracteres numéricos
                    if (newText.all { it.isDigit() }) {
                        entryText = newText
                    }
                },
                label = { Text("Ingrese su número") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = nameButton,
                color = Color.Magenta,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier
                    .clickable {
                        resultText = entryText
                    }
                    .padding(8.dp)
            )
        }

        Spacer(modifier = Modifier.height(40.dp))

        // Caja decorativa para mostrar el resultado
        if (resultText.isNotEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFE0E0E0)) // gris claro
                    .padding(16.dp)
            ) {
                Text(
                    text = "Número ingresado: $resultText",
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}
