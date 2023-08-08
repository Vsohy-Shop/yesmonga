package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.j0 */
public final class C12380j0 extends C12359a {
    @C12579k

    /* renamed from: d */
    public final String f30314d;

    public C12380j0(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        this.f30314d = str;
    }

    /* renamed from: I */
    public int mo25422I(int i) {
        if (i < mo25416C().length()) {
            return i;
        }
        return -1;
    }

    /* renamed from: N */
    public int mo25426N() {
        int i = this.f30240a;
        if (i == -1) {
            return i;
        }
        while (i < mo25416C().length() && ((r1 = mo25416C().charAt(i)) == ' ' || r1 == 10 || r1 == 13 || r1 == 9)) {
            i++;
        }
        this.f30240a = i;
        return i;
    }

    /* renamed from: Q */
    public boolean mo25429Q() {
        int N = mo25426N();
        if (N == mo25416C().length() || N == -1 || mo25416C().charAt(N) != ',') {
            return false;
        }
        this.f30240a++;
        return true;
    }

    @C12579k
    /* renamed from: U */
    public String mo25416C() {
        return this.f30314d;
    }

    /* renamed from: f */
    public boolean mo25437f() {
        int i = this.f30240a;
        if (i == -1) {
            return false;
        }
        while (i < mo25416C().length()) {
            char charAt = mo25416C().charAt(i);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i++;
            } else {
                this.f30240a = i;
                return mo25419F(charAt);
            }
        }
        this.f30240a = i;
        return false;
    }

    @C12579k
    /* renamed from: k */
    public String mo25442k() {
        mo25445n('\"');
        int i = this.f30240a;
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) mo25416C(), '\"', i, false, 4, (Object) null);
        if (indexOf$default != -1) {
            int i2 = i;
            while (i2 < indexOf$default) {
                int i3 = i2 + 1;
                if (mo25416C().charAt(i2) == '\\') {
                    return mo25448q(mo25416C(), this.f30240a, i2);
                }
                i2 = i3;
            }
            this.f30240a = indexOf$default + 1;
            String substring = mo25416C().substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        mo25456y((byte) 1);
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public byte mo25443l() {
        byte a;
        String U = mo25416C();
        do {
            int i = this.f30240a;
            if (i == -1 || i >= U.length()) {
                return 10;
            }
            int i2 = this.f30240a;
            this.f30240a = i2 + 1;
            a = C12361b.m49912a(U.charAt(i2));
        } while (a == 3);
        return a;
    }

    /* renamed from: n */
    public void mo25445n(char c) {
        if (this.f30240a == -1) {
            mo25431S(c);
        }
        String U = mo25416C();
        while (this.f30240a < U.length()) {
            int i = this.f30240a;
            this.f30240a = i + 1;
            char charAt = U.charAt(i);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                if (charAt != c) {
                    mo25431S(c);
                } else {
                    return;
                }
            }
        }
        mo25431S(c);
    }
}
