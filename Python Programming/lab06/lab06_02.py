import turtle
t = turtle.Pen()

t.up()
t.goto(-100,0)
t.down()

t.color("Red")
t.pencolor("Black")
t.width(3)

t.begin_fill()
t.left(135)
t.goto(0,-100)
t.left(90)
t.goto(100,0)

t.left(180)
t.circle(70,180)
t.right(90)
t.circle(70,180)
t.end_fill()
