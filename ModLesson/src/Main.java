import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IOstreaming.writeFile(Huffman.buildHuffmanTree(IOstreaming.readFile()));
    }
}
