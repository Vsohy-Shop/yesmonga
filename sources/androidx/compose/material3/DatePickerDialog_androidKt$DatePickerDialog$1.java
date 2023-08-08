package androidx.compose.material3;

import androidx.compose.foundation.C2223i;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8310i;
import androidx.compose.material3.tokens.C8313j;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
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
import androidx.compose.runtime.internal.C8552a;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerDialog_androidKt$DatePickerDialog$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C8180c0 $colors;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $confirmButton;
    final /* synthetic */ C11305q<C2373k, C8592o, Integer, C11079d2> $content;
    final /* synthetic */ C11304p<C8592o, Integer, C11079d2> $dismissButton;
    final /* synthetic */ C15218g4 $shape;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerDialog_androidKt$DatePickerDialog$1(C15218g4 g4Var, C8180c0 c0Var, float f, int i, C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2) {
        super(2);
        this.$shape = g4Var;
        this.$colors = c0Var;
        this.$tonalElevation = f;
        this.$$dirty = i;
        this.$content = qVar;
        this.$dismissButton = pVar;
        this.$confirmButton = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-476003174, i2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:79)");
            }
            C8767m.C8768a aVar = C8767m.f23478j;
            C8310i iVar = C8310i.f21329a;
            C8767m q = SizeKt.m10117q(SizeKt.m10126z(aVar, iVar.mo13731f()), 0.0f, iVar.mo13728c(), 1, (Object) null);
            C15218g4 g4Var = this.$shape;
            long c = this.$colors.mo12474c();
            float f = this.$tonalElevation;
            final C11305q<C2373k, C8592o, Integer, C11079d2> qVar = this.$content;
            final int i3 = this.$$dirty;
            final C11304p<C8592o, Integer, C11079d2> pVar = this.$dismissButton;
            final C11304p<C8592o, Integer, C11079d2> pVar2 = this.$confirmButton;
            C8552a b = C8553b.m31048b(oVar, 1763752415, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(1763752415, i2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:87)");
                        }
                        Arrangement.C2271e l = Arrangement.f6010a.mo7628l();
                        C11305q<C2373k, C8592o, Integer, C11079d2> qVar = qVar;
                        int i3 = i3;
                        C11304p<C8592o, Integer, C11079d2> pVar = pVar;
                        C11304p<C8592o, Integer, C11079d2> pVar2 = pVar2;
                        oVar2.mo14918M(-483455358);
                        C8767m.C8768a aVar = C8767m.f23478j;
                        C8734c.C8735a aVar2 = C8734c.f23406a;
                        C15560f0 b = ColumnKt.m9863b(l, aVar2.mo17072u(), oVar2, 6);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                        C11289a<ComposeUiNode> a = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
                        qVar.invoke(columnScopeInstance, oVar2, Integer.valueOf(((i3 >> 21) & 112) | 6));
                        C8767m j = PaddingKt.m10023j(columnScopeInstance.mo7714e(aVar, aVar2.mo17071s()), DatePickerDialog_androidKt.f19311a);
                        oVar2.mo14918M(733328855);
                        C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, oVar2, 0);
                        oVar2.mo14918M(-1323940314);
                        C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                        LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                        C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                        C11289a<ComposeUiNode> a2 = companion.mo44585a();
                        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(j);
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
                        C8592o b3 = Updater.m30180b(oVar);
                        Updater.m30188j(b3, k, companion.mo44588d());
                        Updater.m30188j(b3, dVar2, companion.mo44586b());
                        Updater.m30188j(b3, layoutDirection2, companion.mo44587c());
                        Updater.m30188j(b3, c4Var2, companion.mo44590f());
                        oVar.mo14972e();
                        f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        oVar2.mo14918M(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                        CompositionLocalKt.m29856b(new C8572j1[]{ContentColorKt.m25558a().mo16141f(C15240j2.m66071n(ColorSchemeKt.m25524k(C8313j.f21402a.mo13798c(), oVar2, 6)))}, C8553b.m31048b(oVar2, -926980325, true, new DatePickerDialog_androidKt$DatePickerDialog$1$1$1$1$1(pVar, i3, pVar2)), oVar2, 56);
                        oVar.mo15002m0();
                        oVar.mo14896D();
                        oVar.mo15002m0();
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
            });
            int i4 = this.$$dirty;
            SurfaceKt.m26352a(q, g4Var, c, 0, f, 0.0f, (C2223i) null, b, oVar, ((i4 >> 9) & 112) | 12582918 | ((i4 >> 3) & 57344), 104);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
