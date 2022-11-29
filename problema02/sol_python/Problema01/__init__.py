trajes = int(input("Ingrese el numero de trajes a alquilar"))
unitario = float(input("Ingrese el valor unitario del traje"))
subtotal = 0
total = 0
if trajes==1:
    subtotal = unitario * trajes
    descuento = 0.20
    descuento = subtotal * descuento
elif trajes == 2:
    subtotal = unitario * trajes
    descuento = 0.25
    descuento = subtotal * descuento
elif trajes == 3:
    subtotal = unitario * trajes
    descuento = 0.40
    descuento = subtotal * descuento
else:
    subtotal = unitario * trajes
    descuento = 0.50
    descuento = subtotal * descuento

total = subtotal - descuento
print("El valor subtotal es : ")
print(subtotal)
print("El valor del descuento es : ")
print(descuento)
print("El valor total es : ")
print(total)