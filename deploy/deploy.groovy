void call(){

echo "Starting Deployment"
stage("Deploy"){
    node{
        sleep(1)
	    echo ('%WORKSPACE%')   
	    echo ('%env.projet_name%')
	//deploy to tomcat    
    }
}
echo "Auto deployment done"	
}
