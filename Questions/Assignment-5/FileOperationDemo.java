import java.io.*;

class FileOperations {
    private String filePath;

    // Constructor to initialize the file path
    public FileOperations(String filePath) {
        this.filePath = filePath;
    }

    // Method to write text to a file
    public void writeFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }

    // Overloaded method to write binary data to a file
    public void writeFile(byte[] data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data);
        }
    }

    // Method to read text from a file
    public String readFile() throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    // Overloaded method to read binary data from a file
    public byte[] readFileBinary() throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] data = new byte[fis.available()];
            fis.read(data);
            return data;
        }
    }

    // Method to copy a file
    public void copyFile(String destinationPath) throws IOException {
        try (InputStream in = new FileInputStream(filePath);
             OutputStream out = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }
}

public class FileOperationDemo {
    public static void main(String[] args) {
        String textFilePath = "example.txt";
        String binaryFilePath = "example.bin";
        String copyFilePath = "copy_example.txt";

        FileOperations textFileOps = new FileOperations(textFilePath);
        FileOperations binaryFileOps = new FileOperations(binaryFilePath);

        try {
            // Writing to text file
            textFileOps.writeFile("Hello, World!");
            // Reading from text file
            System.out.println("Text File Content:");
            System.out.println(textFileOps.readFile());

            // Writing to binary file
            binaryFileOps.writeFile(new byte[]{65, 66, 67}); // Writes ABC
            // Reading from binary file
            byte[] binaryData = binaryFileOps.readFileBinary();
            System.out.print("Binary File Content (as ASCII): ");
            for (byte b : binaryData) {
                System.out.print((char) b); // Print as characters
            }
            System.out.println();

            // Copying text file
            textFileOps.copyFile(copyFilePath);
            System.out.println("Copied text file content:");
            System.out.println(new FileOperations(copyFilePath).readFile());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
