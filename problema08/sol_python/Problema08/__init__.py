metros = int(input("Ingrese el numero de metros limite"))
contador = 1
yardas = 3
pulgadas = 2.54
pies = 12
opcion = " "
mensaje = " "
bandera = True
opcion = " "
while contador <= metros:
    yardas = contador * yardas
    pulgadas = pulgadas * contador
    pies = pies * contador
    mensaje = print(f"{contador},  {metros} ,  {yardas} pie,  {pulgadas} cm,  {pies} pulgadas")
    contador = contador + 1

print(mensaje)

