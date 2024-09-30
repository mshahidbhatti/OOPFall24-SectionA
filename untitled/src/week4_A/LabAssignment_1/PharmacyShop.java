package week4_A.LabAssignment_1;

public class PharmacyShop {
    private Person owner;
    private Address address;
    private Medicine[] medicines;
    private int medicineCount; // To keep track of the number of medicines

    public PharmacyShop(Person owner, Address address, int maxMedicines) {
        this.owner = owner;
        this.address = address;
        this.medicines = new Medicine[maxMedicines];
        this.medicineCount = 0;
    }

    public void addMedicine(Medicine medicine) {
        // TODO: Implement method to add a new medicine to the array
    }

    public void updateMedicine(String medicineId) {
        // TODO: Implement method to update existing medicine details
    }

    public void removeMedicine(String medicineId) {
        // TODO: Implement method to remove a medicine from the array
    }

    public void sellMedicine(String medicineId, int quantity) {
        // TODO: Implement method to sell a medicine and update quantity
    }

    public void displayMedicines() {
        // TODO: Implement method to display all available medicines
    }

    public void searchMedicineById(String medicineId) {
        // TODO: Implement method to search for a medicine by ID
    }

    public void searchMedicineByName(String name) {
        // TODO: Implement method to search for a medicine by name
    }

    public void printTotalRevenue() {
        // TODO: Implement method to print total revenue from sales
    }

    public void findExpiredMedicines(Date currentDate) {
        // TODO: Implement method to identify and list expired medicines
    }
}