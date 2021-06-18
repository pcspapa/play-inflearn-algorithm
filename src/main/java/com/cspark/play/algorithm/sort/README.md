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

## Merge sort
1. merge 시 정렬이 이루어짐

## Quick sort
* 분할: 배열을 다음과 같은 조건이 만족되도록 두 부분으로 나눈다.(Pivot)
  - elements in lower parts <= elements in upper parts
* 정복: 각 부분을 순환적으로 정렬한다.
* 합병: nothing to do