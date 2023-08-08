package com.carrefour.fid.android.design.libs.pager;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt;
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

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class PagerKt$Pager$7$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C37464a $consumeFlingNestedScrollConnection;
    final /* synthetic */ C11306r<C37465b, Integer, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ int $count;
    final /* synthetic */ C11300l<Integer, Object> $key;
    final /* synthetic */ C37466c $pagerScope;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$Pager$7$1(int i, C11300l<? super Integer, ? extends Object> lVar, C37464a aVar, C11306r<? super C37465b, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar, C37466c cVar, int i2) {
        super(1);
        this.$count = i;
        this.$key = lVar;
        this.$consumeFlingNestedScrollConnection = aVar;
        this.$content = rVar;
        this.$pagerScope = cVar;
        this.$$dirty1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        int i = this.$count;
        C11300l<Integer, Object> lVar = this.$key;
        final C37464a aVar = this.$consumeFlingNestedScrollConnection;
        final C11306r<C37465b, Integer, C8592o, Integer, C11079d2> rVar = this.$content;
        final C37466c cVar = this.$pagerScope;
        final int i2 = this.$$dirty1;
        LazyListScope.m10822e(lazyListScope, i, lVar, (C11300l) null, C8553b.m31049c(-1830867026, true, new C11306r<C2455e, Integer, C8592o, Integer, C11079d2>() {
            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            /* renamed from: a */
            public final void mo114097a(@C12579k C2455e eVar, int i, @C12580l C8592o oVar, int i2) {
                int i3;
                int i4;
                int i5;
                C2455e eVar2 = eVar;
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
                    if (oVar2.mo14976f(i)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                } else {
                    int i6 = i;
                }
                if ((i3 & 731) != 146 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-1830867026, i3, -1, "com.carrefour.fid.android.design.libs.pager.Pager.<anonymous>.<anonymous>.<anonymous> (Pager.kt:277)");
                    }
                    C8767m N = SizeKt.m10098N(C2455e.m10931b(eVar2, NestedScrollModifierKt.m68305b(C8767m.f23478j, aVar, (NestedScrollDispatcher) null, 2, (Object) null), 0.0f, 1, (Object) null), (C8734c) null, false, 3, (Object) null);
                    C11306r<C37465b, Integer, C8592o, Integer, C11079d2> rVar = rVar;
                    C37466c cVar = cVar;
                    int i7 = i2;
                    oVar2.mo14918M(733328855);
                    C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                    oVar2.mo14918M(-1323940314);
                    C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                    LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                    C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                    ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                    C11289a<ComposeUiNode> a = companion.mo44585a();
                    C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(N);
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
                    Updater.m30188j(b, k, companion.mo44588d());
                    Updater.m30188j(b, dVar, companion.mo44586b());
                    Updater.m30188j(b, layoutDirection, companion.mo44587c());
                    Updater.m30188j(b, c4Var, companion.mo44590f());
                    oVar.mo14972e();
                    f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                    oVar2.mo14918M(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                    rVar.invoke(cVar, Integer.valueOf(i), oVar2, Integer.valueOf((i3 & 112) | ((i7 << 3) & 896)));
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
                mo114097a((C2455e) obj, ((Number) obj2).intValue(), (C8592o) obj3, ((Number) obj4).intValue());
                return C11079d2.f28267a;
            }
        }), 4, (Object) null);
    }
}
