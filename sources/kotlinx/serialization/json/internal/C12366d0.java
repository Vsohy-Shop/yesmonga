package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.d0 */
public final class C12366d0 extends C12359a {
    @C12579k

    /* renamed from: d */
    public final Reader f30283d;
    @C12579k

    /* renamed from: e */
    public char[] f30284e;

    /* renamed from: f */
    public int f30285f;
    @C12579k

    /* renamed from: g */
    public CharSequence f30286g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12366d0(Reader reader, char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reader, (i & 2) != 0 ? new char[16384] : cArr);
    }

    @C12579k
    /* renamed from: C */
    public CharSequence mo25416C() {
        return this.f30286g;
    }

    /* renamed from: D */
    public int mo25417D(char c, int i) {
        char[] cArr = this.f30284e;
        int length = cArr.length;
        while (i < length) {
            int i2 = i + 1;
            if (cArr[i] == c) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: I */
    public int mo25422I(int i) {
        boolean z;
        if (i < mo25416C().length()) {
            return i;
        }
        this.f30240a = i;
        mo25453u();
        if (this.f30240a != 0) {
            return -1;
        }
        if (mo25416C().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    @C12579k
    /* renamed from: O */
    public String mo25427O(int i, int i2) {
        return new String(this.f30284e, i, i2 - i);
    }

    /* renamed from: Q */
    public boolean mo25429Q() {
        int N = mo25426N();
        if (N >= mo25416C().length() || N == -1 || mo25416C().charAt(N) != ',') {
            return false;
        }
        this.f30240a++;
        return true;
    }

    /* renamed from: U */
    public final void mo25489U(int i) {
        char[] cArr = this.f30284e;
        System.arraycopy(cArr, this.f30240a, cArr, 0, i);
        int length = this.f30284e.length;
        while (true) {
            if (i == length) {
                break;
            }
            int read = this.f30283d.read(cArr, i, length - i);
            if (read == -1) {
                char[] copyOf = Arrays.copyOf(this.f30284e, i);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f30284e = copyOf;
                mo25490V(new C12365d(copyOf));
                this.f30285f = -1;
                break;
            }
            i += read;
        }
        this.f30240a = 0;
    }

    /* renamed from: V */
    public void mo25490V(@C12579k CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
        this.f30286g = charSequence;
    }

    /* renamed from: e */
    public void mo25436e(int i, int i2) {
        mo25415B().append(this.f30284e, i, i2 - i);
    }

    /* renamed from: f */
    public boolean mo25437f() {
        mo25453u();
        int i = this.f30240a;
        while (true) {
            int I = mo25422I(i);
            if (I == -1) {
                this.f30240a = I;
                return false;
            }
            char charAt = mo25416C().charAt(I);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i = I + 1;
            } else {
                this.f30240a = I;
                return mo25419F(charAt);
            }
        }
    }

    @C12579k
    /* renamed from: k */
    public String mo25442k() {
        mo25445n('\"');
        int i = this.f30240a;
        int D = mo25417D('\"', i);
        if (D == -1) {
            int I = mo25422I(i);
            if (I != -1) {
                return mo25448q(mo25416C(), this.f30240a, I);
            }
            mo25456y((byte) 1);
            throw new KotlinNothingValueException();
        }
        int i2 = i;
        while (i2 < D) {
            int i3 = i2 + 1;
            if (mo25416C().charAt(i2) == '\\') {
                return mo25448q(mo25416C(), this.f30240a, i2);
            }
            i2 = i3;
        }
        this.f30240a = D + 1;
        return mo25427O(i, D);
    }

    /* renamed from: l */
    public byte mo25443l() {
        mo25453u();
        CharSequence C = mo25416C();
        int i = this.f30240a;
        while (true) {
            int I = mo25422I(i);
            if (I == -1) {
                this.f30240a = I;
                return 10;
            }
            int i2 = I + 1;
            byte a = C12361b.m49912a(C.charAt(I));
            if (a == 3) {
                i = i2;
            } else {
                this.f30240a = i2;
                return a;
            }
        }
    }

    /* renamed from: u */
    public void mo25453u() {
        int length = this.f30284e.length - this.f30240a;
        if (length <= this.f30285f) {
            mo25489U(length);
        }
    }

    public C12366d0(@C12579k Reader reader, @C12579k char[] cArr) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(cArr, "_source");
        this.f30283d = reader;
        this.f30284e = cArr;
        this.f30285f = 128;
        this.f30286g = new C12365d(cArr);
        mo25489U(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12366d0(@org.jetbrains.annotations.C12579k java.io.InputStream r2, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r3) {
        /*
            r1 = this;
            java.lang.String r0 = "i"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0016
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x001e
        L_0x0016:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 262144(0x40000, float:3.67342E-40)
            r2.<init>(r0, r3)
            r0 = r2
        L_0x001e:
            r2 = 2
            r3 = 0
            r1.<init>((java.io.Reader) r0, (char[]) r3, (int) r2, (kotlin.jvm.internal.DefaultConstructorMarker) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C12366d0.<init>(java.io.InputStream, java.nio.charset.Charset):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12366d0(InputStream inputStream, Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, (i & 2) != 0 ? C11602d.f28868b : charset);
    }
}
