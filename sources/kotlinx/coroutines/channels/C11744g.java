package kotlinx.coroutines.channels;

import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11112h;
import kotlinx.coroutines.channels.C11763t;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.internal.C12016r0;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.channels.g */
public interface C11744g<E> extends C11763t<E>, ReceiveChannel<E> {

    /* renamed from: A0 */
    public static final int f29154A0 = -1;

    /* renamed from: B0 */
    public static final int f29155B0 = -2;

    /* renamed from: C0 */
    public static final int f29156C0 = -3;
    @C12579k

    /* renamed from: D0 */
    public static final String f29157D0 = "kotlinx.coroutines.channels.defaultBuffer";
    @C12579k

    /* renamed from: x0 */
    public static final C11746b f29158x0 = C11746b.f29161a;

    /* renamed from: y0 */
    public static final int f29159y0 = Integer.MAX_VALUE;

    /* renamed from: z0 */
    public static final int f29160z0 = 0;

    /* renamed from: kotlinx.coroutines.channels.g$a */
    public static final class C11745a {
        @C12579k
        /* renamed from: b */
        public static <E> C12126e<E> m46596b(@C12579k C11744g<E> gVar) {
            return ReceiveChannel.DefaultImpls.m46547d(gVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
        /* renamed from: c */
        public static <E> boolean m46597c(@C12579k C11744g<E> gVar, E e) {
            return C11763t.C11764a.m46774c(gVar, e);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
        @C12580l
        /* renamed from: d */
        public static <E> E m46598d(@C12579k C11744g<E> gVar) {
            return ReceiveChannel.DefaultImpls.m46551h(gVar);
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
        @C12580l
        @C11112h
        /* renamed from: e */
        public static <E> Object m46599e(@C12579k C11744g<E> gVar, @C12579k C11045c<? super E> cVar) {
            return ReceiveChannel.DefaultImpls.m46552i(gVar, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.g$b */
    public static final class C11746b {

        /* renamed from: a */
        public static final /* synthetic */ C11746b f29161a = new C11746b();

        /* renamed from: b */
        public static final int f29162b = Integer.MAX_VALUE;

        /* renamed from: c */
        public static final int f29163c = 0;

        /* renamed from: d */
        public static final int f29164d = -1;

        /* renamed from: e */
        public static final int f29165e = -2;

        /* renamed from: f */
        public static final int f29166f = -3;
        @C12579k

        /* renamed from: g */
        public static final String f29167g = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: h */
        public static final int f29168h = C12016r0.m47945b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* renamed from: a */
        public final int mo23915a() {
            return f29168h;
        }
    }
}
