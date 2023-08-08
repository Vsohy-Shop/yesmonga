package androidx.compose.foundation;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.modifier.C15630f;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.p004ui.platform.InspectableValueKt;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFocusedBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n135#2:124\n*S KotlinDebug\n*F\n+ 1 FocusedBounds.kt\nandroidx/compose/foundation/FocusedBoundsKt\n*L\n50#1:124\n*E\n"})
public final class FocusedBoundsKt {
    @C12579k

    /* renamed from: a */
    public static final C15638m<C11300l<C15588o, C11079d2>> f5742a = C15630f.m69509a(FocusedBoundsKt$ModifierLocalFocusedBoundsObserver$1.f5743f);

    @C12579k
    /* renamed from: a */
    public static final C15638m<C11300l<C15588o, C11079d2>> m8944a() {
        return f5742a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m8945b() {
    }

    @C2855v
    @C12579k
    /* renamed from: c */
    public static final C8767m m8946c(@C12579k C8767m mVar, @C12579k C11300l<? super C15588o, C11079d2> lVar) {
        C11300l lVar2;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onPositioned");
        if (InspectableValueKt.m71063e()) {
            lVar2 = new C2083x5a20c36e(lVar);
        } else {
            lVar2 = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar2, new FocusedBoundsKt$onFocusedBoundsChanged$2(lVar));
    }
}
