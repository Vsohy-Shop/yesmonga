package com.squareup.moshi.internal;

import com.squareup.moshi.C35384h;
import com.squareup.moshi.C35407q;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.internal.b */
public final class C35392b<T> extends C35384h<T> {

    /* renamed from: a */
    public final C35384h<T> f86949a;

    public C35392b(C35384h<T> hVar) {
        this.f86949a = hVar;
    }

    /* renamed from: a */
    public C35384h<T> mo105993a() {
        return this.f86949a;
    }

    @Nullable
    public T fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo105888s() == JsonReader.Token.NULL) {
            return jsonReader.mo105885o();
        }
        return this.f86949a.fromJson(jsonReader);
    }

    public void toJson(C35407q qVar, @Nullable T t) throws IOException {
        if (t == null) {
            qVar.mo106046o();
        } else {
            this.f86949a.toJson(qVar, t);
        }
    }

    public String toString() {
        return this.f86949a + ".nullSafe()";
    }
}
