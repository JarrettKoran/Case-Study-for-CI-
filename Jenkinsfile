pipeline { 

  agent any
  environment{
    PATH = "/usr/bin/mvn:$PATH"
  }
  
  tools{
    maven "Maven3"
    jdk "JDK 9.0.4"
    
  }
  
  stages {
  
    stage("build"){
    
      steps{
        echo 'building the application'
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gitToken', url: 'https://github.com/FDator/Case-Study-for-CI-.git']]])
        sh "mvn clean install" 
      }
      
    }
    
  }
  
}
