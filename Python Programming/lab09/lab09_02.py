booklist = []


class Book():
    __counter = 0     

    #초기화
    def __init__(self,writer,title,charge,page):
        self.writer = writer
        self.title = title
        self.charge = charge
        self.page = page
        
        Book.__counter += 1


    #소멸
    def __del__(self):
        Book.__counter -= 1
        

    #출력
    def print_book():
        print("="*50)
        for i in range (len(booklist)):
            print("저자 : " + booklist[i].writer)
            print("제목 : " + booklist[i].title)
            print("가격 : " + booklist[i].charge)
            print("페이지 수 : " + booklist[i].page)
            print()
        print("전체 책의 개수는 %d개 입니다." % Book.book_count()) 

            
    #count
    def book_count():
        return Book.__counter




###실행###
    
while True :
    
    print("="*50)
    print("1. 책 추가")
    print("2. 책 삭제")
    print("3. 전체 책 출력")
    print("4. 종료")
    print("-"*50)
    choice = input("선택 : ")


    #책 추가
    if choice == '1':
        print()
        writer = input("작가 : ")
        title = input("제목 : ")
        charge = input("가격 : ")
        page = input("페이지 수 : ")


        booklist.append(Book(writer,title,charge,page))


    #책 삭제
    elif choice == '2':
        print()
        index = int(input("삭제할 책의 인덱스를 입력하세요 : "))
        del booklist[index] 
        
        

    #전체 책 출력
    elif choice == '3':
        print()
        Book.print_book()
        

    #종료
    elif choice == '4':
        print()
        print("이용해주셔서 감사합니다.")
        break

    
   #잘못 입력했을 때
    else:
        print()
        print("잘못 입력했습니다.")
        
