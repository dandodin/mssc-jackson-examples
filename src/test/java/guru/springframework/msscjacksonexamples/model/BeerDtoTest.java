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
        String jsonString = "{\"beerName\":\"Kilt Lifter\",\"beerStyle\":\"Brown\",\"upc\":1223455,\"price\":\"11.22\",\"createdDate\":\"2020-04-21T10:21:-0700\",\"lastUpdatedDate\":\"2020-04-21T10:21:-0700\",\"localDate\":\"20200421\",\"beerId\":\"416c749e-40c6-4e8c-8769-bda24e1d9416\"}\n";
        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(beerDto.toString());
    }
}