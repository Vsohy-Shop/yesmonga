package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTestModifierUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,58:1\n251#2,10:59\n*S KotlinDebug\n*F\n+ 1 TestModifierUpdater.kt\nandroidx/compose/ui/layout/TestModifierUpdaterKt\n*L\n50#1:59,10\n*E\n"})
/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt */
public final class TestModifierUpdaterKt {
    @C8540g
    @C11395k(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
    /* renamed from: a */
    public static final void m69042a(@C12579k C11300l<? super C15571h1, C11079d2> lVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(lVar, "onAttached");
        C8592o o = oVar.mo15009o(-1673066036);
        if ((i & 14) == 0) {
            if (o.mo14927P(lVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1673066036, i, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:45)");
            }
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1.f38682a;
            C11289a<LayoutNode> a = LayoutNode.f38817e1.mo44724a();
            o.mo14918M(1886828752);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo15026u();
            if (o.mo14997l()) {
                o.mo14947W(new C15529xeabd4719(a));
            } else {
                o.mo14888A();
            }
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.f38797m.mo44588d());
            Updater.m30185g(b, new TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(lVar));
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(lVar, i));
        }
    }
}
