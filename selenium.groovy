pipeline {
  agent any

  stages{
    stage('test'){
      steps{
        dir ('C:\\code\\jenkins tests') {
          bat 'selenium.py'
        }
      }
    }
  }

}
