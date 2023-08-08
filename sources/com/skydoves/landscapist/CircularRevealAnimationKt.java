package com.skydoves.landscapist;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1983k;
import androidx.compose.animation.core.C1998o0;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.profileinstaller.C20022q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11377x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class CircularRevealAnimationKt {

    /* renamed from: com.skydoves.landscapist.CircularRevealAnimationKt$a */
    public /* synthetic */ class C35310a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CircularRevealState.values().length];
            iArr[CircularRevealState.None.ordinal()] = 1;
            iArr[CircularRevealState.Finished.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public static final Painter m145554a(@C12579k Painter painter, @C12579k C15403w2 w2Var, int i, @C12580l C35315b bVar, @C12580l C8592o oVar, int i2, int i3) {
        C35315b bVar2;
        float f;
        float f2;
        Painter painter2 = painter;
        C15403w2 w2Var2 = w2Var;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(painter2, "<this>");
        Intrinsics.checkNotNullParameter(w2Var2, "imageBitmap");
        oVar2.mo14918M(-234649234);
        if ((i3 & 4) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        oVar2.mo14918M(-3687241);
        Object N = oVar.mo14921N();
        C8592o.C8593a aVar = C8592o.f23032a;
        if (N == aVar.mo16277a()) {
            N = new C1998o0(CircularRevealState.None);
            oVar2.mo14893C(N);
        }
        oVar.mo15002m0();
        C1998o0 o0Var = (C1998o0) N;
        o0Var.mo6949g(CircularRevealState.Finished);
        Transition n = TransitionKt.m8195n(o0Var, (String) null, oVar2, C1998o0.f5575d | 48, 0);
        CircularRevealAnimationKt$circularReveal$radius$2 circularRevealAnimationKt$circularReveal$radius$2 = new CircularRevealAnimationKt$circularReveal$radius$2(i);
        oVar2.mo14918M(1399891485);
        C1945a1<Float, C1983k> i4 = VectorConvertersKt.m8224i(C11377x.f28521a);
        oVar2.mo14918M(1847725064);
        oVar2.mo14918M(-511059282);
        int[] iArr = C35310a.$EnumSwitchMapping$0;
        int i5 = iArr[((CircularRevealState) n.mo6700h()).ordinal()];
        if (i5 == 1) {
            f = 0.0f;
        } else if (i5 == 2) {
            if (bVar2 != null) {
                bVar2.mo105773a();
            }
            f = 1.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oVar.mo15002m0();
        Float valueOf = Float.valueOf(f);
        oVar2.mo14918M(-511059282);
        int i6 = iArr[((CircularRevealState) n.mo6706o()).ordinal()];
        if (i6 == 1) {
            f2 = 0.0f;
        } else if (i6 == 2) {
            if (bVar2 != null) {
                bVar2.mo105773a();
            }
            f2 = 1.0f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        oVar.mo15002m0();
        C8578k2<Float> m = TransitionKt.m8194m(n, valueOf, Float.valueOf(f2), (C1956d0) circularRevealAnimationKt$circularReveal$radius$2.invoke(n.mo6704m(), oVar2, 0), i4, "FloatAnimation", oVar, C20022q.C20025c.f51280k);
        oVar.mo15002m0();
        oVar.mo15002m0();
        oVar2.mo14918M(-3686930);
        boolean n0 = oVar2.mo15006n0(painter2);
        Object N2 = oVar.mo14921N();
        if (n0 || N2 == aVar.mo16277a()) {
            N2 = new C35317d(w2Var2, painter2);
            oVar2.mo14893C(N2);
        }
        oVar.mo15002m0();
        C35317d dVar = (C35317d) N2;
        dVar.mo105775p(m145555b(m));
        oVar.mo15002m0();
        return dVar;
    }

    /* renamed from: b */
    public static final float m145555b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }
}
