# Domain-Driven-Design

### Objetos de Valor (Value Objects)
Objetos de valor são reconhecidos por não possuírem identificadores,
sendo assim, usamos seus valores para os distinguir um do outro. Cada um
é único e imutável (o valor é criado como um todo e não muda depois de
sua criação).

### Entidades
Entidades, ao contrário do que encontramos com Objetos de Valor, possuem identificadores, e são mutáveis,
ou seja, cada um tem um ID único que nunca mais será utilizado por outros, dessa forma, a imutabilidade é
impossível, pois a Entidade pode e deve ser alterada depois de criada.

### Agragados
Um agregado é um conjunto de entidades e objetos de valor, que mantém relacionamentos entre si e possui
um limite que o circunda e define.


### Serviços de Domínio (Domain Services)
Serviços de domínio são objetos tratados separadamente, e que trabalham com diversas entidades e agre-
gados, sempre que são necessários cálculos, execuções de rotinas e muito mais.

## Exemplo

#### Objetos de Valor:
Nota: Representa uma nota atribuída a uma atividade para um aluno. \n
Comentario: Representa um comentário feito pelo professor ou por outros alunos em uma atividade. \n
Anexo: Representa um anexo (por exemplo, arquivo) relacionado a uma atividade. \n
Endereço: Serve como um objeto de valor em outras entidades, como Professor e Aluno \n

#### Entidades:
Professor: Representa um professor com um identificador único, nome e informações de contato. \n
Aluno: Representa um aluno com um identificador único, nome e informações de contato.

#### Agregado:
Atividade: Representa uma atividade que contém notas, comentários e anexos relacionados a ela. Cada atividade é associada a um professor e pode ter vários alunos submetendo trabalho para ela.



