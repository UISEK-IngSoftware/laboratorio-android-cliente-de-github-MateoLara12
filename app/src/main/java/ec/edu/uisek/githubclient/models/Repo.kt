package ec.edu.uisek.githubclient.models

import ec.edu.uisek.githubclient.models.RepoOwner


data class Repo (
    val id: Long,
    val name: String,
    val description: String,
    val language: String,
    val owner: RepoOwner,


    )