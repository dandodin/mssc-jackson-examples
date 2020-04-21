package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = this.getDto();
        String jsonString = objectMapper.writeValueAsString(beerDto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String jsonString = "{\"beerId\":\"857b395b-c57c-4c2d-aa3e-5dd5e281de49\",\"beerName\":\"\",\"beerStyle\":\"\",\"upc\":1223455,\"price\":11.22,\"createdDate\":\"2020-04-21T09:39:06.6104443-07:00\",\"lastUpdatedDate\":\"2020-04-21T09:39:06.6104443-07:00\"}\n";
        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto.toString());
    }
}