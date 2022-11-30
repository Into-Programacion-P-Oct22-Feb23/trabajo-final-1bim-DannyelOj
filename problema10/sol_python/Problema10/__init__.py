bandera = True
datoInicial = 0
mensaje = 0
contador = 0
media = 0
opcion = "b"
while bandera:
    datoInicial = int(input("ingrese el dato a calcular:"))
    mensaje = mensaje + datoInicial
    opcion = input("ingrese s para salir\n>>>")
    contador = contador + 1
    if opcion == "s":
        bandera = False
media = mensaje/contador
print(f"La media es de :{media}")