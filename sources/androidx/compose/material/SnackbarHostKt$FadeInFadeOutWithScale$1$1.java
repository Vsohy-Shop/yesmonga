package androidx.compose.material;

import androidx.compose.animation.core.C1947b0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.C16027e;
import androidx.compose.p004ui.semantics.C16044q;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,373:1\n67#2,6:374\n73#2:406\n77#2:411\n75#3:380\n76#3,11:382\n89#3:410\n76#4:381\n460#5,13:393\n473#5,3:407\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n299#1:374,6\n299#1:406\n299#1:411\n299#1:380\n299#1:382,11\n299#1:410\n299#1:381\n299#1:393,13\n299#1:407,3\n*E\n"})
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends Lambda implements C11305q<C11304p<? super C8592o, ? super Integer, ? extends C11079d2>, C8592o, Integer, C11079d2> {
    final /* synthetic */ C3052i1 $current;
    final /* synthetic */ C3052i1 $key;
    final /* synthetic */ List<C3052i1> $keys;
    final /* synthetic */ C7874k0<C3052i1> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(C3052i1 i1Var, C3052i1 i1Var2, List<C3052i1> list, C7874k0<C3052i1> k0Var) {
        super(3);
        this.$key = i1Var;
        this.$current = i1Var2;
        this.$keys = list;
        this.$state = k0Var;
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public final void mo10425a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar2 = pVar;
        C8592o oVar2 = oVar;
        Intrinsics.checkNotNullParameter(pVar2, "children");
        if ((i & 14) == 0) {
            if (oVar2.mo14927P(pVar2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-94104314, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
            }
            boolean areEqual = Intrinsics.areEqual((Object) this.$key, (Object) this.$current);
            if (areEqual) {
                i3 = 150;
            } else {
                i3 = 75;
            }
            if (!areEqual || CollectionsKt___CollectionsKt.m40664n2(this.$keys).size() == 1) {
                i4 = 0;
            } else {
                i4 = 75;
            }
            C8578k2 d = SnackbarHostKt.m13849f(C1972h.m8391p(i3, i4, C1947b0.m8291c()), areEqual, new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(this.$key, this.$state), oVar, 0, 0);
            C8578k2 e = SnackbarHostKt.m13850g(C1972h.m8391p(i3, i4, C1947b0.m8290b()), areEqual, oVar2, 0);
            C8767m e2 = C15320t2.m66561e(C8767m.f23478j, ((Number) e.getValue()).floatValue(), ((Number) e.getValue()).floatValue(), ((Number) d.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131064, (Object) null);
            final C3052i1 i1Var = this.$key;
            C8767m c = SemanticsModifierKt.m71868c(e2, false, new C11300l<C16044q, C11079d2>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C16044q) obj);
                    return C11079d2.f28267a;
                }

                public final void invoke(@C12579k C16044q qVar) {
                    Intrinsics.checkNotNullParameter(qVar, "$this$semantics");
                    SemanticsPropertiesKt.m71971M0(qVar, C16027e.f39783b.mo46109b());
                    final C3052i1 i1Var = i1Var;
                    SemanticsPropertiesKt.m72024l(qVar, (String) null, new C11289a<Boolean>() {
                        @C12579k
                        public final Boolean invoke() {
                            i1Var.dismiss();
                            return Boolean.TRUE;
                        }
                    }, 1, (Object) null);
                }
            }, 1, (Object) null);
            oVar2.mo14918M(733328855);
            C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(c);
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
            pVar2.invoke(oVar2, Integer.valueOf(i2 & 14));
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo10425a((C11304p) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
