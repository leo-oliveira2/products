package lh.example.products;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductsApplicationTests {
	ImpostoCalculator imposto;
	DescontoManager desconto;


	@Test
	void calcularImpostoTest(){
		assertEquals(imposto.calcularImposto(10), 1);
		assertEquals(imposto.calcularImposto(100),10);
	}

	@Test
	void aplicarDescontoTest(){
		assertEquals(desconto.aplicarDesconto(100, 10), 90);
	} 
	
}
