dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../Tenebris/libs.versions.toml"))
        }
    }
}

rootProject.name = "schem"