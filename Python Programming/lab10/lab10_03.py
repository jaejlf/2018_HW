from tkinter import *
import random
import time
tk = Tk()
canvas = Canvas(tk, width = 500, height = 500)
canvas.pack()

colors = ['red','pink','blue','purple','violet','orange','yellow', 'green']


width = 500
height = 500
step = 5

while True:

    #원이 커지는    
    for i in range(10, 250, step):        
            
        x1 = width / 2 - i
        y1 = height / 2 - i
        x2 = width / 2 + i
        y2 = height / 2 + i
        canvas.create_arc(x1, y1, x2, y2, extent=359,style=ARC, outline = random.choice(colors))
        tk.update()
        time.sleep(0.05)
        canvas.delete('all')


    #원이 작아지는
    for i in range(250,10,-step):
        
        x1 = width / 2 - i
        y1 = height / 2 - i
        x2 = width / 2 + i
        y2 = height / 2 + i
        canvas.create_arc(x1, y1, x2, y2, extent=359,style=ARC, outline = random.choice(colors))
        tk.update()
        time.sleep(0.05)
        canvas.delete('all')

    

            
