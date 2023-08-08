package androidx.compose.material;

import androidx.compose.p004ui.layout.AlignmentLineKt;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16483g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10978t;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,429:1\n1549#2:430\n1620#2,3:431\n1789#2,3:434\n69#3,6:437\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material/ListItemKt$BaselinesOffsetColumn$1\n*L\n355#1:430\n355#1:431,3\n357#1:434,3\n362#1:437,6\n*E\n"})
public final class ListItemKt$BaselinesOffsetColumn$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ List<C16483g> f7690a;

    public ListItemKt$BaselinesOffsetColumn$1(List<C16483g> list) {
        this.f7690a = list;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        Intrinsics.checkNotNullParameter(h0Var, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        long e = C16476b.m74351e(j, 0, 0, 0, Integer.MAX_VALUE, 3, (Object) null);
        Iterable<C15557e0> iterable = list;
        ArrayList<C15611w0> arrayList = new ArrayList<>(C10978t.m41495Y(iterable, 10));
        for (C15557e0 t0 : iterable) {
            arrayList.add(t0.mo44324t0(e));
        }
        int i2 = 0;
        for (C15611w0 K0 : arrayList) {
            i2 = Math.max(i2, K0.mo44471K0());
        }
        int size = arrayList.size();
        Integer[] numArr = new Integer[size];
        for (int i3 = 0; i3 < size; i3++) {
            numArr[i3] = 0;
        }
        List<C16483g> list2 = this.f7690a;
        int size2 = arrayList.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size2; i5++) {
            C15611w0 w0Var = (C15611w0) arrayList.get(i5);
            if (i5 > 0) {
                int i6 = i5 - 1;
                i = ((C15611w0) arrayList.get(i6)).mo44468G0() - ((C15611w0) arrayList.get(i6)).mo44325A(AlignmentLineKt.m68886b());
            } else {
                i = 0;
            }
            int max = Math.max(0, (h0Var.mo7429n2(list2.get(i5).mo47823t0()) - w0Var.mo44325A(AlignmentLineKt.m68885a())) - i);
            numArr[i5] = Integer.valueOf(max + i4);
            i4 += max + w0Var.mo44468G0();
        }
        return C15568h0.m69206r2(h0Var, i2, i4, (Map) null, new ListItemKt$BaselinesOffsetColumn$1$measure$2(arrayList, numArr), 4, (Object) null);
    }
}
