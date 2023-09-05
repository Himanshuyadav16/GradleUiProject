pipeline{
     agent any
        stages{
            stage('Java Version') {
                steps {
                    sh 'java --version'
                }
            }
            stage('Gradle version'){
                steps {
                    sh "gradle --version"
                }
            }
            stage('build'){
                steps{
           		    sh "gradle build"
                }
            }
       }
    }