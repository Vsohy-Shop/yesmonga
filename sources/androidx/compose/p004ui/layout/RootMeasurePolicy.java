package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.node.LayoutNode;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n151#2,3:68\n33#2,4:71\n154#2,2:75\n38#2:77\n156#2:78\n33#2,6:79\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:68,3\n47#1:71,4\n47#1:75,2\n47#1:77\n47#1:78\n52#1:79,6\n*E\n"})
/* renamed from: androidx.compose.ui.layout.RootMeasurePolicy */
public final class RootMeasurePolicy extends LayoutNode.C15646d {
    @C12579k

    /* renamed from: b */
    public static final RootMeasurePolicy f38673b = new RootMeasurePolicy();

    public RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (list.isEmpty()) {
            return C15568h0.m69206r2(h0Var, C16476b.m74364r(j), C16476b.m74363q(j), (Map) null, RootMeasurePolicy$measure$1.f38674f, 4, (Object) null);
        }
        if (list.size() == 1) {
            C15611w0 t0 = ((C15557e0) list.get(0)).mo44324t0(j);
            return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, t0.mo44471K0()), C16478c.m74381f(j, t0.mo44468G0()), (Map) null, new RootMeasurePolicy$measure$2(t0), 4, (Object) null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C15557e0) list.get(i)).mo44324t0(j));
        }
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size2; i4++) {
            C15611w0 w0Var = (C15611w0) arrayList.get(i4);
            i2 = Math.max(w0Var.mo44471K0(), i2);
            i3 = Math.max(w0Var.mo44468G0(), i3);
        }
        return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, i2), C16478c.m74381f(j, i3), (Map) null, new RootMeasurePolicy$measure$4(arrayList), 4, (Object) null);
    }
}
