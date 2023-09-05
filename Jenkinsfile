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
                    sh './gradlew --version'
                }
            }
            stage('build'){
                steps{
           		    sh './gradlew build'
                }
            }
       }
    }