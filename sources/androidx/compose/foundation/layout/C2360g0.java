package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C2396p
@C8567o(parameters = 0)
@C11363r0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n81#1:675\n81#1:676,2\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.g0 */
public final class C2360g0 implements C2354e1 {

    /* renamed from: c */
    public static final int f6271c = 0;
    @C12579k

    /* renamed from: b */
    public final C8700z0 f6272b;

    public C2360g0() {
        this((C2354e1) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8067e().mo7984a(dVar);
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8067e().mo7985b(dVar, layoutDirection);
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8067e().mo7986c(dVar);
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8067e().mo7987d(dVar, layoutDirection);
    }

    @C12579k
    /* renamed from: e */
    public final C2354e1 mo8067e() {
        return (C2354e1) this.f6272b.getValue();
    }

    /* renamed from: f */
    public final void mo8068f(@C12579k C2354e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "<set-?>");
        this.f6272b.setValue(e1Var);
    }

    public C2360g0(@C12579k C2354e1 e1Var) {
        Intrinsics.checkNotNullParameter(e1Var, "initialInsets");
        this.f6272b = C8539f2.m30981g(e1Var, (C8410b2) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2360g0(C2354e1 e1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2358f1.m10388a(0, 0, 0, 0) : e1Var);
    }
}
