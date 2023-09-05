pipeline{
     agent {
        label "gradle"

        stages{
            stage('Java Version') {
                steps {
                    sh "java --version"
                    sh "gradle --version"
                }
            }
       }
    }
