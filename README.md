# Sobre
O Dinheirama é uma biblioteca para ser usada em conjunto com a nova Money API. Esta biblioteca contém, até o momento, uma simples implementação da interface **MonetaryQuery** para converter um valor em **MonetaryAmount** para uma representação por extenso. Por exemplo, o valor R$ 10,00 será convertido para a String "Dez reais".

# Instalação
Infelizmente, a burocracia de criar um repositório no Maven Central é grande e a preguiça falou mais alto! :) Até o momento, a única forma de utilizar este projeto é clonando-o e gerando o JAR usando o Maven. Em breve, vamos criar um repositório Maven aqui no Github para que você possa usá-lo por lá! Em breve, juro!

# Uso
O uso desta interface é muito simples, pois se trata de uma **MonetaryQuery**. Vamos lá!

    public class Exemplo {
      public static void main(String...args) {
          MonetaryAmount d = FastMoney.of(10.32, "BRL");
          String extenso = d.query(new ValorPorExtensoQuery());
          System.out.println(extenso);
      }
    }

# Créditos
A implementação que converte um BigDecimal para uma String é um fork do projeto PorExtenso, que se encontra em https://github.com/mcrisc/porextenso/. Como a estrutura dos dois projetos é totalmente distinta, resolvi fazer uma implementação completamente nova, mas copiando a classe CurrencyWriter para este projeto. O autor do projeto já foi contatado e avisado desta "cópia" previamente.
