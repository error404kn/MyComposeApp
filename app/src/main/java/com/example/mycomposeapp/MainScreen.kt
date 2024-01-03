package com.example.mycomposeapp

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import android.icu.text.ListFormatter.Width
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

//    var nameText by remember{
//        mutableStateOf("")
//    }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//
//    ) {
//
//        OutlinedTextField(
//            value = nameText,
//            onValueChange = {
//                nameText = it
//            },
//            label = {
//                Text(text = "Username")
//            },
//            leadingIcon = {
//                Icon(
//                    painter = painterResource(id = R.drawable.show),
//                    contentDescription = null
//                )
//            }
//        )
//        Spacer(modifier = Modifier.height(23.dp))
//        Button(onClick = {  }) {
//            Text(text = "Login")
//
//        }
//
//    }

        var nameText by remember{
        mutableStateOf("")
    }
    var myState by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.padding(top = 30.dp))
        Text(text = "Login", fontSize = 30.sp, color = Color.Black)
        Spacer(modifier = Modifier.padding(top = 15.dp))
        Column {
            Text(text = "By signing in you are agreeing", color = Color.Gray)
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "our Term and privacy policy", color = Color.Blue)
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Row {
            Text(text = "Login", color = Color.Blue)
            Spacer(modifier = Modifier.padding(horizontal = 20.dp))
            Text(text = "Register", color = Color.Gray)
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
        OutlinedTextField(
            value = nameText,
            onValueChange = {
                nameText = it
            },
            label = {
                Text(text = "Username")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.mail),
                    contentDescription = null
                )
            }
        )
        Spacer(modifier = Modifier.padding(top = 20.dp))
        OutlinedTextField(value = nameText,
            onValueChange = {
                nameText = it
            },
            label = {
                Text(text = "Username")
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.lock),
                    contentDescription = null
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.show),
                    contentDescription = null)
            }
        )
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Row {
            Checkbox(
                checked = myState,
                onCheckedChange = {myState = it}
            )
            Row {
                Text(text = "Remember password", color = Color.Gray, textAlign = TextAlign.Center, modifier = Modifier.padding(top = 15.dp), fontSize = 12.sp)
                Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                Text(text = "Forget Password", color = Color.Blue, modifier = Modifier.padding(top = 15.dp), fontSize = 12.sp)
            }
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
        Button(
            modifier = Modifier.size(width = 280.dp, height = 40.dp),
            onClick = { },
            colors = buttonColors(Color.Blue)
        ) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Text(text = "or connect with", Modifier.clickable {  }, color = Color.Gray)
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Row {
            Icon(painterResource(
                id = R.drawable.facebook),
                contentDescription = null,
                tint = Color.Unspecified)
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))
            Icon(painterResource(id = R.drawable.instagram),
                contentDescription = null,
                tint = Color.Unspecified)
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))
            Icon(painterResource(id = R.drawable.pinterest),
                contentDescription = null,
                tint = Color.Unspecified)
            Spacer(modifier = Modifier.padding(horizontal = 5.dp))
            Icon(painterResource(id = R.drawable.linkedin),
                contentDescription = null,
                tint = Color.Unspecified)
        }
    }
}