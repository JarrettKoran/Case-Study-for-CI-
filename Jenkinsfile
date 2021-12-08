pipeline { 

  agent any
  
  tools{
    maven "Maven3"
    jdk "JDK 9.0.4"
    
  }
  
  stages {
    stage("cloning"){
      steps{
        echo 'cloning main branch'
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'gitToken', url: 'https://github.com/FDator/Case-Study-for-CI-.git']]])
      }
    }
    stage("build"){
      steps{
        sh 'mvn clean'
        
        echo 'setting up junit'
        sh 'mkdir lib'
        sh 'cd lib/ ; wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0-all.jar'
        sh 'cd src ; javac -cp "../lib/junit-platform-console-standalone-1.7.0-all.jar" src/main/java/org/psnbtech/GameTest.java'
        
        echo 'building the application'
        sh "mvn --version"
        sh "mvn clean compile"
      }
    }
      stage("testing"){
      steps{
        echo 'running junit tests'
          sh 'cd src/ ; java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." --select-class GameTest --reports-dir="reports"'
          junit 'src/reports/*-jupiter.xml'
      }
    }
}
}
