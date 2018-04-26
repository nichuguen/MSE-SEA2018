pipeline {
    agent any
    stages {
       stage('Build') {
           steps {
                dir (path: "./tuto-mongo") {
                    sh './compile.sh'
                }
           }
       }
       stage('Redeploy') {
           steps {
                dir (path: "./tuto-mongo") {
                    sh 'docker-compose down --volumes'
                    sh 'docker-compose up -d'
                }
           }
       }
    }
}
