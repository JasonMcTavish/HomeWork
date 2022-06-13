package exceptions.Part2

sealed class BattleState {
    val stateMsg: String
        get() = when (this) {
            is Draw -> "${team1.name} vs ${team2.name} is draw"
            is Team1Win -> "\n${team1.name} vs ${team2.name}: ${team1.name} win"
            is Team2Win -> "\n${team1.name} vs ${team2.name}: ${team2.name} win"
            is Progress -> "\nBattle in progress"
        }

    class Draw(val team1: Team, val team2: Team) : BattleState()
    class Team1Win(val team1: Team, val team2: Team) : BattleState()
    class Team2Win(val team1: Team, val team2: Team) : BattleState()
    class Progress(val team1: Team, val team2: Team) : BattleState() {
        val progressInfo: String
            get() = "\n${team1.name} left unit(s): ${team1.team.size}" +
                    "\n${team2.name} left unit(s): ${team2.team.size}"
    }
}