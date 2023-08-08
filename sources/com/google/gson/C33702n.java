package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.n */
public final class C33702n {
    /* renamed from: a */
    public C33699k mo97799a(C33710a aVar) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = aVar.isLenient();
        aVar.setLenient(true);
        try {
            C33699k parse = Streams.parse(aVar);
            aVar.setLenient(isLenient);
            return parse;
        } catch (StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e2);
        } catch (Throwable th) {
            aVar.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: b */
    public C33699k mo97800b(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            C33710a aVar = new C33710a(reader);
            C33699k a = mo97799a(aVar);
            if (!a.mo97773j0()) {
                if (aVar.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    /* renamed from: c */
    public C33699k mo97801c(String str) throws JsonSyntaxException {
        return mo97800b(new StringReader(str));
    }
}
