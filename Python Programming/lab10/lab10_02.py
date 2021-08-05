from tkinter import *
import time
tk = Tk()
canvas = Canvas(tk, width = 500, height = 500)
canvas.pack()
canvas.create_polygon(250, 400, 275, 450, 225, 450)


x = 4
y = 5
while True:
    canvas.move(1,x,y)
    tk.update()
    time.sleep(0.05)

    position = canvas.coords(1)

    if position[2] >= 500:
        x = -x

    elif position[4] <= 0:
        x = -x

    elif position[1] <= 0:
        y = -y

    elif position[3] >= 500:
        y = -y

    
   
