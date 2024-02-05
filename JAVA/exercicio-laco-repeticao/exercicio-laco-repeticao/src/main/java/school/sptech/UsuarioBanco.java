package school.sptech;

public class UsuarioBanco {

  private Long id;
  private String primeiroNome;
  private String ultimoNome;
  private String email;
  private String senha;
  private Integer idade;
  private Boolean admin;

  public UsuarioBanco() {
  }

  public UsuarioBanco(Long id, String primeiroNome, String ultimoNome, String email, String senha, Integer idade, Boolean admin) {
    this.id = id;
    this.primeiroNome = primeiroNome;
    this.ultimoNome = ultimoNome;
    this.email = email;
    this.senha = senha;
    this.idade = idade;
    this.admin = admin;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
  }

  public String getUltimoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    this.ultimoNome = ultimoNome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("---------").append('\n');
    sb.append("id:").append(id).append('\n');
    sb.append("primeiroNome:").append(primeiroNome).append('\n');
    sb.append("ultimoNome:").append(ultimoNome).append('\n');
    sb.append("email:").append(email).append('\n');
    sb.append("senha:").append(senha).append('\n');
    sb.append("idade:").append(idade);
    sb.append("admin:").append(admin);
    return sb.toString();
  }
}
