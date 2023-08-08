package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt$Flow$1$measure$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,334:1\n1864#2,2:335\n1864#2,3:337\n1866#2:340\n*S KotlinDebug\n*F\n+ 1 Flow.kt\ncom/google/accompanist/flowlayout/FlowKt$Flow$1$measure$1\n*L\n229#1:335,2\n245#1:337,3\n229#1:340\n*E\n"})
public final class FlowKt$Flow$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ FlowCrossAxisAlignment $crossAxisAlignment;
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ List<Integer> $crossAxisSizes;
    final /* synthetic */ MainAxisAlignment $lastLineMainAxisAlignment;
    final /* synthetic */ MainAxisAlignment $mainAxisAlignment;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ LayoutOrientation $orientation;
    final /* synthetic */ List<List<C15611w0>> $sequences;
    final /* synthetic */ C15568h0 $this_Layout;

    /* renamed from: com.google.accompanist.flowlayout.FlowKt$Flow$1$measure$1$a */
    public /* synthetic */ class C15011a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.google.accompanist.flowlayout.FlowCrossAxisAlignment[] r0 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.accompanist.flowlayout.FlowCrossAxisAlignment r1 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Start     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.google.accompanist.flowlayout.FlowCrossAxisAlignment r1 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.End     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.google.accompanist.flowlayout.FlowCrossAxisAlignment r1 = com.google.accompanist.flowlayout.FlowCrossAxisAlignment.Center     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.accompanist.flowlayout.FlowKt$Flow$1$measure$1.C15011a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowKt$Flow$1$measure$1(List<List<C15611w0>> list, C15568h0 h0Var, float f, MainAxisAlignment mainAxisAlignment, MainAxisAlignment mainAxisAlignment2, LayoutOrientation layoutOrientation, int i, FlowCrossAxisAlignment flowCrossAxisAlignment, List<Integer> list2, List<Integer> list3) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = h0Var;
        this.$mainAxisSpacing = f;
        this.$mainAxisAlignment = mainAxisAlignment;
        this.$lastLineMainAxisAlignment = mainAxisAlignment2;
        this.$orientation = layoutOrientation;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisAlignment = flowCrossAxisAlignment;
        this.$crossAxisSizes = list2;
        this.$crossAxisPositions = list3;
    }

    /* renamed from: a */
    public final void mo41959a(@C12579k C15611w0.C15612a aVar) {
        Arrangement.C2279l lVar;
        int i;
        boolean z;
        int i2;
        FlowCrossAxisAlignment flowCrossAxisAlignment;
        List<Integer> list;
        List<Integer> list2;
        int i3;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        List<List<C15611w0>> list3 = this.$sequences;
        C15568h0 h0Var = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        MainAxisAlignment mainAxisAlignment = this.$mainAxisAlignment;
        MainAxisAlignment mainAxisAlignment2 = this.$lastLineMainAxisAlignment;
        LayoutOrientation layoutOrientation = this.$orientation;
        int i4 = this.$mainAxisLayoutSize;
        FlowCrossAxisAlignment flowCrossAxisAlignment2 = this.$crossAxisAlignment;
        List<Integer> list4 = this.$crossAxisSizes;
        List<Integer> list5 = this.$crossAxisPositions;
        int i5 = 0;
        for (Object next : list3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            List list6 = (List) next;
            int size = list6.size();
            int[] iArr = new int[size];
            int i7 = 0;
            while (i7 < size) {
                int h = FlowKt.m64332e((C15611w0) list6.get(i7), layoutOrientation);
                List<Integer> list7 = list5;
                if (i7 < CollectionsKt__CollectionsKt.m40443G(list6)) {
                    i3 = h0Var.mo7429n2(f);
                } else {
                    i3 = 0;
                }
                iArr[i7] = h + i3;
                i7++;
                C15611w0.C15612a aVar2 = aVar;
                list5 = list7;
            }
            List<Integer> list8 = list5;
            if (i5 < CollectionsKt__CollectionsKt.m40443G(list3)) {
                lVar = mainAxisAlignment.mo41963q();
            } else {
                lVar = mainAxisAlignment2.mo41963q();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
            }
            lVar.mo7656d(h0Var, i4, iArr, iArr2);
            int i9 = 0;
            for (Object next2 : list6) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt__CollectionsKt.m40459W();
                }
                C15611w0 w0Var = (C15611w0) next2;
                int i11 = C15011a.$EnumSwitchMapping$0[flowCrossAxisAlignment2.ordinal()];
                if (i11 == 1) {
                    z = false;
                    i = 0;
                } else if (i11 == 2) {
                    z = false;
                    i = list4.get(i5).intValue() - FlowKt.m64331d(w0Var, layoutOrientation);
                } else if (i11 == 3) {
                    z = false;
                    i = C16494m.m74583o(C8734c.f23406a.mo17066i().mo17059a(C16500q.f40900b.mo47897a(), C16502r.m74668a(0, list4.get(i5).intValue() - FlowKt.m64331d(w0Var, layoutOrientation)), LayoutDirection.Ltr));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (layoutOrientation == LayoutOrientation.Horizontal) {
                    int i12 = iArr2[i9];
                    List<Integer> list9 = list8;
                    boolean z2 = z;
                    list = list4;
                    flowCrossAxisAlignment = flowCrossAxisAlignment2;
                    C15611w0.C15612a.m69412p(aVar, w0Var, i12, list9.get(i5).intValue() + i, 0.0f, 4, (Object) null);
                    i2 = i5;
                    list2 = list9;
                } else {
                    boolean z3 = z;
                    flowCrossAxisAlignment = flowCrossAxisAlignment2;
                    List<Integer> list10 = list8;
                    list = list4;
                    int i13 = i5;
                    i2 = i13;
                    list2 = list10;
                    C15611w0.C15612a.m69412p(aVar, w0Var, list10.get(i13).intValue() + i, iArr2[i9], 0.0f, 4, (Object) null);
                }
                list4 = list;
                i9 = i10;
                flowCrossAxisAlignment2 = flowCrossAxisAlignment;
                i5 = i2;
                list8 = list2;
            }
            C15611w0.C15612a aVar3 = aVar;
            i5 = i6;
            list5 = list8;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo41959a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
