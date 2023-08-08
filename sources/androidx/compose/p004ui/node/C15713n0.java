package androidx.compose.p004ui.node;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15583m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.node.n0 */
public final class C15713n0 {

    /* renamed from: androidx.compose.ui.node.n0$a */
    public /* synthetic */ class C15714a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.compose.ui.node.LayoutNode$LayoutState[] r0 = androidx.compose.p004ui.node.LayoutNode.LayoutState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Measuring     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p004ui.node.LayoutNode.LayoutState.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.C15713n0.C15714a.<clinit>():void");
        }
    }

    @C12579k
    /* renamed from: a */
    public static final List<List<C15557e0>> m70433a(@C12579k C15583m mVar) {
        List<C15557e0> list;
        Intrinsics.checkNotNullParameter(mVar, "scope");
        LayoutNode H5 = ((C15710m0) mVar).mo44836H5();
        boolean b = m70434b(H5);
        List<LayoutNode> b0 = H5.mo44671b0();
        ArrayList arrayList = new ArrayList(b0.size());
        int size = b0.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = b0.get(i);
            if (b) {
                list = layoutNode.mo44663X();
            } else {
                list = layoutNode.mo44665Y();
            }
            arrayList.add(list);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m70434b(LayoutNode layoutNode) {
        int i = C15714a.$EnumSwitchMapping$0[layoutNode.mo44691m0().ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        if (i == 5) {
            LayoutNode C0 = layoutNode.mo44613C0();
            if (C0 != null) {
                return m70434b(C0);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
