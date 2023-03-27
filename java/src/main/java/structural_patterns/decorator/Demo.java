package structural_patterns.decorator;

public class Demo {
    public static void main(String[] args) {
        String fileName = "outputdemo.txt";
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                        new EncryptionDecorator(
                                            new FileDataSource(fileName)));

        encoded.writeData(salaryRecords);
        FileDataSource plain = new FileDataSource(fileName);

        System.out.println("- Input-----------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded-----------");
        System.out.println(plain.readData());
        System.out.println("- Decoded-----------");
        System.out.println(encoded.readData());
    }
}
