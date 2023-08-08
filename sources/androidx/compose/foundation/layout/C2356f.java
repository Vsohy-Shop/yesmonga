package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import androidx.core.graphics.C17616m0;
import androidx.core.view.C18436z4;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,767:1\n76#2:768\n102#2,2:769\n76#2:771\n102#2,2:772\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n58#1:768\n58#1:769,2\n64#1:771\n64#1:772,2\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.f */
public final class C2356f implements C2354e1 {

    /* renamed from: b */
    public final int f6264b;
    @C12579k

    /* renamed from: c */
    public final String f6265c;
    @C12579k

    /* renamed from: d */
    public final C8700z0 f6266d = C8539f2.m30981g(C17616m0.f45994e, (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: e */
    public final C8700z0 f6267e = C8539f2.m30981g(Boolean.TRUE, (C8410b2) null, 2, (Object) null);

    public C2356f(int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.f6264b = i;
        this.f6265c = str;
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8050e().f45996b;
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8050e().f45997c;
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8050e().f45998d;
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8050e().f45995a;
    }

    @C12579k
    /* renamed from: e */
    public final C17616m0 mo8050e() {
        return (C17616m0) this.f6266d.getValue();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2356f)) {
            return false;
        }
        if (this.f6264b == ((C2356f) obj).f6264b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int mo8052f() {
        return this.f6264b;
    }

    /* renamed from: g */
    public final boolean mo8053g() {
        return ((Boolean) this.f6267e.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final void mo8054h(@C12579k C17616m0 m0Var) {
        Intrinsics.checkNotNullParameter(m0Var, "<set-?>");
        this.f6266d.setValue(m0Var);
    }

    public int hashCode() {
        return this.f6264b;
    }

    /* renamed from: i */
    public final void mo8056i(boolean z) {
        this.f6267e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: j */
    public final void mo8057j(@C12579k C18436z4 z4Var, int i) {
        Intrinsics.checkNotNullParameter(z4Var, "windowInsetsCompat");
        if (i == 0 || (i & this.f6264b) != 0) {
            mo8054h(z4Var.mo53136f(this.f6264b));
            mo8056i(z4Var.mo53122C(this.f6264b));
        }
    }

    @C12579k
    public String toString() {
        return this.f6265c + '(' + mo8050e().f45995a + ", " + mo8050e().f45996b + ", " + mo8050e().f45997c + ", " + mo8050e().f45998d + ')';
    }
}
