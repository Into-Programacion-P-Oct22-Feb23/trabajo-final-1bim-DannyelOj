nombre = input("Ingrese el nombre del empleado")
tipoEmpledo = int(input("Ingrese el tipo de empleado"))
numeroHoras = int(input("Ingrese el numero de horas"))
horasExtras = int(input("Ingrese el numero de horas extras"))
costoHora = float(input("Ingrese el valor de hora trabajada"))
total = 0
if horasExtras >= 40:
    if tipoEmpledo==1:
        costoHora = costoHora * 1.5
        horasExtras = horasExtras * costoHora
    else:
        if tipoEmpledo==2:
            costoHora = costoHora * 2
            horasExtras = horasExtras * costoHora
        else:
            if tipoEmpledo==3:
                costoHora = costoHora * 2.5
                horasExtras = horasExtras * costoHora
            else:
                if tipoEmpledo == 4:
                    costoHora = costoHora * 3
                    horasExtras = horasExtras * costoHora
    costoHora = costoHora * numeroHoras
    total = total + horasExtras * costoHora
else:
    costoHora = costoHora * numeroHoras
    total = total + costoHora
print("Datos del cliente")
print(nombre)
print(tipoEmpledo)
print(numeroHoras)
print(total)



