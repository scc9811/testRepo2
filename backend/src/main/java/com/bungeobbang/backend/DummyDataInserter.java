package com.bungeobbang.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class DummyDataInserter {
    private final JdbcTemplate jdbcTemplate;

    @EventListener(ApplicationReadyEvent.class) // 애플리케이션이 완전히 실행된 후 실행됨
    public void insertDummyOpinions() {
        String sql = """
            INSERT INTO opinion (university_id, member_id, opinion_type, category_type, is_remind, chat_count, created_at)
            VALUES (?, ?, ?, ?, ?, ?, ?)
        """;

        Random random = new Random();
        String[] opinionTypes = {"IMPROVEMENT", "NEED", "SUGGESTION", "INQUIRY"};
        String[] categoryTypes = {"ACADEMICS", "FACILITIES", "BUDGET", "CLUBS", "EVENTS", "IT", "TRANSPORTATION", "OTHER"};

        List<Object[]> batchArgs = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Object[] params = {
                    random.nextInt(2) + 1, // university_id: 1~2
                    random.nextInt(10) + 1, // member_id: 1~10
                    opinionTypes[random.nextInt(opinionTypes.length)], // opinion_type 랜덤
                    categoryTypes[random.nextInt(categoryTypes.length)], // category_type 랜덤
                    random.nextBoolean(), // is_remind 랜덤
                    random.nextInt(20) + 1, // chat_count: 1~20 랜덤
                    LocalDateTime.now().minusDays(random.nextInt(365)) // created_at: 1년 이내 랜덤 날짜
            };
            batchArgs.add(params);
        }

        jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println("✅ 1,000개의 더미 데이터가 삽입되었습니다.");
    }
}
