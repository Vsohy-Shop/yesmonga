package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.p004ui.geometry.C15094f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.selection.k */
public final class C2833k {
    @C12579k

    /* renamed from: a */
    public final Handle f7456a;

    /* renamed from: b */
    public final long f7457b;

    public /* synthetic */ C2833k(Handle handle, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(handle, j);
    }

    /* renamed from: d */
    public static /* synthetic */ C2833k m13083d(C2833k kVar, Handle handle, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            handle = kVar.f7456a;
        }
        if ((i & 2) != 0) {
            j = kVar.f7457b;
        }
        return kVar.mo9889c(handle, j);
    }

    @C12579k
    /* renamed from: a */
    public final Handle mo9887a() {
        return this.f7456a;
    }

    /* renamed from: b */
    public final long mo9888b() {
        return this.f7457b;
    }

    @C12579k
    /* renamed from: c */
    public final C2833k mo9889c(@C12579k Handle handle, long j) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        return new C2833k(handle, j, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: e */
    public final Handle mo9890e() {
        return this.f7456a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833k)) {
            return false;
        }
        C2833k kVar = (C2833k) obj;
        return this.f7456a == kVar.f7456a && C15094f.m64876l(this.f7457b, kVar.f7457b);
    }

    /* renamed from: f */
    public final long mo9892f() {
        return this.f7457b;
    }

    public int hashCode() {
        return (this.f7456a.hashCode() * 31) + C15094f.m64883s(this.f7457b);
    }

    @C12579k
    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f7456a + ", position=" + C15094f.m64889y(this.f7457b) + ')';
    }

    public C2833k(Handle handle, long j) {
        this.f7456a = handle;
        this.f7457b = j;
    }
}
