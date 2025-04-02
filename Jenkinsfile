pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/jeevachennakesavan/Selenium-Basics.git'
            }
        }

        stage('Setup Environment') {
            steps {
                script {
                    echo 'Setting up dependencies...'
                    bat 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    echo 'Executing Selenium Tests...'
                    bat 'mvn test'
                }
            }
        }
    }
    
}
