package jp.ac.it_college.std.s23024.pokequiz.ui.generation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GenerationScreen(
    modifier: Modifier = Modifier,
    onGenerationSelected: (Int) -> Unit = {}
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "世代選択")
        Button(
            onClick = {
                onGenerationSelected(1)
            }
        ) {
            Text(text = "第一世代")
        }
    }
}

@Preview
@Composable
private fun GenerationScreenPreview() {
    GenerationScreen()
}