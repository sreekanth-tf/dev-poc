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
                withSonarQubeEnv('SonarQube Server') {
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

        stage('Slack Message') {
            steps {
                slackSend channel: '#devops',
                color: 'good',
                teamDomain: 'devops-s1t9307',
                tokenCredentialId: 'slack-token',
                message: '*${currentBuild.currentResult}:* Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n
                            More info at: ${env.BUILD_URL}'
            }
        }
    }
}