package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15531a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.node.b0 */
public final class C15671b0 extends AlignmentLines {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15671b0(@C12579k C15665a aVar) {
        super(aVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "alignmentLinesOwner");
    }

    /* renamed from: d */
    public long mo44525d(@C12579k NodeCoordinator nodeCoordinator, long j) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "$this$calculatePositionInParent");
        return nodeCoordinator.mo44892x6(j);
    }

    @C12579k
    /* renamed from: e */
    public Map<C15531a, Integer> mo44526e(@C12579k NodeCoordinator nodeCoordinator) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        return nodeCoordinator.mo44862e1().mo8593w();
    }

    /* renamed from: i */
    public int mo44530i(@C12579k NodeCoordinator nodeCoordinator, @C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        return nodeCoordinator.mo44325A(aVar);
    }
}
