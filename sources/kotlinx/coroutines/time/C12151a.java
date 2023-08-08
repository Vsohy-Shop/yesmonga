package kotlinx.coroutines.time;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12145t1;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.selects.C12121a;
import kotlinx.coroutines.selects.C12122b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;
import p073j$.time.Duration;
import p073j$.time.temporal.ChronoUnit;

/* renamed from: kotlinx.coroutines.time.a */
public final class C12151a {
    /* renamed from: a */
    public static final long m48695a(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    @C12145t1
    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m48696b(@C12579k C11907e<? extends T> eVar, @C12579k Duration duration) {
        return C11909g.m47427a0(eVar, m48695a(duration));
    }

    @C12580l
    /* renamed from: c */
    public static final Object m48697c(@C12579k Duration duration, @C12579k C11045c<? super C11079d2> cVar) {
        Object b = DelayKt.m45925b(m48695a(duration), cVar);
        return b == C11063b.m42612h() ? b : C11079d2.f28267a;
    }

    /* renamed from: d */
    public static final <R> void m48698d(@C12579k C12122b<? super R> bVar, @C12579k Duration duration, @C12579k C11300l<? super C11045c<? super R>, ? extends Object> lVar) {
        C12121a.m48521a(bVar, m48695a(duration), lVar);
    }

    @C12145t1
    @C12579k
    /* renamed from: e */
    public static final <T> C11907e<T> m48699e(@C12579k C11907e<? extends T> eVar, @C12579k Duration duration) {
        return C11909g.m47353B1(eVar, m48695a(duration));
    }

    @C12580l
    /* renamed from: f */
    public static final <T> Object m48700f(@C12579k Duration duration, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return TimeoutKt.m46062c(m48695a(duration), pVar, cVar);
    }

    @C12580l
    /* renamed from: g */
    public static final <T> Object m48701g(@C12579k Duration duration, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar, @C12579k C11045c<? super T> cVar) {
        return TimeoutKt.m46064e(m48695a(duration), pVar, cVar);
    }
}
