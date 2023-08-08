package com.google.gson;

import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.s */
public abstract class C33708s<T> {

    /* renamed from: com.google.gson.s$a */
    public class C33709a extends C33708s<T> {
        public C33709a() {
        }

        public T read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return C33708s.this.read(aVar);
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, T t) throws IOException {
            if (t == null) {
                cVar.nullValue();
            } else {
                C33708s.this.write(cVar, t);
            }
        }
    }

    public final T fromJson(Reader reader) throws IOException {
        return read(new C33710a(reader));
    }

    public final T fromJsonTree(C33699k kVar) {
        try {
            return read(new JsonTreeReader(kVar));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public final C33708s<T> nullSafe() {
        return new C33709a();
    }

    public abstract T read(C33710a aVar) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new C33713c(writer), t);
    }

    public final C33699k toJsonTree(T t) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t);
            return jsonTreeWriter.get();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public abstract void write(C33713c cVar, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson((Reader) new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
