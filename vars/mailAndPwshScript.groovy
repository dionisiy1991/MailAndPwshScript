properties ([
    parameters ([
        string(defaultValue: '',description: '', name: 'Mail'),
        string(defaultValue: '',description: '', name: 'Text')
    ])
])
node ( "master") {
    stage {
        emailext body: 'ttt', subject: '${params.Text}', to: '${params.Mail}'
    }
}