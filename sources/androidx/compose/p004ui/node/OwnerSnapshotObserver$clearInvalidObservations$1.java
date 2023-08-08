package androidx.compose.p004ui.node;

import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1 */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends Lambda implements C11300l<Object, Boolean> {

    /* renamed from: f */
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 f38978f = new OwnerSnapshotObserver$clearInvalidObservations$1();

    public OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        return Boolean.valueOf(!((C15680d1) obj).mo44553e0());
    }
}
