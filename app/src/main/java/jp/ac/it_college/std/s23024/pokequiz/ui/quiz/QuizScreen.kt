package jp.ac.it_college.std.s23024.pokequiz.ui.quiz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    toResult:(Int) -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "クイズ画面")
        Button(
            onClick = {
                toResult(5)
            }
        ) {
            Text(text = "リザルトへ")
        }
    }
}

@Preview
@Composable
private fun QuizScreenPreview() {
    QuizScreen()
}