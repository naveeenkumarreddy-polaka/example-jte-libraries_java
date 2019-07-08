void call(){
echo "Starting Static Code Analysis"       
stage('SCA_Sonar'){
       node{
          bat "mvn packge sonar:sonar"
       }
} 
echo "Ending Static Code Analysis"
}
