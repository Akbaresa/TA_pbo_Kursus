package testing;

import org.junit.Assert;
import org.junit.Test;

import controller.*;
import entity.Barang;

public class unitTestBarang {

    // unit testing
    @Test
    public void testSetNamaBarang() throws Exception {
        // Arrange
        int index = 0;
        String expectedNamaBarang = "Barang 1";

        // Act
        AllModelObject.barang.listBarang.add(new Barang("Barang 1", 0.0, 0));
        AllModelObject.barang.setNamaBarang(index, expectedNamaBarang);
        String actualNamaBarang = AllModelObject.barang.getNamaBarang(index);

        // Assert
        Assert.assertEquals(expectedNamaBarang, actualNamaBarang);

    }

    @Test
    public void testSetHargaBarang() throws Exception {
        // Arrange
        int index = 0;
        Double expectedHargaBarang = 8000.00;

        // Act
        AllModelObject.barang.listBarang.add(new Barang("Barang 1", 0.0, 0));
        AllModelObject.barang.setHargaBarang(index, expectedHargaBarang);
        Double actualHargaBarang = AllModelObject.barang.getHargaBarang(index);

        // Assert
        Assert.assertEquals(expectedHargaBarang, actualHargaBarang);
    }

    @Test
    public void testSetStokBarang() throws Exception {
        // Arrange
        int index = 0;
        int expectedStokBarang = 10;

        // Act
        AllModelObject.barang.listBarang.add(new Barang("Barang 1", 0.0, 0));
        AllModelObject.barang.setStokBarang(index, expectedStokBarang);
        int actualStokBarang = AllModelObject.barang.getStokBarang(index);

        // Assert
        Assert.assertEquals(expectedStokBarang, actualStokBarang);

    }

    @Test
    public void testRemoveBarang() throws Exception {
        // Arrange
        int index = 0;

        // Act
        AllModelObject.barang.listBarang.add(new Barang(null, null, index));
        int beforeRemove = AllModelObject.barang.listBarang.size();
        AllModelObject.barang.removeBarang(index);
        int afterRemove = AllModelObject.barang.listBarang.size() + 1;

        // Assert
        Assert.assertEquals(beforeRemove, afterRemove);
    }

}
