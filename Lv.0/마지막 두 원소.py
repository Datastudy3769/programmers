def solution(num_list):
    answer=num_list
    if num_list[-1]>num_list[-2]:
        a=num_list[-1]-1
        answer.append(a)
    elif num_list[-1]<=num_list[-2]:
        a=2*num_list[-1]
        answer.append(a)
    return answer