package com.google.gson.internal.bind;

import com.google.gson.C33623h;
import com.google.gson.C33699k;
import com.google.gson.C33700l;
import com.google.gson.C33701m;
import com.google.gson.C33703o;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

public final class JsonTreeReader extends C33710a {
    private static final Object SENTINEL_CLOSED = new Object();
    private static final Reader UNREADABLE_READER = new Reader() {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };
    private int[] pathIndices = new int[32];
    private String[] pathNames = new String[32];
    private Object[] stack = new Object[32];
    private int stackSize = 0;

    public JsonTreeReader(C33699k kVar) {
        super(UNREADABLE_READER);
        push(kVar);
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
        }
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i = this.stackSize - 1;
        this.stackSize = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private void push(Object obj) {
        int i = this.stackSize;
        Object[] objArr = this.stack;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.pathIndices, 0, iArr, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = objArr2;
            this.pathIndices = iArr;
            this.pathNames = strArr;
        }
        Object[] objArr3 = this.stack;
        int i2 = this.stackSize;
        this.stackSize = i2 + 1;
        objArr3[i2] = obj;
    }

    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((C33623h) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((C33701m) peekStack()).mo97794u0().iterator());
    }

    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.stackSize) {
            Object[] objArr = this.stack;
            Object obj = objArr[i];
            if (obj instanceof C33623h) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(C12361b.f30260k);
                    sb.append(this.pathIndices[i]);
                    sb.append(C12361b.f30261l);
                }
            } else if (obj instanceof C33701m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.pathNames[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        JsonToken peek = peek();
        if (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) {
            return false;
        }
        return true;
    }

    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean k = ((C33703o) popStack()).mo97540k();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    public double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            double y = ((C33703o) peekStack()).mo97554y();
            if (isLenient() || (!Double.isNaN(y) && !Double.isInfinite(y))) {
                popStack();
                int i = this.stackSize;
                if (i > 0) {
                    int[] iArr = this.pathIndices;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return y;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + y);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            int H = ((C33703o) peekStack()).mo97529H();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return H;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek == jsonToken || peek == JsonToken.STRING) {
            long Y = ((C33703o) peekStack()).mo97530Y();
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return Y;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public String nextName() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i = this.stackSize;
        if (i > 0) {
            int[] iArr = this.pathIndices;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek == jsonToken || peek == JsonToken.NUMBER) {
            String h0 = ((C33703o) popStack()).mo97536h0();
            int i = this.stackSize;
            if (i > 0) {
                int[] iArr = this.pathIndices;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return h0;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
    }

    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object peekStack = peekStack();
        if (peekStack instanceof Iterator) {
            boolean z = this.stack[this.stackSize - 2] instanceof C33701m;
            Iterator it = (Iterator) peekStack;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                push(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (peekStack instanceof C33701m) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (peekStack instanceof C33623h) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (peekStack instanceof C33703o) {
                C33703o oVar = (C33703o) peekStack;
                if (oVar.mo97807s0()) {
                    return JsonToken.STRING;
                }
                if (oVar.mo97805n0()) {
                    return JsonToken.BOOLEAN;
                }
                if (oVar.mo97806p0()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (peekStack instanceof C33700l) {
                return JsonToken.NULL;
            } else {
                if (peekStack == SENTINEL_CLOSED) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new C33703o((String) entry.getKey()));
    }

    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = "null";
        } else {
            popStack();
            int i = this.stackSize;
            if (i > 0) {
                this.pathNames[i - 1] = "null";
            }
        }
        int i2 = this.stackSize;
        if (i2 > 0) {
            int[] iArr = this.pathIndices;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String toString() {
        return JsonTreeReader.class.getSimpleName();
    }
}
