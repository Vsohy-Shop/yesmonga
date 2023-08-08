package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.foundation.layout.C2428y0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,2104:1\n79#2,2:2105\n81#2:2133\n85#2:2138\n75#3:2107\n76#3,11:2109\n89#3:2137\n76#4:2108\n460#5,13:2120\n473#5,3:2134\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipKt$ChipContent$1\n*L\n1412#1:2105,2\n1412#1:2133\n1412#1:2138\n1412#1:2107\n1412#1:2109,11\n1412#1:2137\n1412#1:2108\n1412#1:2120,13\n1412#1:2134,3\n*E\n"})
public final class ChipKt$ChipContent$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $avatar;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $label;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $leadingIcon;
    final /* synthetic */ long $leadingIconColor;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ C2366i0 $paddingValues;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $trailingIcon;
    final /* synthetic */ long $trailingIconColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipKt$ChipContent$1(float f, C2366i0 i0Var, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, int i, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, long j, C11304p<? super C8592o, ? super Integer, C11079d2> pVar3, C11304p<? super C8592o, ? super Integer, C11079d2> pVar4, long j2) {
        super(2);
        this.$minHeight = f;
        this.$paddingValues = i0Var;
        this.$avatar = pVar;
        this.$$dirty = i;
        this.$leadingIcon = pVar2;
        this.$leadingIconColor = j;
        this.$label = pVar3;
        this.$trailingIcon = pVar4;
        this.$trailingIconColor = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(1748799148, i2, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:1410)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m j = PaddingKt.m10023j(SizeKt.m10108h(aVar, 0.0f, this.$minHeight, 1, (Object) null), this.$paddingValues);
            Arrangement.C2269d p = Arrangement.f6010a.mo7630p();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            C11304p<C8592o, Integer, C11079d2> pVar = this.$avatar;
            int i3 = this.$$dirty;
            C11304p<C8592o, Integer, C11079d2> pVar2 = this.$leadingIcon;
            long j2 = this.$leadingIconColor;
            C11304p<C8592o, Integer, C11079d2> pVar3 = this.$label;
            C11304p<C8592o, Integer, C11079d2> pVar4 = this.$trailingIcon;
            long j3 = this.$trailingIconColor;
            oVar2.mo14918M(693286680);
            C15560f0 d = RowKt.m10071d(p, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            long j4 = j3;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(j);
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
            if (pVar != null) {
                oVar2.mo14918M(650988036);
                pVar.invoke(oVar2, Integer.valueOf((i3 >> 12) & 14));
                oVar.mo15002m0();
            } else if (pVar2 != null) {
                oVar2.mo14918M(650988107);
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j2))}, pVar2, oVar2, ((i3 >> 6) & 112) | 8);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(650988269);
                oVar.mo15002m0();
            }
            C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f19220a), oVar2, 6);
            pVar3.invoke(oVar2, Integer.valueOf(i3 & 14));
            C2428y0.m10726a(SizeKt.m10092H(aVar, ChipKt.f19220a), oVar2, 6);
            oVar2.mo14918M(-313068567);
            if (pVar4 != null) {
                CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(j4))}, pVar4, oVar2, ((i3 >> 12) & 112) | 8);
            }
            oVar.mo15002m0();
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
}
