
 

## DOCUMENTO SOFTWARE

  
# Empresa: Serralheria União S/A

## - OBJETIVO DO PROJETO
  Desenvolver um Sistema Desktop Java com integração de Banco de Dados Relacional MYSQL para auxiliar na Administração Operacional da Empresa otimizando seu Sistema de armazenamento de dados, gerando relatórios que ajudem a ter um controle maior sobre a parte Financeira da Empresa, fazendo o armazenamento em banco de Dados, dos dados cadastrais dos Clientes, Funcionários, Produtos e Distribuidores e que realize o registro e armazenamento de Orçamentos solicitados no período assim como o Registro da Venda finalizada.

## - DESCRIÇÃO DOS USUÁRIOS

  (Ator) Proprietário - Responsável pela Loja
  
  (Ator) Gerente - Gerencia os Funcionários, cuida da parte Administrativa.
  
  (Ator) Serralheiro Alumínio - Profissional que fabrica e executa as instalações.
  
  (Ator) Meio Oficial – Profissional que auxilia o Serralheiro.
  
  (Ator) Vendedor - Profissional que executa Vendas.

# NESCESSIDADES APRESENTADAS 
	
 Foi feita uma pesquisa interna nos setores da empresa entrevistando o Proprietário e seus funcionários, para entender os procedimentos aplicados em todos os departamentos da empresa, tendo início no atendimento ao cliente, passando pelos  orçamentos, compra de matéria prima, montagem de esquadrias e por último instalação. 
	A partir desta pesquisa foi possível filtrar as necessidades da empresa e elaborar um plano de ação para o desenvolvimento de um Banco de Dados Relacional que se qualifique em atender as necessidades do Cliente simplificando o armazenamento de dados que vão gerar relatórios que darão um panorama geral do funcionamento da empresa, tanto na parte administrativa, como na parte de serviços e principalmente na área financeira.

##	FUNCIONALIDADES PREVISTAS	

           O Sistema tem como Objetivo o Desenvolvimento das Funcionalidades Listadas a Seguir.

- Registro de Vendas: 

Realizar o Cadastro de Vendas Realizadas no Período, armazenando os dados respectivos, para consultas e relatórios futuros.

-	Cadastro de Clientes:
    Realizar o Cadastro dos Clientes, mantendo assim banco de dados amplo e organizado,
para gerir relatórios de compras e consultas cadastrais ( Endereço, telefone, etc ). 

-	Cadastro de Produtos:
		Realizar o Cadastro de Esquadrias de Alumínio no Sistema, para gerir orçamentos e vendas.

- Cadastro de Funcionários:
		Realizar o Cadastro dos dados Pessoais dos funcionários e Prestadores de Serviço.


-	Cadastro de Colaboradores
		Realizar o Cadastro de Fornecedores e Distribuidores.


-	Sistema de Backup
		Realizar o Backup do sistema periodicamente, armazenando e salvando os dados Obtidos em um provedor externo, e-mail ou nuvem.



-	Sistema de Segurança
		Sistema de Criptografia de Senhas de Usuários e permissões de acesso restrito a determinados níveis do sistema.


##	REQUISITOS FUNCIONAIS: 

•	RF -  001  - Registro de Vendas  

•	RF -  002  - Cadastro de Clientes

•	RF -  003  - Cadastro de Produto

•	RF -  004  - Cadastro Funcionários

•	RF -  005  - Cadastro de Colaboradores


##	DESCRIÇÃO REQUISITOS FUNCIONAIS

#RF 001 – Registro Vendas

Descrição - Efetuar no Sistema o cadastro de uma Venda.

Atores - ( Proprietário, Gerente, Vendedor )

•	Fazer login no Sistema.

•	Cadastrar o Cliente.

•	Cadastrar no Sistema os Itens Vendidos

•	Cadastrar a Venda.


#RF 002 – Cadastro de Clientes

Descrição - Efetuar no Sistema o cadastro de Clientes.

Atores - ( Gerente, Vendedor )

•	Fazer login no Sistema.

•	Cadastrar o Cliente.


#RF 003 – Cadastro de Produto

Descrição - Efetuar no Sistema o Cadastro de Produtos.

Atores - ( Gerente, Vendedor )

•	Fazer login no Sistema.

•	Cadastrar o Produto.

•	Cadastrar Distribuidor.



#RF 004 – Cadastro de Funcionário

Descrição - Efetuar no Sistema o Cadastro de Funcionários.

Atores - ( Proprietário, Gerente)

•	Fazer login no Sistema.

•	Cadastrar o Funcionário.

•	Efetuar permissões de Acesso



#RF 005 – Cadastro de Colaboradores

Descrição - Efetuar no Sistema o Cadastro de Colaboradores.

Atores - ( Proprietário, Gerente)

•	Fazer login no Sistema.

•	Cadastrar Distribuidores.

•	Cadastrar Colaboradores


##	REQUISITOS NÃO FUNCIONAIS:

•	RF - 001 - Sistema de Backup

•	RF - 002 - Infraestrutura (Sistema Operacional, Servidores, Computadores)

•	RF - 003 - Sistema de Segurança (Cadastro Usuários / Permissões / Senhas)

•	RF - 004 - Escalabilidade (Aguentar volume de Usuários)
 



#RF 001 – Infraestrutura

Descrição - Equipamentos e Sistema Operacional para instalação do Sistema.

Atores – Equipe de Instalação

•	Computadores

•	Servidores

•	Microsoft SQL Server

•	Sistema Operacional Windows

#RF 002 – Sistema de Backup

Descrição - Efetuar Periodicamente Backup do  Sistema.

Atores – Administrador de Banco de Dados

•	Microsoft SQLBackupAndFTP

#RF 003 – Segurança

Descrição – Cadastrar e configurar permissões de acesso e senhas de Usuários

Atores – Administrador de Banco de Dados

•	Cadastrar Usuários.

•	Conceder Permissões e Acessos.

•	Criptografar Senhas.

#RF 004 – Escalabilidade

Descrição – Executar normas de Normalização e index no Sistema.

Atores – Equipe Desenvolvimento

•	Adequar o Sistema aos Padrões de Normalização NF1, NF2, NF3

•	Adicionar index para consultar

•	Criar Views





##	METODOLOGIA DE TRABALHO

•	Metodologia: Scrum

•	Sprint: de 2 semanas 

•	Data de início: 2023 - 20 - 03 

•	Cerimonias: 

•	Planning: 2023 - 20- 03 

•	Planning Poker: Junto da Planning 

•	Daily: Ocorre todos os dias, exceto início e fim de sprint 

•	Review: Ocorre no último dia da sprint

•	Retro: Ocorre no último dia da sprint, após a review 


##	TECNOLOGIAS PREVISTAS 

•	Linguagem de Programação JAVA

•	Apache NetBeans IDE 

•	Linguagem de Programação SQL

•	Microsoft MySQL

•	Microsoft MySQL Workbench

•	Microsoft SQL Backup And FTP

•	Microsoft SQL Server

•	Gerenciamento de Projeto - App Trello

•	Interface Gráfica -  Figma

•	Diagramação - Draw Io
	
##	EQUIPE

•	Scrum Master

•	Product Owner

•	Administradores de Banco de Dados

•	Desenvolvedores

•	Testadores

•	Tia do Café

