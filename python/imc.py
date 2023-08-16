from math import pow

peso=float(input('Quanto você pesa em Kg? (kg) '))
altura=float(input('Quanto você mede em altura? (m)'))
idade = float(input('Qual a sua idade?'))
textoSexo = str(input('Qual o seu sexo?')).upper()
if textoSexo == 'F':
    sexo = float(0)
elif textoSexo == 'M':
    sexo = float(1)
IMC = peso/(pow(altura,2))
BT = (1.20 * IMC) + (0.23 * idade) - (10.8 * sexo) - 5.4
print('O seu IMC é de {:.1f}'.format(IMC) + ' e seu percentual de gordura é de {:1f}'.format(BT))
if IMC < 18.5 and 11 < BT < 20 :
    print('Diagnóstico: Abaixo do peso normal, no seu caso é recomendado comer alimentos com mais fibras, proteínas magras e pães integrais, além de frutas e verduras também')
elif 18.5 <= IMC <25 and 11 < BT < 20:
    print('Diagnóstico: Peso normal e indice de gordura também, continue com uma boa rotina')
elif 25 <= IMC <30 and 11 < BT < 20:
    print('Diagnóstico: Musculoso, um bom peso e um baixo percentual de gordura')
elif 25 <= IMC < 30 and 20 <= BT < 23:
    print('Diagnóstico: Sobrepeso, você está com um pouco de gordura acumulada, tome cuidado, faça exercícios e uma dieta balanceada que o resultado já será surpreendente')
elif 25 <= IMC < 30 and BT >= 23:
    print('Diagnóstico: Obeso, introduza exercícios em sua rotina imediatamente, procure um clínico geral e um nutricionista')
elif 30 <= IMC <40 and 11 < BT < 20:
    print('Diagnóstico: Uma aberração genética, muito músculo e poquissíma gordura, gigante')
elif 30 <= IMC < 40 and 20 <= BT < 23:
    print('Diagnóstico: Um fordo, tem muito musculo mas também gordura acumulada, muito dificil ganhar músculo sem ganhar gordura também, bastante cardio e uma dieta voltada para o déficit calórico  são recomendados')
elif 30 <= IMC < 40 and BT >= 23:
    print('Diagnóstico: Obeso, introduza exercícios em sua rotina imediatamente, procure um clínico geral e um nutricionista')
elif IMC >=40 and 11 < BT < 20:
    print('Diagnóstico: A vida é feita de ciclos, não é mesmo? Acha que engana quem com esse corpo de fisiculturisca? Se for viajar te prendem no aeroporto por usar tanta bomba!')
elif IMC >=40 and 20 <= BT < 23:
    print('Diagnóstico: Obeso, introduza exercícios em sua rotina imediatamente, procure um clínico geral e um nutricionista')
elif IMC >= 40 and BT >= 23:
    print('Diagnóstico: obesidade mórbida procure ajuda médica IMEDIATAMENTE')

