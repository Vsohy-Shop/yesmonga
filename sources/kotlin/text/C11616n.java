package kotlin.text;

import java.util.regex.Pattern;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.text.n */
public class C11616n extends StringsKt__IndentKt {
    @C11110f
    /* renamed from: g */
    public static final Regex m45255g(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "<this>");
        return new Regex(pattern);
    }
}
