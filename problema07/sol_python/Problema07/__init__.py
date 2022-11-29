contador = int(input("Ingrese un numero par"))
suma = 0
limite = int(input("Ingrese un limite"))
cadena = " "
while (contador > 2 and contador<=limite):
    if contador %2==0:
        suma = suma + contador
        numero = contador + 2
        print("La suma es: ", suma)
    else:
        print("error")



