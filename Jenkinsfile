pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
    }
    stages {
        stage('Push') {
            steps {
                withCredentials([
                        usernamePassword(credentialsId: 'dockerhub_id', usernameVariable: 'USER', passwordVariable: 'PASS')
                ]) {
                    echo $USER
                    //sh 'docker login -u $USER -p $PASS'
                    //sh 'docker push jlissman/javaverktygprojekt:souter'
                }


            }
        }
    }
}