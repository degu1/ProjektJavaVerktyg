pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
    }
    environment {
        registry = "degu1/javaverktygprojekt"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    stages {
        stage('info') {
            steps {
                echo 'Group 4'
                sh 'java --version'
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        /*
        stage('Build') {
            steps {
                sh 'mvn package'
                sh 'docker build -t jlissman/javaverktygprojekt:souter .'
            }
        }

         */
        stage('Building our image') {
            steps{
               // script {

                    //dockerImage = docker.build registry + ":$BUILD_NUMBER"
                //}
            }
        }
        stage('Deploy our image') {
            steps{

                docker.withRegistry('', 'dockerhub_id') {
                    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
                }
                //script {
                    //docker.withRegistry( '', registryCredential ) {
                      //  dockerImage.push()
                    //}
                //}
            }
        }

        stage('LoginTest'){
            steps {
                sh 'docker login -u jlissman -p losenordforprojekt11'
            }
        }
/*
        stage('Push'){
            steps{
                sh 'docker push jlissman/javaverktygprojekt:souter'
            }

        }
*/
        }
    }

