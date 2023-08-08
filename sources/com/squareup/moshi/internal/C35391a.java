package com.squareup.moshi.internal;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.internal.a */
public final class C35391a<T> extends C35384h<T> {

    /* renamed from: a */
    public final C35384h<T> f86948a;

    public C35391a(C35384h<T> hVar) {
        this.f86948a = hVar;
    }

    /* renamed from: a */
    public C35384h<T> mo105991a() {
        return this.f86948a;
    }

    @Nullable
    public T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo105888s() != JsonReader.Token.NULL) {
            return this.f86948a.fromJson(jsonReader);
        }
        throw new JsonDataException("Unexpected null at " + jsonReader.getPath());
    }

    public void toJson(C35407q qVar, @Nullable T t) throws IOException {
        if (t != null) {
            this.f86948a.toJson(qVar, t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + qVar.getPath());
    }

    public String toString() {
        return this.f86948a + ".nonNull()";
    }
}
