package com.google.gson.internal;

import com.google.gson.stream.C33710a;
import java.io.IOException;

public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(C33710a aVar) throws IOException;
}
