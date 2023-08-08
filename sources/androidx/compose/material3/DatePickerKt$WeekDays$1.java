package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.C8310i;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DatePickerKt$WeekDays$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ ArrayList<Pair<String, String>> $dayNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DatePickerKt$WeekDays$1(ArrayList<Pair<String, String>> arrayList) {
        super(2);
        this.$dayNames = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1445541615, i, -1, "androidx.compose.material3.WeekDays.<anonymous> (DatePicker.kt:1365)");
            }
            C16361p0 a = TypographyKt.m26914a(C8215i1.f20180a.mo12654c(oVar, 6), C8310i.f21329a.mo13725T());
            final ArrayList<Pair<String, String>> arrayList = this.$dayNames;
            TextKt.m26698a(a, C8553b.m31048b(oVar, 2133710592, true, new C11304p<C8592o, Integer, C11079d2>() {
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
                            ComposerKt.m29845w0(2133710592, i2, -1, "androidx.compose.material3.WeekDays.<anonymous>.<anonymous> (DatePicker.kt:1368)");
                        }
                        C8734c cVar = null;
                        C8767m n = SizeKt.m10114n(SizeKt.m10108h(C8767m.f23478j, 0.0f, DatePickerKt.m25591K(), 1, (Object) null), 0.0f, 1, (Object) null);
                        Arrangement.C2271e n2 = Arrangement.f6010a.mo7629n();
                        C8734c.C8737c q = C8734c.f23406a.mo17070q();
                        ArrayList<Pair<String, String>> arrayList = arrayList;
                        oVar2.mo14918M(693286680);
                        C15560f0 d = RowKt.m10071d(n2, q, oVar2, 54);
                        int i3 = -1323940314;
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
                        boolean z = false;
                        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                        int i4 = 2058660585;
                        oVar2.mo14918M(2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                        oVar2.mo14918M(784203502);
                        for (Pair pair : arrayList) {
                            C8767m.C8768a aVar = C8767m.f23478j;
                            oVar2.mo14918M(1157296644);
                            boolean n0 = oVar2.mo15006n0(pair);
                            Object N = oVar.mo14921N();
                            if (n0 || N == C8592o.f23032a.mo16277a()) {
                                N = new DatePickerKt$WeekDays$1$1$1$1$1$1(pair);
                                oVar2.mo14893C(N);
                            }
                            oVar.mo15002m0();
                            C8767m E = SizeKt.m10089E(SemanticsModifierKt.m71866a(aVar, (C11300l) N), DatePickerKt.m25591K(), DatePickerKt.m25591K());
                            C8734c i5 = C8734c.f23406a.mo17066i();
                            oVar2.mo14918M(733328855);
                            C15560f0 k = BoxKt.m9849k(i5, z, oVar2, 6);
                            oVar2.mo14918M(i3);
                            C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                            C15863c4 c4Var2 = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.f38797m;
                            C11289a<ComposeUiNode> a2 = companion2.mo44585a();
                            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(E);
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
                            C8592o b2 = Updater.m30180b(oVar);
                            Updater.m30188j(b2, k, companion2.mo44588d());
                            Updater.m30188j(b2, dVar2, companion2.mo44586b());
                            Updater.m30188j(b2, layoutDirection2, companion2.mo44587c());
                            Updater.m30188j(b2, c4Var2, companion2.mo44590f());
                            oVar.mo14972e();
                            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, Integer.valueOf(z ? 1 : 0));
                            oVar2.mo14918M(i4);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                            TextKt.m26700c((String) pair.mo21851f(), SizeKt.m10098N(aVar, cVar, z, 3, cVar), 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(C16432i.f40718b.mo47667a()), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, 48, 0, 130556);
                            oVar.mo15002m0();
                            oVar.mo14896D();
                            oVar.mo15002m0();
                            oVar.mo15002m0();
                            oVar2 = oVar;
                            i4 = i4;
                            z = z;
                            i3 = i3;
                            cVar = cVar;
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
            }), oVar, 48);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
