package model.exceptions;

/*
 * RuntimeException não precisa ser tratada.
 * Classes que são serializable tem objetos que podem ser 
 * convertidos para bytes - gravados em arquivos e trafegar
 * em rede.
 *  
 */
public class DomainException extends Exception {
	private static final long serialVersionUID = 1L; 
	
	/*
	 * O construtor a seguir permite instanciar a exceção
	 * personalizada passando uma mensagem. 
	 */
	
	public DomainException(String msg) {
		super(msg);
	}

}
