# O método set() é apenas um outro jeito de se criar um conjunto


conjunto_processsador = {'CPU', 'Registrador', 'Core'}
conjunto_processsador2 = set(['CPU', 'Registrador', 'Core'])

print(conjunto_processsador2)

lista_process = {'CPU', 'Registrador', 'Core', 'CPU'}
conjunto_processsador3 = set(lista_process)
print(conjunto_processsador3)
print(lista_process)

user_Thor = {'mysql', 'CPU', 'RAM', 'SSD1', 'Google'}
user_Thanos = {'LoL', 'CPU', 'RAM', 'HD', 'Google'}
user_CA = {'mysql', 'LOL', 'RAM', 'CPU', 'Firefox'}
user_TS = {'mysql', 'CPU', 'RAM', 'SSD1', 'Google'}

inventario1 = user_Thor.union(user_CA, user_Thanos, user_TS)
print(inventario1)
inventario2 = user_Thor & user_CA & user_Thanos & user_TS
print(inventario2)
inventario3 = user_Thor - user_Thanos