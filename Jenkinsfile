pipeline{
    agent {
        label "agent any"
    }

    stages {
        stage("build") {
            if (isUnix()) {
                sh './gradlew clean build'
            } else {
                bat 'gradlew.bat clean build'
            }
        }
    }
}