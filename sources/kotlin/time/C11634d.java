package kotlin.time;

import kotlin.C11665v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C11652q;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11646k
@C11665v0(version = "1.8")
/* renamed from: kotlin.time.d */
public interface C11634d extends C11652q, Comparable<C11634d> {

    /* renamed from: kotlin.time.d$a */
    public static final class C11635a {
        /* renamed from: a */
        public static int m45435a(@C12579k C11634d dVar, @C12579k C11634d dVar2) {
            Intrinsics.checkNotNullParameter(dVar2, "other");
            return C11636e.m45457Q(dVar.mo23420l0(dVar2), C11636e.f28954b.mo23447W());
        }

        /* renamed from: b */
        public static boolean m45436b(@C12579k C11634d dVar) {
            return C11652q.C11653a.m45692a(dVar);
        }

        /* renamed from: c */
        public static boolean m45437c(@C12579k C11634d dVar) {
            return C11652q.C11653a.m45693b(dVar);
        }

        @C12579k
        /* renamed from: d */
        public static C11634d m45438d(@C12579k C11634d dVar, long j) {
            return dVar.mo23413A(C11636e.m45506w2(j));
        }
    }

    @C12579k
    /* renamed from: A */
    C11634d mo23413A(long j);

    @C12579k
    /* renamed from: E */
    C11634d mo23414E(long j);

    /* renamed from: Z1 */
    int mo23415Z1(@C12579k C11634d dVar);

    boolean equals(@C12580l Object obj);

    int hashCode();

    /* renamed from: l0 */
    long mo23420l0(@C12579k C11634d dVar);
}
