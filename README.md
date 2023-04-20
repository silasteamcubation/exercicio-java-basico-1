# exercicio-java-basico-1

1. Crie uma classe ParserName, que contenha um método parse. Este método irá receber um nome completo em String, e deverá
retornar um objeto Name, contendo um nome e um sobrenome separados.

Este objeto Name deverá ter métodos acessórios getFirstName e getLastName, que retornarão o nome e o sobrenome
respectivamente. A classe de teste ParserNameTest já está pronta como exemplo.

2. Crie uma classe PrimeChecker para verificar se um número é primo ou não. Esta classe deve conter um método isPrime,
que receberá um número inteiro positivo e retornará TRUE se o número for primo, ou FALSE, do contrário.

A classe de teste PrimeCheckerTest já está pronta como exemplo.

Obs.: Um número é primo se ele for divisível apenas por 1 e por ele próprio.

3. Crie uma classe TypeInformationChecker para verificar se uma String é um CEP, um telefone, um CPF ou um CNPJ. Essa
classe deve conter um método getType, que recebe uma String numérica e verifica qual o tipo da informação, retornando
também uma String. Se for CEP, o método retornará a palavra "CEP", se telefone, retornará "TEL", se CPF, retornará
"CPF" e se é CNPJ retornará "CNPJ". Se não se encaixar em nenhum tipo, retornará "ERRO".

O CEP sempre conterá 8 dígitos, o telefone 9, o CPF 11 e o CNPJ 14.

A classe de teste TypeInformationCheckerTest já está pronta como exemplo.

Obs.: Pode considerar que a String sempre virá contendo apenas números. 

3. Crie uma classe TypeInformatioMasker para colocar uma String na sua máscara correspondente. Essa classe deve
conter um método mask que recebe uma String numérica e mascara para o formato correspondente.

Uma String com 8 dígitos deve ser mascarada para um CEP. Ex.: com a entrada 12345678 deve retornar 12345-678
Uma String com 9 dígitos deve ser mascarada para um telefone. Ex.: com a entrada 123456789 deve retornar 12345-6789
Uma String com 11 dígitos deve ser mascarada para um CPF. Ex.: com a entrada 12345678901 deve retornar 123.456.789-01
Uma String com 14 dígitos deve ser mascarada para um CNPJ. Ex.: com a entrada 12345678901234 deve retornar 12.345.678/9012-34
Uma String com quantidade diferente de dígitos deve retornar ela mesma. Ex.: 12345 deve retornar 12345.

O CEP sempre conterá 8 dígitos, o telefone 9, o CPF 11 e o CNPJ 14.

A classe de teste TypeInformatioMaskerTest já está pronta como exemplo.

Obs.: Pode considerar que a String sempre virá contendo apenas números. 
