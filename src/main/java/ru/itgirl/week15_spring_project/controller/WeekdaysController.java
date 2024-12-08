package ru.itgirl.week15_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirl.week15_spring_project.enums.WeekdayName;

@RestController
public class WeekdaysController {
    public String weekdayRussian;

    @GetMapping("/dayOfWeek")
    public String dayOfWeek(@RequestParam(value = "weekdayName", defaultValue = "Weekday") WeekdayName weekdayName) {

        switch (weekdayName) {
            case MONDAY -> {
                weekdayRussian = "понедельник";
            }
            case TUESDAY -> {
                weekdayRussian = "вторник";
            }
            case WEDNESDAY -> {
                weekdayRussian = "среда";
            }
            case THURSDAY -> {
                weekdayRussian = "четверг";
            }
            case FRIDAY -> {
                weekdayRussian = "пятница";
            }
            case SATURDAY -> {
                weekdayRussian = "суббота";
            }
            case SUNDAY -> {
                weekdayRussian = "воскресенье";
            }
        }
        return String.format("Сегодня %s!", weekdayRussian);
    }

}