package com.kodilla.exception.homework;

import junit.framework.TestCase;
import org.junit.Test;

public class WarehouseTestSuite extends TestCase {

    @Test
    public void testGetOrder() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("16"));
        // when
        Order orderInWarehouse = warehouse.getOrder("16");
        // then
        assertEquals("16", orderInWarehouse.getNumber());
    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        // when
        Order isOrder16InWarehouse = warehouse.getOrder("15");
    }
}