package com.galago.plugins.gpos;

import com.getcapacitor.Logger;

public class GposPlugin {

    public String echo(String value) {
        Logger.info("Echo", value);
        return value;
    }
}
