numero = 2
limite = int(input("Ingrese un numero par"))
suma = 0
cadena = " "
if numero %2==0:
    while numero <= limite :
        cadena = print(f" {numero} ", end= " ")
        suma = suma + numero
        numero = numero +2
else:
    print("error")

print(f"La suma es: {suma}")