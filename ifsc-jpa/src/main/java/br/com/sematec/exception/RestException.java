package br.com.sematec.exception;

public class RestException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final RestException ERRO_PARAMETRO = new RestException(604, "O parametro informado nao e valido");

	public static final RestException ERRO_VALOR = new RestException(606, "O valor infomado nao e valido para a pesquisa");
	public static final RestException ERRO_LOGIN = new RestException(607, "Login invalido ou inexistente");
	public static final RestException ERRO_SENHA = new RestException(608, "Senha invalida");
	public static final RestException CLASS_NOT_FOUND = new RestException(610, "N�o foi encontrada a classe.");
	public static final RestException SERVER_ERROR = new RestException(611, "Ocorreu um erro no servidor");
	public static final RestException DISPOSITIVO_NOT_FOUND = new RestException(612, "Dispositivo n�o cadastrado.");
	public static final RestException DISPOSITIVO_DESATIVADO = new RestException(613, "Dispositivo n�o autorizado.");
	public static final RestException ERRO_APIKEY = new RestException(630, "ApiKey n�o � valida");
	public static final RestException INTEGRACAO_DESATIVADA = new RestException(631, "Integra��o para o municipio est� desativada");
	public static final RestException ERRO_NO_BANCO = new RestException(640, "Erro no banco de dados");
	public static final RestException DADOS_INVALIDOS = new RestException(701, "Dados Inv�lidos");

	private Integer codigoErro;

	private RestException(Integer codigoErro, String message) {
		super(message);
		setCodigoErro(codigoErro);
	}

	public RestException(String message) {
		super(message);
		System.out.println(message);
	}

	public RestException(String message, Throwable cause) {
		super(message, cause);
		System.out.println(message);
	}

	public RestException(Throwable cause) {
		super(cause);
	}

	public Integer getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(Integer codigoErro) {
		this.codigoErro = codigoErro;
	}

}
