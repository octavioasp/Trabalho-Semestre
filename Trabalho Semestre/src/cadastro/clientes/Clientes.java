package cadastro.clientes;

import java.util.ArrayList;

/**
 *
 * @autor Octavio
 */
public class Clientes {

    private int id;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    private String cpf_cnpj;
    private String nascimento;
    private String e_mail;
    private String nomeFantasia;
    private String telefone;
    
    
    ArrayList<Clientes> ListaClientes;

    public Clientes() {
        ListaClientes = new ArrayList();
    }

    public Clientes(int id, String nome, String endereco, String bairro, String cidade, String estado,
            String cep, String pais, String cpf_cnpj, String nascimento, 
            String e_mail, String nomeFantasia, String telefone) {

        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = pais;
        this.cpf_cnpj = cpf_cnpj;
        this.nascimento = nascimento;
        this.e_mail = e_mail;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        
        ListaClientes = new ArrayList();
        

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPai(String pais) {
        this.pais = pais;
    }

    public String getCpf_Cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_Cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getE_Mail() {
        return e_mail;
    }

    public void setE_Mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
   
    public String getTelefone() {
        return telefone;
    }

    public void setTelefonea(String telefone) {
        this.telefone = telefone;
    }
    

    public ArrayList<Clientes> getListaClientes() {
        return ListaClientes;
    }

    public void setListaClientes(ArrayList<Clientes> ListaClientes) {
        this.ListaClientes = ListaClientes;
    }
    
    public void addCliente (Clientes A){
        ListaClientes.add(A);
    }
    
}
