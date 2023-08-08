package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15611w0;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,291:1\n69#2,4:292\n69#2,6:296\n74#2:302\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material/AlertDialogKt$AlertDialogFlowRow$1$measure$1\n*L\n259#1:292,4\n271#1:296,6\n259#1:302\n*E\n"})
public final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements C11300l<C15611w0.C15612a, C11079d2> {
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ List<List<C15611w0>> $sequences;
    final /* synthetic */ C15568h0 $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<C15611w0>> list, C15568h0 h0Var, float f, int i, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = h0Var;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    /* renamed from: a */
    public final void mo9953a(@C12579k C15611w0.C15612a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "$this$layout");
        List<List<C15611w0>> list = this.$sequences;
        C15568h0 h0Var = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i2 = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            List list3 = list.get(i3);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                int K0 = ((C15611w0) list3.get(i4)).mo44471K0();
                if (i4 < CollectionsKt__CollectionsKt.m40443G(list3)) {
                    i = h0Var.mo7429n2(f);
                } else {
                    i = 0;
                }
                iArr[i4] = K0 + i;
            }
            Arrangement.C2279l d = Arrangement.f6010a.mo7624d();
            int[] iArr2 = new int[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                iArr2[i5] = 0;
            }
            d.mo7656d(h0Var, i2, iArr, iArr2);
            int size3 = list3.size();
            int i6 = 0;
            while (i6 < size3) {
                int i7 = i6;
                int i8 = iArr2[i6];
                C15611w0.C15612a.m69412p(aVar, (C15611w0) list3.get(i6), i8, list2.get(i3).intValue(), 0.0f, 4, (Object) null);
                i6 = i7 + 1;
                size3 = size3;
                iArr2 = iArr2;
                list3 = list3;
                i3 = i3;
            }
            i3++;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo9953a((C15611w0.C15612a) obj);
        return C11079d2.f28267a;
    }
}
