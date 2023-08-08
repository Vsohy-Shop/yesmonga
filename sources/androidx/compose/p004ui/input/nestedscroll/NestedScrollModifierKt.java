package androidx.compose.p004ui.input.nestedscroll;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,344:1\n135#2:345\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n331#1:345\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt */
public final class NestedScrollModifierKt {
    @C12579k
    /* renamed from: a */
    public static final C8767m m68304a(@C12579k C8767m mVar, @C12579k C15446a aVar, @C12580l NestedScrollDispatcher nestedScrollDispatcher) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "connection");
        if (InspectableValueKt.m71063e()) {
            lVar = new C15444xb158771c(aVar, nestedScrollDispatcher);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new NestedScrollModifierKt$nestedScroll$2(nestedScrollDispatcher, aVar));
    }

    /* renamed from: b */
    public static /* synthetic */ C8767m m68305b(C8767m mVar, C15446a aVar, NestedScrollDispatcher nestedScrollDispatcher, int i, Object obj) {
        if ((i & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return m68304a(mVar, aVar, nestedScrollDispatcher);
    }
}
