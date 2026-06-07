import prolixa.lexer.*;
import prolixa.node.*;
import prolixa.parser.Parser;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //String arq = "entradas/AnoNovo.prlx";
            String arq = "entradas/ParImpar.prlx";
            //String arq = "entradas/CodigoCerto.prlx";

            Lexer lexer =
                    new Lexer(
                            new PushbackReader(
                                    new FileReader(arq), 1024));

            Parser p = new Parser(lexer);
            Start tree = p.parse();
            tree.apply(new ASTDisplay());
            Token token;
            while(!((token = lexer.next()) instanceof EOF)) {
                System.out.println(token.getClass());
                System.out.println(" ( "+token.toString()+")");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}