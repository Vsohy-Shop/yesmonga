package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.x0 */
public final class C17655x0 {
    @C12579k
    /* renamed from: a */
    public static final PorterDuffColorFilter m80788a(@C12579k PorterDuff.Mode mode, int i) {
        Intrinsics.checkNotNullParameter(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    @C12579k
    /* renamed from: b */
    public static final PorterDuffXfermode m80789b(@C12579k PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
