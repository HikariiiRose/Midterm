package com.example.hikarii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.hikarii.chars.data
import com.example.hikarii.models.faces
import com.example.hikarii.ui.theme.HikariiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HikariiTheme {
                persona()
            }
        }
    }

 @Composable
    fun persona(){ //name of the app//
        series(
            charlist = data().a()
        )


    }
}


@Composable
fun charCard(chars: faces.Companion, modifier: Modifier = Modifier){
    Card (modifier = modifier){
        Column {
            Image(
                painter = painterResource(faces.imageResourceId),
                contentDescription = stringResource(faces.stringResourceId),
            )
            Text(
                text = LocalContext.current.getString(faces.stringResourceId), // string resource id in sports.kt
                modifier = Modifier.padding(7.dp), // padding of the text in the app
                style = MaterialTheme.typography.headlineMedium // fontsize of the text in the app
            )


        }
    }
}

@Composable
fun series(charlist:List<faces>, modifier: Modifier = Modifier){
LazyColumn (modifier = modifier){
    items(charlist){
        charCard(
            chars = faces,
            modifier = Modifier.padding(8.dp)
        )
    }
 }

}