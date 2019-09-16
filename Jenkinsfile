pipeline{
    agent any
    stages {
        stage("build") {
            steps {
                bat './gradlew clean build'
            }
        }
        stage('SonarQube analysis') {
            steps {
                sh './gradlew sonarqube'
            }
        }
    }
}