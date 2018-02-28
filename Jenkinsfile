pipeline {
    agent any 
    stages {
        stage('Clean') {
            steps {
                mvn clean
            }
        }
        stage('Checkout') {
            steps {
                git checkout -b ${env.}
            }
        }
        stage('Build') { 
            steps {
                mvn install
            }
        }
        stage('Test') { 
            steps {
                mvn test
            }
        }
        stage('Deploy') { 
            steps {
                
            }
        }
    }
}
