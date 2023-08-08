package kotlinx.coroutines.channels;

import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11300l;
import kotlin.reflect.C11500i;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.C12020t0;
import org.jetbrains.annotations.C12579k;

public final class BufferedChannelKt {
    @C12579k

    /* renamed from: A */
    public static final C12009o0 f29107A = new C12009o0("NO_CLOSE_CAUSE");

    /* renamed from: B */
    public static final int f29108B = 0;

    /* renamed from: C */
    public static final int f29109C = 1;

    /* renamed from: D */
    public static final int f29110D = 2;

    /* renamed from: E */
    public static final int f29111E = 3;

    /* renamed from: F */
    public static final int f29112F = 60;

    /* renamed from: G */
    public static final long f29113G = 1152921504606846975L;

    /* renamed from: H */
    public static final long f29114H = 4611686018427387904L;

    /* renamed from: I */
    public static final long f29115I = 4611686018427387903L;
    @C12579k

    /* renamed from: a */
    public static final C11754l<Object> f29116a = new C11754l(-1, (C11754l) null, (BufferedChannel) null, 0);
    @C11287e

    /* renamed from: b */
    public static final int f29117b = C12020t0.m47961e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);

    /* renamed from: c */
    public static final int f29118c = C12020t0.m47961e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);

    /* renamed from: d */
    public static final long f29119d = 0;

    /* renamed from: e */
    public static final long f29120e = Long.MAX_VALUE;
    @C12579k
    @C11287e

    /* renamed from: f */
    public static final C12009o0 f29121f = new C12009o0("BUFFERED");
    @C12579k

    /* renamed from: g */
    public static final C12009o0 f29122g = new C12009o0("SHOULD_BUFFER");
    @C12579k

    /* renamed from: h */
    public static final C12009o0 f29123h = new C12009o0("S_RESUMING_BY_RCV");
    @C12579k

    /* renamed from: i */
    public static final C12009o0 f29124i = new C12009o0("RESUMING_BY_EB");
    @C12579k

    /* renamed from: j */
    public static final C12009o0 f29125j = new C12009o0("POISONED");
    @C12579k

    /* renamed from: k */
    public static final C12009o0 f29126k = new C12009o0("DONE_RCV");
    @C12579k

    /* renamed from: l */
    public static final C12009o0 f29127l = new C12009o0("INTERRUPTED_SEND");
    @C12579k

    /* renamed from: m */
    public static final C12009o0 f29128m = new C12009o0("INTERRUPTED_RCV");
    @C12579k

    /* renamed from: n */
    public static final C12009o0 f29129n = new C12009o0("CHANNEL_CLOSED");
    @C12579k

    /* renamed from: o */
    public static final C12009o0 f29130o = new C12009o0("SUSPEND");
    @C12579k

    /* renamed from: p */
    public static final C12009o0 f29131p = new C12009o0("SUSPEND_NO_WAITER");
    @C12579k

    /* renamed from: q */
    public static final C12009o0 f29132q = new C12009o0("FAILED");

    /* renamed from: r */
    public static final int f29133r = 0;

    /* renamed from: s */
    public static final int f29134s = 1;

    /* renamed from: t */
    public static final int f29135t = 2;

    /* renamed from: u */
    public static final int f29136u = 3;

    /* renamed from: v */
    public static final int f29137v = 4;

    /* renamed from: w */
    public static final int f29138w = 5;
    @C12579k

    /* renamed from: x */
    public static final C12009o0 f29139x = new C12009o0("NO_RECEIVE_RESULT");
    @C12579k

    /* renamed from: y */
    public static final C12009o0 f29140y = new C12009o0("CLOSE_HANDLER_CLOSED");
    @C12579k

    /* renamed from: z */
    public static final C12009o0 f29141z = new C12009o0("CLOSE_HANDLER_INVOKED");

    /* renamed from: A */
    public static final long m46389A(long j) {
        return j & 4611686018427387903L;
    }

    /* renamed from: B */
    public static final boolean m46390B(long j) {
        return (j & f29114H) != 0;
    }

    /* renamed from: C */
    public static final int m46391C(long j) {
        return (int) (j >> 60);
    }

    /* renamed from: D */
    public static final long m46392D(long j) {
        return j & f29113G;
    }

    /* renamed from: E */
    public static final long m46393E(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != Integer.MAX_VALUE) {
            return (long) i;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: F */
    public static final <T> boolean m46394F(C12072o<? super T> oVar, T t, C11300l<? super Throwable, C11079d2> lVar) {
        Object a0 = oVar.mo24533a0(t, (Object) null, lVar);
        if (a0 == null) {
            return false;
        }
        oVar.mo24540o0(a0);
        return true;
    }

    /* renamed from: G */
    public static /* synthetic */ boolean m46395G(C12072o oVar, Object obj, C11300l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        return m46394F(oVar, obj, lVar);
    }

    /* renamed from: v */
    public static final long m46417v(long j, boolean z) {
        return (z ? f29114H : 0) + j;
    }

    /* renamed from: w */
    public static final long m46418w(long j, int i) {
        return (((long) i) << 60) + j;
    }

    /* renamed from: x */
    public static final <E> C11754l<E> m46419x(long j, C11754l<E> lVar) {
        return new C11754l(j, lVar, lVar.mo23937w(), 0);
    }

    @C12579k
    /* renamed from: y */
    public static final <E> C11500i<C11754l<E>> m46420y() {
        return BufferedChannelKt$createSegmentFunction$1.f29142a;
    }

    @C12579k
    /* renamed from: z */
    public static final C12009o0 m46421z() {
        return f29129n;
    }
}
