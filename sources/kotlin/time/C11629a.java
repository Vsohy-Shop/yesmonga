package kotlin.time;

import kotlin.C11395k;
import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11634d;
import kotlin.time.C11654r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.a */
public abstract class C11629a implements C11654r.C11658c {
    @C12579k

    /* renamed from: b */
    public final DurationUnit f28944b;

    /* renamed from: kotlin.time.a$a */
    public static final class C11630a implements C11634d {

        /* renamed from: a */
        public final double f28945a;
        @C12579k

        /* renamed from: b */
        public final C11629a f28946b;

        /* renamed from: c */
        public final long f28947c;

        public /* synthetic */ C11630a(double d, C11629a aVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, aVar, j);
        }

        @C12579k
        /* renamed from: E */
        public C11634d m45404E(long j) {
            return C11634d.C11635a.m45438d(this, j);
        }

        /* renamed from: Z1 */
        public int compareTo(@C12579k C11634d dVar) {
            return C11634d.C11635a.m45435a(this, dVar);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C11630a) && Intrinsics.areEqual((Object) this.f28946b, (Object) ((C11630a) obj).f28946b) && C11636e.m45474h0(mo23420l0((C11634d) obj), C11636e.f28954b.mo23447W());
        }

        /* renamed from: g */
        public long mo23418g() {
            return C11636e.m45467a2(C11639g.m45636l0(this.f28946b.mo23412c() - this.f28945a, this.f28946b.mo23411b()), this.f28947c);
        }

        public int hashCode() {
            return C11636e.m45452L1(C11636e.m45469c2(C11639g.m45636l0(this.f28945a, this.f28946b.mo23411b()), this.f28947c));
        }

        /* renamed from: l0 */
        public long mo23420l0(@C12579k C11634d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "other");
            if (dVar instanceof C11630a) {
                C11630a aVar = (C11630a) dVar;
                if (Intrinsics.areEqual((Object) this.f28946b, (Object) aVar.f28946b)) {
                    if (C11636e.m45474h0(this.f28947c, aVar.f28947c) && C11636e.m45460T1(this.f28947c)) {
                        return C11636e.f28954b.mo23447W();
                    }
                    long a2 = C11636e.m45467a2(this.f28947c, aVar.f28947c);
                    long l0 = C11639g.m45636l0(this.f28945a - aVar.f28945a, this.f28946b.mo23411b());
                    if (C11636e.m45474h0(l0, C11636e.m45506w2(a2))) {
                        return C11636e.f28954b.mo23447W();
                    }
                    return C11636e.m45469c2(l0, a2);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + dVar);
        }

        /* renamed from: q */
        public boolean mo23421q() {
            return C11634d.C11635a.m45437c(this);
        }

        /* renamed from: r */
        public boolean mo23422r() {
            return C11634d.C11635a.m45436b(this);
        }

        @C12579k
        public String toString() {
            return "DoubleTimeMark(" + this.f28945a + C11643j.m45660h(this.f28946b.mo23411b()) + " + " + C11636e.m45500t2(this.f28947c) + ", " + this.f28946b + ')';
        }

        public C11630a(double d, C11629a aVar, long j) {
            Intrinsics.checkNotNullParameter(aVar, "timeSource");
            this.f28945a = d;
            this.f28946b = aVar;
            this.f28947c = j;
        }

        @C12579k
        /* renamed from: A */
        public C11634d m45402A(long j) {
            return new C11630a(this.f28945a, this.f28946b, C11636e.m45469c2(this.f28947c, j), (DefaultConstructorMarker) null);
        }
    }

    public C11629a(@C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "unit");
        this.f28944b = durationUnit;
    }

    @C12579k
    /* renamed from: b */
    public final DurationUnit mo23411b() {
        return this.f28944b;
    }

    /* renamed from: c */
    public abstract double mo23412c();

    @C12579k
    /* renamed from: a */
    public C11634d m45398a() {
        return new C11630a(mo23412c(), this, C11636e.f28954b.mo23447W(), (DefaultConstructorMarker) null);
    }
}
