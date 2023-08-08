package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/runtime/u1;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/d2;", "a", "(Landroidx/compose/runtime/o;Landroidx/compose/runtime/o;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n*L\n1#1,316:1\n4216#2,4:317\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n192#1:317,4\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LayoutKt$materializerOf$1 */
public final class LayoutKt$materializerOf$1 extends Lambda implements C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> {
    final /* synthetic */ C8767m $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOf$1(C8767m mVar) {
        super(3);
        this.$modifier = mVar;
    }

    @C8540g
    /* renamed from: a */
    public final void mo44257a(@C12579k C8592o oVar, @C12580l C8592o oVar2, int i) {
        Intrinsics.checkNotNullParameter(oVar, "$this$null");
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1586257396, i, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:189)");
        }
        C8767m k = ComposedModifierKt.m32288k(oVar2, this.$modifier);
        oVar.mo14918M(509942095);
        Updater.m30188j(Updater.m30180b(oVar), k, ComposeUiNode.f38797m.mo44589e());
        oVar.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        mo44257a(((C8684u1) obj).mo16772h(), (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }
}
