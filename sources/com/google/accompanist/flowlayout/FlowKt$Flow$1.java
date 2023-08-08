package com.google.accompanist.flowlayout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16478c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

public final class FlowKt$Flow$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ LayoutOrientation f37102a;

    /* renamed from: b */
    public final /* synthetic */ float f37103b;

    /* renamed from: c */
    public final /* synthetic */ SizeMode f37104c;

    /* renamed from: d */
    public final /* synthetic */ float f37105d;

    /* renamed from: e */
    public final /* synthetic */ MainAxisAlignment f37106e;

    /* renamed from: f */
    public final /* synthetic */ MainAxisAlignment f37107f;

    /* renamed from: g */
    public final /* synthetic */ FlowCrossAxisAlignment f37108g;

    public FlowKt$Flow$1(LayoutOrientation layoutOrientation, float f, SizeMode sizeMode, float f2, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, FlowCrossAxisAlignment flowCrossAxisAlignment) {
        this.f37102a = layoutOrientation;
        this.f37103b = f;
        this.f37104c = sizeMode;
        this.f37105d = f2;
        this.f37106e = mainAxisAlignment;
        this.f37107f = mainAxisAlignment2;
        this.f37108g = flowCrossAxisAlignment;
    }

    /* renamed from: j */
    public static final boolean m64336j(List<C15611w0> list, Ref.IntRef intRef, C15568h0 h0Var, float f, C15012a aVar, LayoutOrientation layoutOrientation, C15611w0 w0Var) {
        if (list.isEmpty() || intRef.element + h0Var.mo7429n2(f) + FlowKt.m64332e(w0Var, layoutOrientation) <= aVar.mo41973i()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final void m64337k(List<List<C15611w0>> list, Ref.IntRef intRef, C15568h0 h0Var, float f, List<C15611w0> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
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
        long j2;
        int i;
        int i2;
        int i3;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        ArrayList arrayList;
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
        C15012a aVar = new C15012a(j, this.f37102a, (DefaultConstructorMarker) null);
        if (this.f37102a == LayoutOrientation.Horizontal) {
            j2 = C16478c.m74377b(0, aVar.mo41973i(), 0, 0, 13, (Object) null);
        } else {
            j2 = C16478c.m74377b(0, 0, 0, aVar.mo41973i(), 7, (Object) null);
        }
        long j3 = j2;
        for (C15557e0 t0 : list) {
            C15611w0 t02 = t0.mo44324t0(j3);
            C15611w0 w0Var = t02;
            long j4 = j3;
            C15012a aVar2 = aVar;
            Ref.IntRef intRef7 = intRef6;
            if (!m64336j(arrayList5, intRef5, h0Var, this.f37103b, aVar, this.f37102a, w0Var)) {
                intRef = intRef5;
                arrayList = arrayList5;
                intRef2 = intRef4;
                m64337k(arrayList2, intRef4, h0Var, this.f37105d, arrayList5, arrayList3, intRef7, arrayList4, intRef3, intRef);
            } else {
                intRef = intRef5;
                arrayList = arrayList5;
                intRef2 = intRef4;
            }
            Ref.IntRef intRef8 = intRef;
            if (!arrayList.isEmpty()) {
                intRef8.element += h0Var2.mo7429n2(this.f37103b);
            }
            C15611w0 w0Var2 = w0Var;
            ArrayList arrayList6 = arrayList;
            arrayList6.add(w0Var2);
            intRef8.element += FlowKt.m64332e(w0Var2, this.f37102a);
            intRef6 = intRef7;
            intRef6.element = Math.max(intRef6.element, FlowKt.m64331d(w0Var2, this.f37102a));
            arrayList5 = arrayList6;
            intRef5 = intRef8;
            aVar = aVar2;
            j3 = j4;
            intRef4 = intRef2;
        }
        C15012a aVar3 = aVar;
        ArrayList arrayList7 = arrayList5;
        Ref.IntRef intRef9 = intRef4;
        Ref.IntRef intRef10 = intRef5;
        if (!arrayList7.isEmpty()) {
            m64337k(arrayList2, intRef9, h0Var, this.f37105d, arrayList7, arrayList3, intRef6, arrayList4, intRef3, intRef10);
        }
        if (aVar3.mo41973i() == Integer.MAX_VALUE || this.f37104c != SizeMode.Expand) {
            i = Math.max(intRef3.element, aVar3.mo41974j());
        } else {
            i = aVar3.mo41973i();
        }
        int i4 = i;
        int max = Math.max(intRef9.element, aVar3.mo41971h());
        LayoutOrientation layoutOrientation = this.f37102a;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            i2 = i4;
        } else {
            i2 = max;
        }
        if (layoutOrientation == layoutOrientation2) {
            i3 = max;
        } else {
            i3 = i4;
        }
        return C15568h0.m69206r2(h0Var, i2, i3, (Map) null, new FlowKt$Flow$1$measure$1(arrayList2, h0Var, this.f37103b, this.f37106e, this.f37107f, layoutOrientation, i4, this.f37108g, arrayList3, arrayList4), 4, (Object) null);
    }
}
