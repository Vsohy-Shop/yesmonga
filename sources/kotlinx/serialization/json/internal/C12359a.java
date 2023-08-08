package kotlinx.serialization.json.internal;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.a */
public abstract class C12359a {
    @C11287e

    /* renamed from: a */
    public int f30240a;
    @C12580l

    /* renamed from: b */
    public String f30241b;
    @C12579k

    /* renamed from: c */
    public StringBuilder f30242c = new StringBuilder();

    /* renamed from: K */
    public static /* synthetic */ void m49864K(C12359a aVar, boolean z, int i, C11289a aVar2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = aVar.f30240a;
            }
            Intrinsics.checkNotNullParameter(aVar2, "message");
            if (!z) {
                aVar.mo25455w((String) aVar2.invoke(), i);
                throw new KotlinNothingValueException();
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
    }

    /* renamed from: x */
    public static /* synthetic */ Void m49866x(C12359a aVar, String str, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = aVar.f30240a;
            }
            return aVar.mo25455w(str, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final int mo25414A(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        char charAt = charSequence.charAt(i);
        boolean z3 = true;
        if ('0' > charAt || charAt >= ':') {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return charAt - '0';
        }
        char c = C15369g.f37993s;
        if ('a' > charAt || charAt >= 'g') {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            c = C15369g.f37994t;
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                m49866x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
        }
        return (charAt - c) + 10;
    }

    @C12579k
    /* renamed from: B */
    public final StringBuilder mo25415B() {
        return this.f30242c;
    }

    @C12579k
    /* renamed from: C */
    public abstract CharSequence mo25416C();

    /* renamed from: D */
    public int mo25417D(char c, int i) {
        return StringsKt__StringsKt.indexOf$default(mo25416C(), c, i, false, 4, (Object) null);
    }

    /* renamed from: E */
    public final boolean mo25418E() {
        return mo25420G() != 10;
    }

    /* renamed from: F */
    public final boolean mo25419F(char c) {
        boolean z = false;
        if (((c == '}' || c == ']') || c == ':') || c == ',') {
            z = true;
        }
        return !z;
    }

    /* renamed from: G */
    public final byte mo25420G() {
        CharSequence C = mo25416C();
        int i = this.f30240a;
        while (true) {
            int I = mo25422I(i);
            if (I == -1) {
                this.f30240a = I;
                return 10;
            }
            char charAt = C.charAt(I);
            if (charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9) {
                i = I + 1;
            } else {
                this.f30240a = I;
                return C12361b.m49912a(charAt);
            }
        }
    }

    @C12580l
    /* renamed from: H */
    public final String mo25421H(boolean z) {
        String str;
        byte G = mo25420G();
        if (z) {
            if (G != 1 && G != 0) {
                return null;
            }
            str = mo25449r();
        } else if (G != 1) {
            return null;
        } else {
            str = mo25447p();
        }
        this.f30241b = str;
        return str;
    }

    /* renamed from: I */
    public abstract int mo25422I(int i);

    /* renamed from: J */
    public final void mo25423J(boolean z, int i, @C12579k C11289a<String> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "message");
        if (!z) {
            mo25455w(aVar.invoke(), i);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: L */
    public final void mo25424L(@C12579k StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<set-?>");
        this.f30242c = sb;
    }

    /* renamed from: M */
    public final void mo25425M(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte G = mo25420G();
        if (G == 8 || G == 6) {
            while (true) {
                byte G2 = mo25420G();
                boolean z2 = true;
                if (G2 != 1) {
                    if (!(G2 == 8 || G2 == 6)) {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(Byte.valueOf(G2));
                    } else if (G2 == 9) {
                        if (((Number) CollectionsKt___CollectionsKt.m40653k3(arrayList)).byteValue() == 8) {
                            C10994x.m42351L0(arrayList);
                        } else {
                            throw C12388n.m50107f(this.f30240a, "found ] instead of }", mo25416C());
                        }
                    } else if (G2 == 7) {
                        if (((Number) CollectionsKt___CollectionsKt.m40653k3(arrayList)).byteValue() == 6) {
                            C10994x.m42351L0(arrayList);
                        } else {
                            throw C12388n.m50107f(this.f30240a, "found } instead of ]", mo25416C());
                        }
                    } else if (G2 == 10) {
                        m49866x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 2, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                    mo25443l();
                    if (arrayList.size() == 0) {
                        return;
                    }
                } else if (z) {
                    mo25449r();
                } else {
                    mo25442k();
                }
            }
        } else {
            mo25449r();
        }
    }

    /* renamed from: N */
    public int mo25426N() {
        int I;
        char charAt;
        int i = this.f30240a;
        while (true) {
            I = mo25422I(i);
            if (I != -1 && ((charAt = mo25416C().charAt(I)) == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                i = I + 1;
            }
        }
        this.f30240a = I;
        return I;
    }

    @C12579k
    /* renamed from: O */
    public String mo25427O(int i, int i2) {
        return mo25416C().subSequence(i, i2).toString();
    }

    /* renamed from: P */
    public final String mo25428P() {
        String str = this.f30241b;
        Intrinsics.checkNotNull(str);
        this.f30241b = null;
        return str;
    }

    /* renamed from: Q */
    public abstract boolean mo25429Q();

    /* renamed from: R */
    public final boolean mo25430R() {
        int I = mo25422I(mo25426N());
        int length = mo25416C().length() - I;
        if (length < 4 || I == -1) {
            return true;
        }
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            if ("null".charAt(i) != mo25416C().charAt(i + I)) {
                return true;
            }
            i = i2;
        }
        if (length > 4 && C12361b.m49912a(mo25416C().charAt(I + 4)) == 0) {
            return true;
        }
        this.f30240a = I + 4;
        return false;
    }

    /* renamed from: S */
    public final void mo25431S(char c) {
        int i = this.f30240a - 1;
        this.f30240a = i;
        if (i < 0 || c != '\"' || !Intrinsics.areEqual((Object) mo25449r(), (Object) "null")) {
            mo25456y(C12361b.m49912a(c));
            throw new KotlinNothingValueException();
        } else {
            mo25455w("Expected string literal but 'null' literal was found.\nUse 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.", this.f30240a - 4);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: T */
    public final boolean mo25432T() {
        return mo25416C().charAt(this.f30240a - 1) != '\"';
    }

    /* renamed from: b */
    public final int mo25433b(int i) {
        int I = mo25422I(i);
        if (I != -1) {
            int i2 = I + 1;
            char charAt = mo25416C().charAt(I);
            if (charAt == 'u') {
                return mo25435d(mo25416C(), i2);
            }
            char b = C12361b.m49913b(charAt);
            if (b != 0) {
                this.f30242c.append(b);
                return i2;
            }
            m49866x(this, "Invalid escaped char '" + charAt + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        m49866x(this, "Expected escape sequence to continue, got EOF", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public final int mo25434c(int i, int i2) {
        mo25436e(i, i2);
        return mo25433b(i2 + 1);
    }

    /* renamed from: d */
    public final int mo25435d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.f30240a = i;
            mo25453u();
            if (this.f30240a + 4 < charSequence.length()) {
                return mo25435d(charSequence, this.f30240a);
            }
            m49866x(this, "Unexpected EOF during unicode escape", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        this.f30242c.append((char) ((mo25414A(charSequence, i) << 12) + (mo25414A(charSequence, i + 1) << 8) + (mo25414A(charSequence, i + 2) << 4) + mo25414A(charSequence, i + 3)));
        return i2;
    }

    /* renamed from: e */
    public void mo25436e(int i, int i2) {
        this.f30242c.append(mo25416C(), i, i2);
    }

    /* renamed from: f */
    public abstract boolean mo25437f();

    /* renamed from: g */
    public final boolean mo25438g() {
        return mo25439h(mo25426N());
    }

    /* renamed from: h */
    public final boolean mo25439h(int i) {
        int I = mo25422I(i);
        if (I >= mo25416C().length() || I == -1) {
            m49866x(this, "EOF", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        int i2 = I + 1;
        char charAt = mo25416C().charAt(I) | ' ';
        if (charAt == 't') {
            mo25441j("rue", i2);
            return true;
        } else if (charAt == 'f') {
            mo25441j("alse", i2);
            return false;
        } else {
            m49866x(this, "Expected valid boolean literal prefix, but had '" + mo25449r() + '\'', 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: i */
    public final boolean mo25440i() {
        boolean z;
        int N = mo25426N();
        if (N != mo25416C().length()) {
            if (mo25416C().charAt(N) == '\"') {
                N++;
                z = true;
            } else {
                z = false;
            }
            boolean h = mo25439h(N);
            if (z) {
                if (this.f30240a == mo25416C().length()) {
                    m49866x(this, "EOF", 0, 2, (Object) null);
                    throw new KotlinNothingValueException();
                } else if (mo25416C().charAt(this.f30240a) == '\"') {
                    this.f30240a++;
                } else {
                    m49866x(this, "Expected closing quotation mark", 0, 2, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            return h;
        }
        m49866x(this, "EOF", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public final void mo25441j(String str, int i) {
        if (mo25416C().length() - i >= str.length()) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (str.charAt(i2) == (mo25416C().charAt(i2 + i) | ' ')) {
                    i2 = i3;
                } else {
                    m49866x(this, "Expected valid boolean literal prefix, but had '" + mo25449r() + '\'', 0, 2, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f30240a = i + str.length();
            return;
        }
        m49866x(this, "Unexpected end of boolean literal", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: k */
    public abstract String mo25442k();

    /* renamed from: l */
    public abstract byte mo25443l();

    /* renamed from: m */
    public final byte mo25444m(byte b) {
        byte l = mo25443l();
        if (l == b) {
            return l;
        }
        mo25456y(b);
        throw new KotlinNothingValueException();
    }

    /* renamed from: n */
    public void mo25445n(char c) {
        mo25453u();
        CharSequence C = mo25416C();
        int i = this.f30240a;
        while (true) {
            int I = mo25422I(i);
            if (I == -1) {
                this.f30240a = I;
                mo25431S(c);
                return;
            }
            int i2 = I + 1;
            char charAt = C.charAt(I);
            if (!(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9)) {
                this.f30240a = i2;
                if (charAt != c) {
                    mo25431S(c);
                } else {
                    return;
                }
            }
            i = i2;
        }
    }

    /* renamed from: o */
    public final long mo25446o() {
        boolean z;
        boolean z2;
        int I = mo25422I(mo25426N());
        Object obj = null;
        int i = 2;
        if (I >= mo25416C().length() || I == -1) {
            m49866x(this, "EOF", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        if (mo25416C().charAt(I) == '\"') {
            I++;
            if (I != mo25416C().length()) {
                z = true;
            } else {
                m49866x(this, "EOF", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
        } else {
            z = false;
        }
        int i2 = I;
        boolean z3 = false;
        boolean z4 = true;
        long j = 0;
        while (z4) {
            char charAt = mo25416C().charAt(i2);
            if (charAt == '-') {
                if (i2 == I) {
                    i2++;
                    z3 = true;
                } else {
                    m49866x(this, "Unexpected symbol '-' in numeric literal", 0, i, obj);
                    throw new KotlinNothingValueException();
                }
            } else if (C12361b.m49912a(charAt) != 0) {
                break;
            } else {
                i2++;
                if (i2 != mo25416C().length()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                int i3 = charAt - '0';
                if (i3 < 0 || i3 >= 10) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    j = (j * ((long) 10)) - ((long) i3);
                    if (j <= 0) {
                        obj = null;
                        i = 2;
                    } else {
                        m49866x(this, "Numeric value overflow", 0, 2, (Object) null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    m49866x(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, 2, (Object) null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (I == i2 || (z3 && I == i2 - 1)) {
            m49866x(this, "Expected numeric literal", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
        if (z) {
            if (!z4) {
                m49866x(this, "EOF", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            } else if (mo25416C().charAt(i2) == '\"') {
                i2++;
            } else {
                m49866x(this, "Expected closing quotation mark", 0, 2, (Object) null);
                throw new KotlinNothingValueException();
            }
        }
        this.f30240a = i2;
        if (z3) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        m49866x(this, "Numeric value overflow", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: p */
    public final String mo25447p() {
        if (this.f30241b != null) {
            return mo25428P();
        }
        return mo25442k();
    }

    @C12579k
    /* renamed from: q */
    public final String mo25448q(@C12579k CharSequence charSequence, int i, int i2) {
        String str;
        Intrinsics.checkNotNullParameter(charSequence, "source");
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                i = mo25422I(mo25434c(i, i2));
                if (i == -1) {
                    mo25455w("EOF", i);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    mo25436e(i, i2);
                    i = mo25422I(i2);
                    if (i == -1) {
                        mo25455w("EOF", i);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (!z) {
            str = mo25427O(i, i2);
        } else {
            str = mo25451t(i, i2);
        }
        this.f30240a = i2 + 1;
        return str;
    }

    @C12579k
    /* renamed from: r */
    public final String mo25449r() {
        String str;
        if (this.f30241b != null) {
            return mo25428P();
        }
        int N = mo25426N();
        if (N >= mo25416C().length() || N == -1) {
            mo25455w("EOF", N);
            throw new KotlinNothingValueException();
        }
        byte a = C12361b.m49912a(mo25416C().charAt(N));
        if (a == 1) {
            return mo25447p();
        }
        if (a == 0) {
            boolean z = false;
            while (C12361b.m49912a(mo25416C().charAt(N)) == 0) {
                N++;
                if (N >= mo25416C().length()) {
                    mo25436e(this.f30240a, N);
                    int I = mo25422I(N);
                    if (I == -1) {
                        this.f30240a = N;
                        return mo25451t(0, 0);
                    }
                    N = I;
                    z = true;
                }
            }
            if (!z) {
                str = mo25427O(this.f30240a, N);
            } else {
                str = mo25451t(this.f30240a, N);
            }
            this.f30240a = N;
            return str;
        }
        m49866x(this, Intrinsics.stringPlus("Expected beginning of the string, but got ", Character.valueOf(mo25416C().charAt(N))), 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: s */
    public final String mo25450s() {
        String r = mo25449r();
        if (!Intrinsics.areEqual((Object) r, (Object) "null") || !mo25432T()) {
            return r;
        }
        m49866x(this, "Unexpected 'null' value instead of string literal", 0, 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public final String mo25451t(int i, int i2) {
        mo25436e(i, i2);
        String sb = this.f30242c.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "escapedString.toString()");
        this.f30242c.setLength(0);
        return sb;
    }

    @C12579k
    public String toString() {
        return "JsonReader(source='" + mo25416C() + "', currentPosition=" + this.f30240a + ')';
    }

    /* renamed from: u */
    public void mo25453u() {
    }

    /* renamed from: v */
    public final void mo25454v() {
        if (mo25443l() != 10) {
            m49866x(this, "Expected EOF after parsing, but had " + mo25416C().charAt(this.f30240a - 1) + " instead", 0, 2, (Object) null);
            throw new KotlinNothingValueException();
        }
    }

    @C12579k
    /* renamed from: w */
    public final Void mo25455w(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw C12388n.m50107f(i, str, mo25416C());
    }

    @C12579k
    /* renamed from: y */
    public final Void mo25456y(byte b) {
        String str;
        String str2;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "semicolon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f30240a == mo25416C().length() || this.f30240a <= 0) {
            str2 = "EOF";
        } else {
            str2 = String.valueOf(mo25416C().charAt(this.f30240a - 1));
        }
        mo25455w("Expected " + str + ", but had '" + str2 + "' instead", this.f30240a - 1);
        throw new KotlinNothingValueException();
    }

    /* renamed from: z */
    public final void mo25457z(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) mo25427O(0, this.f30240a), str, 0, false, 6, (Object) null);
        mo25455w("Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.", lastIndexOf$default);
        throw new KotlinNothingValueException();
    }
}
