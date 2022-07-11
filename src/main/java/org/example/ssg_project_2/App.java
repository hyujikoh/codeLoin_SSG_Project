package org.example.ssg_project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {
        List<WiseSaying> result = new ArrayList<>();

        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);
        int i = 1;
        outer:
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();
            Rq rq = new Rq(cmd);
            switch (rq.getPath()) {
                case "종료":
                    break outer;
                case "등록":
                    System.out.printf("명언) ");
                    String content = sc.nextLine().trim();

                    System.out.printf("작가) ");
                    String author = sc.nextLine().trim();

                    System.out.println(i + "번 게시물이 등록되었다");


                    WiseSaying wiseSaying = new WiseSaying(i, content, author);
                    result.add(wiseSaying);
                    System.out.print(result);
                    i++;
                    continue;
                case "조회":
                    System.out.printf("번호) ");
                    int index = sc.nextInt();
                    //result.get(Integer.parseInt(index));
                    System.out.println(result.get(index - 1));
                    //i++;
                    continue;
                case "수정":
                    
                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");
                    for (int ia = result.size() - 1; ia >= 0; ia--) {
                        WiseSaying wiseSaying_ = result.get(ia);
                        System.out.printf("%d / %s / %s\n", wiseSaying_.id, wiseSaying_.content, wiseSaying_.author);

                    }
                    break;

                case "삭제":
                    // URL에 입력된 id 얻기
                    int paramId = rq.getIntParam("id", 0);

                    // URL에 입력된 id가 없다면 작업중지
                    if (paramId == 0) {
                        System.out.println("id를 입력해주세요.");
                        continue;
                    }
                    // URL에 입력된 id에 해당하는 명언객체 찾기
                    WiseSaying wiseSaying__ = null;

                    for (WiseSaying wiseSaying___ : result) {
                        if (wiseSaying___.id == paramId) {
                            wiseSaying__ = wiseSaying___;
                        }
                    }
                    // 찾지 못했다면 중지
                    if (wiseSaying__ == null) {
                        System.out.printf("%d번 명언은 존재하지 않습니다..\n", paramId);
                        continue;
                    }

                    // 입력된 id에 해당하는 명언객체를 리스트에서 삭제
                    result.remove(wiseSaying__);

                    System.out.printf("%d번 명언이 삭제되었습니다.\n", paramId);
                    break;

            }
        }

        sc.close();
    }
}