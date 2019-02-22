package security.enums;

public enum Perfil {

	ADMIN(1, "ROLE_ADMIN"),
	CLIENTE(2, "ROLE_CLIENTE");
	
	private Integer cod;
	private String descricao;
	
	private Perfil(Integer cod, String desc) {
		this.cod = cod;
		this.descricao = desc;
	}
	
	public Integer getCod() {
		return this.cod;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public Perfil toEnum(Integer cod) {
		
		//Algoritmo de verificaçõ do enum
		if(cod != null) {
			for(Perfil perfil : Perfil.values()) {
				if(perfil.getCod() == cod) {
					return perfil;
				}
			}
		}
		
		throw new IllegalArgumentException("Código inválido: " + cod);
	}
}
