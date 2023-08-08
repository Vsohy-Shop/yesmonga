package androidx.compose.material3;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import java.util.Arrays;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11457f;
import kotlin.ranges.C11478t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1508:1\n76#2:1509\n102#2,2:1510\n76#2:1512\n102#2,2:1513\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderPositions\n*L\n1482#1:1509\n1482#1:1510,2\n1490#1:1512\n1490#1:1513,2\n*E\n"})
/* renamed from: androidx.compose.material3.p2 */
public final class C8264p2 {

    /* renamed from: c */
    public static final int f20412c = 0;
    @C12579k

    /* renamed from: a */
    public final C8700z0 f20413a;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f20414b;

    public C8264p2() {
        this((C11457f) null, (float[]) null, 3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final C11457f<Float> mo12902a() {
        return (C11457f) this.f20413a.getValue();
    }

    @C12579k
    /* renamed from: b */
    public final float[] mo12903b() {
        return (float[]) this.f20414b.getValue();
    }

    /* renamed from: c */
    public final void mo12904c(@C12579k C11457f<Float> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f20413a.setValue(fVar);
    }

    /* renamed from: d */
    public final void mo12905d(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<set-?>");
        this.f20414b.setValue(fArr);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8264p2)) {
            return false;
        }
        C8264p2 p2Var = (C8264p2) obj;
        if (Intrinsics.areEqual((Object) mo12902a(), (Object) p2Var.mo12902a()) && Arrays.equals(mo12903b(), p2Var.mo12903b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (mo12902a().hashCode() * 31) + Arrays.hashCode(mo12903b());
    }

    public C8264p2(@C12579k C11457f<Float> fVar, @C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fVar, "initialActiveRange");
        Intrinsics.checkNotNullParameter(fArr, "initialTickFractions");
        this.f20413a = C8539f2.m30981g(fVar, (C8410b2) null, 2, (Object) null);
        this.f20414b = C8539f2.m30981g(fArr, (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8264p2(C11457f<Float> fVar, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C11478t.m44305e(0.0f, 1.0f) : fVar, (i & 2) != 0 ? new float[0] : fArr);
    }
}
