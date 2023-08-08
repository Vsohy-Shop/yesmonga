package kotlin.time;

import kotlin.C11665v0;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11634d;
import org.jetbrains.annotations.C12579k;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.r */
public interface C11654r {
    @C12579k

    /* renamed from: a */
    public static final C11655a f28968a = C11655a.f28969a;

    /* renamed from: kotlin.time.r$a */
    public static final class C11655a {

        /* renamed from: a */
        public static final /* synthetic */ C11655a f28969a = new C11655a();
    }

    /* renamed from: kotlin.time.r$b */
    public static final class C11656b implements C11658c {
        @C12579k

        /* renamed from: b */
        public static final C11656b f28970b = new C11656b();

        @C11288f
        @C11646k
        @C11665v0(version = "1.7")
        /* renamed from: kotlin.time.r$b$a */
        public static final class C11657a implements C11634d {

            /* renamed from: a */
            public final long f28971a;

            public /* synthetic */ C11657a(long j) {
                this.f28971a = j;
            }

            /* renamed from: M */
            public static long m45700M(long j) {
                return C11650o.f28965b.mo23489d(j);
            }

            /* renamed from: Q */
            public static boolean m45701Q(long j, Object obj) {
                return (obj instanceof C11657a) && j == ((C11657a) obj).mo23500p0();
            }

            /* renamed from: W */
            public static final boolean m45702W(long j, long j2) {
                return j == j2;
            }

            /* renamed from: X */
            public static boolean m45703X(long j) {
                return C11636e.m45464X1(m45700M(j));
            }

            /* renamed from: Z */
            public static boolean m45704Z(long j) {
                return !C11636e.m45464X1(m45700M(j));
            }

            /* renamed from: b */
            public static final /* synthetic */ C11657a m45705b(long j) {
                return new C11657a(j);
            }

            /* renamed from: e0 */
            public static int m45706e0(long j) {
                return Long.hashCode(j);
            }

            /* renamed from: f0 */
            public static final long m45707f0(long j, long j2) {
                return C11650o.f28965b.mo23488c(j, j2);
            }

            /* renamed from: i0 */
            public static long m45708i0(long j, long j2) {
                return C11650o.f28965b.mo23487b(j, C11636e.m45506w2(j2));
            }

            /* renamed from: j0 */
            public static long m45709j0(long j, @C12579k C11634d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "other");
                if (dVar instanceof C11657a) {
                    return m45707f0(j, ((C11657a) dVar).mo23500p0());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + m45711o0(j) + " and " + dVar);
            }

            /* renamed from: n0 */
            public static long m45710n0(long j, long j2) {
                return C11650o.f28965b.mo23487b(j, j2);
            }

            /* renamed from: o0 */
            public static String m45711o0(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            /* renamed from: w */
            public static final int m45712w(long j, long j2) {
                return C11636e.m45457Q(m45707f0(j, j2), C11636e.f28954b.mo23447W());
            }

            /* renamed from: y */
            public static int m45713y(long j, @C12579k C11634d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "other");
                return m45705b(j).compareTo(dVar);
            }

            /* renamed from: z */
            public static long m45714z(long j) {
                return j;
            }

            /* renamed from: Z1 */
            public int compareTo(@C12579k C11634d dVar) {
                return C11634d.C11635a.m45435a(this, dVar);
            }

            public boolean equals(Object obj) {
                return m45701Q(this.f28971a, obj);
            }

            /* renamed from: g */
            public long mo23418g() {
                return m45700M(this.f28971a);
            }

            /* renamed from: h0 */
            public long mo23498h0(long j) {
                return m45708i0(this.f28971a, j);
            }

            public int hashCode() {
                return m45706e0(this.f28971a);
            }

            /* renamed from: l0 */
            public long mo23420l0(@C12579k C11634d dVar) {
                Intrinsics.checkNotNullParameter(dVar, "other");
                return m45709j0(this.f28971a, dVar);
            }

            /* renamed from: m0 */
            public long mo23499m0(long j) {
                return m45710n0(this.f28971a, j);
            }

            /* renamed from: p0 */
            public final /* synthetic */ long mo23500p0() {
                return this.f28971a;
            }

            /* renamed from: q */
            public boolean mo23421q() {
                return m45704Z(this.f28971a);
            }

            /* renamed from: r */
            public boolean mo23422r() {
                return m45703X(this.f28971a);
            }

            public String toString() {
                return m45711o0(this.f28971a);
            }
        }

        /* renamed from: b */
        public long mo23495b() {
            return C11650o.f28965b.mo23490e();
        }

        @C12579k
        public String toString() {
            return C11650o.f28965b.toString();
        }
    }

    @C11646k
    @C11665v0(version = "1.8")
    /* renamed from: kotlin.time.r$c */
    public interface C11658c extends C11654r {
        @C12579k
        /* renamed from: a */
        C11634d mo23410a();
    }

    @C12579k
    /* renamed from: a */
    C11652q mo23410a();
}
