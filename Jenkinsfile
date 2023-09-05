pipeline{
     agent {
        label "gradle"
     }
        tools{
        gradle --version
        }
        stages{
            stage('Java Version') {
                steps {
                    sh "java --version"
                    sh "gradle --version"
                }
            }
       }
    }
