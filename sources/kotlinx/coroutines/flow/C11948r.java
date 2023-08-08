package kotlinx.coroutines.flow;

import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.flow.r */
public interface C11948r {
    @C12579k

    /* renamed from: a */
    public static final C11949a f29534a = C11949a.f29535a;

    /* renamed from: kotlinx.coroutines.flow.r$a */
    public static final class C11949a {

        /* renamed from: a */
        public static final /* synthetic */ C11949a f29535a = new C11949a();
        @C12579k

        /* renamed from: b */
        public static final C11948r f29536b = new C11951t();
        @C12579k

        /* renamed from: c */
        public static final C11948r f29537c = new StartedLazily();

        /* renamed from: b */
        public static /* synthetic */ C11948r m47621b(C11949a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.mo24271a(j, j2);
        }

        @C12579k
        /* renamed from: a */
        public final C11948r mo24271a(long j, long j2) {
            return new StartedWhileSubscribed(j, j2);
        }

        @C12579k
        /* renamed from: c */
        public final C11948r mo24272c() {
            return f29536b;
        }

        @C12579k
        /* renamed from: d */
        public final C11948r mo24273d() {
            return f29537c;
        }
    }

    @C12579k
    /* renamed from: a */
    C11907e<SharingCommand> mo24207a(@C12579k C11952u<Integer> uVar);
}
