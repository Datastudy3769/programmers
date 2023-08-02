def solution(num_list):
    answer = 0
    hol = ''
    jak = ''
    for i in num_list:
        if i %2 == 1:
            hol +=str(i)
        else:
            jak +=str(i)
    answer = int(hol)+int(jak)
    return answer