package sg.nus.iss.ceramicraft_customer_backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeramicraftCustomerBackendApplicationTest {

    @Test
    void main() {
        // Since the main method starts the Spring application, we can only test that it runs without exceptions.
        try {
            String[] args = {};
            CeramicraftCustomerBackendApplication.main(args);
        } catch (Exception e) {
            fail("The main method threw an exception: " + e.getMessage());
        }
    }
}