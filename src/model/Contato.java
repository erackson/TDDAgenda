package model;

/**
 * @author Erackson Brito <erackson@gmail.com>
 */
public class Contato
{
	private String nome;
	private String email;
	private String fone;

	public String getNome()
	{
		return nome;
	}

	public boolean validarInicialNome(String nome){
		return nome.matches("^[a-zA-Z].*");
	}

	public boolean validarQuantidadeCaracteres(String nome){
		return nome.length() <= 25 && nome.length() >= 2;
	}

	public boolean validarEmailArroba(String email){
		return email.matches("[^@]+@{1}[^@]+");
	}

	public boolean validarFoneApenasNumeros(String fone){
		return fone.matches("\\d{8,14}");
	}

	public boolean setNome(String nome)
	{
		if(this.validarInicialNome(nome) && this.validarQuantidadeCaracteres(nome))
			this.nome = nome;
		else
			return false;
		return true;
	}

	public String getEmail()
	{
		return email;
	}

	public boolean setEmail(String email)
	{
		if(validarEmailArroba(email))
			this.email = email;
		else
			return false;
		return true;
	}

	public String getFone()
	{
		return fone;
	}

	public boolean setFone(String fone)
	{
		if(validarFoneApenasNumeros(fone))
			this.fone = fone;
		else
			return false;
		return true;
	}
}
