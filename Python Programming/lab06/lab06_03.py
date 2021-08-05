import turtle
import random

t = turtle.Pen()

for i in range(6):
    t.left(60)
    t.forward(100)
    for j in range(6):
       t.pencolor(random.random(),random.random(),random.random())
       t.right(60)
       t.forward(100)
