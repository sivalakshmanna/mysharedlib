package stages

class DeployStage {
    static void execute(script) {
        script.stage('Deploy') {
            script.echo "This is the Deploy stage."
        }
    }
}
