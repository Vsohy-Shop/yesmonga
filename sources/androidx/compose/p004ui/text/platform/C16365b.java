package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16200h;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16211i1;
import androidx.compose.p004ui.text.font.C16242u;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "This path for preloading fonts is not supported")
/* renamed from: androidx.compose.ui.text.platform.b */
public final class C16365b implements C16385n {
    @C12579k

    /* renamed from: a */
    public final C16242u f40624a = C16242u.f40340b.mo47008b();

    @C12579k
    /* renamed from: a */
    public C16242u mo47020a() {
        return this.f40624a;
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47534b(@C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        if (Build.VERSION.SDK_INT < 28) {
            Typeface defaultFromStyle = Typeface.defaultFromStyle(C16200h.m72990c(i0Var, i));
            Intrinsics.checkNotNullExpressionValue(defaultFromStyle, "{\n            Typeface.d…)\n            )\n        }");
            return defaultFromStyle;
        }
        C16211i1 i1Var = C16211i1.f40304a;
        Typeface typeface = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(typeface, "DEFAULT");
        return i1Var.mo46960a(typeface, i0Var.mo46939t0(), C16190e0.m72951f(i, C16190e0.f40252b.mo46882a()));
    }
}
