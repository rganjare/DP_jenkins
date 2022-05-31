folder('CI-pipeline') {
    displayName('CI-pipeline')
    description('CI-pipeline')
}
multibranchPipelineJob('cart') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/rganjare/DP_cart.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}