package testing;

import org.junit.Assert;
import org.junit.Test;

import controller.*;

public class unitTestPembeli {
    PembeliController pC = new PembeliController();

    @Test
    public void testLoginMember_ValidCredentials() {

        pC.insertPembeli();
        // Arrange
        String nama = "esa";
        String password = "12";
        int expectedIndex = 1; // Index pembeli yang valid

        // Act
        int actualIndex = AllModelObject.pembeli.loginMember(nama, password) + 1;

        // Assert
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testLoginMember_InvalidCredentials() {
        pC.insertPembeli();
        // Arrange
        String nama = "Jane";
        String password = "wrongpassword";
        int expectedIndex = -1; // Indeks yang menandakan login gagal

        // Act
        int actualIndex = AllModelObject.pembeli.loginMember(nama, password) - 1;

        // Assert
        Assert.assertEquals(expectedIndex, actualIndex);

    }

}
