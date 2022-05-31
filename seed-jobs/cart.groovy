multibranchPipelineJob('CI-pipelines/cart') {
    branchSources {
        // git {
        //     id('123456789') // IMPORTANT: use a constant and unique identifier
        //     remote('https://github.com/rganjare/DP_cart.git')
        // }
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHub-cred')
            repository('rganjare/DP_cart.git')
        }
    }
    // orphanedItemStrategy {
    //     discardOldItems {
    //         numToKeep(20)
    //     }
    // }
}