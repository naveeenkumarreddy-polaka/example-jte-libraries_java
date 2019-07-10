void call() {
echo "starting msbuild"
stage('build') {
       echo "build the code"
       node {
              extensions: [[$class: 'CloneOption', timeout: 120]],
              bat "mvn package"
       }
  } 
echo "ending msbuild"
}
