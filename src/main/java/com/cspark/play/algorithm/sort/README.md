# 정렬 (Sort)

* Selection sort
* Bubble sort
* Insertion sort

* Merge sort
* Quick sort
* Heap sort

* Radix sort

## Selection sort
1. The largest item
1. swap (last item)

## Bubble sort
1. 두 값 비교
1. swap

## Insertion sort
1. start at 2nd item
1. copy the item to tmp   
1. compare and shift

## 분할정복법 (Divide and Conquer)
> Merge sort, Quick sort

* 분할: 해결하고자 하는 문제를 작은 크기의 동일한 문제들로 분할
* 정복: 각각의 작은 문제를 순환적으로 해결
* 합병: 작은 문제의 해를 합하여(merge) 원래 문제에 대한 해를 구함

### Merge sort
1. merge 시 정렬이 이루어짐

### Quick sort
* 분할: 배열을 다음과 같은 조건이 만족되도록 두 부분으로 나눈다.(Pivot)
  - elements in lower parts <= elements in upper parts
* 정복: 각 부분을 순환적으로 정렬한다.
* 합병: nothing to do

## Heap sort
이진 힙(binary heap) 자료구조를 사용
* Full Binary Tree VS Complete Binary Tree
* Heap
  - Complete Binary Tree이면서
  - heap property를 만족해야
    - max heap property: 부모는 자식보다 크거나 같다.
    - min heap property: 부모는 자식보다 작거나 같다.
  - 힙은 일차원 배열로 표현가능: A[1..n] 
    - A[i]의 부모 = A[1/2]
    - A[i]의 왼쪽 자식  = A[2i]
    - A[i]의 오른쪽 자식  = A[2i+1]
* 기본연산: MAX-HEAPIFY
  - 전체를 힙으로 만들어라.
    - 트리의 전체 모양은 Complete Binary Tree
    - 유일하게 루트만이 heap property를 만족 안함
    - 왼쪽 부트리(subtree)는 그 자체로 heap
    - 오른쪽 부트리(subtree)는 그 자체로 heap
  
## 정렬의 lower bound
* Comparison sort
  * 데이터간의 상대적 크기관계만을 이용해서 정렬하는 알고리즘
  * 따라서 데이터들간의 크기 관계가 정의되어 있으면 어떤 데이터든 적용가능
  * 버블, 삽입, 합병, 퀵, 힙 등...
* Non Comparison sort
  * 정렬할 데이터에 대한 사전지식을 이용 - 적용에 제한
  * Bucket Sort
  * Radix Sort
  
### Lower bound - Comparison sort
* 입력된 데이터를 한 번씩 다 보기위해서 최소 O(n)의 시간복잡도 필요
* 합병정렬과 힙정렬 알고리즘들의 시간복잡도 O(nlong2n)
* 어떤 Comparison sort 알고리즘도 O(nlog2n)보다 나을 수 없다.

### 선형시간 정렬 알고리즘(sorting in linear time)
### Counting sort
* k가 클 경우 비실용적
* Stable 정렬 알고리즘 
  - 입력에 동일한 값이 있을 때 입력에 먼저 나오는 값이 출력에서도 먼저 나온다.
  
### Radix Sort
* n개의 d자리 정수들(고정된 길이)
* 가장 낮은 자리수부터 정렬 (각 자리의 정렬이 Stable 정렬)


## Sorting in Java
* Comparable
  - 한 가지 기준으로 정렬 고정됨
* Comparator
  - 두 가지 이상의 기준으로 정렬 시 필요에 따라 각각의 기준에 맞게 사용