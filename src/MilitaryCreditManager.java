public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("Asker kredisi hesapland─▒.");
    }

    @Override
    public void Save() {
        super.Save();
    }
}
