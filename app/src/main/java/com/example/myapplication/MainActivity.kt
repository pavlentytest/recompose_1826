package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyUI()
        }
    }
}

@Composable
fun MyUI() {
    Box(modifier = Modifier
        .fillMaxSize()
        .border(0.dp, Color.Red)
        .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            var counter = 0
            Button(onClick = { counter++ }) {
                Text(text = stringResource(R.string.click),
                    fontSize = dimensionResource(R.dimen.size1).value.sp
                )
            }
            Text(text = stringResource(R.string.counter, counter),
                fontSize = dimensionResource(R.dimen.size2).value.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PrevMyUI() {
    MyUI()
}


