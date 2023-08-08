package kotlin.text;

import java.nio.charset.Charset;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;

@C11314h(name = "CharsetsKt")
/* renamed from: kotlin.text.e */
public final class C11603e {
    @C11110f
    /* renamed from: a */
    public static final Charset m45212a(String str) {
        Intrinsics.checkNotNullParameter(str, "charsetName");
        Charset forName = Charset.forName(str);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
        return forName;
    }
}
