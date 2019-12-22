package petroff.jaros.msscbreweryclient.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import petroff.jaros.msscbreweryclient.model.dto.in.BeerDto;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getBeerById() {
        BeerDto response = client.getBeerById(1L);

        assertNotNull(response);
    }
}