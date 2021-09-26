def call(first, second, third, fourth, fifth){
pipeline {
    agent any
    stages {
        stage('CLEAN_WORKSPACE') {
            steps {
                cleanWs()
            }
        }
        
        stage('CLONING_SOURCE_CODE') {
            steps {
                echo "${first}
            }
        }
        
        stage('BUILD') {
            steps{
                script {
                    echo "${second}
                }
            }
        }
        
        stage('SIGNED_APK') {
            steps{
                script {
                    echo "${third}
                }
            }
        }
        
        stage('PUBLISH_APP_CENTER') {
            steps {
                echo "${fourth}"
            }
        }
    }
    post {
        always {
            echo "${fifth}
        }
    }
}
}
