package androidx.compose.p004ui.platform;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "a", "(Ljava/lang/Object;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2 */
public final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements C11300l<Object, C11079d2> {
    final /* synthetic */ C11744g<C11079d2> $channel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(C11744g<C11079d2> gVar) {
        super(1);
        this.$channel = gVar;
    }

    /* renamed from: a */
    public final void mo45549a(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "it");
        this.$channel.mo23751L(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo45549a(obj);
        return C11079d2.f28267a;
    }
}
