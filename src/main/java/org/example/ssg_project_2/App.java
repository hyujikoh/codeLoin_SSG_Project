package org.example.ssg_project_2;

import java.util.Scanner;

public class App {
        public void run() {
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
                        System.out.printf("명언) ");
                        String desc = sc.nextLine().trim();
                        System.out.printf("작가) ");
                        String author = sc.nextLine().trim();
                        System.out.println(i+"번 게시물이 등록되었다");
                        i++;
                }
            }

            sc.close();
        }
    }