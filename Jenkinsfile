pipeline{
     agent any
        stages{
            stage('Java Version') {
                steps {
                    sh 'java --version'
                }
            }
            stage('build'){
                steps{
           		    sh "gradle clean test"
                }
            }
       }
    }