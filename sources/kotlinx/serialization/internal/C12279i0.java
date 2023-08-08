package kotlinx.serialization.internal;

import androidx.compose.p004ui.graphics.vector.C15369g;
import com.journeyapps.barcodescanner.camera.C34935s;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTimeFieldType;

/* renamed from: kotlinx.serialization.internal.i0 */
public final class C12279i0 {
    @C12579k

    /* renamed from: a */
    public static final C12279i0 f30072a = new C12279i0();
    @C12579k

    /* renamed from: b */
    public static final String f30073b = "0123456789ABCDEF";

    /* renamed from: d */
    public static /* synthetic */ String m49334d(C12279i0 i0Var, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return i0Var.mo25074c(bArr, z);
    }

    /* renamed from: a */
    public final int mo25072a(char c) {
        boolean z = true;
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = C15369g.f37994t;
        if (!('A' <= c && c < 'G')) {
            c2 = C15369g.f37993s;
            if ('a' > c || c >= 'g') {
                z = false;
            }
            if (!z) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @C12579k
    /* renamed from: b */
    public final byte[] mo25073b(@C12579k String str) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, C34935s.f84988a);
        int length = str.length();
        if (length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                int a = mo25072a(str.charAt(i));
                int i2 = i + 1;
                int a2 = mo25072a(str.charAt(i2));
                if (a == -1 || a2 == -1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    bArr[i / 2] = (byte) ((a << 4) + a2);
                    i += 2;
                } else {
                    throw new IllegalArgumentException(("Invalid hex chars: " + str.charAt(i) + str.charAt(i2)).toString());
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("HexBinary string must be even length".toString());
    }

    @C12579k
    /* renamed from: c */
    public final String mo25074c(@C12579k byte[] bArr, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "data");
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            sb.append(f30073b.charAt((b >> 4) & 15));
            sb.append(f30073b.charAt(b & DateTimeFieldType.f30626Z));
        }
        if (z) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "r.toString()");
            String lowerCase = sb2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return lowerCase;
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "r.toString()");
        return sb3;
    }

    @C12579k
    /* renamed from: e */
    public final String mo25075e(int i) {
        byte[] bArr = new byte[4];
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >> (24 - (i2 * 8)));
        }
        String trimStart = StringsKt__StringsKt.trimStart(mo25074c(bArr, true), '0');
        if (trimStart.length() > 0) {
            z = true;
        }
        if (!z) {
            trimStart = null;
        }
        if (trimStart == null) {
            return "0";
        }
        return trimStart;
    }
}
