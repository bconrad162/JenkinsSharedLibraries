def call(String stageName){
  
  if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "Sonar")
     {
       sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Nexus")
     {
       sh "mvn clean deploy"
     }
}
