dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../Tenebris/dependencies.toml"))
        }
    }
}

rootProject.name = "schem"