package com.eomcs.pms;

public class App2 {
  public static void main(String[] args) {
    int number = 1201;
    String projectName = "미니 프로젝트 관리 시스템 개발";
    String text = "소규모 팀을 위한 프로젝트 관리 시스템을 개발한다.";
    String start = "2020-01-01";
    String end ="2020-12-31";
    String editer = "홍길동";
    String team = "홍길동,김구,유관순,안중근,윤봉길";

    System.out.println("[프로젝트]");
    System.out.println("번호:" + number);
    System.out.println("프로젝트명:" + projectName);
    System.out.println("내용:" + text);
    System.out.println("시작일:" + start);
    System.out.println("종료일:" + end);
    System.out.println("만든이:" + editer);
    System.out.println("팀원:" + team);
  }
}
