HTTP는 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol HyperText Transfer Protocol의 약자이다.
HTTP는 비 연결성과 무상태성을 가지고있는 TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송하지만 서버는 클라이언트와 연결에 대한 정보를 저장하지않아 식별하지 못한다.
HTTP의 연결의 과정으로는 TCP연결을 열어준다 -> HTTP메시지 전송한다 -> 서버가 보낸 응답을 읽는다 -> 연결을 닫거나 다른 요청을 위해 재사용한다로 나타낼 수 있다.
클라이언트가 서버에 특정 요청을 보낼때, 웹서버에게 요청하는 목적 및 그 종류를 알리는 수단으로 HTTP Method를 사용한다.



HTTPS는 HyperText Transfer Protocol over Secure Socket Layer의 약자로 기존 HTTP의 보안이 강화된 버전이다. 
SSL(보안 소켓 계층)을 사용하여 서버와 브라우저 사이에 안전하게 암호화된 연결을 만들 수 있게 도와주고, 서버 브라우저가 민감한 정보를 주고받을 떄 이것이 도난당하는 것을 막아줍니다.
HTTP와 HTTPS의 큰 차이점은 보안성에 있다.



이벤트 목록 조회              GET    /events/lists

이벤트 조회                  GET    /events

이벤트 등록                  POST   /events

이벤트 수정                  PUT    /events

이벤트 삭제                  DELETE  /events

이벤트 상태 변경              PATCH   /events/states

특정 이벤트의 주문 목록 조회    GET    /events/{eventId}/orders/lists

멤버 목록 조회                GET    /members/lists

특정 멤버 권한 변경           PATCH   /members/{memberId}/authorities

특정 멤버 정보 조회           GET    /members/{memberId}

특정 멤버 정보 변경           PATCH   /members/{memberId}

멤버 등록                    POST    /members
