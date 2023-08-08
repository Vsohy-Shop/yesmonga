package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8547h2;
import com.urbanairship.iam.C9168d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.j */
public final class C2370j implements C2365i, C2362h {
    @C12579k

    /* renamed from: a */
    public final C16479d f6282a;

    /* renamed from: b */
    public final long f6283b;

    /* renamed from: c */
    public final /* synthetic */ BoxScopeInstance f6284c;

    public /* synthetic */ C2370j(C16479d dVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j);
    }

    /* renamed from: k */
    public static /* synthetic */ C2370j m10448k(C2370j jVar, C16479d dVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            dVar = jVar.f6282a;
        }
        if ((i & 2) != 0) {
            j = jVar.mo8086b();
        }
        return jVar.mo8101j(dVar, j);
    }

    /* renamed from: a */
    public float mo8085a() {
        C16479d dVar = this.f6282a;
        if (C16476b.m74356j(mo8086b())) {
            return dVar.mo7416L(C16476b.m74362p(mo8086b()));
        }
        return C16483g.f40871b.mo47827c();
    }

    /* renamed from: b */
    public long mo8086b() {
        return this.f6283b;
    }

    @C8547h2
    @C12579k
    /* renamed from: c */
    public C8767m mo7701c(@C12579k C8767m mVar, @C12579k C8734c cVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        return this.f6284c.mo7701c(mVar, cVar);
    }

    /* renamed from: d */
    public float mo8087d() {
        C16479d dVar = this.f6282a;
        if (C16476b.m74355i(mo8086b())) {
            return dVar.mo7416L(C16476b.m74361o(mo8086b()));
        }
        return C16483g.f40871b.mo47827c();
    }

    @C8547h2
    @C12579k
    /* renamed from: e */
    public C8767m mo7702e(@C12579k C8767m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return this.f6284c.mo7702e(mVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2370j)) {
            return false;
        }
        C2370j jVar = (C2370j) obj;
        return Intrinsics.areEqual((Object) this.f6282a, (Object) jVar.f6282a) && C16476b.m74353g(mo8086b(), jVar.mo8086b());
    }

    /* renamed from: f */
    public float mo8088f() {
        return this.f6282a.mo7416L(C16476b.m74364r(mo8086b()));
    }

    /* renamed from: g */
    public float mo8089g() {
        return this.f6282a.mo7416L(C16476b.m74363q(mo8086b()));
    }

    /* renamed from: h */
    public final C16479d mo8098h() {
        return this.f6282a;
    }

    public int hashCode() {
        return (this.f6282a.hashCode() * 31) + C16476b.m74366t(mo8086b());
    }

    /* renamed from: i */
    public final long mo8100i() {
        return mo8086b();
    }

    @C12579k
    /* renamed from: j */
    public final C2370j mo8101j(@C12579k C16479d dVar, long j) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return new C2370j(dVar, j, (DefaultConstructorMarker) null);
    }

    @C12579k
    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f6282a + ", constraints=" + C16476b.m74369w(mo8086b()) + ')';
    }

    public C2370j(C16479d dVar, long j) {
        this.f6282a = dVar;
        this.f6283b = j;
        this.f6284c = BoxScopeInstance.f6046a;
    }
}
