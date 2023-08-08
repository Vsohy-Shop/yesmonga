package kotlin.text;

import java.util.Set;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.text.o */
public class C11617o extends C11616n {
    @C11110f
    /* renamed from: h */
    public static final Regex m45256h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new Regex(str);
    }

    @C11110f
    /* renamed from: i */
    public static final Regex m45257i(String str, Set<? extends RegexOption> set) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(set, "options");
        return new Regex(str, set);
    }

    @C11110f
    /* renamed from: j */
    public static final Regex m45258j(String str, RegexOption regexOption) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(regexOption, "option");
        return new Regex(str, regexOption);
    }
}
