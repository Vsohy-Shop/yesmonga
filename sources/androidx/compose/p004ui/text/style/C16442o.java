package androidx.compose.p004ui.text.style;

import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.style.o */
public final class C16442o {
    @C12579k

    /* renamed from: c */
    public static final C16443a f40744c = new C16443a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f40745d = 0;
    @C12579k

    /* renamed from: e */
    public static final C16442o f40746e = new C16442o(0, 0, 3, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f40747a;

    /* renamed from: b */
    public final long f40748b;

    /* renamed from: androidx.compose.ui.text.style.o$a */
    public static final class C16443a {
        public /* synthetic */ C16443a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C8547h2
        /* renamed from: b */
        public static /* synthetic */ void m74233b() {
        }

        @C12579k
        /* renamed from: a */
        public final C16442o mo47706a() {
            return C16442o.f40746e;
        }

        public C16443a() {
        }
    }

    public /* synthetic */ C16442o(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: c */
    public static /* synthetic */ C16442o m74229c(C16442o oVar, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = oVar.f40747a;
        }
        if ((i & 2) != 0) {
            j2 = oVar.f40748b;
        }
        return oVar.mo47700b(j, j2);
    }

    @C12579k
    /* renamed from: b */
    public final C16442o mo47700b(long j, long j2) {
        return new C16442o(j, j2, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final long mo47701d() {
        return this.f40747a;
    }

    /* renamed from: e */
    public final long mo47702e() {
        return this.f40748b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16442o)) {
            return false;
        }
        C16442o oVar = (C16442o) obj;
        if (C16504t.m74683j(this.f40747a, oVar.f40747a) && C16504t.m74683j(this.f40748b, oVar.f40748b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C16504t.m74688o(this.f40747a) * 31) + C16504t.m74688o(this.f40748b);
    }

    @C12579k
    public String toString() {
        return "TextIndent(firstLine=" + C16504t.m74694u(this.f40747a) + ", restLine=" + C16504t.m74694u(this.f40748b) + ')';
    }

    public C16442o(long j, long j2) {
        this.f40747a = j;
        this.f40748b = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16442o(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C16506u.m74712m(0) : j, (i & 2) != 0 ? C16506u.m74712m(0) : j2, (DefaultConstructorMarker) null);
    }
}
