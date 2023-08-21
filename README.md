# mini_project-notice_board
프로젝트 시작하기 전에 게시판에 대해 공부하기 위해서 만들었습니다.

## API설계
1. PostController
   1. Post
      * 게시글 작성
        ```
            http://localhost:8080/v1/posts
        ```
      * body에서 입력한 내용
        ```
        {
            "title" : "안녕하세요!",
            "context" : "앞으로 잘부탁드려요!",
            "writer" : "해피",
            "password" : "1234"
        }
        ```
   2. Get
        * 전체 게시글 가져오기
           ```
               http://localhost:8080/v1/posts
            ```
      * 결과
           ```
           [
               {
                   "number": 1,
                   "savedAt": "2023-08-21",
                   "modifiedAt": "2023-08-21",
                   "deleteAt": null,
                   "ip": null,
                   "title": "안녕하세요!",
                   "password": "1234",
                   "context": "앞으로 잘부탁드려요!",
                   "writer": "해피",
                   "commentEntity": []
               },
               {
                   "number": 2,
                   "savedAt": "2023-08-21",
                   "modifiedAt": "2023-08-21",
                   "deleteAt": null,
                   "ip": null,
                   "title": "안녕하세요!",
                   "password": "1234",
                   "context": "앞으로 잘부탁드려요!",
                   "writer": "해피",
                   "commentEntity": []
               }
          ]
      * 특정 게시글 가져오기
         ```
           http://localhost:8080/v1/posts/view/1
         ```
        * 결과
          ```
              {
                     "number": 1,
                     "savedAt": "2023-08-21",
                     "modifiedAt": "2023-08-21",
                     "deleteAt": null,
                     "ip": null,
                     "title": "안녕하세요!",
                     "password": "1234",
                     "context": "앞으로 잘부탁드려요!",
                     "writer": "해피",
                     "commentEntity": []
                 }
          ```
   3. Patch
        * 게시글 수정하기
          ```
          http://localhost:8080/v1/posts/1
          ```
        * 입력한 값
          ```
          {
             "title" : "안녕하세요! 수정",
             "context" : "앞으로 잘부탁드려요!",
             "writer" : "해피",
             "password" : "1234"
           }
             ```
          * 결과
            ```
            {
               "number": 1,
               "savedAt": "2023-08-21",
               "modifiedAt": "2023-08-21",
               "deleteAt": null,
               "ip": null,
               "title": "안녕하세요! 수정",
               "password": "1234",
               "context": "앞으로 잘부탁드려요!",
               "writer": "해피",
               "commentEntity": []
               }
             ```
   4. Delete
        * 게시글 삭제하기
          ```
            http://localhost:8080/v1/posts/1
          ```
        * 입력한 값
          ```
            {
             "password": "1234"
             }
          ```
        * 결과 - GET으로 출력시 해당 게시글 삭제된 것을 확인
2. CommentController
    1. Post
    2. Get
    3. put
    4. delete