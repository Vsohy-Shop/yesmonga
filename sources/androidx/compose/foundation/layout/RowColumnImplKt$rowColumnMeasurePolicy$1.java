package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15580l;
import androidx.compose.p004ui.layout.C15583m;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11307s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class RowColumnImplKt$rowColumnMeasurePolicy$1 implements C15560f0 {

    /* renamed from: a */
    public final /* synthetic */ LayoutOrientation f6140a;

    /* renamed from: b */
    public final /* synthetic */ C11307s<Integer, int[], LayoutDirection, C16479d, int[], C11079d2> f6141b;

    /* renamed from: c */
    public final /* synthetic */ float f6142c;

    /* renamed from: d */
    public final /* synthetic */ SizeMode f6143d;

    /* renamed from: e */
    public final /* synthetic */ C2380m f6144e;

    public RowColumnImplKt$rowColumnMeasurePolicy$1(LayoutOrientation layoutOrientation, C11307s<? super Integer, ? super int[], ? super LayoutDirection, ? super C16479d, ? super int[], C11079d2> sVar, float f, SizeMode sizeMode, C2380m mVar) {
        this.f6140a = layoutOrientation;
        this.f6141b = sVar;
        this.f6142c = f;
        this.f6143d = sizeMode;
        this.f6144e = mVar;
    }

    @C12579k
    /* renamed from: a */
    public C15564g0 mo6397a(@C12579k C15568h0 h0Var, @C12579k List<? extends C15557e0> list, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(list, "measurables");
        C2407s0 s0Var = new C2407s0(this.f6140a, this.f6141b, this.f6142c, this.f6143d, this.f6144e, list, new C15611w0[list.size()], (DefaultConstructorMarker) null);
        C2404r0 l = s0Var.mo8175l(h0Var, j, 0, list.size());
        if (this.f6140a == LayoutOrientation.Horizontal) {
            i2 = l.mo8159e();
            i = l.mo8156b();
        } else {
            i2 = l.mo8156b();
            i = l.mo8159e();
        }
        return C15568h0.m69206r2(h0Var, i2, i, (Map) null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$1(s0Var, l, h0Var), 4, (Object) null);
    }

    /* renamed from: b */
    public int mo6398b(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.m10045b(this.f6140a).invoke(list, Integer.valueOf(i), Integer.valueOf(mVar.mo7429n2(this.f6142c)))).intValue();
    }

    /* renamed from: c */
    public int mo6399c(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.m10046c(this.f6140a).invoke(list, Integer.valueOf(i), Integer.valueOf(mVar.mo7429n2(this.f6142c)))).intValue();
    }

    /* renamed from: d */
    public int mo6400d(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.m10047d(this.f6140a).invoke(list, Integer.valueOf(i), Integer.valueOf(mVar.mo7429n2(this.f6142c)))).intValue();
    }

    /* renamed from: e */
    public int mo6401e(@C12579k C15583m mVar, @C12579k List<? extends C15580l> list, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "measurables");
        return ((Number) RowColumnImplKt.m10044a(this.f6140a).invoke(list, Integer.valueOf(i), Integer.valueOf(mVar.mo7429n2(this.f6142c)))).intValue();
    }
}
