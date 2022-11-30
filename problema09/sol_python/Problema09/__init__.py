positivos = 0
contador = 1
terminoPos = 12
terminoNeg = -11
negativos = 0
serie = "La serie es >>> S1 = 12−11+24−22+36−33+48−44"
mensaje = ""
numero = int(input("Cuál es el número de términos que desea imprimir de la serie:\n" + serie + "\n>>>"))
if numero <= 8:
    while contador <= numero:
        if numero == 1:
            mensaje = mensaje + str(terminoPos)
        elif contador % 2 == 1:
            positivos = positivos + terminoPos
            mensaje = mensaje + "+" + str(positivos)
        elif contador % 2 == 0:
            negativos = negativos + terminoNeg
            mensaje = mensaje + str(negativos)
        contador = contador + 1
else:
    print("el numero ingresado exede el limite de datos de la serie.")

print(mensaje)
