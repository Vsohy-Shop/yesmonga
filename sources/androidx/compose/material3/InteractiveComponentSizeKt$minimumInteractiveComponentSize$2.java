package androidx.compose.material3;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,128:1\n76#2:129\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt$minimumInteractiveComponentSize$2\n*L\n56#1:129\n*E\n"})
public final class InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {

    /* renamed from: f */
    public static final InteractiveComponentSizeKt$minimumInteractiveComponentSize$2 f19451f = new InteractiveComponentSizeKt$minimumInteractiveComponentSize$2();

    public InteractiveComponentSizeKt$minimumInteractiveComponentSize$2() {
        super(3);
    }

    @C8540g
    @C12579k
    /* renamed from: a */
    public final C8767m mo11615a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        C8767m mVar2;
        Intrinsics.checkNotNullParameter(mVar, "$this$composed");
        oVar.mo14918M(279503903);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(279503903, i, -1, "androidx.compose.material3.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:54)");
        }
        if (((Boolean) oVar.mo15032w(InteractiveComponentSizeKt.m25830b())).booleanValue()) {
            mVar2 = new MinimumInteractiveComponentSizeModifier(InteractiveComponentSizeKt.f19449c, (DefaultConstructorMarker) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return mVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo11615a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}
