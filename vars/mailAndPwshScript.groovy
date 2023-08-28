properties ([
    parameters ([
        string(defaultValue: '',description: '', name: 'number1'),
        string(defaultValue: '',description: '', name: 'number2')
    ])
])
node ( "master") {
    stage ("Checkout") {
        checkout scm
    }
    stage ("Run script") {
        powershell "${pwd()}/Lesson1.ps1 -num1 '${params.number1}' -num2 '${params.number2}'"
    }
}