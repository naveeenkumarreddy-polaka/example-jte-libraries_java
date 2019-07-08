void call(){
echo "Starting Package Stage"
Stage("Package"){
       node{
              bat "mvn clean package" 
       }
}
echo "Ending Package Stage"      
}
