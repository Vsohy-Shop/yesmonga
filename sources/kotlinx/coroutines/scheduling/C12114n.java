package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.C11287e;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.internal.C12016r0;
import kotlinx.coroutines.internal.C12020t0;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.scheduling.n */
public final class C12114n {
    @C12579k
    @C11287e

    /* renamed from: a */
    public static final String f29821a = C12016r0.m47948e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    @C11287e

    /* renamed from: b */
    public static final long f29822b = C12020t0.m47962f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    @C11287e

    /* renamed from: c */
    public static final int f29823c = C12020t0.m47961e("kotlinx.coroutines.scheduler.core.pool.size", C11479u.m44447u(C12016r0.m47944a(), 2), 1, 0, 8, (Object) null);
    @C11287e

    /* renamed from: d */
    public static final int f29824d = C12020t0.m47961e("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f29763K0, 0, CoroutineScheduler.f29763K0, 4, (Object) null);
    @C11287e

    /* renamed from: e */
    public static final long f29825e = TimeUnit.SECONDS.toNanos(C12020t0.m47962f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));
    @C12579k
    @C11287e

    /* renamed from: f */
    public static C12109i f29826f = C12107g.f29811a;

    /* renamed from: g */
    public static final int f29827g = 0;

    /* renamed from: h */
    public static final int f29828h = 1;
    @C12579k
    @C11287e

    /* renamed from: i */
    public static final C12111k f29829i = new C12112l(0);
    @C12579k
    @C11287e

    /* renamed from: j */
    public static final C12111k f29830j = new C12112l(1);

    /* renamed from: a */
    public static final boolean m48426a(@C12579k C12110j jVar) {
        return jVar.f29818b.mo24658L() == 1;
    }
}
