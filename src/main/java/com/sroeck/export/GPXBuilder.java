package com.sroeck.export;

import com.sroeck.parser.RuntasticActivity;

import java.io.IOException;
import java.nio.file.Path;

public class GPXBuilder implements Exporter{

    @Override
    public void generateActivity(RuntasticActivity runtasticActivity, Path destinationDirectory) throws IOException {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
