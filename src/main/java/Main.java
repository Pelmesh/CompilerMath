import grammatics.GrammaticsLexer;
import grammatics.GrammaticsParser;
import grammatics.GrammaticsVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.setVisitor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws Exception {
        compileSource("test.lang");
    }

    private static void compileSource(String sourceFileName) {
        GrammaticsLexer lexer = null;
        try {
            lexer = new GrammaticsLexer(new ANTLRFileStream(sourceFileName));
            GrammaticsParser parser = new GrammaticsParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.parse();
            GrammaticsVisitor grammaticsVisitor = new setVisitor(sourceFileName);
            String output = (String) grammaticsVisitor.visit(tree);
            System.out.println(output);
            InFile(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void InFile(String output) {
        try(FileWriter writer = new FileWriter("output.java", false))
        {
            writer.write(output);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

}

