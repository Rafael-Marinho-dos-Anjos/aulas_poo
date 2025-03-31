# Exercícios - Superclasses e Subclasses
[<-- Voltar](./README.md)

### 1. Funcionários

Em uma empresa existem 2 tipos de empregados em relação à modalidade de pagamento: Horistas e Mensalistas.

Horistas são funcionários que não possuem carga horária contratada fixa e recebem proporcional a isso.

Mensalistas possuem carga horária contratada e salário fixo, sendo que o salário pode sofrer descontos caso o funcionário trabalhe menos horas do que o contratado ou pode receber por hora extra.

Escreva uma superclasse ```Funcionario```, que irá implementar os métodos e atributos que as subclasses ```Mensalista``` e ```Horista``` possuem em comum. Depois implemente as subclasses também.

Métodos e atributos:

| Atributo | Descrição | ```Funcionario``` | ```Mensalista``` | ```Horista``` |
|----------|-----------|-------------------|------------------|---------------|
| Nome | Nome do funcionário | &check; | &check; | &check; |
| CPF | CPF do funcionáiro | &check; | &check; | &check; |
| Base | Salário base caso seja funcionário, valor da hora caso seja horista | &check; | &check; | &check; |
| Horas trabalhadas | Total de horas trabalhadas no mês | &check; | &check; | &check; |
| Horas contratadas | Total de horas de trabalho no mês | &cross; | &cross; | &check; |

| Atributo | Descrição | ```Funcionario``` | ```Mensalista``` | ```Horista``` |
|----------|-----------|-------------------|------------------|---------------|
| Registrar horas | Registrar horas trabalhadas (acumular no atributo de horas trabalhadas) | &check; | &check; | &check; |
| Fazer pagamento | Calcular e retornar valor a ser pago | &cross; | &check; | &check; |

Cálculo do pagamento:

- Horista:

$$ valor_{Pago} = horas_{trabalhadas} \cdot valor_{hora} $$

- Mensalista:

$$ valor_{Pago}=\left\lbrace \begin{array}{lc}
    salário_{base} \text{ se } horas_{trabalhadas} = horas_{contratadas}, \\
    salário_{base} + \Delta hora \cdot \frac{salário_{base}}{horas_{contratadas}} \text{ se } horas_{trabalhadas} < horas_{contratadas}, \\
    salário_{base} + 1.5 \cdot \Delta hora \cdot \frac{Salário_{base}}{Horas_{contratadas}} \text{ se } horas_{trabalhadas} > horas_{contratadas}, \\
    \end{array}\right.$$

Onde

$\Delta hora = horas_{trabalhadas} - horas_{contratadas}$