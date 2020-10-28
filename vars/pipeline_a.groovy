def call() {
        stage('Even Stage') {
          steps {
            echo "The build number is even"
          }
        }
}
