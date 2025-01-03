package stages

class BuildStage {
    static void execute(script) {
        script.stage('Build') {
            script.echo "This is the Build stage."
        }
    }
}
