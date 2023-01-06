package bera31.Project.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.time.Duration;

@Repository
@RequiredArgsConstructor
public class RedisRepository {
    private final RedisTemplate<String, String> redisTemplate;

    public void setValues(String key, String value){
        redisTemplate.opsForValue().set(key, value);
    }

    public void setValues(String key, String value, long lifetime){
        Duration duration = Duration.ofSeconds(lifetime);
        redisTemplate.opsForValue().set(key, value, duration);
    }

    public String getValues(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public void deleteValues(String key) {
        redisTemplate.delete(key);
    }
}
