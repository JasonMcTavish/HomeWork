package Generics_And_Utility_Classes

open class Battle(var numberOfWarrior: Int) {
    val team1 = Team("Alpha", numberOfWarrior)
    val team2 = Team("Beta", numberOfWarrior)
    private var battleIsOver: Boolean = false

    private fun getProgress(i:Int) {
        if (team1.team.size == 0) {
            battleIsOver = true
            println(BattleState.Team2Win(team1, team2).stateMsg)
        }
        if (team2.team.size == 0) {
            battleIsOver = true
            println(BattleState.Team1Win(team1, team2).stateMsg)
        }
        if(!battleIsOver) println(BattleState.Progress(team1, team2).stateMsg)
    }

    fun iterationOfBattle() {
        var i = 0
        do {
            do {
                team1.team[(0 until team1.team.size).random()].attack(team2.team[(0 until team2.team.size).random()])
                team2.team.removeAll { it.isKilled }
                getProgress(i)
                if (battleIsOver) {
                    break
                }
                team2.team[(0 until team2.team.size).random()].attack(team1.team[(0 until team1.team.size).random()])
                team1.team.removeAll { it.isKilled }
                getProgress(i)
                if (battleIsOver) {
                    break
                }
                i++
            } while (i < team1.team.size || i < team2.team.size)
            i = 0
            if(!battleIsOver){
            println(BattleState.Progress(team1, team2).progressInfo)}
        } while (!battleIsOver)
    }
}