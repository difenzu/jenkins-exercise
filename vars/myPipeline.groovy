void call() {
    echo "my pipeline"
    pipeline {
        agent any

        stages {
            stage('mr p') {
                steps {
                    helloWorld()
                }
            }
        }
    }
}