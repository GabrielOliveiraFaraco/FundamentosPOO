public class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private int cep;
    private Municipio municipio;

    public Endereco(String logradouro, int numero, String bairro, int cep, Municipio municipio){
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.municipio = municipio;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public int getCep() {
        return cep;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
