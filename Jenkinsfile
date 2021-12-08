pipeline { 

  agent any
  
  tools{
    maven "Maven3"
    jdk "JDK 9.0.4"
    
  }
  
  stages {
  
    stage("cloning"){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gitToken', url: 'https://github.com/FDator/Case-Study-for-CI-.git']]])
      }
    }
    stage("build"){
      steps{
        echo 'building the application'
        sh "mvn --version"
        sh "mvn compile"
      }
     
    }
    
  }
  
}
