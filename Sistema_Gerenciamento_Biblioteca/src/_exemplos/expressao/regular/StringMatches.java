package _exemplos.expressao.regular;

public class StringMatches {
    public static void main(String[] args) throws Exception {
        
        String str;        
        String regex;
        
        str = "1";
        // \d  qualquer dígito
        regex = "\\d";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a";
        regex = "\\d"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a";
        // \D  qualquer não dígito
        regex = "\\D";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a";
        // \w  qualquer letra (em letras maiúsculas ou minúsculas), qualquer dígito ou o caractere sublinhado
        regex = "\\w";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "1";
        regex = "\\w";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = " ";
        regex = "\\w";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = " ";
        // \s  qualquer caractere de espaço em branco
        regex = "\\s";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "o";
        // conjunto de caracteres que não tem uma classe de caracteres predefinida, utilize os colchetes []
        regex = "[aeiou]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "p";
        regex = "[aeiou]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "A";
        // *  zero ou mais ocorrências da subexpressão imediatamente anterior
        regex = "A*"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = "A*"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "AAAA";
        regex = "A*"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "A";
        // +  uma ou mais ocorrências da subexpressão imediatamente anterior
        regex = "A+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = "A+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "AAAA";
        regex = "A+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a";
        // .  identifica uma única intância de qualquer caractere
        regex = ".";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aaa";
        regex = ".";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aaa";
        regex = ".*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = ".*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = ".+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Mario";
        // [A-Z]  identifica uma única letra maiúscula
        // [a-z]  identifica uma única letra minúscula
        regex = "[A-Z][a-zA-Z]*"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "mARIO";
        regex = "[A-Z][a-zA-Z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "MARIO";
        regex = "[A-Z][a-zA-Z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Mario Popolin";
        regex = "[A-Z][a-zA-Z]*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin Neto";
        // parênteses são utilizados para agrupar partes da expressão regular
        regex = "[A-Z][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin-Neto";
        regex = "[A-Z][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin--Neto";
        regex = "[A-Z][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin  Neto";
        regex = "[A-Z][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin Neto";
        // ^  qualquer caractere diferente dos indicados
        regex = "[^P][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin Neto";
        regex = "[^S][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "popolin Neto";
        regex = "[^S][a-z]+([ '-][A-Z][a-z]+)*";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Alamedas, 71";
        // | expressa 2 alternativas
        regex = "([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+),\\s\\d+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );

        str = "Alamedas Verdes, 71";
        regex = "([A-Za-z]+|[A-Za-z]+\\s[A-Za-z]+),\\s\\d+";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "14340";
        // {n}  localiza exatamente n ocorrências
        regex = "\\d{5}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "1434";
        regex = "\\d{5}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "14340-000";
        regex = "\\d{5}-\\d{3}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "+55(16)3763-7412";
        // ?  localiza zero ou uma ocorrência
        // {n,m}  localiza entre n e m ocorrências
        // {n,}  localiza pelo menos n ocorrências
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "(16)3763-7412";
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "+55(16)99358-7412";
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "(16)99358-7412";
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );

        str = "Mario  Popolin     Neto";
        regex = "\\s+";
        System.out.println( str + " | " + regex + " | " + str.replaceAll(regex, "-") );

        String[] results = str.split(regex);
        for ( String s : results ) {
            System.out.println(s);
        }
        
        str = "(16)99358-7412";
        regex = "(\\+\\d{2,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";        
        if( !str.isEmpty() && !str.matches(regex) ) 
            throw new Exception("Formato para Telefone Inválido.");
        
        str = "27.563.092/0001-74";
        regex = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}";        
        if( !str.isEmpty() && !str.matches(regex) ) 
            throw new Exception("Formato para CNPJ Inválido.");
    }    
}
