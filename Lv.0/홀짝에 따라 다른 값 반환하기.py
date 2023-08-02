def solution(a):
    answer = 0
    i=0
    n=0
    if a%2 ==1:
        for i in range(int((a -1)/2)+1):
            n= n+(2*i+1)
        answer=n
    elif a%2 ==0:
        for i in range(int(a /2)+1):
            n= n+((2*i)**2)
        answer=n
    return answer