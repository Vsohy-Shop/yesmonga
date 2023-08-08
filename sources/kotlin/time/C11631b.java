package kotlin.time;

import kotlin.C11665v0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11634d;
import kotlin.time.C11636e;
import kotlin.time.C11654r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.b */
public abstract class C11631b implements C11654r.C11658c {
    @C12579k

    /* renamed from: b */
    public final DurationUnit f28948b;

    @C11363r0({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,180:1\n720#2,2:181\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n66#1:181,2\n*E\n"})
    /* renamed from: kotlin.time.b$a */
    public static final class C11632a implements C11634d {

        /* renamed from: a */
        public final long f28949a;
        @C12579k

        /* renamed from: b */
        public final C11631b f28950b;

        /* renamed from: c */
        public final long f28951c;

        public /* synthetic */ C11632a(long j, C11631b bVar, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, bVar, j2);
        }

        @C12579k
        /* renamed from: E */
        public C11634d m45417E(long j) {
            return C11634d.C11635a.m45438d(this, j);
        }

        /* renamed from: Z1 */
        public int compareTo(@C12579k C11634d dVar) {
            return C11634d.C11635a.m45435a(this, dVar);
        }

        public boolean equals(@C12580l Object obj) {
            return (obj instanceof C11632a) && Intrinsics.areEqual((Object) this.f28950b, (Object) ((C11632a) obj).f28950b) && C11636e.m45474h0(mo23420l0((C11634d) obj), C11636e.f28954b.mo23447W());
        }

        /* renamed from: g */
        public long mo23418g() {
            return C11636e.m45460T1(this.f28951c) ? C11636e.m45506w2(this.f28951c) : C11636e.m45467a2(C11639g.m45640n0(this.f28950b.mo23425c() - this.f28949a, this.f28950b.mo23424b()), this.f28951c);
        }

        public int hashCode() {
            return C11636e.m45452L1(mo23428w());
        }

        /* renamed from: l0 */
        public long mo23420l0(@C12579k C11634d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "other");
            if (dVar instanceof C11632a) {
                C11632a aVar = (C11632a) dVar;
                if (Intrinsics.areEqual((Object) this.f28950b, (Object) aVar.f28950b)) {
                    if (C11636e.m45474h0(this.f28951c, aVar.f28951c) && C11636e.m45460T1(this.f28951c)) {
                        return C11636e.f28954b.mo23447W();
                    }
                    long a2 = C11636e.m45467a2(this.f28951c, aVar.f28951c);
                    long n0 = C11639g.m45640n0(this.f28949a - aVar.f28949a, this.f28950b.mo23424b());
                    if (C11636e.m45474h0(n0, C11636e.m45506w2(a2))) {
                        return C11636e.f28954b.mo23447W();
                    }
                    return C11636e.m45469c2(n0, a2);
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
            return "LongTimeMark(" + this.f28949a + C11643j.m45660h(this.f28950b.mo23424b()) + " + " + C11636e.m45500t2(this.f28951c) + " (=" + C11636e.m45500t2(mo23428w()) + "), " + this.f28950b + ')';
        }

        /* renamed from: w */
        public final long mo23428w() {
            if (C11636e.m45460T1(this.f28951c)) {
                return this.f28951c;
            }
            DurationUnit b = this.f28950b.mo23424b();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            if (b.compareTo(durationUnit) >= 0) {
                return C11636e.m45469c2(C11639g.m45640n0(this.f28949a, b), this.f28951c);
            }
            long b2 = C11641i.m45654b(1, durationUnit, b);
            long j = this.f28949a;
            long j2 = j / b2;
            long j3 = j % b2;
            long j4 = this.f28951c;
            long q1 = C11636e.m45494q1(j4);
            int B1 = C11636e.m45441B1(j4);
            int i = B1 / 1000000;
            long n0 = C11639g.m45640n0(j3, b);
            C11636e.C11637a aVar = C11636e.f28954b;
            return C11636e.m45469c2(C11636e.m45469c2(C11636e.m45469c2(n0, C11639g.m45638m0(B1 % 1000000, DurationUnit.NANOSECONDS)), C11639g.m45640n0(j2 + ((long) i), durationUnit)), C11639g.m45640n0(q1, DurationUnit.SECONDS));
        }

        public C11632a(long j, C11631b bVar, long j2) {
            Intrinsics.checkNotNullParameter(bVar, "timeSource");
            this.f28949a = j;
            this.f28950b = bVar;
            this.f28951c = j2;
        }

        @C12579k
        /* renamed from: A */
        public C11634d m45415A(long j) {
            return new C11632a(this.f28949a, this.f28950b, C11636e.m45469c2(this.f28951c, j), (DefaultConstructorMarker) null);
        }
    }

    public C11631b(@C12579k DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "unit");
        this.f28948b = durationUnit;
    }

    @C12579k
    /* renamed from: b */
    public final DurationUnit mo23424b() {
        return this.f28948b;
    }

    /* renamed from: c */
    public abstract long mo23425c();

    @C12579k
    /* renamed from: a */
    public C11634d m45411a() {
        return new C11632a(mo23425c(), this, C11636e.f28954b.mo23447W(), (DefaultConstructorMarker) null);
    }
}
