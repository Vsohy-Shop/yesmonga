package androidx.compose.p004ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16200h;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16211i1;
import androidx.compose.p004ui.text.font.C16216k0;
import androidx.compose.p004ui.text.font.C16242u;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "This path for preloading loading fonts is not supported.")
/* renamed from: androidx.compose.ui.text.platform.d */
public final class C16368d implements C16385n {
    @C12579k

    /* renamed from: a */
    public final C16242u f40630a;
    @C12579k

    /* renamed from: b */
    public final Typeface f40631b;

    public C16368d(@C12579k C16216k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "fontFamily");
        this.f40630a = k0Var;
        Typeface create = Typeface.create(k0Var.mo46975H(), 0);
        Intrinsics.checkNotNull(create);
        this.f40631b = create;
    }

    @C12579k
    /* renamed from: a */
    public C16242u mo47020a() {
        return this.f40630a;
    }

    @C12579k
    /* renamed from: b */
    public Typeface mo47534b(@C12579k C16209i0 i0Var, int i, int i2) {
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        Typeface c = mo47537c(i0Var, i);
        Intrinsics.checkNotNullExpressionValue(c, "buildStyledTypeface(fontWeight, fontStyle)");
        return c;
    }

    /* renamed from: c */
    public final Typeface mo47537c(C16209i0 i0Var, int i) {
        if (Build.VERSION.SDK_INT < 28) {
            return Typeface.create(this.f40631b, C16200h.m72990c(i0Var, i));
        }
        return C16211i1.f40304a.mo46960a(this.f40631b, i0Var.mo46939t0(), C16190e0.m72951f(i, C16190e0.f40252b.mo46882a()));
    }
}
