package com.moviles.examenmoviles.navigation

object AppDestinations {
    const val LIST = "list"
    const val DETAIL = "detail/{spaceId}"

    fun createDetailRoute(spaceId: Int) = "detail/$spaceId"
}

