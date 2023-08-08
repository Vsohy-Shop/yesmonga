package com.carrefour.fid.android.design.theme;

import androidx.compose.material.C7901q;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ThemeKt {
    @C12579k

    /* renamed from: a */
    public static final C7901q f94127a;

    static {
        C37475b bVar = C37475b.f94185a;
        f94127a = ColorsKt.m13387h(bVar.mo114218O(), 0, 0, 0, bVar.mo114208E(), 0, 0, 0, 0, 0, 0, 0, 4078, (Object) null);
    }

    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m153788a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(419090262);
        if ((i & 14) == 0) {
            if (o.mo14927P(pVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(419090262, i2, -1, "com.carrefour.fid.android.design.theme.OneAppTheme (Theme.kt:23)");
            }
            MaterialThemeKt.m13562a(f94127a, C37477d.m153887N(), C37476c.m153873a(), pVar, o, ((i2 << 9) & 7168) | 438, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ThemeKt$OneAppTheme$1(pVar, i));
        }
    }
}
