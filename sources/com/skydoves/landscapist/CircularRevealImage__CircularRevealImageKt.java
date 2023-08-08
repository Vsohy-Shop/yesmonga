package com.skydoves.landscapist;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.C15292a;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final /* synthetic */ class CircularRevealImage__CircularRevealImageKt {
    @C8540g
    /* renamed from: a */
    public static final void m145557a(@C12579k C15403w2 w2Var, @C12580l C8767m mVar, @C12580l Painter painter, @C12580l C8734c cVar, @C12580l C15541c cVar2, @C12580l String str, float f, @C12580l C15249k2 k2Var, @C12580l C35314a aVar, @C12580l C8592o oVar, int i, int i2) {
        C15292a aVar2;
        int i3;
        int i4 = i2;
        Intrinsics.checkNotNullParameter(w2Var, "bitmap");
        C8592o o = oVar.mo15009o(868152710);
        C8767m.C8768a aVar3 = (i4 & 2) != 0 ? C8767m.f23478j : mVar;
        if ((i4 & 4) != 0) {
            aVar2 = new C15292a(w2Var, 0, 0, 6, (DefaultConstructorMarker) null);
            i3 = i & -897;
        } else {
            aVar2 = painter;
            i3 = i;
        }
        C8734c i5 = (i4 & 8) != 0 ? C8734c.f23406a.mo17066i() : cVar;
        C15541c a = (i4 & 16) != 0 ? C15541c.f38696a.mo44369a() : cVar2;
        float f2 = (i4 & 64) != 0 ? 1.0f : f;
        C15249k2 k2Var2 = (i4 & 128) != 0 ? null : k2Var;
        C35314a aVar4 = (i4 & 256) != 0 ? null : aVar;
        o.mo14918M(868153101);
        Painter a2 = aVar4 != null ? CircularRevealAnimationKt.m145554a(aVar2, w2Var, aVar4.mo105768e(), aVar4.mo105770f(), o, 72, 0) : aVar2;
        o.mo15002m0();
        int i6 = i3 >> 3;
        ImageKt.m8967b(a2, str, aVar3, i5, a, f2, k2Var2, o, ((i3 >> 12) & 112) | 8 | ((i3 << 3) & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i6) | (i6 & 3670016), 0);
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new CircularRevealImage__CircularRevealImageKt$CircularRevealImage$1(w2Var, aVar3, aVar2, i5, a, str, f2, k2Var2, aVar4, i, i2));
        }
    }
}
