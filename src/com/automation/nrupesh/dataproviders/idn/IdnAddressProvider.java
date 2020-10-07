package com.automation.nrupesh.dataproviders.idn;

import com.automation.nrupesh.dataproviders.idn.IdnAddress;

import java.util.ArrayList;

public class IdnAddressProvider {
    public ArrayList<IdnAddress> emptyCheck(){
        return new ArrayList<IdnAddress>();
    }

    public static IdnAddress completeAddressS() {
        return new IdnAddress(null, null,
                "test home add", "Test road","12345","DKI Jakarta",
                "Kota Administrasi Jakarta Pusat","Gambir",true);
    }
}
