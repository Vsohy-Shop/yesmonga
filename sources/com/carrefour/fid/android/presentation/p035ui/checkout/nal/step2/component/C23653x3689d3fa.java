package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.shape.C2694o;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.theme.C37475b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.DayOfWeek;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo22516d2 = {"T", "Landroidx/compose/foundation/lazy/e;", "", "it", "Lkotlin/d2;", "a", "(Landroidx/compose/foundation/lazy/e;ILandroidx/compose/runtime/o;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt$OpeningComponent$2$3\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,423:1\n97#2,6:424\n104#2:431\n105#2,3:433\n109#2,7:465\n116#2:477\n154#3:430\n154#3:432\n79#4,2:436\n81#4:464\n85#4:476\n75#5:438\n76#5,11:440\n89#5:475\n76#6:439\n460#7,13:451\n473#7,3:472\n*S KotlinDebug\n*F\n+ 1 OpeningComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/OpeningComponentKt$OpeningComponent$2$3\n*L\n102#1:430\n104#1:432\n98#1:436,2\n98#1:464\n98#1:476\n98#1:438\n98#1:440,11\n98#1:475\n98#1:439\n98#1:451,13\n98#1:472,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.OpeningComponentKt$OpeningComponent$2$3$invoke$$inlined$itemsIndexed$default$3 */
public final class C23653x3689d3fa extends Lambda implements C11306r<C2455e, Integer, C8592o, Integer, C11079d2> {
    final /* synthetic */ DayOfWeek $currentDayOfWeek$inlined;
    final /* synthetic */ List $items;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23653x3689d3fa(List list, DayOfWeek dayOfWeek) {
        super(4);
        this.$items = list;
        this.$currentDayOfWeek$inlined = dayOfWeek;
    }

    @C8540g
    /* renamed from: a */
    public final void mo69298a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
        int i3;
        C16209i0 i0Var;
        long j;
        int i4;
        int i5;
        C2455e eVar2 = eVar;
        int i6 = i;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(eVar2, "$this$items");
        if ((i2 & 14) == 0) {
            if (oVar2.mo15006n0(eVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i2 | i5;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (oVar2.mo14976f(i6)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 731) != 146 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
            }
            C23659a aVar = (C23659a) this.$items.get(i6);
            if (this.$currentDayOfWeek$inlined == aVar.mo69353e()) {
                i0Var = new C16209i0(700);
            } else {
                i0Var = new C16209i0(400);
            }
            C16209i0 i0Var2 = i0Var;
            C8767m.C8768a aVar2 = C8767m.f23478j;
            if (i6 % 2 == 0) {
                j = C37475b.f94185a.mo114206C();
            } else {
                j = C15240j2.f37547b.mo42852w();
            }
            C8767m n = SizeKt.m10114n(PaddingKt.m10024k(BackgroundKt.m8824c(aVar2, j, C2694o.m12166h(C16483g.m74435M((float) 4))), C16483g.m74435M((float) 8)), 0.0f, 1, (Object) null);
            Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(l, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            C8592o oVar3 = oVar;
            TextKt.m14196c(OpeningComponentKt.m105033e(aVar.mo69353e()), (C8767m) null, 0, C16506u.m74712m(12), (C16190e0) null, i0Var2, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 3072, 0, 131030);
            TextKt.m14196c(OpeningComponentKt.m105034f(aVar.mo69355f(), C16018i.m71858d(R.string.pickup_closed, oVar, 0)), (C8767m) null, 0, C16506u.m74712m(12), (C16190e0) null, i0Var2, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar3, 3072, 0, 131030);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo69298a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}
