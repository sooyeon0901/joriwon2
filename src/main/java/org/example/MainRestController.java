package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainRestController {
    @GetMapping("/")
    public String test1() {
        // RestTemplate 생성
        RestTemplate restTemplate = new RestTemplate();

        // 공공 API 호출 (예: 기상청 API)
        String apiUrl = "https://openapi.gg.go.kr/PostnatalCare?KEY=cc0c1abbce9d4ba8b3a7d4b01159143f&Type=json&pIndex=1&pSize=10";

        // API 호출 후 결과 받기
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
