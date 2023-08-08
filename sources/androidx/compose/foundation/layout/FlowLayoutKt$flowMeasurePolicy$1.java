package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.C8423g;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,724:1\n523#2:725\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$flowMeasurePolicy$1\n*L\n244#1:725\n*E\n"})
public final class FlowLayoutKt$flowMeasurePolicy$1 implements C15560f0 {
    @C12579k

    /* renamed from: a */
    public final C11305q<C15580l, Integer, Integer, Integer> f6068a;
    @C12579k

    /* renamed from: b */
    public final C11305q<C15580l, Integer, Integer, Integer> f6069b;
    @C12579k

    /* renamed from: c */
    public final C11305q<C15580l, Integer, Integer, Integer> f6070c;
    @C12579k

    /* renamed from: d */
    public final C11305q<C15580l, Integer, Integer, Integer> f6071d;

    /* renamed from: e */
    public final /* synthetic */ LayoutOrientation f6072e;

    /* renamed from: f */
    public final /* synthetic */ C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> f6073f;

    /* renamed from: g */
    public final /* synthetic */ float f6074g;

    /* renamed from: h */
    public final /* synthetic */ SizeMode f6075h;

    /* renamed from: i */
    public final /* synthetic */ C2380m f6076i;

    /* renamed from: j */
    public final /* synthetic */ int f6077j;

    /* renamed from: k */
    public final /* synthetic */ C11306r<Integer, int[], C15568h0, int[], C11079d2> f6078k;

    public FlowLayoutKt$flowMeasurePolicy$1(LayoutOrientation layoutOrientation, C11307s<? super Integer, ? super int[], ? super LayoutDirection, ? super C16479d, ? super int[], C11079d2> sVar, float f, SizeMode sizeMode, C2380m mVar, int i, C11306r<? super Integer, ? super int[], ? super C15568h0, ? super int[], C11079d2> rVar) {
        C11305q<C15580l, Integer, Integer, Integer> qVar;
        C11305q<C15580l, Integer, Integer, Integer> qVar2;
        C11305q<C15580l, Integer, Integer, Integer> qVar3;
        C11305q<C15580l, Integer, Integer, Integer> qVar4;
        this.f6072e = layoutOrientation;
        this.f6073f = sVar;
        this.f6074g = f;
        this.f6075h = sizeMode;
        this.f6076i = mVar;
        this.f6077j = i;
        this.f6078k = rVar;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            qVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.f6081f;
        } else {
            qVar = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.f6082f;
        }
        this.f6068a = qVar;
        if (layoutOrientation == layoutOrientation2) {
            qVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.f6079f;
        } else {
            qVar2 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.f6080f;
        }
        this.f6069b = qVar2;
        if (layoutOrientation == layoutOrientation2) {
            qVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.f6083f;
        } else {
            qVar3 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.f6084f;
        }
        this.f6070c = qVar3;
        if (layoutOrientation == layoutOrientation2) {
            qVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.f6085f;
        } else {
            qVar4 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.f6086f;
        }
        this.f6071d = qVar4;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        C2407s0 s0Var = new C2407s0(this.f6072e, this.f6073f, this.f6074g, this.f6075h, this.f6076i, list, new C15611w0[list.size()], (DefaultConstructorMarker) null);
        C2406s f = FlowLayoutKt.m9898f(h0Var, s0Var, this.f6072e, new C2363h0(j, this.f6072e, (DefaultConstructorMarker) null), this.f6077j);
        int a = f.mo8161a();
        C8423g<C2404r0> b = f.mo8162b();
        int h0 = b.mo15469h0();
        int[] iArr = new int[h0];
        for (int i3 = 0; i3 < h0; i3++) {
            iArr[i3] = ((C2404r0) b.mo15462d0()[i3]).mo8156b();
        }
        int[] iArr2 = new int[h0];
        this.f6078k.invoke(Integer.valueOf(a), iArr, h0Var, iArr2);
        if (this.f6072e == LayoutOrientation.Horizontal) {
            i2 = f.mo8163c();
            i = f.mo8161a();
        } else {
            i2 = f.mo8161a();
            i = f.mo8163c();
        }
        return C15568h0.m69206r2(h0Var, C16478c.m74382g(j, i2), C16478c.m74381f(j, i), (Map) null, new FlowLayoutKt$flowMeasurePolicy$1$measure$1(f, s0Var, iArr2, h0Var), 4, (Object) null);
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f6072e == LayoutOrientation.Horizontal) {
            return mo7745o(list, i, mVar.mo7429n2(this.f6074g));
        }
        return mo7744n(list, i, mVar.mo7429n2(this.f6074g));
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f6072e == LayoutOrientation.Horizontal) {
            return mo7744n(list, i, mVar.mo7429n2(this.f6074g));
        }
        return mo7746p(list, i, mVar.mo7429n2(this.f6074g));
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f6072e == LayoutOrientation.Horizontal) {
            return mo7746p(list, i, mVar.mo7429n2(this.f6074g));
        }
        return mo7744n(list, i, mVar.mo7429n2(this.f6074g));
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        if (this.f6072e == LayoutOrientation.Horizontal) {
            return mo7744n(list, i, mVar.mo7429n2(this.f6074g));
        }
        return mo7745o(list, i, mVar.mo7429n2(this.f6074g));
    }

    @C12579k
    /* renamed from: j */
    public final C11305q<C15580l, Integer, Integer, Integer> mo7740j() {
        return this.f6069b;
    }

    @C12579k
    /* renamed from: k */
    public final C11305q<C15580l, Integer, Integer, Integer> mo7741k() {
        return this.f6068a;
    }

    @C12579k
    /* renamed from: l */
    public final C11305q<C15580l, Integer, Integer, Integer> mo7742l() {
        return this.f6070c;
    }

    @C12579k
    /* renamed from: m */
    public final C11305q<C15580l, Integer, Integer, Integer> mo7743m() {
        return this.f6071d;
    }

    /* renamed from: n */
    public final int mo7744n(@C12579k List<? extends C15580l> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.m9903k(list, this.f6071d, this.f6070c, i, i2, this.f6077j);
    }

    /* renamed from: o */
    public final int mo7745o(@C12579k List<? extends C15580l> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.m9909q(list, this.f6068a, i, i2, this.f6077j);
    }

    /* renamed from: p */
    public final int mo7746p(@C12579k List<? extends C15580l> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "measurables");
        return FlowLayoutKt.m9911s(list, this.f6071d, this.f6070c, i, i2, this.f6077j);
    }
}
