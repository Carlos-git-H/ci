pipeline {
    // Ejecuta todo dentro de un contenedor Maven (trae Java 17 + Maven listos)
    agent {
        docker { image 'maven:3.9-eclipse-temurin-17' }
    }

    stages {
        stage('Compilar') {
            steps {
                sh 'mvn -B compile'
            }
        }
        stage('Probar') {
            steps {
                sh 'mvn -B test'
            }
        }
    }

    post {
        success { echo 'Build correcto ✅' }
        failure { echo 'Build falló ❌ - revisa el código' }
    }
}