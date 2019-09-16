pipeline{
    agent {
        label "agent any"
    }

    stages {
        stage("build") {
            bat './gradlew clean build'
        }
    }
}