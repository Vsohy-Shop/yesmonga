package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
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
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import org.jsoup.parser.C12888a;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$HorizontalMonthsList$2$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C8186d0 $dateFormatter;
    final /* synthetic */ C11300l<Long, Boolean> $dateValidator;
    final /* synthetic */ C8266q $firstMonth;
    final /* synthetic */ C11300l<Long, C11079d2> $onDateSelected;
    final /* synthetic */ StateData $stateData;
    final /* synthetic */ C8238l $today;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(StateData stateData, C8266q qVar, C11300l<? super Long, C11079d2> lVar, C8238l lVar2, C11300l<? super Long, Boolean> lVar3, C8186d0 d0Var, C8180c0 c0Var, int i) {
        super(1);
        this.$stateData = stateData;
        this.$firstMonth = qVar;
        this.$onDateSelected = lVar;
        this.$today = lVar2;
        this.$dateValidator = lVar3;
        this.$dateFormatter = d0Var;
        this.$colors = c0Var;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        int h = this.$stateData.mo11994h();
        final StateData stateData = this.$stateData;
        final C8266q qVar = this.$firstMonth;
        final C11300l<Long, C11079d2> lVar = this.$onDateSelected;
        final C8238l lVar2 = this.$today;
        final C11300l<Long, Boolean> lVar3 = this.$dateValidator;
        final C8186d0 d0Var = this.$dateFormatter;
        final C8180c0 c0Var = this.$colors;
        final int i = this.$$dirty;
        LazyListScope.m10822e(lazyListScope, h, (C11300l) null, (C11300l) null, C8553b.m31049c(-65053693, true, new C11306r<C2455e, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            /* renamed from: a */
            public final void mo11393a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
                int i3;
                int i4;
                int i5;
                C2455e eVar2 = eVar;
                int i6 = i;
                C8592o oVar2 = oVar;
                int i7 = i2;
                Intrinsics.checkNotNullParameter(eVar2, "$this$items");
                if ((i7 & 14) == 0) {
                    if (oVar2.mo15006n0(eVar2)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    i3 = i5 | i7;
                } else {
                    i3 = i7;
                }
                if ((i7 & 112) == 0) {
                    if (oVar2.mo14976f(i6)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & 731) != 146 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-65053693, i7, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1300)");
                    }
                    C8266q e = stateData.mo11987a().mo12489e(qVar, i6);
                    C8767m b = C2455e.m10931b(eVar2, C8767m.f23478j, 0.0f, 1, (Object) null);
                    C11300l<Long, C11079d2> lVar = lVar;
                    C8238l lVar2 = lVar2;
                    StateData stateData = stateData;
                    C11300l<Long, Boolean> lVar3 = lVar3;
                    C8186d0 d0Var = d0Var;
                    C8180c0 c0Var = c0Var;
                    int i8 = i;
                    oVar2.mo14918M(733328855);
                    C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                    oVar2.mo14918M(-1323940314);
                    C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                    LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                    C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                    C11289a<ComposeUiNode> a = companion.mo44585a();
                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(b);
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
                    C8592o b2 = Updater.m30180b(oVar);
                    Updater.m30188j(b2, k, companion.mo44588d());
                    Updater.m30188j(b2, dVar, companion.mo44586b());
                    Updater.m30188j(b2, layoutDirection, companion.mo44587c());
                    Updater.m30188j(b2, c4Var, companion.mo44590f());
                    oVar.mo14972e();
                    f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                    oVar2.mo14918M(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                    int i9 = i8 << 3;
                    int i10 = i8 << 6;
                    DatePickerKt.m25604j(e, lVar, lVar2, stateData, false, lVar3, d0Var, c0Var, oVar, (i9 & 458752) | (i9 & 112) | C12888a.f31808q | (i10 & 7168) | ((i8 << 9) & 3670016) | (29360128 & i10));
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
                mo11393a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }), 6, (Object) null);
    }
}
