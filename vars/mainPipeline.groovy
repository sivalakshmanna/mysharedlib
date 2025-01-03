@Library('mySharedLib') _

import stages.*

def call() {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script {
                        BuildStage.execute()
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        TestStage.execute()
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        DeployStage.execute()
                    }
                }
            }
        }
    }
}
