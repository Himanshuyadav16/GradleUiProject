pipeline{
     agent any
        stages{
            stage('Java And Gradle Version') {
                steps {
                    sh 'java --version'
                    sh './gradlew clean test'
                     allure([
                             includeProperties: false,
                             jdk: '',
                             properties: [],
                                          reportBuildPolicy: 'ALWAYS',
                                               results: [[path: 'allure-results']]
                                           ])
                }
            }
       }
    }
