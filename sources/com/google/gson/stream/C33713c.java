package com.google.gson.stream;

import com.carrefour.fid.android.airship.util.C13758b;
import com.google.firebase.installations.C33124s;
import com.google.firebase.installations.local.C33093b;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.stream.c */
public class C33713c implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i = 0; i <= 31; i++) {
            REPLACEMENT_CHARS[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C33713c(Writer writer) {
        mo97856i(6);
        this.separator = C33124s.f80355c;
        this.serializeNulls = true;
        if (writer != null) {
            this.out = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    public final void mo97849a() throws IOException {
        int g = mo97854g();
        if (g == 5) {
            this.out.write(44);
        } else if (g != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        mo97852d();
        mo97859j(4);
    }

    /* renamed from: b */
    public final void mo97850b() throws IOException {
        int g = mo97854g();
        if (g == 1) {
            mo97859j(2);
            mo97852d();
        } else if (g == 2) {
            this.out.append(',');
            mo97852d();
        } else if (g != 4) {
            if (g != 6) {
                if (g != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.lenient) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            mo97859j(7);
        } else {
            this.out.append(this.separator);
            mo97859j(5);
        }
    }

    public C33713c beginArray() throws IOException {
        mo97862l();
        return mo97853f(1, "[");
    }

    public C33713c beginObject() throws IOException {
        mo97862l();
        return mo97853f(3, C33093b.f80281i);
    }

    /* renamed from: c */
    public final C33713c mo97851c(int i, int i2, String str) throws IOException {
        int g = mo97854g();
        if (g != i2 && g != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.deferredName == null) {
            this.stackSize--;
            if (g == i2) {
                mo97852d();
            }
            this.out.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
    }

    public void close() throws IOException {
        this.out.close();
        int i = this.stackSize;
        if (i > 1 || (i == 1 && this.stack[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    /* renamed from: d */
    public final void mo97852d() throws IOException {
        if (this.indent != null) {
            this.out.write("\n");
            int i = this.stackSize;
            for (int i2 = 1; i2 < i; i2++) {
                this.out.write(this.indent);
            }
        }
    }

    public C33713c endArray() throws IOException {
        return mo97851c(1, 2, "]");
    }

    public C33713c endObject() throws IOException {
        return mo97851c(3, 5, "}");
    }

    /* renamed from: f */
    public final C33713c mo97853f(int i, String str) throws IOException {
        mo97850b();
        mo97856i(i);
        this.out.write(str);
        return this;
    }

    public void flush() throws IOException {
        if (this.stackSize != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final int mo97854g() {
        int i = this.stackSize;
        if (i != 0) {
            return this.stack[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    /* renamed from: i */
    public final void mo97856i(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr3[i3] = i;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    /* renamed from: j */
    public final void mo97859j(int i) {
        this.stack[this.stackSize - 1] = i;
    }

    public C33713c jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        mo97862l();
        mo97850b();
        this.out.append(str);
        return this;
    }

    /* renamed from: k */
    public final void mo97861k(String str) throws IOException {
        String[] strArr;
        String str2;
        if (this.htmlSafe) {
            strArr = HTML_SAFE_REPLACEMENT_CHARS;
        } else {
            strArr = REPLACEMENT_CHARS;
        }
        this.out.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.out.write(str, i, i2 - i);
            }
            this.out.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.out.write(str, i, length - i);
        }
        this.out.write("\"");
    }

    /* renamed from: l */
    public final void mo97862l() throws IOException {
        if (this.deferredName != null) {
            mo97849a();
            mo97861k(this.deferredName);
            this.deferredName = null;
        }
    }

    public C33713c name(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.deferredName != null) {
            throw new IllegalStateException();
        } else if (this.stackSize != 0) {
            this.deferredName = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public C33713c nullValue() throws IOException {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                mo97862l();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        mo97850b();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z) {
        this.htmlSafe = z;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = C33124s.f80355c;
            return;
        }
        this.indent = str;
        this.separator = ": ";
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.serializeNulls = z;
    }

    public C33713c value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        mo97862l();
        mo97850b();
        mo97861k(str);
        return this;
    }

    public C33713c value(boolean z) throws IOException {
        mo97862l();
        mo97850b();
        this.out.write(z ? C13758b.f33436b : C13758b.f33438c);
        return this;
    }

    public C33713c value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        mo97862l();
        mo97850b();
        this.out.write(bool.booleanValue() ? C13758b.f33436b : C13758b.f33438c);
        return this;
    }

    public C33713c value(double d) throws IOException {
        mo97862l();
        if (this.lenient || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            mo97850b();
            this.out.append(Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public C33713c value(long j) throws IOException {
        mo97862l();
        mo97850b();
        this.out.write(Long.toString(j));
        return this;
    }

    public C33713c value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        mo97862l();
        String obj = number.toString();
        if (this.lenient || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            mo97850b();
            this.out.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
