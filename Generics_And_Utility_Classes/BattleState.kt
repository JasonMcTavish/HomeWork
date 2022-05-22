package Generics_And_Utility_Classes

sealed class BattleState {
    object Progress : BattleState() {
        var remainingWarrior = "Осталось воинов первой команды: "
    }

    object WinOfFirstTeam : BattleState() {
        var endOfBattle = "Победила первая команда"
    }

    object WinOfSecondTeam : BattleState() {
        var endOfBattle = "Победила вторая команда"
    }

    object Draw : BattleState() {
        var endOfBattle = "Ничья"
    }
}