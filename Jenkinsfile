pipeline{
    agent any
    tools{
        maven 'Maven 3.6.3'
    }
    stages{
        stage('info'){
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
        stage('Build'){
            steps {
                sh 'mvn package'
                sh 'docker build -t jlissman/javaverktygprojekt:souter .'
            }
        }
        stage('LoginTest'){
            steps {
                sh 'docker login'
            }
        }

        stage('Push'){
            steps{
                sh 'docker push jlissman/javaverktygprojekt:souter'
            }

        }
    }
}