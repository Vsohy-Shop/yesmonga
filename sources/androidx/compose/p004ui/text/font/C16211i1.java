package androidx.compose.p004ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C0376v0(28)
/* renamed from: androidx.compose.ui.text.font.i1 */
public final class C16211i1 {
    @C12579k

    /* renamed from: a */
    public static final C16211i1 f40304a = new C16211i1();

    @C0376v0(28)
    @C12579k
    @C0373u
    /* renamed from: a */
    public final Typeface mo46960a(@C12579k Typeface typeface, int i, boolean z) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Typeface a = Typeface.create(typeface, i, z);
        Intrinsics.checkNotNullExpressionValue(a, "create(typeface, finalFontWeight, finalFontStyle)");
        return a;
    }
}
