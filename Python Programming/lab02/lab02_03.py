import math
x1=int(input("첫 번째 x좌표 입력: "))
y1=int(input("첫 번째 y좌표 입력: "))
x2=int(input("두 번째 x좌표 입력: "))
y2=int(input("두 번째 y좌표 입력: "))
result=math.sqrt(math.pow((x2-x1),2)+math.pow((y2-y1),2))
print("두 점 사이의 거리:",result)
