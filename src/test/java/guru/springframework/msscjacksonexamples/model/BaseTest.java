package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder()
            .beerName("Kilt Lifter")
            .beerStyle("Brown")
            .id(UUID.randomUUID())
            .createdDate(OffsetDateTime.now())
            .lastUpdatedDate(OffsetDateTime.now())
            .price(new BigDecimal("11.22"))
            .upc(1223455L)
            .localDate(LocalDate.now())
            .build();
    }
}
