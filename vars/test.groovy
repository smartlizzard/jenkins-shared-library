def call(first){
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
                echo "${first}"
            }
        }
        
        stage('BUILD') {
            steps{
                script {
                    echo "${first}"
                }
            }
        }
        
        stage('SIGNED_APK') {
            steps{
                script {
                    echo "${first}"
                }
            }
        }
        
        stage('PUBLISH_APP_CENTER') {
            steps {
                echo "${first}"
            }
        }
    }
    post {
        always {
            echo "${first}"
        }
    }
}
}
