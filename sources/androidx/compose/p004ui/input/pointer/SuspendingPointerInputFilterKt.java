package androidx.compose.p004ui.input.pointer;

import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.platform.InspectableValueKt;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,643:1\n135#2:644\n135#2:645\n135#2:646\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n233#1:644\n280#1:645\n326#1:646\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt */
public final class SuspendingPointerInputFilterKt {
    @C12579k

    /* renamed from: a */
    public static final String f38470a = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    @C12579k

    /* renamed from: b */
    public static final C15491o f38471b = new C15491o(CollectionsKt__CollectionsKt.m40441E());

    @C12579k
    /* renamed from: b */
    public static final C8767m m68436b(@C12579k C8767m mVar, @C12580l Object obj, @C12580l Object obj2, @C12579k C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (InspectableValueKt.m71063e()) {
            lVar = new C15459x56256fb6(obj, obj2, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new SuspendingPointerInputFilterKt$pointerInput$4(obj, obj2, pVar));
    }

    @C12579k
    /* renamed from: c */
    public static final C8767m m68437c(@C12579k C8767m mVar, @C12580l Object obj, @C12579k C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (InspectableValueKt.m71063e()) {
            lVar = new C15458x56256fb5(obj, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new SuspendingPointerInputFilterKt$pointerInput$2(obj, pVar));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.")
    @C12579k
    /* renamed from: d */
    public static final C8767m m68438d(@C12579k C8767m mVar, @C12579k C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        throw new IllegalStateException(f38470a.toString());
    }

    @C12579k
    /* renamed from: e */
    public static final C8767m m68439e(@C12579k C8767m mVar, @C12579k Object[] objArr, @C12579k C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        C11300l lVar;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "keys");
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (InspectableValueKt.m71063e()) {
            lVar = new C15460x56256fb7(objArr, pVar);
        } else {
            lVar = InspectableValueKt.m71060b();
        }
        return ComposedModifierKt.m32282e(mVar, lVar, new SuspendingPointerInputFilterKt$pointerInput$6(objArr, pVar));
    }
}
