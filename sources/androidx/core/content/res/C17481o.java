package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.C0330d1;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(26)
/* renamed from: androidx.core.content.res.o */
public final class C17481o {
    @C12579k

    /* renamed from: a */
    public static final C17481o f45775a = new C17481o();

    @C12579k
    @C0373u
    @C11384m
    /* renamed from: a */
    public static final Typeface m80207a(@C12579k TypedArray typedArray, @C0330d1 int i) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Typeface a = typedArray.getFont(i);
        Intrinsics.checkNotNull(a);
        return a;
    }
}
