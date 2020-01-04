package com.sroeck.export;

import com.sroeck.parser.RuntasticActivity;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public interface Exporter {
    void generateActivity(RuntasticActivity runtasticActivity, Path destinationDirectory) throws IOException;
}
