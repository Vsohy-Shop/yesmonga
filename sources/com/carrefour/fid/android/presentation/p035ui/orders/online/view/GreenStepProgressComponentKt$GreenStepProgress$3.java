package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2365i;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nGreenStepProgressComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/GreenStepProgressComponentKt$GreenStepProgress$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,189:1\n154#2:190\n154#2:223\n154#2:224\n154#2:230\n154#2:232\n76#3,5:191\n81#3:222\n85#3:229\n75#4:196\n76#4,11:198\n89#4:228\n76#5:197\n460#6,13:209\n473#6,3:225\n88#7:231\n58#7:233\n*S KotlinDebug\n*F\n+ 1 GreenStepProgressComponent.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/view/GreenStepProgressComponentKt$GreenStepProgress$3\n*L\n73#1:190\n86#1:223\n87#1:224\n96#1:230\n97#1:232\n79#1:191,5\n79#1:222\n79#1:229\n79#1:196\n79#1:198,11\n79#1:228\n79#1:197\n79#1:209,13\n79#1:225,3\n97#1:231\n97#1:233\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgressComponentKt$GreenStepProgress$3 */
public final class GreenStepProgressComponentKt$GreenStepProgress$3 extends Lambda implements C11305q<C2365i, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $maxStep;
    final /* synthetic */ C8578k2<Float> $progressAnimation$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GreenStepProgressComponentKt$GreenStepProgress$3(C8578k2<Float> k2Var, int i) {
        super(3);
        this.$progressAnimation$delegate = k2Var;
        this.$maxStep = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo73651a(@C12579k C2365i iVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        C2365i iVar2 = iVar;
        C8592o oVar2 = oVar;
        int i4 = i;
        Intrinsics.checkNotNullParameter(iVar2, "$this$BoxWithConstraints");
        if ((i4 & 14) == 0) {
            if (oVar2.mo15006n0(iVar2)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i4;
        } else {
            i2 = i4;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1876377241, i4, -1, "com.carrefour.fid.android.presentation.ui.orders.online.view.GreenStepProgress.<anonymous> (GreenStepProgressComponent.kt:68)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            float f = (float) 8;
            C8767m a = C8744d.m32514a(SizeKt.m10115o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), C16483g.m74435M(f)), C2694o.m12169k());
            float A = GreenStepProgressComponentKt.m109299j(this.$progressAnimation$delegate);
            C37475b bVar = C37475b.f94185a;
            float f2 = f;
            ProgressIndicatorKt.m13714k(A, a, bVar.mo114250r(), bVar.mo114206C(), 0, oVar, 0, 16);
            C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            int i5 = this.$maxStep;
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, C8734c.f23406a.mo17073w(), oVar2, 6);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(n);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a2);
            } else {
                oVar.mo14888A();
            }
            oVar.mo14941U();
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            int i6 = 0;
            f3.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            oVar2.mo14918M(1975281727);
            if (i5 >= 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7;
                    ImageKt.m8967b(C16015f.m71849d(R.drawable.ic_white_dot, oVar2, i6), (String) null, SizeKt.m10087C(PaddingKt.m10026m(C8767m.f23478j, C16483g.m74435M((float) 3), 0.0f, 2, (Object) null), C16483g.m74435M((float) 4)), C8734c.f23406a.mo17066i(), (C15541c) null, 0.0f, (C15249k2) null, oVar, 3512, 112);
                    if (i8 == i5) {
                        break;
                    }
                    i7 = i8 + 1;
                    i6 = 0;
                }
            }
            oVar.mo15002m0();
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            ImageKt.m8967b(C16015f.m71849d(R.drawable.point_highlight, oVar2, 0), (String) null, OffsetKt.m10000f(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 16)), C16483g.m74435M(C16483g.m74435M(iVar.mo8085a() * GreenStepProgressComponentKt.m109299j(this.$progressAnimation$delegate)) - C16483g.m74435M(f2)), 0.0f, 2, (Object) null), (C8734c) null, (C15541c) null, 0.0f, (C15249k2) null, oVar, 56, 120);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo73651a((C2365i) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
