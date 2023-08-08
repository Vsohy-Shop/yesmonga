package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,412:1\n76#2:413\n102#2,2:414\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/PlaceableInfo\n*L\n402#1:413\n402#1:414,2\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.grid.a0 */
public final class C2483a0 {

    /* renamed from: a */
    public int f6571a;
    @C12579k

    /* renamed from: b */
    public final Animatable<C16494m, C1986l> f6572b;

    /* renamed from: c */
    public long f6573c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6574d;

    public /* synthetic */ C2483a0(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    @C12579k
    /* renamed from: a */
    public final Animatable<C16494m, C1986l> mo8539a() {
        return this.f6572b;
    }

    /* renamed from: b */
    public final boolean mo8540b() {
        return ((Boolean) this.f6574d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int mo8541c() {
        return this.f6571a;
    }

    /* renamed from: d */
    public final long mo8542d() {
        return this.f6573c;
    }

    /* renamed from: e */
    public final void mo8543e(boolean z) {
        this.f6574d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void mo8544f(int i) {
        this.f6571a = i;
    }

    /* renamed from: g */
    public final void mo8545g(long j) {
        this.f6573c = j;
    }

    public C2483a0(long j, int i) {
        this.f6571a = i;
        this.f6572b = new Animatable(C16494m.m74570b(j), VectorConvertersKt.m8222g(C16494m.f40890b), (Object) null, 4, (DefaultConstructorMarker) null);
        this.f6573c = j;
        this.f6574d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    }
}
