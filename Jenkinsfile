@Library('test-lib') _
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sayHello()
                sh ' echo "foo"'}}
        stage('call other pipeline')
        {
            steps{
                twoinputs()
            }
        }
    }
}