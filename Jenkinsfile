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
        
        echo 'building the application'
        sh "mvn --version"
        sh "mvn clean compile"
      }
    }
    stage("testing"){
      steps{
        echo 'setting up junit tests'
        //sh 'cd /var/lib/jenkins/workspace/CaseStudyPipeline_main/target/classes : javac -cp junit-4.5.jar: GameTest.java'
      }
    post { 
      always { 
          echo 'Creating Test report'
          sh "mvn surefire-report:report"
          
          echo 'Sending Emails'
          emailext body: 'A Test EMail', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test'
     }
    }
    }
}
}
