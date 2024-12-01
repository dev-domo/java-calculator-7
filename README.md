# java-calculator-precourse

## 기능 구현 목록

### 목표 : 입력한 문자열에서 숫자를 추출하여 더하는 계산기

### Input type 분리

- [X] 쉼표나 콜론을 구분자로 가지는 문자열은 BasicInputType으로 분리한다.
- [X] //와 \n 사이에 커스텀 구분자를 지정하는 문자열은 CustomInputType으로 분리한다.
- [X] null이나 빈 문자열은 EmptyInputType으로 분리한다.

## 계산할 숫자 리스트 제작

- [X] EmptyInputType은 0만 담긴 숫자 리스트를 반환한다.
- [X] BasicInputType은 콤마 혹은 콜론 기준으로 나누어 숫자 리스트를 반환한다.
- [X] CustomInputType은 커스텀 구분자 기준으로 나누어 숫자 리스트를 반환한다.

## 덧셈 계산

- [X] 숫자 리스트에서 숫자 하나씩 꺼내 덧셈을 계산한다.

### 예외

- [ ] 사용자가 잘못된 값을 입력하는 경우 IllegalArgumentException을 발생시키고 종료한다.

### 입력

- [X] 구분자와 양수로 구성된 문자열

### 출력

- [X] 덧셈할 문자열을 입력해 주세요
- [X] 덧셈 결과 출력