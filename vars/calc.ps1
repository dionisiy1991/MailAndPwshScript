param (
    [CmdletBinding()]
    [String]
    $num1,
    [String]
    $num2
)
$num3 = $num1+$num2
Write-Host $num3