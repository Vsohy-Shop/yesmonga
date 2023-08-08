package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.serialization.json.internal.b */
public final class C12361b {

    /* renamed from: A */
    public static final byte f30245A = 10;

    /* renamed from: B */
    public static final byte f30246B = Byte.MAX_VALUE;

    /* renamed from: C */
    public static final int f30247C = 126;

    /* renamed from: D */
    public static final int f30248D = 117;

    /* renamed from: E */
    public static final int f30249E = 32;
    @C12579k

    /* renamed from: a */
    public static final String f30250a = "Use 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.";
    @C12579k

    /* renamed from: b */
    public static final String f30251b = "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.";
    @C12579k

    /* renamed from: c */
    public static final String f30252c = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
    @C12579k

    /* renamed from: d */
    public static final String f30253d = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";
    @C12579k

    /* renamed from: e */
    public static final String f30254e = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    @C12579k

    /* renamed from: f */
    public static final String f30255f = "null";

    /* renamed from: g */
    public static final char f30256g = ',';

    /* renamed from: h */
    public static final char f30257h = ':';

    /* renamed from: i */
    public static final char f30258i = '{';

    /* renamed from: j */
    public static final char f30259j = '}';

    /* renamed from: k */
    public static final char f30260k = '[';

    /* renamed from: l */
    public static final char f30261l = ']';

    /* renamed from: m */
    public static final char f30262m = '\"';

    /* renamed from: n */
    public static final char f30263n = '\\';

    /* renamed from: o */
    public static final char f30264o = '\u0000';

    /* renamed from: p */
    public static final char f30265p = 'u';

    /* renamed from: q */
    public static final byte f30266q = 0;

    /* renamed from: r */
    public static final byte f30267r = 1;

    /* renamed from: s */
    public static final byte f30268s = 2;

    /* renamed from: t */
    public static final byte f30269t = 3;

    /* renamed from: u */
    public static final byte f30270u = 4;

    /* renamed from: v */
    public static final byte f30271v = 5;

    /* renamed from: w */
    public static final byte f30272w = 6;

    /* renamed from: x */
    public static final byte f30273x = 7;

    /* renamed from: y */
    public static final byte f30274y = 8;

    /* renamed from: z */
    public static final byte f30275z = 9;

    /* renamed from: a */
    public static final byte m49912a(char c) {
        if (c < '~') {
            return C12369f.f30293c[c];
        }
        return 0;
    }

    /* renamed from: b */
    public static final char m49913b(int i) {
        if (i < 117) {
            return C12369f.f30292b[i];
        }
        return 0;
    }
}
