package jp.ac.it_college.std.s23024.pokequiz.ui.result

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ResultScreen(
    modifier: Modifier = Modifier,
    onRetryClick: () -> Unit = {},
    onGenerationClick: () -> Unit = {}
    ) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "結果画面")
        Button(
            onClick = onGenerationClick
        ) {
            Text(text = "世代選択に戻る")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ResultScreenPreview() {
    ResultScreen()
}