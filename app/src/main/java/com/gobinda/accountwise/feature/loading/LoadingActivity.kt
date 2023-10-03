package com.gobinda.accountwise.feature.loading


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gobinda.accountwise.ui.theme.AccountWiseTheme

/**
 * This activity will be used to show a loading progressbar & in background
 * we will check if user is using our latest apk or not. & based on the status,
 * we will redirect user to a new activity, such as If the user is using the
 * latest apk then we will redirect user to AccountListActivity otherwise we
 * will change the UI to notify the user to use our latest apk.
 */
class LoadingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountWiseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Splash Activity real")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccountWiseTheme {
        Greeting("Splash Activity")
    }
}