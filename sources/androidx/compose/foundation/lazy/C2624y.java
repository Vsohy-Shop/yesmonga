package androidx.compose.foundation.lazy;

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

@C11363r0({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,350:1\n76#2:351\n102#2,2:352\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n*L\n340#1:351\n340#1:352,2\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.y */
public final class C2624y {

    /* renamed from: a */
    public int f6961a;
    @C12579k

    /* renamed from: b */
    public final Animatable<C16494m, C1986l> f6962b;

    /* renamed from: c */
    public long f6963c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6964d;

    public /* synthetic */ C2624y(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i);
    }

    @C12579k
    /* renamed from: a */
    public final Animatable<C16494m, C1986l> mo9036a() {
        return this.f6962b;
    }

    /* renamed from: b */
    public final boolean mo9037b() {
        return ((Boolean) this.f6964d.getValue()).booleanValue();
    }

    /* renamed from: c */
    public final int mo9038c() {
        return this.f6961a;
    }

    /* renamed from: d */
    public final long mo9039d() {
        return this.f6963c;
    }

    /* renamed from: e */
    public final void mo9040e(boolean z) {
        this.f6964d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void mo9041f(int i) {
        this.f6961a = i;
    }

    /* renamed from: g */
    public final void mo9042g(long j) {
        this.f6963c = j;
    }

    public C2624y(long j, int i) {
        this.f6961a = i;
        this.f6962b = new Animatable(C16494m.m74570b(j), VectorConvertersKt.m8222g(C16494m.f40890b), (Object) null, 4, (DefaultConstructorMarker) null);
        this.f6963c = j;
        this.f6964d = C8539f2.m30981g(Boolean.FALSE, (C8410b2) null, 2, (Object) null);
    }
}
