pipeline{
    agent any
    tools{
        maven 'Maven 3.6.3'
    }
    stages{
        stage('Build'){
            steps{
                echo 'Group 4'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Deploy'){
            steps {
                sh 'mvn package'
            }
            steps {
                sh 'docker build -t souter:1.0 .'
            }
        }
    }
}