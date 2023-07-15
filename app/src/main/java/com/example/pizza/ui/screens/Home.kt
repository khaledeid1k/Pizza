package com.example.pizza.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pizza.R
import com.example.pizza.ui.theme.GooglePoppinsTypography
import com.example.pizza.ui.theme.IconSize
import com.example.pizza.ui.theme.LightBackground
import com.example.pizza.ui.theme.Type.Caption
import com.example.pizza.ui.theme.Type.GraphicTextLarge
import com.example.pizza.ui.theme.space16
import com.example.pizza.ui.theme.space8
import com.example.pizza.ui.theme.textSize24
import com.example.pizza.ui.theme.textSize32

@Composable
fun Home() {

}

@Preview
@Composable
fun HomeContent() {
    Column(modifier = Modifier
        .background(LightBackground),
        verticalArrangement = Arrangement.Center) {
        Row (modifier = Modifier
            .background(LightBackground)
            .fillMaxWidth()
            .padding(top = space8,)
            .padding(horizontal = space16),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top){
            Icon(imageVector = Icons.Default.ArrowBack
                , contentDescription = "",modifier = Modifier
                    .size(IconSize))
            Text(text = stringResource(R.string.pizza) ,
                style = TextStyle(fontWeight = FontWeight.Bold,
                    fontSize = textSize24),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center

            )

            Icon(imageVector = Icons.Default.Favorite
                , contentDescription = "",modifier = Modifier
                    .size(IconSize))
        }


        Image(painter = painterResource(id = R.drawable.plate),
             contentDescription = "")
        Text(text = "17$")
        Row {

        }
        Text(text = "Customize Your Pizza")
        LazyRow(
            modifier = Modifier.wrapContentSize(),
            contentPadding = PaddingValues(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {


            }
        Button(onClick = { /*TODO*/ }) {
            Row {
                Icon(painter = painterResource(R.drawable.shop)
                    , contentDescription = "")
                Text(text ="Add to cart" )
            }

        }
        }
    }
