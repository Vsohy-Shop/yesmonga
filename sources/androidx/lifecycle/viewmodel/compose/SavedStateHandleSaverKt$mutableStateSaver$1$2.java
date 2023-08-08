package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.saveable.C8628e;
import androidx.compose.runtime.snapshots.C8665r;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"T", "Landroidx/compose/runtime/z0;", "", "it", "a", "(Landroidx/compose/runtime/z0;)Landroidx/compose/runtime/z0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class SavedStateHandleSaverKt$mutableStateSaver$1$2 extends Lambda implements C11300l<C8700z0<Object>, C8700z0<T>> {
    final /* synthetic */ C8628e<T, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedStateHandleSaverKt$mutableStateSaver$1$2(C8628e<T, Object> eVar) {
        super(1);
        this.$this_with = eVar;
    }

    @C12580l
    /* renamed from: a */
    public final C8700z0<T> invoke(@C12579k C8700z0<Object> z0Var) {
        T t;
        Intrinsics.checkNotNullParameter(z0Var, "it");
        if (z0Var instanceof C8665r) {
            if (z0Var.getValue() != null) {
                C8628e<T, Object> eVar = this.$this_with;
                Object value = z0Var.getValue();
                Intrinsics.checkNotNull(value);
                t = eVar.mo16407b(value);
            } else {
                t = null;
            }
            C8410b2 a = ((C8665r) z0Var).mo15298a();
            Intrinsics.checkNotNull(a, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0?>");
            C8700z0<T> j = C8415c2.m30241j(t, a);
            Intrinsics.checkNotNull(j, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$0>");
            return j;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
