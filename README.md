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

- [X] 사용자가 잘못된 값을 입력하는 경우 IllegalArgumentException을 발생시키고 종료한다.
- [ ] 예외 처리 경우
    - 커스텀 구분자가 정의되지 않은 경우 (Done)
    - 구분자 하나만 입력으로 들어온 경우 (Done)
    - 구분자가 연속으로 등장하는 경우 (Done)
    - 잘못된 커스텀 구분자 형식 (Done)
    - 서로 다른 기본 구분자가 포함된 경우 (Done)
    - 커스텀 구분자로 정의되지 않은 구분자가 포함된 경우 (Done)
    - 커스텀 구분자가 여러 개 정의된 경우 (Done)
    - 숫자로 변환할 수 없는 문자가 입력된 경우 (Done)
    - 입력된 문자열 중 숫자가 양수가 아닌 경우 (Done)
    - 커스텀 구분자로 정의된 문자와 실제 입력의 구분자가 서로 다른 경우

### 입력

- [X] 구분자와 양수로 구성된 문자열

### 출력

- [X] 덧셈할 문자열을 입력해 주세요
- [X] 덧셈 결과 출력