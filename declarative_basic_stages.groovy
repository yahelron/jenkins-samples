# basic 4 stages windows cmd commands example 
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
   }
}
