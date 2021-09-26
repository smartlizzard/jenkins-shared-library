def call(Map pipelineParams){
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
                echo "${pipelineParams.first}"
            }
        }
        
        stage('BUILD') {
            steps{
                script {
                    echo "${pipelineParams.second}"
                }
            }
        }
        
        stage('SIGNED_APK') {
            steps{
                script {
                    echo "${pipelineParams.third}"
                }
            }
        }
        
        stage('PUBLISH_APP_CENTER') {
            steps {
                echo "${pipelineParams.fourth}"
            }
        }
    }
    post {
        always {
            echo "${pipelineParams.fifth}"
        }
    }
}
}
