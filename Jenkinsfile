pipeline{
    agent any
    stages {
        stage("build") {
            steps {
                bat './gradlew clean build'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                bat './gradlew sonarqube'
            }
        }
    }
}