package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;
import java.io.IOException;
import java.io.Reader;

@C32455c
/* renamed from: com.google.android.datatransport.cct.internal.m */
public abstract class C40082m {

    /* renamed from: a */
    public static final String f102279a = "LogResponseInternal";

    /* renamed from: a */
    public static C40082m m163236a(long j) {
        return new C40073h(j);
    }

    @C0359n0
    /* renamed from: b */
    public static C40082m m163237b(@C0359n0 Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m163236a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C40082m a = m163236a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo132657c();
}
