package com.github.danielsitnik.intellijdbmlplugin.services

import com.intellij.openapi.project.Project
import com.github.danielsitnik.intellijdbmlplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
