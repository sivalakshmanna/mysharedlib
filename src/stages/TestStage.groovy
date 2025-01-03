package stages

class TestStage {
    static void execute(script) {
        script.stage('Test') {
            script.echo "This is the Test stage."
        }
    }
}
