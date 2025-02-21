package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.topic2.android.notes.domain.model.NoteModel
import com.topic2.android.notes.theme.rwGreen


@Composable
fun Note(onNoteClick: (NoteModel) -> Unit, isSelected: Boolean, note: NoteModel) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(rwGreen)
        )
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Заголовок", maxLines = 1)
            Text(text = "Содержание", maxLines = 1)
        }
        Checkbox(
            checked = false,
            onCheckedChange = {},
            modifier = Modifier.padding(start = 8.dp)
        )

    }
}
@Preview
@Composable
private fun NotePreview(){ Note(onNoteClick, isNoteSelected, note)
}