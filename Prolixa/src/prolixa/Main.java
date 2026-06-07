package Prolixa.src.prolixa;
import Prolixa.src.prolixa.lexer.*;
import Prolixa.src.prolixa.node.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			String arquivo = "teste/teste.prl";

			Lexer lexer =
					new Lexer(
							new PushbackReader(  
									new FileReader(arquivo), 1024)); 
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