import exercicioClasseAbstrata.Fisica;
import exercicioClasseAbstrata.Juridica;
import exercicioClasseAbstrata.Pessoa;

public class Executor {
    
    public static void main(String[] args){
        Juridica empresa = new Juridica();
        empresa.setNome("Felipe");
        empresa.setCnpj("12.345.678/0001-00");
        empresa.setRazaoSocial("EngeCode");
        empresa.setTelefone("(11) 1234-5678");
        empresa.setPatrimonio(40000d);
        imprimir(empresa);

        Fisica pessoa = new Fisica();
        pessoa.setNome("Beatriz");
        pessoa.setSobrenome("de Sousa Espinoza");
        pessoa.setCpf("111.222.333-44");
        pessoa.setTelefone("(11) 91234-5678");
        pessoa.setPatrimonio(100000d);
        imprimir(pessoa);
    }

    private static void imprimir(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " possui patrimonio de R$" + pessoa.getPatrimonio());
    }

}
