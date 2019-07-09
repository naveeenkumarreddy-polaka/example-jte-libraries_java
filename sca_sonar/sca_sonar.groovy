void call(){
echo "Starting Static Code Analysis"       
stage('SCA_Sonar'){
       node{
          //bat "mvn package sonar:sonar"
       }
} 
echo "Ending Static Code Analysis"
}
