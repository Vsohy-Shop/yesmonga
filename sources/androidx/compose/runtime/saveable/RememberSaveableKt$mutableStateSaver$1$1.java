package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.snapshots.C8665r;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"T", "Landroidx/compose/runtime/saveable/f;", "Landroidx/compose/runtime/z0;", "state", "", "a", "(Landroidx/compose/runtime/saveable/f;Landroidx/compose/runtime/z0;)Landroidx/compose/runtime/z0;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class RememberSaveableKt$mutableStateSaver$1$1 extends Lambda implements C11304p<C8629f, C8700z0<T>, C8700z0<Object>> {
    final /* synthetic */ C8628e<T, Object> $this_with;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$1(C8628e<T, Object> eVar) {
        super(2);
        this.$this_with = eVar;
    }

    @C12580l
    /* renamed from: a */
    public final C8700z0<Object> invoke(@C12579k C8629f fVar, @C12579k C8700z0<T> z0Var) {
        Intrinsics.checkNotNullParameter(fVar, "$this$Saver");
        Intrinsics.checkNotNullParameter(z0Var, "state");
        if (z0Var instanceof C8665r) {
            Object a = this.$this_with.mo16406a(fVar, z0Var.getValue());
            C8410b2 a2 = ((C8665r) z0Var).mo15298a();
            Intrinsics.checkNotNull(a2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return C8415c2.m30241j(a, a2);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}
