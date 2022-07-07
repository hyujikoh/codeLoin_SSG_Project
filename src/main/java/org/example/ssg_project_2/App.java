package org.example.ssg_project_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
        public void run() {
            List<StringBuffer> result = new ArrayList<>();

            System.out.println("== 명언 SSG ==");

            Scanner sc = new Scanner(System.in);
            int i = 1;
            outer:
            while (true) {
                System.out.printf("명령) ");
                String cmd = sc.nextLine().trim();

                switch (cmd) {
                    case "종료":
                        break outer;
                    case "등록":
                        StringBuffer sb = new StringBuffer();
                        System.out.printf("명언) ");
                        String content = sc.nextLine().trim();
                       sb.append("명언"+" :"+ content+ "\n");
                        System.out.printf("작가) ");
                        String author = sc.nextLine().trim();
                        sb.append("작가"+" :"+ author+ "\n");
                        System.out.println(i+"번 게시물이 등록되었다");
                        i++;

                        WiseSaying wiseSaying = new WiseSaying(i,content,author);
                        System.out.println(wiseSaying);
                }
            }

            sc.close();
        }
    }