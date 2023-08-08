package androidx.compose.p004ui.node;

import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.collection.C8423g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/m$c;", "it", "", "a", "(Landroidx/compose/ui/m$c;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.NodeChainKt$fillVector$1 */
public final class NodeChainKt$fillVector$1 extends Lambda implements C11300l<C8767m.C8770c, Boolean> {
    final /* synthetic */ C8423g<C8767m.C8770c> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodeChainKt$fillVector$1(C8423g<C8767m.C8770c> gVar) {
        super(1);
        this.$result = gVar;
    }

    @C12579k
    /* renamed from: a */
    public final Boolean invoke(@C12579k C8767m.C8770c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "it");
        this.$result.mo15463e(cVar);
        return Boolean.TRUE;
    }
}
