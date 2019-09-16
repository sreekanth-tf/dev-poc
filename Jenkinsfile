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
                withSonarQubeEnv('SonarQube Server')
                    bat './gradlew sonarqube'
                }
            }
        }

        stage("Wait for Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}