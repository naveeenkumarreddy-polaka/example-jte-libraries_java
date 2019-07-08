void call() {
echo "starting msbuild"
stage('build') {
       echo "Helloooooooooooooooooo"
       node {
              bat "mvn package"
       }
  } 
echo "ending msbuild"
}
