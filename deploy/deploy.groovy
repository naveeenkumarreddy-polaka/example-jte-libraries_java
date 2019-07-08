void call(){

echo "Starting Deployment"
stage("Deploy"){
    node{
        sleep(1)
	//deploy to tomcat    
    }
}
echo "Auto deployment done"	
}
