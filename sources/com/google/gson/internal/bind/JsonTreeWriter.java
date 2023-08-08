package com.google.gson.internal.bind;

import com.google.gson.C33623h;
import com.google.gson.C33699k;
import com.google.gson.C33700l;
import com.google.gson.C33701m;
import com.google.gson.C33703o;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class JsonTreeWriter extends C33713c {
    private static final C33703o SENTINEL_CLOSED = new C33703o("closed");
    private static final Writer UNWRITABLE_WRITER = new Writer() {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private String pendingName;
    private C33699k product = C33700l.f81818a;
    private final List<C33699k> stack = new ArrayList();

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
    }

    private C33699k peek() {
        List<C33699k> list = this.stack;
        return list.get(list.size() - 1);
    }

    private void put(C33699k kVar) {
        if (this.pendingName != null) {
            if (!kVar.mo97773j0() || getSerializeNulls()) {
                ((C33701m) peek()).mo97786m0(this.pendingName, kVar);
            }
            this.pendingName = null;
        } else if (this.stack.isEmpty()) {
            this.product = kVar;
        } else {
            C33699k peek = peek();
            if (peek instanceof C33623h) {
                ((C33623h) peek).mo97541m0(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C33713c beginArray() throws IOException {
        C33623h hVar = new C33623h();
        put(hVar);
        this.stack.add(hVar);
        return this;
    }

    public C33713c beginObject() throws IOException {
        C33701m mVar = new C33701m();
        put(mVar);
        this.stack.add(mVar);
        return this;
    }

    public void close() throws IOException {
        if (this.stack.isEmpty()) {
            this.stack.add(SENTINEL_CLOSED);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public C33713c endArray() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C33623h) {
            List<C33699k> list = this.stack;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public C33713c endObject() throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C33701m) {
            List<C33699k> list = this.stack;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() throws IOException {
    }

    public C33699k get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.stack);
    }

    public C33713c name(String str) throws IOException {
        if (this.stack.isEmpty() || this.pendingName != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C33701m) {
            this.pendingName = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public C33713c nullValue() throws IOException {
        put(C33700l.f81818a);
        return this;
    }

    public C33713c value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        put(new C33703o(str));
        return this;
    }

    public C33713c value(boolean z) throws IOException {
        put(new C33703o(Boolean.valueOf(z)));
        return this;
    }

    public C33713c value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        put(new C33703o(bool));
        return this;
    }

    public C33713c value(double d) throws IOException {
        if (isLenient() || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            put(new C33703o((Number) Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    public C33713c value(long j) throws IOException {
        put(new C33703o((Number) Long.valueOf(j)));
        return this;
    }

    public C33713c value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        put(new C33703o(number));
        return this;
    }
}
