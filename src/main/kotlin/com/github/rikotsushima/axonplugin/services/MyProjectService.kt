package com.github.rikotsushima.axonplugin.services

import com.github.rikotsushima.axonplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
