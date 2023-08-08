package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n365#1:675\n365#1:676,2\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.c1 */
public final class C2345c1 implements C2354e1 {
    @C12579k

    /* renamed from: b */
    public final String f6248b;
    @C12579k

    /* renamed from: c */
    public final C8700z0 f6249c;

    public C2345c1(@C12579k C2419x xVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(xVar, "insets");
        Intrinsics.checkNotNullParameter(str, "name");
        this.f6248b = str;
        this.f6249c = C8539f2.m30981g(xVar, (C8410b2) null, 2, (Object) null);
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8022f().mo8227d();
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8022f().mo8226c();
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return mo8022f().mo8224a();
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return mo8022f().mo8225b();
    }

    @C12579k
    /* renamed from: e */
    public final String mo8020e() {
        return this.f6248b;
    }

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2345c1)) {
            return false;
        }
        return Intrinsics.areEqual((Object) mo8022f(), (Object) ((C2345c1) obj).mo8022f());
    }

    @C12579k
    /* renamed from: f */
    public final C2419x mo8022f() {
        return (C2419x) this.f6249c.getValue();
    }

    /* renamed from: g */
    public final void mo8023g(@C12579k C2419x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<set-?>");
        this.f6249c.setValue(xVar);
    }

    public int hashCode() {
        return this.f6248b.hashCode();
    }

    @C12579k
    public String toString() {
        return this.f6248b + "(left=" + mo8022f().mo8225b() + ", top=" + mo8022f().mo8227d() + ", right=" + mo8022f().mo8226c() + ", bottom=" + mo8022f().mo8224a() + ')';
    }
}
