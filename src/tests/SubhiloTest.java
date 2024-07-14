package tests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import clases.Subhilo;

public class SubhiloTest {
	@Test
	public void subhiloConstruidoOK(){

		var s1 = new Subhilo("primero", 1);
		assertEquals(s1.getNombre(), "primero");
		assertEquals(s1.getN(), 1);
	}
}
