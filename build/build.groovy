void call() {
echo "starting msbuild"
stage('build') {
       echo "Helloooooooooooooooooo"
       node {
              bat '"C:\\ProgramData\\chocolatey\\lib\\NuGet.CommandLine\\tools\\nuget.exe" restore DancingGoat.sln'
              bat "\"${tool 'MSBuild'}\" DancingGoat.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /P:DeployOnBuild=true /p:ProductVersion=1.0.${env.BUILD_NUMBER}"
       }
  } 
echo "ending msbuild"
}
