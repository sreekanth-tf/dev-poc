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

        stage("Wait for Quality Gate") {
            timeout(time: 1, unit: "HOURS") {
                def qg = waitForQualityGate()
                if(qg.status != 'OK') {
                    error "Quality Check failed, Status : ${qg.status}"
                }
            }
        }
    }
}