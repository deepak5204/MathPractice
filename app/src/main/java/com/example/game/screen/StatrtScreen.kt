package com.example.game.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.game.R

@Composable
fun ArithmeticIcons() {
   Column(
       modifier = Modifier
           .fillMaxSize()
           .background(Color.White),
       verticalArrangement = Arrangement.spacedBy(16.dp)
   ) {
       Row(
           modifier = Modifier.fillMaxWidth().padding(16.dp),
           horizontalArrangement = Arrangement.spacedBy(16.dp),
           verticalAlignment = Alignment.CenterVertically
       ) {
           Image(
               painter = painterResource(R.drawable.plus),
               contentDescription = "Plus",
           )
           Image(
               painter = painterResource(R.drawable.minus),
               contentDescription = "minus",
           )
       }

       Row(
           modifier = Modifier.fillMaxWidth().padding(16.dp),
           horizontalArrangement = Arrangement.spacedBy(16.dp),
           verticalAlignment = Alignment.CenterVertically
       ) {
           Image(
               painter = painterResource(R.drawable.multiply),
               contentDescription = "multiply",
           )
           Image(
               painter = painterResource(R.drawable.divide),
               contentDescription = "divide",
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
fun PreviewArithmeticIcons() {
    MaterialTheme {
        Surface {
            ArithmeticIcons()
        }
    }
}
