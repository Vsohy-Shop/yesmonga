package kotlinx.serialization.json.internal;

import com.carrefour.fid.android.airship.util.C13758b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.serialization.json.internal.k0 */
public final class C12382k0 {
    @C12579k

    /* renamed from: a */
    public static final String[] f30315a;
    @C12579k

    /* renamed from: b */
    public static final byte[] f30316b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m50087g(i >> 12) + m50087g(i >> 8) + m50087g(i >> 4) + m50087g(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f30315a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = (byte) 34;
        bArr[92] = (byte) 92;
        bArr[9] = (byte) 116;
        bArr[8] = (byte) 98;
        bArr[10] = (byte) 110;
        bArr[13] = (byte) 114;
        bArr[12] = (byte) 102;
        f30316b = bArr;
    }

    @C12579k
    /* renamed from: a */
    public static final byte[] m50081a() {
        return f30316b;
    }

    /* renamed from: b */
    public static /* synthetic */ void m50082b() {
    }

    @C12579k
    /* renamed from: c */
    public static final String[] m50083c() {
        return f30315a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m50084d() {
    }

    /* renamed from: e */
    public static final void m50085e(@C12579k StringBuilder sb, @C12579k String str) {
        int i;
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(str, "value");
        sb.append('\"');
        int length = str.length();
        int i2 = 0;
        loop0:
        while (true) {
            i = i2;
            while (i2 < length) {
                int i3 = i2 + 1;
                char charAt = str.charAt(i2);
                String[] strArr = f30315a;
                if (charAt >= strArr.length || strArr[charAt] == null) {
                    i2 = i3;
                } else {
                    sb.append(str, i, i2);
                    sb.append(strArr[charAt]);
                    i2 = i3;
                }
            }
            break loop0;
        }
        if (i != 0) {
            sb.append(str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    @C12580l
    /* renamed from: f */
    public static final Boolean m50086f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (C11622t.equals(str, C13758b.f33436b, true)) {
            return Boolean.TRUE;
        }
        if (C11622t.equals(str, C13758b.f33438c, true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: g */
    public static final char m50087g(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
