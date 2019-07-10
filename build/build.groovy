void call() {
echo "starting msbuild"
stage('build') {
       echo "build the code"
       node {
              bat "mvn package"
       }
  } 
echo "ending msbuild"
}
