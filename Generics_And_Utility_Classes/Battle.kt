package Generics_And_Utility_Classes

open class Battle(var numberOfWarrior: Int) {
    private val team1 = mutableListOf<AbstractWarrior>()
    private val team2 = mutableListOf<AbstractWarrior>()





    fun iterationOfBattle() {
        for (l in 0 until numberOfWarrior) {
            team1.add(Team().addWarrior())
            team2.add(Team().addWarrior())
        }
        var i = 0
        do {
            do {
                team1.shuffle()
                team2.shuffle()
                team1[i].attack(team2[i])
                if (team2[i].isKilled) team2.remove(team2[i])
                team2[i].attack(team1[i])
                if (team1[i].isKilled) team1.remove(team1[i])
                if (team1.size == 0 && team2.size == 0) {
                    println(BattleState.Draw.endOfBattle)
                    break
                }
                if (team1.size == 0) {
                    println(BattleState.WinOfSecondTeam.endOfBattle)
                    break
                }
                if (team2.size == 0) {
                    println(BattleState.WinOfFirstTeam.endOfBattle)
                    break
                }
                i++
            } while (i != team1.size || i != team2.size)
            i = 0
        } while (team1.size != 0 || team2.size != 0)
    }
}