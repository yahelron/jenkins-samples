##  build job: '<Project name>', parameters: [[$class: 'StringParameterValue', name: 'param1', value: 'test_param']]

pipeline {
   agent any

   stages {
      stage('one') {
         steps {
            bat 'echo yahel >c:\\Users\\yahel\\Desktop\\name.txt'
         }
      }
      stage('two') {
        steps{
          bat 'type c:\\Users\\yahel\\Desktop\\name.txt'
        }
      }
      stage('three'){
        steps{
          bat 'dir | find "free"'
        }
      }
      stage('four'){
        steps{
          bat 'move C:\\Users\\yahel\\Desktop\\name.txt C:\\Users\\yahel\\Desktop\\new'
        }
      }
      stage('Invoke_homework1'){
        steps{
          build job: 'homework1', parameters: [
          string(name: 'param1', value: "value1")
        ]
        }
      }
   }
}
