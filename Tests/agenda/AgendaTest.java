package agenda;

import junit.framework.TestCase;
import model.Contato;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Erackson Brito <erackson@gmail.com>
 */
public class AgendaTest extends TestCase
{
	public Contato contato;

	@Before
	public void setUp(){
		this.contato = new Contato();
	}

	@Test
	public void testNomeIniciarComLetra()
	{
		assertTrue(this.contato.setNome("Marília"));
		assertFalse(this.contato.setNome("1Marília"));
		assertFalse(this.contato.setNome("2Marília"));
	}

	@Test
	public void testMinMaxCaracteres(){
		assertTrue(this.contato.setNome("Marília Freire De Souza S"));
		assertFalse(this.contato.setNome("Marília Freire De Souza Si"));
		assertTrue(this.contato.setNome("Marília"));
		assertTrue(this.contato.setNome("Ma"));
		assertFalse(this.contato.setNome("M"));
	}

	@Test
	public void testEmailArroba(){
		assertTrue(this.contato.setEmail("marilia@gmail.com"));
		assertFalse(this.contato.setEmail("@gmail.com"));
		assertFalse(this.contato.setEmail("marilia@"));
		assertFalse(this.contato.setEmail("mari@lia@gmail.com"));
	}

	@Test
	public void testFoneApenasNumeros(){
		assertTrue(this.contato.setFone("8488889999"));
		assertFalse(this.contato.setFone("(84) 8888-9999"));
		assertTrue(this.contato.setFone("12345678901234"));
		assertTrue(this.contato.setFone("1234567890123"));
		assertTrue(this.contato.setFone("123456789"));
		assertTrue(this.contato.setFone("12345678"));
		assertFalse(this.contato.setFone("1234567"));
		assertFalse(this.contato.setFone("123456789012345"));
	}
}
