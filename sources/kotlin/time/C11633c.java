package kotlin.time;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11652q;
import org.jetbrains.annotations.C12579k;

@C11646k
/* renamed from: kotlin.time.c */
public final class C11633c implements C11652q {
    @C12579k

    /* renamed from: a */
    public final C11652q f28952a;

    /* renamed from: b */
    public final long f28953b;

    public /* synthetic */ C11633c(C11652q qVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, j);
    }

    @C12579k
    /* renamed from: A */
    public C11652q mo23413A(long j) {
        return new C11633c(this.f28952a, C11636e.m45469c2(this.f28953b, j), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: E */
    public C11652q mo23414E(long j) {
        return C11652q.C11653a.m45694c(this, j);
    }

    /* renamed from: a */
    public final long mo23429a() {
        return this.f28953b;
    }

    @C12579k
    /* renamed from: b */
    public final C11652q mo23430b() {
        return this.f28952a;
    }

    /* renamed from: g */
    public long mo23418g() {
        return C11636e.m45467a2(this.f28952a.mo23418g(), this.f28953b);
    }

    /* renamed from: q */
    public boolean mo23421q() {
        return C11652q.C11653a.m45693b(this);
    }

    /* renamed from: r */
    public boolean mo23422r() {
        return C11652q.C11653a.m45692a(this);
    }

    public C11633c(C11652q qVar, long j) {
        Intrinsics.checkNotNullParameter(qVar, "mark");
        this.f28952a = qVar;
        this.f28953b = j;
    }
}
