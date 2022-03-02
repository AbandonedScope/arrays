package by.mahanko.array.entity;

import java.util.HashMap;
import java.util.Map;

public class CustomArrayWarehouse {
    private Map<String, CustomArrayData> arrays;
    private static CustomArrayWarehouse instance;

    private CustomArrayWarehouse() {
        arrays = new HashMap<>();
    }

    public static CustomArrayWarehouse getInstance() {
        if (instance == null) {
            instance = new CustomArrayWarehouse();
        }

        return instance;
    }

    public CustomArrayData get(String id) {
        return arrays.get(id);
    }

    public CustomArrayData put(String id, CustomArrayData value) {
        return arrays.put(id, value);
    }

    public boolean remove(String key, CustomArrayData value) {
        return arrays.remove(key, value);
    }
}
