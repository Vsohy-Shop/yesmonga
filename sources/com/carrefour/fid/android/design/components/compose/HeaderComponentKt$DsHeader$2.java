package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nHeaderComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,607:1\n154#2:608\n154#2:642\n154#2:643\n74#3,6:609\n80#3:641\n84#3:648\n75#4:615\n76#4,11:617\n89#4:647\n76#5:616\n460#6,13:628\n473#6,3:644\n*S KotlinDebug\n*F\n+ 1 HeaderComponent.kt\ncom/carrefour/fid/android/design/components/compose/HeaderComponentKt$DsHeader$2\n*L\n103#1:608\n107#1:642\n116#1:643\n100#1:609,6\n100#1:641\n100#1:648\n100#1:615\n100#1:617,11\n100#1:647\n100#1:616\n100#1:628,13\n100#1:644,3\n*E\n"})
public final class HeaderComponentKt$DsHeader$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty2;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    final /* synthetic */ C16361p0 $titleStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderComponentKt$DsHeader$2(String str, C16361p0 p0Var, int i, String str2, int i2) {
        super(2);
        this.$title = str;
        this.$titleStyle = p0Var;
        this.$$dirty = i;
        this.$subtitle = str2;
        this.$$dirty2 = i2;
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
                ComposerKt.m29845w0(1116678453, i2, -1, "com.carrefour.fid.android.design.components.compose.DsHeader.<anonymous> (HeaderComponent.kt:98)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8767m o = PaddingKt.m10028o(SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 0.0f, 0.0f, C16483g.m74435M((float) 22), 0.0f, 11, (Object) null);
            C8734c.C8736b m = C8734c.f23406a.mo17068m();
            String str = this.$title;
            C16361p0 p0Var = this.$titleStyle;
            int i3 = this.$$dirty;
            String str2 = this.$subtitle;
            int i4 = this.$$dirty2;
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), m, oVar2, 48);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(o);
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
            Updater.m30188j(b2, b, companion.mo44588d());
            Updater.m30188j(b2, dVar, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection, companion.mo44587c());
            Updater.m30188j(b2, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            float f2 = (float) 16;
            C8767m o2 = PaddingKt.m10028o(aVar, 0.0f, 0.0f, C16483g.m74435M(f2), 0.0f, 11, (Object) null);
            C16449r.C16450a aVar2 = C16449r.f40760b;
            int c = aVar2.mo47727c();
            C16432i.C16433a aVar3 = C16432i.f40718b;
            float f3 = f2;
            int i5 = i3;
            C16361p0 p0Var2 = p0Var;
            int i6 = (i5 & 14) | 3120;
            int i7 = ((i5 << 3) & 3670016) | 3120;
            String str3 = str;
            C16361p0 p0Var3 = p0Var2;
            C8592o oVar3 = oVar;
            TextKt.m14196c(str3, o2, 0, C16506u.m74712m(17), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(aVar3.mo47672f()), 0, c, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, p0Var3, oVar3, i6, i7, 54772);
            C8767m o3 = PaddingKt.m10028o(aVar, 0.0f, 0.0f, C16483g.m74435M(f3), 0.0f, 11, (Object) null);
            int c2 = aVar2.mo47727c();
            int f4 = aVar3.mo47672f();
            String str4 = str2;
            C16361p0 p0Var4 = p0Var2;
            C8592o oVar4 = oVar;
            TextKt.m14196c(str4, o3, 0, C16506u.m74712m(12), (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(f4), 0, c2, false, 1, 0, (C11300l<? super C16260h0, C11079d2>) null, p0Var4, oVar4, (i4 & 14) | 3120, i7, 54772);
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
