package androidx.compose.p004ui.text.android;

import android.text.Spanned;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.android.v */
public final class C16138v {
    /* renamed from: a */
    public static final boolean m72612a(@C12579k Spanned spanned, @C12579k Class<?> cls) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m72613b(@C12579k Spanned spanned, @C12579k Class<?> cls, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
            return true;
        }
        return false;
    }
}
