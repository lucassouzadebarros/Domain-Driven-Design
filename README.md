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


