package kotlin.text;

import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11452c;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* renamed from: kotlin.text.c */
public class C11601c extends C11600b {
    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    /* renamed from: D */
    public static final char m45198D(int i) {
        if (new C11466l(0, 9).mo23056Q(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException("Int " + i + " is not a decimal digit");
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    /* renamed from: E */
    public static final char m45199E(int i, int i2) {
        int i3;
        if (!new C11466l(2, 36).mo23056Q(i2)) {
            throw new IllegalArgumentException("Invalid radix: " + i2 + ". Valid radix values are in range 2..36");
        } else if (i < 0 || i >= i2) {
            throw new IllegalArgumentException("Digit " + i + " does not represent a valid digit in radix " + i2);
        } else {
            if (i < 10) {
                i3 = i + 48;
            } else {
                i3 = ((char) (i + 65)) - 10;
            }
            return (char) i3;
        }
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    /* renamed from: F */
    public static final int m45200F(char c) {
        int b = C11600b.m45173b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.5")
    /* renamed from: G */
    public static final int m45201G(char c, int i) {
        Integer I = m45203I(c, i);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: H */
    public static final Integer m45202H(char c) {
        Integer valueOf = Integer.valueOf(C11600b.m45173b(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @C11097g2(markerClass = {C11429q.class})
    @C12580l
    @C11665v0(version = "1.5")
    /* renamed from: I */
    public static final Integer m45203I(char c, int i) {
        boolean z;
        C11600b.m45172a(i);
        Integer valueOf = Integer.valueOf(C11600b.m45173b(c, i));
        if (valueOf.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return valueOf;
        }
        return null;
    }

    /* renamed from: J */
    public static final boolean m45204J(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m45205K(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m45204J(c, c2, z);
    }

    /* renamed from: L */
    public static final boolean m45206L(char c) {
        return new C11452c(55296, 57343).mo23018Q(c);
    }

    @C11110f
    /* renamed from: M */
    public static final String m45207M(char c, String str) {
        Intrinsics.checkNotNullParameter(str, "other");
        return c + str;
    }

    @C11665v0(version = "1.5")
    @C12579k
    /* renamed from: N */
    public static final String m45208N(char c) {
        return C11628z.m45394a(c);
    }
}
