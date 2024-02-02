def compile() {
    if (env.codeType == "maven") {
        print 'maven'
    }

    if (env.codeType == "nodejs") {
        print 'Nodejs'
    }

    if (env.codeType == "python") {
        print 'python'
    }

    if (env.codeType == "static") {
        print 'static'
    }
}