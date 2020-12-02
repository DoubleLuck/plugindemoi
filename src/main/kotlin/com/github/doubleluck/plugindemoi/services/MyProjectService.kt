package com.github.doubleluck.plugindemoi.services

import com.intellij.openapi.project.Project
import com.github.doubleluck.plugindemoi.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
