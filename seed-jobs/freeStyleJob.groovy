freeStyleJob('example') {
    scm {
        github('jenkinsci/job-dsl-plugin', 'main')
    }
    steps {
        gradle('clean build')
    }
    
}