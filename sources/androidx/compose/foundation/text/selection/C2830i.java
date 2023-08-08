package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.foundation.text.selection.i */
public final class C2830i {
    @C12579k

    /* renamed from: a */
    public final C2831a f7450a;
    @C12579k

    /* renamed from: b */
    public final C2831a f7451b;

    /* renamed from: c */
    public final boolean f7452c;

    @C8585m0
    /* renamed from: androidx.compose.foundation.text.selection.i$a */
    public static final class C2831a {
        @C12579k

        /* renamed from: a */
        public final ResolvedTextDirection f7453a;

        /* renamed from: b */
        public final int f7454b;

        /* renamed from: c */
        public final long f7455c;

        public C2831a(@C12579k ResolvedTextDirection resolvedTextDirection, int i, long j) {
            Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
            this.f7453a = resolvedTextDirection;
            this.f7454b = i;
            this.f7455c = j;
        }

        /* renamed from: e */
        public static /* synthetic */ C2831a m13074e(C2831a aVar, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = aVar.f7453a;
            }
            if ((i2 & 2) != 0) {
                i = aVar.f7454b;
            }
            if ((i2 & 4) != 0) {
                j = aVar.f7455c;
            }
            return aVar.mo9880d(resolvedTextDirection, i, j);
        }

        @C12579k
        /* renamed from: a */
        public final ResolvedTextDirection mo9877a() {
            return this.f7453a;
        }

        /* renamed from: b */
        public final int mo9878b() {
            return this.f7454b;
        }

        /* renamed from: c */
        public final long mo9879c() {
            return this.f7455c;
        }

        @C12579k
        /* renamed from: d */
        public final C2831a mo9880d(@C12579k ResolvedTextDirection resolvedTextDirection, int i, long j) {
            Intrinsics.checkNotNullParameter(resolvedTextDirection, "direction");
            return new C2831a(resolvedTextDirection, i, j);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2831a)) {
                return false;
            }
            C2831a aVar = (C2831a) obj;
            return this.f7453a == aVar.f7453a && this.f7454b == aVar.f7454b && this.f7455c == aVar.f7455c;
        }

        @C12579k
        /* renamed from: f */
        public final ResolvedTextDirection mo9882f() {
            return this.f7453a;
        }

        /* renamed from: g */
        public final int mo9883g() {
            return this.f7454b;
        }

        /* renamed from: h */
        public final long mo9884h() {
            return this.f7455c;
        }

        public int hashCode() {
            return (((this.f7453a.hashCode() * 31) + Integer.hashCode(this.f7454b)) * 31) + Long.hashCode(this.f7455c);
        }

        @C12579k
        public String toString() {
            return "AnchorInfo(direction=" + this.f7453a + ", offset=" + this.f7454b + ", selectableId=" + this.f7455c + ')';
        }
    }

    public C2830i(@C12579k C2831a aVar, @C12579k C2831a aVar2, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "start");
        Intrinsics.checkNotNullParameter(aVar2, "end");
        this.f7450a = aVar;
        this.f7451b = aVar2;
        this.f7452c = z;
    }

    /* renamed from: e */
    public static /* synthetic */ C2830i m13064e(C2830i iVar, C2831a aVar, C2831a aVar2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = iVar.f7450a;
        }
        if ((i & 2) != 0) {
            aVar2 = iVar.f7451b;
        }
        if ((i & 4) != 0) {
            z = iVar.f7452c;
        }
        return iVar.mo9868d(aVar, aVar2, z);
    }

    @C12579k
    /* renamed from: a */
    public final C2831a mo9865a() {
        return this.f7450a;
    }

    @C12579k
    /* renamed from: b */
    public final C2831a mo9866b() {
        return this.f7451b;
    }

    /* renamed from: c */
    public final boolean mo9867c() {
        return this.f7452c;
    }

    @C12579k
    /* renamed from: d */
    public final C2830i mo9868d(@C12579k C2831a aVar, @C12579k C2831a aVar2, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "start");
        Intrinsics.checkNotNullParameter(aVar2, "end");
        return new C2830i(aVar, aVar2, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2830i)) {
            return false;
        }
        C2830i iVar = (C2830i) obj;
        return Intrinsics.areEqual((Object) this.f7450a, (Object) iVar.f7450a) && Intrinsics.areEqual((Object) this.f7451b, (Object) iVar.f7451b) && this.f7452c == iVar.f7452c;
    }

    @C12579k
    /* renamed from: f */
    public final C2831a mo9870f() {
        return this.f7451b;
    }

    /* renamed from: g */
    public final boolean mo9871g() {
        return this.f7452c;
    }

    @C12579k
    /* renamed from: h */
    public final C2831a mo9872h() {
        return this.f7450a;
    }

    public int hashCode() {
        int hashCode = ((this.f7450a.hashCode() * 31) + this.f7451b.hashCode()) * 31;
        boolean z = this.f7452c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C2830i mo9874i(@C12580l C2830i iVar) {
        if (iVar == null) {
            return this;
        }
        if (this.f7452c) {
            return m13064e(this, iVar.f7450a, (C2831a) null, false, 6, (Object) null);
        }
        return m13064e(this, (C2831a) null, iVar.f7451b, false, 5, (Object) null);
    }

    /* renamed from: j */
    public final long mo9875j() {
        return C16359o0.m73780b(this.f7450a.mo9883g(), this.f7451b.mo9883g());
    }

    @C12579k
    public String toString() {
        return "Selection(start=" + this.f7450a + ", end=" + this.f7451b + ", handlesCrossed=" + this.f7452c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2830i(C2831a aVar, C2831a aVar2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i & 4) != 0 ? false : z);
    }
}
