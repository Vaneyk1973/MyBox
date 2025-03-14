package com.mybox

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val isLoggedIn: Boolean = true
        setContent {
            if (!isLoggedIn) {
                MaterialTheme {
                    Surface {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text("Главный экран")
                            Button(
                                onClick = {
                                    val intent =
                                        Intent(this@MainActivity, LoginActivity::class.java)
                                    startActivity(intent)
                                }
                            ) {
                                Text("Открыть новую активность")
                            }
                        }
                    }
                }
            } else {
                startActivity(
                    Intent(this@MainActivity, LoginActivity::class.java)
                )
            }
        }
    }
}
