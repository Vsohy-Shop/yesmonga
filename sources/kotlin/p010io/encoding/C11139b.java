package kotlin.p010io.encoding;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;

/* renamed from: kotlin.io.encoding.b */
public final class C11139b {
    @C11110f
    @C11143f
    @C11665v0(version = "1.8")
    /* renamed from: a */
    public static final byte[] m43013a(C11137a aVar, CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "source");
        if (!(charSequence instanceof String)) {
            return aVar.mo22567e(charSequence, i, i2);
        }
        aVar.mo22569g(charSequence.length(), i, i2);
        String substring = ((String) charSequence).substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Charset charset = C11602d.f28873g;
        Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = substring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @C11110f
    @C11143f
    @C11665v0(version = "1.8")
    /* renamed from: b */
    public static final int m43014b(C11137a aVar, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        return aVar.mo22578v(bArr, bArr2, i, i2, i3);
    }

    @C11110f
    @C11143f
    @C11665v0(version = "1.8")
    /* renamed from: c */
    public static final byte[] m43015c(C11137a aVar, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "source");
        return aVar.mo22561B(bArr, i, i2);
    }

    @C11110f
    @C11143f
    @C11665v0(version = "1.8")
    /* renamed from: d */
    public static final String m43016d(C11137a aVar, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "source");
        return new String(aVar.mo22561B(bArr, i, i2), C11602d.f28873g);
    }
}
