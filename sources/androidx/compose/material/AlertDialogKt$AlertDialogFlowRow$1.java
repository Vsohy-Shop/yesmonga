package androidx.compose.material;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

public final class AlertDialogKt$AlertDialogFlowRow$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ float f7501a;

    /* renamed from: b */
    public final /* synthetic */ float f7502b;

    public AlertDialogKt$AlertDialogFlowRow$1(float f, float f2) {
        this.f7501a = f;
        this.f7502b = f2;
    }

    /* renamed from: j */
    public static final boolean m13196j(List<C15611w0> list, Ref.IntRef intRef, C15568h0 h0Var, float f, long j, C15611w0 w0Var) {
        if (list.isEmpty() || intRef.element + h0Var.mo7429n2(f) + w0Var.mo44471K0() <= C16476b.m74362p(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final void m13197k(List<List<C15611w0>> list, Ref.IntRef intRef, C15568h0 h0Var, float f, List<C15611w0> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
        Collection collection = list;
        if (!collection.isEmpty()) {
            intRef.element += h0Var.mo7429n2(f);
        }
        collection.add(CollectionsKt___CollectionsKt.m40557Q5(list2));
        list3.add(Integer.valueOf(intRef2.element));
        list4.add(Integer.valueOf(intRef.element));
        intRef.element += intRef2.element;
        intRef3.element = Math.max(intRef3.element, intRef4.element);
        list2.clear();
        intRef4.element = 0;
        intRef2.element = 0;
    }

    @C12579k
    /* renamed from: a */
    public final C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        Ref.IntRef intRef;
        ArrayList arrayList;
        Ref.IntRef intRef2;
        C15568h0 h0Var2 = h0Var;
        Intrinsics.checkNotNullParameter(h0Var2, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "measurables");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Ref.IntRef intRef3 = new Ref.IntRef();
        Ref.IntRef intRef4 = new Ref.IntRef();
        ArrayList arrayList5 = new ArrayList();
        Ref.IntRef intRef5 = new Ref.IntRef();
        Ref.IntRef intRef6 = new Ref.IntRef();
        long b = C16478c.m74377b(0, C16476b.m74362p(j), 0, 0, 13, (Object) null);
        for (C15557e0 t0 : list) {
            C15611w0 t02 = t0.mo44324t0(b);
            long j2 = b;
            Ref.IntRef intRef7 = intRef6;
            if (!m13196j(arrayList5, intRef5, h0Var, this.f7501a, j, t02)) {
                intRef2 = intRef5;
                arrayList = arrayList5;
                intRef = intRef4;
                m13197k(arrayList2, intRef4, h0Var, this.f7502b, arrayList5, arrayList3, intRef7, arrayList4, intRef3, intRef2);
            } else {
                intRef2 = intRef5;
                arrayList = arrayList5;
                intRef = intRef4;
            }
            Ref.IntRef intRef8 = intRef2;
            if (!arrayList.isEmpty()) {
                intRef8.element += h0Var2.mo7429n2(this.f7501a);
            }
            C15611w0 w0Var = t02;
            ArrayList arrayList6 = arrayList;
            arrayList6.add(w0Var);
            intRef8.element += w0Var.mo44471K0();
            intRef6 = intRef7;
            intRef6.element = Math.max(intRef6.element, w0Var.mo44468G0());
            arrayList5 = arrayList6;
            intRef5 = intRef8;
            b = j2;
            intRef4 = intRef;
        }
        ArrayList arrayList7 = arrayList5;
        Ref.IntRef intRef9 = intRef4;
        Ref.IntRef intRef10 = intRef5;
        if (!arrayList7.isEmpty()) {
            m13197k(arrayList2, intRef9, h0Var, this.f7502b, arrayList7, arrayList3, intRef6, arrayList4, intRef3, intRef10);
        }
        if (C16476b.m74362p(j) != Integer.MAX_VALUE) {
            i = C16476b.m74362p(j);
        } else {
            i = Math.max(intRef3.element, C16476b.m74364r(j));
        }
        int i2 = i;
        return C15568h0.m69206r2(h0Var, i2, Math.max(intRef9.element, C16476b.m74363q(j)), (Map) null, new AlertDialogKt$AlertDialogFlowRow$1$measure$1(arrayList2, h0Var, this.f7501a, i2, arrayList4), 4, (Object) null);
    }
}
