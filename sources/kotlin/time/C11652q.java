package kotlin.time;

import kotlin.C11665v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11646k
@C11665v0(version = "1.3")
/* renamed from: kotlin.time.q */
public interface C11652q {

    /* renamed from: kotlin.time.q$a */
    public static final class C11653a {
        /* renamed from: a */
        public static boolean m45692a(@C12579k C11652q qVar) {
            return C11636e.m45464X1(qVar.mo23418g());
        }

        /* renamed from: b */
        public static boolean m45693b(@C12579k C11652q qVar) {
            return !C11636e.m45464X1(qVar.mo23418g());
        }

        @C12579k
        /* renamed from: c */
        public static C11652q m45694c(@C12579k C11652q qVar, long j) {
            return qVar.mo23413A(C11636e.m45506w2(j));
        }

        @C12579k
        /* renamed from: d */
        public static C11652q m45695d(@C12579k C11652q qVar, long j) {
            return new C11633c(qVar, j, (DefaultConstructorMarker) null);
        }
    }

    @C12579k
    /* renamed from: A */
    C11652q mo23413A(long j);

    @C12579k
    /* renamed from: E */
    C11652q mo23414E(long j);

    /* renamed from: g */
    long mo23418g();

    /* renamed from: q */
    boolean mo23421q();

    /* renamed from: r */
    boolean mo23422r();
}
