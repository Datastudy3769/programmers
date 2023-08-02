def solution(a, d, included):
    answer = 0
    list=[]

    for k in range(len(included)+1):
        list.append(a+k*d)

    for i in range(len(included)):
        if included[i] == 1:
            answer +=list[i]
        elif included[i] == 0:
            pass
    return answer