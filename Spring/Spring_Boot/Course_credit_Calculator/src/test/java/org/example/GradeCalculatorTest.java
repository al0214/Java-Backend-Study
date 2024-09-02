package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
* 요구 사항
* 평균 학점 계산 방법 = (학점 수 * 교과목 평점)의 합계 / 수강 신청 총 학점 수
* 일급 컬렉션 사용
* */
public class GradeCalculatorTest {
    // 학점 계산기 도메인 : 이수한 과목(객체 지향 프로그래밍, 자료 구조, 중국어 회화), 학점 계산기
    // 객체 지향 프로그래밍, 자료 구조, 중국어 회화 --> 과목(코스) 클래스

    // 이수한 과목을 전달하여 평균 학점 계산 요청 ---> 학점 계산기 ----> (학점수 * 교과목 평점 )의 합계 ---> 과목
    //                                               -----> 수강 신청 총 학점 수         ---> 과목

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
