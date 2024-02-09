package com.istudio.code

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.istudio.code.modules.xml.viewModelProvider.ViewModelProviderActivity
import com.istudio.code.ui.composables.AppButton
import com.istudio.code.ui.composables.AppText
import com.istudio.code.ui.theme.CodeTheme
import com.istudio.code.utils.openActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CurrentScreen()
                }
            }
        }
    }
}

@Composable
fun CurrentScreen(modifier: Modifier = Modifier) {
    val cxt = LocalContext.current

    AppText(text = "XML")
    Spacer(modifier = Modifier.height(10.dp))
    AppButton(text = "Using View Model Store") {
        cxt.openActivity(ViewModelProviderActivity::class.java) {}
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeTheme {
        CurrentScreen()
    }
}