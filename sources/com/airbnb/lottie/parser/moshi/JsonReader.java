package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.C12471f0;
import okio.C12500m;
import okio.C12505n;
import okio.C12507o;

public abstract class JsonReader implements Closeable {

    /* renamed from: g */
    public static final String[] f55937g = new String[128];

    /* renamed from: a */
    public int f55938a;

    /* renamed from: b */
    public int[] f55939b = new int[32];

    /* renamed from: c */
    public String[] f55940c = new String[32];

    /* renamed from: d */
    public int[] f55941d = new int[32];

    /* renamed from: e */
    public boolean f55942e;

    /* renamed from: f */
    public boolean f55943f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.JsonReader$a */
    public static final class C21628a {

        /* renamed from: a */
        public final String[] f55955a;

        /* renamed from: b */
        public final C12471f0 f55956b;

        public C21628a(String[] strArr, C12471f0 f0Var) {
            this.f55955a = strArr;
            this.f55956b = f0Var;
        }

        /* renamed from: a */
        public static C21628a m99628a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C12500m mVar = new C12500m();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.m99611t(mVar, strArr[i]);
                    mVar.readByte();
                    byteStringArr[i] = mVar.mo27301n3();
                }
                return new C21628a((String[]) strArr.clone(), C12471f0.m50529H(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f55937g[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f55937g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: n */
    public static JsonReader m99610n(C12507o oVar) {
        return new C21639b(oVar);
    }

    /* renamed from: t */
    public static void m99611t(C12505n nVar, String str) throws IOException {
        String str2;
        String[] strArr = f55937g;
        nVar.mo27225K2(34);
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
                nVar.mo27242v1(str, i, i2);
            }
            nVar.mo27236l1(str2);
            i = i2 + 1;
        }
        if (i < length) {
            nVar.mo27242v1(str, i, length);
        }
        nVar.mo27225K2(34);
    }

    /* renamed from: b */
    public abstract void mo64551b() throws IOException;

    /* renamed from: c */
    public abstract void mo64552c() throws IOException;

    /* renamed from: d */
    public abstract void mo64553d() throws IOException;

    /* renamed from: f */
    public abstract void mo64554f() throws IOException;

    /* renamed from: g */
    public abstract boolean mo64555g() throws IOException;

    public final String getPath() {
        return C21638a.m99652a(this.f55938a, this.f55939b, this.f55940c, this.f55941d);
    }

    /* renamed from: i */
    public abstract boolean mo64557i() throws IOException;

    /* renamed from: j */
    public abstract double mo64558j() throws IOException;

    /* renamed from: k */
    public abstract int mo64559k() throws IOException;

    /* renamed from: l */
    public abstract String mo64560l() throws IOException;

    /* renamed from: m */
    public abstract String mo64561m() throws IOException;

    /* renamed from: o */
    public abstract Token mo64562o() throws IOException;

    /* renamed from: p */
    public final void mo64563p(int i) {
        int i2 = this.f55938a;
        int[] iArr = this.f55939b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f55939b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f55940c;
                this.f55940c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f55941d;
                this.f55941d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f55939b;
        int i3 = this.f55938a;
        this.f55938a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: q */
    public abstract int mo64564q(C21628a aVar) throws IOException;

    /* renamed from: r */
    public abstract void mo64565r() throws IOException;

    /* renamed from: s */
    public abstract void mo64566s() throws IOException;

    /* renamed from: u */
    public final JsonEncodingException mo64567u(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }
}
