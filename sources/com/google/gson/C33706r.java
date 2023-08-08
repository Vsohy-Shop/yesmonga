package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.gson.r */
public final class C33706r implements Iterator<C33699k> {

    /* renamed from: a */
    public final C33710a f81822a;

    /* renamed from: b */
    public final Object f81823b;

    public C33706r(String str) {
        this((Reader) new StringReader(str));
    }

    /* renamed from: b */
    public C33699k next() throws JsonParseException {
        if (hasNext()) {
            try {
                return Streams.parse(this.f81822a);
            } catch (StackOverflowError e) {
                throw new JsonParseException("Failed parsing JSON source to Json", e);
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (JsonParseException e3) {
                e = e3;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.f81823b) {
            try {
                if (this.f81822a.peek() != JsonToken.END_DOCUMENT) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C33706r(Reader reader) {
        C33710a aVar = new C33710a(reader);
        this.f81822a = aVar;
        aVar.setLenient(true);
        this.f81823b = new Object();
    }
}
