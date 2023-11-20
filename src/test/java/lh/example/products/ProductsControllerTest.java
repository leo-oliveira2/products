package lh.example.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testProduto() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/prd"))
                .andExpect(status().isOk());
    }

}