pipeline {
    agent any
    tools{
        maven 'maven_3_9_6'
    }
    stages{
        stage("Build maven"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/LeandroTombe/Jenkins-papeline']])
                bat 'mvn clean install'
            }
        }
        stage("Build docker image"){
            steps{
                script{
                    bat "docker build -t testintegration/devops-integrations ."
                }
            }
        }
        stage("Push image to hub"){
            steps{
                script{
                    withCredentials([string(credentialsId: 'prueba', variable: 'ejemplo')]) {
                        bat 'docker login -u aloric -p ${ejemplo}'
                        bat "docker tag testintegration/devops-integrations aloric/devops"
                        bat 'docker push aloric/devops'
                    }


                }
            }
        }
    }
}
