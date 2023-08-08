package androidx.compose.p004ui.node;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.unit.C16494m;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,246:1\n157#2:247\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n245#1:247\n*E\n"})
/* renamed from: androidx.compose.ui.node.h0 */
public final class C15691h0 extends AlignmentLines {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15691h0(@C12579k C15665a aVar) {
        super(aVar, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aVar, "alignmentLinesOwner");
    }

    /* renamed from: d */
    public long mo44525d(@C12579k NodeCoordinator nodeCoordinator, long j) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "$this$calculatePositionInParent");
        C15697j0 j4 = nodeCoordinator.mo44868j4();
        Intrinsics.checkNotNull(j4);
        long g1 = j4.mo44865g1();
        return C15094f.m64886v(C15096g.m64898a((float) C16494m.m74581m(g1), (float) C16494m.m74583o(g1)), j);
    }

    @C12579k
    /* renamed from: e */
    public Map<C15531a, Integer> mo44526e(@C12579k NodeCoordinator nodeCoordinator) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        C15697j0 j4 = nodeCoordinator.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44862e1().mo8593w();
    }

    /* renamed from: i */
    public int mo44530i(@C12579k NodeCoordinator nodeCoordinator, @C12579k C15531a aVar) {
        Intrinsics.checkNotNullParameter(nodeCoordinator, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "alignmentLine");
        C15697j0 j4 = nodeCoordinator.mo44868j4();
        Intrinsics.checkNotNull(j4);
        return j4.mo44325A(aVar);
    }
}
