package androidx.compose.p004ui.draw;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.graphics.drawscope.C15184c;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,276:1\n135#2:277\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n137#1:277\n*E\n"})
/* renamed from: androidx.compose.ui.draw.DrawModifierKt */
public final class DrawModifierKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m32436a(@C12579k C8767m mVar, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onDraw");
        return mVar.mo17224k3(new DrawBehindElement(lVar));
    }

    @C12579k
    /* renamed from: b */
    public static final C8767m m32437b(@C12579k C8767m mVar, @C12579k C11300l<? super CacheDrawScope, C8751i> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onBuildDrawCache");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new DrawModifierKt$drawWithCache$$inlined$debugInspectorInfo$1(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar2, new DrawModifierKt$drawWithCache$2(lVar));
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m32438c(@C12579k C8767m mVar, @C12579k C11300l<? super C15184c, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onDraw");
        return mVar.mo17224k3(new DrawWithContentElement(lVar));
    }
}
