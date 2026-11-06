package com.example.avatarlistdemo.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.avatarlistdemo.R
import com.example.avatarlistdemo.data.CrewMember

@Composable
fun CrewRowView(member: CrewMember) {
    var isSelected by rememberSaveable {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                isSelected = !isSelected
            }
            .padding(8.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.Top
        ) {
            CrewAvatarImageView(
                imageRes = member.avatarRes,
                isSelected = isSelected
            )
            Spacer(Modifier.width(16.dp))
            CrewInfoView(
                name = member.name,
                mission = member.mission
            )
        }

        Checkbox(
            checked = isSelected,
            onCheckedChange = {
                isSelected = it
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CrewRowViewPreview() {
    CrewRowView(
        member = CrewMember(
            name = "Dr. Sarvagya",
            mission = "Mars haibat",
            avatarRes = R.drawable.blank_profile
        )
    )
}