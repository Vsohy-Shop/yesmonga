package com.carrefour.fid.android.design.components.compose;

import androidx.compose.animation.core.C1984k0;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15321t3;
import com.carrefour.fid.android.design.theme.C37475b;
import com.google.accompanist.placeholder.C15037b;
import com.google.accompanist.placeholder.C15039c;
import com.google.accompanist.placeholder.PlaceholderKt;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.compose.o */
public final class C37019o {
    @C12579k
    /* renamed from: a */
    public static final C8767m m151908a(@C12579k C8767m mVar, boolean z, @C12579k C15218g4 g4Var) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(g4Var, "shape");
        C15037b.C15038a aVar = C15037b.f37166a;
        C37475b bVar = C37475b.f94185a;
        return PlaceholderKt.m64429d(mVar, z, bVar.mo114206C(), g4Var, C15039c.m64456d(aVar, bVar.mo114258z(), (C1984k0) null, 0.0f, 6, (Object) null), (C11305q) null, (C11305q) null, 48, (Object) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m151909b(C8767m mVar, boolean z, C15218g4 g4Var, int i, Object obj) {
        if ((i & 2) != 0) {
            g4Var = C15321t3.m66567a();
        }
        return m151908a(mVar, z, g4Var);
    }
}
