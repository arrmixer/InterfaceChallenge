package com.AE;

import java.util.List;

/**
 * Created by Angel on 12/12/16.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
