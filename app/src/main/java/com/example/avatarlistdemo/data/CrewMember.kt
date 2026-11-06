package com.example.avatarlistdemo.data

import com.example.avatarlistdemo.R

data class CrewMember(
    val name: String,
    val mission: String,
    val avatarRes: Int? = null
) {
    companion object {
        val mockCrewMembers = listOf(
            CrewMember(
                name = "Dr. Sarvagya",
                mission = "Mars Exploration & Habitat",
                avatarRes = R.drawable.user1
            ),
            CrewMember(
                name = "Capt. Alex Mercer",
                mission = "Lunar Base Alpha",
                avatarRes = R.drawable.user2
            ),
            CrewMember(
                name = "Elena Rostova",
                mission = "Orbital Station Supply",
                avatarRes = R.drawable.user3
            ),
            CrewMember(
                name = "Marcus Vance",
                mission = "Deep Space Reconnaissance",
                avatarRes = R.drawable.user4
            ),
            CrewMember(
                name = "Aisha Khan",
                mission = "Europa Sub-surface Ocean Probe",
                avatarRes = null
            ),
            CrewMember(
                name = "Dr. Hiroshi Tanaka",
                mission = "Asteroid Belt Mining & Research",
                avatarRes = R.drawable.blank_profile
            ),
            CrewMember(
                name = "Commander Sarah Jenkins",
                mission = "Titan Atmosphere Mapping",
                avatarRes = R.drawable.user1
            ),
            CrewMember(
                name = "Lt. David Chen",
                mission = "Orbital Solar Observatory",
                avatarRes = R.drawable.user2
            ),
            CrewMember(
                name = "Amara Okonkwo",
                mission = "Zero-G Agriculture Lab",
                avatarRes = R.drawable.user3
            ),
            CrewMember(
                name = "Sven Lindqvist",
                mission = "Deep Space Communications Relay",
                avatarRes = R.drawable.user4
            )
        )
    }
}

