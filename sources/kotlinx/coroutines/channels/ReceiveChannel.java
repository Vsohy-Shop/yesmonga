package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11112h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12176y0;
import kotlinx.coroutines.internal.C12007n0;
import kotlinx.coroutines.selects.C12126e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public interface ReceiveChannel<E> {

    public static final class DefaultImpls {
        /* renamed from: b */
        public static /* synthetic */ void m46545b(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                receiveChannel.mo23819a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: c */
        public static /* synthetic */ boolean m46546c(ReceiveChannel receiveChannel, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return receiveChannel.mo23823c(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        @C12579k
        /* renamed from: d */
        public static <E> C12126e<E> m46547d(@C12579k ReceiveChannel<? extends E> receiveChannel) {
            Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((BufferedChannel) receiveChannel).mo23809V();
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @C11587t0(expression = "onReceiveCatching", imports = {}))
        /* renamed from: e */
        public static /* synthetic */ void m46548e() {
        }

        @C12176y0
        /* renamed from: f */
        public static /* synthetic */ void m46549f() {
        }

        @C12095s1
        /* renamed from: g */
        public static /* synthetic */ void m46550g() {
        }

        @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
        @C12580l
        /* renamed from: h */
        public static <E> E m46551h(@C12579k ReceiveChannel<? extends E> receiveChannel) {
            Object W = receiveChannel.mo23811W();
            if (C11749j.m46642m(W)) {
                return C11749j.m46638i(W);
            }
            Throwable f = C11749j.m46635f(W);
            if (f == null) {
                return null;
            }
            throw C12007n0.m47912o(f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @kotlin.C11395k(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
        @org.jetbrains.annotations.C12580l
        @kotlin.internal.C11112h
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <E> java.lang.Object m46552i(@org.jetbrains.annotations.C12579k kotlinx.coroutines.channels.ReceiveChannel<? extends E> r4, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super E> r5) {
            /*
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                if (r0 == 0) goto L_0x0013
                r0 = r5
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = (kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1
                r0.<init>(r5)
            L_0x0018:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                kotlin.C11661u0.m45747n(r5)
                kotlinx.coroutines.channels.j r5 = (kotlinx.coroutines.channels.C11749j) r5
                java.lang.Object r4 = r5.mo23920o()
                goto L_0x0043
            L_0x002f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0037:
                kotlin.C11661u0.m45747n(r5)
                r0.label = r3
                java.lang.Object r4 = r4.mo23815Y(r0)
                if (r4 != r1) goto L_0x0043
                return r1
            L_0x0043:
                java.lang.Object r4 = kotlinx.coroutines.channels.C11749j.m46637h(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.m46552i(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.c):java.lang.Object");
        }
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
    @C12580l
    /* renamed from: I */
    E mo23782I();

    @C12579k
    /* renamed from: T */
    C12126e<E> mo23805T();

    @C12579k
    /* renamed from: U */
    C12126e<C11749j<E>> mo23807U();

    @C12579k
    /* renamed from: V */
    C12126e<E> mo23809V();

    @C12579k
    /* renamed from: W */
    Object mo23811W();

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
    @C12580l
    @C11112h
    /* renamed from: X */
    Object mo23813X(@C12579k C11045c<? super E> cVar);

    @C12580l
    /* renamed from: Y */
    Object mo23815Y(@C12579k C11045c<? super C11749j<? extends E>> cVar);

    /* renamed from: a */
    void mo23819a(@C12580l CancellationException cancellationException);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    /* synthetic */ boolean mo23823c(Throwable th);

    @C12580l
    /* renamed from: c0 */
    Object mo23824c0(@C12579k C11045c<? super E> cVar);

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    /* renamed from: e */
    boolean mo23827e();

    boolean isEmpty();

    @C12579k
    ChannelIterator<E> iterator();
}
