void call(){

echo "Uploading Artifacts to S3 bucket"
stage("Upload_Artifact"){
    node{
        sleep(5)
        /*withAWS(region:'us-east-2',credentials:'<Credentials_Id>') {
        s3Upload(file:"C:\\users\\venkataramana.t\\.jenkins\\workspace\\*.${env.BUILD_NUMBER}.zip", bucket:'<bucket-name>')
        (OR)
       bat "mvn clean deploy"
        }*/
    }
}
echo "Artifacts Uploaded to S3 bucket"
}
