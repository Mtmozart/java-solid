# Aplicando S.O.L.I.D em Java: Pilares da O.O.P

## Introdução

Este documento descreve os princípios S.O.L.I.D da programação orientada a objetos e como aplicá-los em projetos Java. Os princípios S.O.L.I.D são diretrizes essenciais para criar código robusto, escalável e de fácil manutenção.

## Pilares da O.O.P

### Coesão

Classes não coesas tendem a crescer indefinidamente, tornando-as difíceis de manter. A coesão é fundamental para garantir que uma classe tenha uma responsabilidade única.

### Encapsulamento

Proteger as classes de fatores externos que podem prejudicar a regra de negócio. O encapsulamento ajuda a garantir que o estado interno de uma classe seja controlado e acessado apenas por métodos apropriados.

### Acoplamento

Evitar dependências muito fortes entre classes. O acoplamento reduzido permite que as classes sejam alteradas independentemente umas das outras, promovendo a flexibilidade e a reutilização de código.

### Polimorfismo

Na programação orientada a objetos, o polimorfismo permite que referências de tipos de classes mais abstratas representem o comportamento das classes concretas que referenciam.

## Princípios S.O.L.I.D

### S - Single Responsibility Principle (Princípio da Responsabilidade Única)

Cada classe deve ter uma responsabilidade única, não deve ter várias coisas que não são inerente à ela, faz conjunto com a coesão do O.O.P, "Uma classe deveria ter apenas um único motivo para mudar" - Robert (Uncle Bob) Martin.

### O - Open Closed Principle (Princípio Aberto/Fechado)

Entidades de software devem estar abertas para extensão, porém fechadas para modificação - Bertrand Meyer. Mexer somente quando necessário e é relacionado ao acoplamento.

### L - Liskov Substitution Principle (Princípio da Substituição de Liskov)

Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y de tipo S, onde S é um subtipo de T -Só porque um pato de borracha e o animal pato de fazem quá e flutuam, não quer dizer que sejam a mesma coisa, nesses casos, a melhor coisa que se pode fazer é usar composição.

### I - Interface Segregation Principle (Princípio da Segregação de Interfaces)

Uma classe não deve ser forçada a usar métodos que não utilizará, que não fazem sentido - Robert (Uncle bob) Martin. Se esse método não é necessário, é melhor usar outra interface, se possível, herdar a anterior ou algo, mas evitar deixar métodos avulsos. - fala com o polimorfismo.

### D - Dependency Inversion Principle (Princípio da Inversão de Dependência)

Abstrações não devem depender de implementações. Implementações devem depender de abstrações Robert (Uncle bob). Adicionar abstrações no projeto para facilitar a troca de implementações.
Adiciona coisas no projeto, se eu tenho vários métodos com a mesma ideia, mesmo parâmetros, vale a pena abstrair para que por exemplo, lhes seja aplicado uma interface, assim, independente do método, tenha um padrão mais fácil de trocar.

## Conclusão

Ao aplicar os princípios S.O.L.I.D em projetos Java, você promove a criação de código modular, flexível e de fácil manutenção. Estes princípios são essenciais para o desenvolvimento de software de qualidade, proporcionando escalabilidade e adaptabilidade ao longo do tempo.
