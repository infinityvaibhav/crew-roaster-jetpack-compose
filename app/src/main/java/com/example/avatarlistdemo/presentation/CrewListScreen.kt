package com.example.avatarlistdemo.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.avatarlistdemo.data.CrewMember

@Composable
fun CrewListScreen(members: List<CrewMember>) {
    LazyColumn {
        items(members) { member ->
            CrewRowView(member)
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CrewListPreview() {
    CrewListScreen(
        members = CrewMember.mockCrewMembers
    )
}