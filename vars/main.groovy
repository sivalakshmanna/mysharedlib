@Library('mySharedLib') _

import stages.*

def call() {
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script {
                        BuildStage.execute(this)
                    }
                }
            }
            stage('Test') {
                steps {
                    script {
                        TestStage.execute(this)
                    }
                }
            }
            stage('Deploy') {
                steps {
                    script {
                        DeployStage.execute(this)
                    }
                }
            }
        }
    }
}
