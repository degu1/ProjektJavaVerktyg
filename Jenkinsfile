pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
    }
    stage('Push') {
        steps {
            withCredentials([
                    usernamePassword(credentialsId: 'dockerhubUser', usernameVariable: 'USER', passwordVariable: 'PASS')
            ]) {
                sh echo $USER
                //sh 'docker login -u $USER -p $PASS'
                //sh 'docker push jlissman/javaverktygprojekt:souter'
            }


        }

    }
}