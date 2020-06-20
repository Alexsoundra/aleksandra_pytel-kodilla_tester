package com.kodilla.exception.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class WarehouseTestSuite extends TestCase {

    @Test
    public void testGetOrder() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when
        boolean isOrderInWarehouse = warehouse.getOrder("16");
        // then
        assertTrue(isOrderInWarehouse);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when
        boolean isOrder16InWarehouse = warehouse.getOrder("15");
        // then
        assertFalse(isOrder16InWarehouse);
    }

}