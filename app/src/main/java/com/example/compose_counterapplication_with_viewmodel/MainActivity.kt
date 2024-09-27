package com.example.compose_counterapplication_with_viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.compose_counterapplication_with_viewmodel.ui.theme.Compose_counterapplication_with_viewmodelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_counterapplication_with_viewmodelTheme {
                    Counter()


            }
        }
    }
}

@Composable
fun Counter(model : MyViewModel = viewModel()){

    
    Column (){
        Button(onClick = {
            model.increaseCounter()
        }) {
Text(text = "click me")
        }
        
Text(text = "The Counter is : ${model.count}", fontSize = 42.sp)
        }
    }
