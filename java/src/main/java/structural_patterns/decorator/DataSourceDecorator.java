package structural_patterns.decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource wrapped;

    public DataSourceDecorator(DataSource wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void writeData(String data) {
        wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}
