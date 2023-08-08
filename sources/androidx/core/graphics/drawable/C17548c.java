package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.C0354l;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.core.graphics.drawable.c */
public final class C17548c {
    @C12579k
    /* renamed from: a */
    public static final ColorDrawable m80437a(@C0354l int i) {
        return new ColorDrawable(i);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @C0376v0(26)
    @C12579k
    /* renamed from: b */
    public static final ColorDrawable m80438b(@C12579k Color color) {
        Intrinsics.checkNotNullParameter(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
