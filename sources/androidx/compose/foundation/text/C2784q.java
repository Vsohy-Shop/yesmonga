package androidx.compose.foundation.text;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.foundation.text.q */
public final class C2784q {
    @C12579k
    /* renamed from: a */
    public static final StringBuilder m12641a(@C12579k StringBuilder sb, int i) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder appendCodePoint = sb.appendCodePoint(i);
        Intrinsics.checkNotNullExpressionValue(appendCodePoint, "appendCodePointX");
        return appendCodePoint;
    }
}
