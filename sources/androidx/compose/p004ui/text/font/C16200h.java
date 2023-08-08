package androidx.compose.p004ui.text.font;

import androidx.compose.p004ui.text.font.C16209i0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.text.font.h */
public final class C16200h {
    @C12579k
    /* renamed from: a */
    public static final C16209i0 m72988a(@C12579k C16209i0.C16210a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.mo46942D();
    }

    /* renamed from: b */
    public static final int m72989b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: c */
    public static final int m72990c(@C12579k C16209i0 i0Var, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(i0Var, "fontWeight");
        if (i0Var.compareTo(m72988a(C16209i0.f40292b)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return m72989b(z, C16190e0.m72951f(i, C16190e0.f40252b.mo46882a()));
    }
}
