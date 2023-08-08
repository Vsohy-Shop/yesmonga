package kotlinx.coroutines.channels;

import androidx.concurrent.futures.C16563a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11414o;
import kotlin.C11587t0;
import kotlin.C11661u0;
import kotlin.DeprecationLevel;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.internal.C11112h;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12077o3;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12089r;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.internal.C11988e;
import kotlinx.coroutines.internal.C11990f;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.coroutines.internal.C12005m0;
import kotlinx.coroutines.internal.C12007n0;
import kotlinx.coroutines.internal.C12008o;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.C12126e;
import kotlinx.coroutines.selects.C12127f;
import kotlinx.coroutines.selects.C12128g;
import kotlinx.coroutines.selects.C12129h;
import kotlinx.coroutines.selects.C12131j;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3055:1\n273#1,6:3058\n280#1,68:3065\n374#1,18:3156\n244#1:3174\n269#1,10:3175\n280#1,48:3186\n395#1:3234\n334#1,14:3235\n399#1,3:3250\n244#1:3263\n269#1,10:3264\n280#1,68:3275\n244#1:3353\n269#1,10:3354\n280#1,68:3365\n244#1:3437\n269#1,10:3438\n280#1,68:3449\n886#1,52:3519\n964#1,8:3575\n858#1:3583\n882#1,33:3584\n974#1:3617\n916#1,14:3618\n935#1,3:3633\n979#1,6:3636\n886#1,52:3650\n964#1,8:3706\n858#1:3714\n882#1,33:3715\n974#1:3748\n916#1,14:3749\n935#1,3:3764\n979#1,6:3767\n858#1:3782\n882#1,48:3783\n935#1,3:3832\n858#1:3835\n882#1,48:3836\n935#1,3:3885\n244#1:3897\n269#1,10:3898\n280#1,68:3909\n858#1:3978\n882#1,48:3979\n935#1,3:4028\n1#2:3056\n3038#3:3057\n3038#3:3064\n3038#3:3185\n3038#3:3274\n3038#3:3364\n3038#3:3436\n3038#3:3448\n3038#3:3518\n3038#3:3781\n3038#3:3888\n3038#3:3889\n3052#3:3890\n3052#3:3891\n3051#3:3892\n3051#3:3893\n3051#3:3894\n3052#3:3895\n3051#3:3896\n3038#3:3908\n3039#3:4031\n3038#3:4032\n3038#3:4033\n3038#3:4034\n3039#3:4035\n3038#3:4036\n3039#3:4059\n3038#3:4060\n3038#3:4061\n3039#3:4062\n3038#3:4112\n3039#3:4113\n3039#3:4114\n3039#3:4132\n3039#3:4133\n314#4,9:3133\n323#4,2:3150\n332#4,4:3152\n336#4,8:3253\n314#4,9:3344\n323#4,2:3434\n332#4,4:3571\n336#4,8:3642\n332#4,4:3702\n336#4,8:3773\n220#5:3142\n221#5:3145\n220#5:3146\n221#5:3149\n61#6,2:3143\n61#6,2:3147\n61#6,2:3261\n269#7:3249\n269#7:3343\n269#7:3433\n269#7:3517\n269#7:3977\n882#8:3632\n882#8:3763\n882#8:3831\n882#8:3884\n882#8:4027\n37#9,11:4037\n37#9,11:4048\n72#10,3:4063\n46#10,8:4066\n72#10,3:4074\n46#10,8:4077\n46#10,8:4085\n72#10,3:4093\n46#10,8:4096\n46#10,8:4104\n766#11:4115\n857#11,2:4116\n2310#11,14:4118\n766#11:4134\n857#11,2:4135\n2310#11,14:4137\n766#11:4151\n857#11,2:4152\n2310#11,14:4154\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n113#1:3058,6\n113#1:3065,68\n154#1:3156,18\n154#1:3174\n154#1:3175,10\n154#1:3186,48\n154#1:3234\n154#1:3235,14\n154#1:3250,3\n194#1:3263\n194#1:3264,10\n194#1:3275,68\n225#1:3353\n225#1:3354,10\n225#1:3365,68\n391#1:3437\n391#1:3438,10\n391#1:3449,68\n667#1:3519,52\n696#1:3575,8\n696#1:3583\n696#1:3584,33\n696#1:3617\n696#1:3618,14\n696#1:3633,3\n696#1:3636,6\n732#1:3650,52\n748#1:3706,8\n748#1:3714\n748#1:3715,33\n748#1:3748\n748#1:3749,14\n748#1:3764,3\n748#1:3767,6\n781#1:3782\n781#1:3783,48\n781#1:3832,3\n971#1:3835\n971#1:3836,48\n971#1:3885,3\n1464#1:3897\n1464#1:3898,10\n1464#1:3909,68\n1512#1:3978\n1512#1:3979,48\n1512#1:4028,3\n70#1:3057\n113#1:3064\n154#1:3185\n194#1:3274\n225#1:3364\n278#1:3436\n391#1:3448\n606#1:3518\n771#1:3781\n1007#1:3888\n1056#1:3889\n1374#1:3890\n1376#1:3891\n1406#1:3892\n1416#1:3893\n1425#1:3894\n1426#1:3895\n1433#1:3896\n1464#1:3908\n1865#1:4031\n1867#1:4032\n1869#1:4033\n1882#1:4034\n1893#1:4035\n1894#1:4036\n2196#1:4059\n2209#1:4060\n2219#1:4061\n2222#1:4062\n2539#1:4112\n2541#1:4113\n2566#1:4114\n2628#1:4132\n2629#1:4133\n134#1:3133,9\n134#1:3150,2\n153#1:3152,4\n153#1:3253,8\n221#1:3344,9\n221#1:3434,2\n695#1:3571,4\n695#1:3642,8\n746#1:3702,4\n746#1:3773,8\n138#1:3142\n138#1:3145\n141#1:3146\n141#1:3149\n138#1:3143,2\n141#1:3147,2\n183#1:3261,2\n154#1:3249\n194#1:3343\n225#1:3433\n391#1:3517\n1464#1:3977\n696#1:3632\n748#1:3763\n781#1:3831\n971#1:3884\n1512#1:4027\n2098#1:4037,11\n2153#1:4048,11\n2361#1:4063,3\n2361#1:4066,8\n2416#1:4074,3\n2416#1:4077,8\n2435#1:4085,8\n2465#1:4093,3\n2465#1:4096,8\n2526#1:4104,8\n2575#1:4115\n2575#1:4116,2\n2576#1:4118,14\n2640#1:4134\n2640#1:4135,2\n2641#1:4137,14\n2681#1:4151\n2681#1:4152,2\n2682#1:4154,14\n*E\n"})
public class BufferedChannel<E> implements C11744g<E> {
    @C12579k

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f29080d;
    @C12579k

    /* renamed from: e */
    public static final AtomicLongFieldUpdater f29081e;
    @C12579k

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f29082f;
    @C12579k

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f29083g;
    @C12579k

    /* renamed from: v */
    public static final AtomicReferenceFieldUpdater f29084v;
    @C12579k

    /* renamed from: w */
    public static final AtomicReferenceFieldUpdater f29085w;
    @C12579k

    /* renamed from: x */
    public static final AtomicReferenceFieldUpdater f29086x;
    @C12579k

    /* renamed from: y */
    public static final AtomicReferenceFieldUpdater f29087y;
    @C12579k

    /* renamed from: z */
    public static final AtomicReferenceFieldUpdater f29088z;
    @C11394v
    @C12580l
    private volatile Object _closeCause;

    /* renamed from: a */
    public final int f29089a;
    @C12580l
    @C11287e

    /* renamed from: b */
    public final C11300l<E, C11079d2> f29090b;
    @C11394v
    private volatile long bufferEnd;
    @C11394v
    @C12580l
    private volatile Object bufferEndSegment;
    @C12580l

    /* renamed from: c */
    public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29091c;
    @C11394v
    @C12580l
    private volatile Object closeHandler;
    @C11394v
    private volatile long completedExpandBuffersAndPauseFlag;
    @C11394v
    @C12580l
    private volatile Object receiveSegment;
    @C11394v
    private volatile long receivers;
    @C11394v
    @C12580l
    private volatile Object sendSegment;
    @C11394v
    private volatile long sendersAndCloseStatus;

    @C11363r0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n886#2,52:3056\n964#2,8:3112\n858#2:3120\n882#2,33:3121\n974#2:3154\n916#2,14:3155\n935#2,3:3170\n979#2,6:3173\n332#3,4:3108\n336#3,8:3179\n882#4:3169\n61#5,2:3187\n61#5,2:3190\n1#6:3189\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1590#1:3056,52\n1627#1:3112,8\n1627#1:3120\n1627#1:3121,33\n1627#1:3154\n1627#1:3155,14\n1627#1:3170,3\n1627#1:3173,6\n1625#1:3108,4\n1625#1:3179,8\n1627#1:3169\n1663#1:3187,2\n1708#1:3190,2\n*E\n"})
    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$a */
    public final class C11731a implements ChannelIterator<E>, C12077o3 {
        @C12580l

        /* renamed from: a */
        public Object f29092a = BufferedChannelKt.f29139x;
        @C12580l

        /* renamed from: b */
        public C12078p<? super Boolean> f29093b;

        public C11731a() {
        }

        @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @C11314h(name = "next")
        /* renamed from: a */
        public /* synthetic */ Object mo23861a(C11045c cVar) {
            return ChannelIterator.DefaultImpls.m46425a(this, cVar);
        }

        /* renamed from: b */
        public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
            C12078p<? super Boolean> pVar = this.f29093b;
            if (pVar != null) {
                pVar.mo23862b(l0Var, i);
            }
        }

        @C12580l
        /* renamed from: c */
        public Object mo23863c(@C12579k C11045c<? super Boolean> cVar) {
            C11754l lVar;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            C11754l lVar2 = (C11754l) BufferedChannel.f29085w.get(bufferedChannel);
            while (!bufferedChannel.mo23827e()) {
                long andIncrement = BufferedChannel.f29081e.getAndIncrement(bufferedChannel);
                int i = BufferedChannelKt.f29117b;
                long j = andIncrement / ((long) i);
                int i2 = (int) (andIncrement % ((long) i));
                if (lVar2.f29607c != j) {
                    C11754l b = bufferedChannel.mo23820a0(j, lVar2);
                    if (b == null) {
                        continue;
                    } else {
                        lVar = b;
                    }
                } else {
                    lVar = lVar2;
                }
                Object C = bufferedChannel.mo23771D1(lVar, i2, andIncrement, (Object) null);
                if (C == BufferedChannelKt.f29130o) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (C == BufferedChannelKt.f29132q) {
                    if (andIncrement < bufferedChannel.mo23846r0()) {
                        lVar.mo24349b();
                    }
                    lVar2 = lVar;
                } else if (C == BufferedChannelKt.f29131p) {
                    return mo23864h(lVar, i2, andIncrement, cVar);
                } else {
                    lVar.mo24349b();
                    this.f29092a = C;
                    return C11064a.m42615a(true);
                }
            }
            return C11064a.m42615a(mo23865i());
        }

        /* renamed from: h */
        public final Object mo23864h(C11754l<E> lVar, int i, long j, C11045c<? super Boolean> cVar) {
            Boolean a;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            C12078p<? super Boolean> b = C12089r.m48295b(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
            try {
                this.f29093b = b;
                Object C = bufferedChannel.mo23771D1(lVar, i, j, this);
                if (C == BufferedChannelKt.f29130o) {
                    bufferedChannel.mo23810V0(this, lVar, i);
                } else {
                    C11300l<Throwable, C11079d2> lVar2 = null;
                    if (C == BufferedChannelKt.f29132q) {
                        if (j < bufferedChannel.mo23846r0()) {
                            lVar.mo24349b();
                        }
                        C11754l lVar3 = (C11754l) BufferedChannel.f29085w.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.mo23827e()) {
                                mo23866j();
                                break;
                            }
                            long andIncrement = BufferedChannel.f29081e.getAndIncrement(bufferedChannel);
                            int i2 = BufferedChannelKt.f29117b;
                            long j2 = andIncrement / ((long) i2);
                            int i3 = (int) (andIncrement % ((long) i2));
                            if (lVar3.f29607c != j2) {
                                C11754l b2 = bufferedChannel.mo23820a0(j2, lVar3);
                                if (b2 != null) {
                                    lVar3 = b2;
                                }
                            }
                            Object C2 = bufferedChannel.mo23771D1(lVar3, i3, andIncrement, this);
                            if (C2 == BufferedChannelKt.f29130o) {
                                bufferedChannel.mo23810V0(this, lVar3, i3);
                                break;
                            } else if (C2 == BufferedChannelKt.f29132q) {
                                if (andIncrement < bufferedChannel.mo23846r0()) {
                                    lVar3.mo24349b();
                                }
                            } else if (C2 != BufferedChannelKt.f29131p) {
                                lVar3.mo24349b();
                                this.f29092a = C2;
                                this.f29093b = null;
                                a = C11064a.m42615a(true);
                                C11300l<E, C11079d2> lVar4 = bufferedChannel.f29090b;
                                if (lVar4 != null) {
                                    lVar2 = OnUndeliveredElementKt.m47762a(lVar4, C2, b.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        lVar.mo24349b();
                        this.f29092a = C;
                        this.f29093b = null;
                        a = C11064a.m42615a(true);
                        C11300l<E, C11079d2> lVar5 = bufferedChannel.f29090b;
                        if (lVar5 != null) {
                            lVar2 = OnUndeliveredElementKt.m47762a(lVar5, C, b.getContext());
                        }
                    }
                    b.mo24532O(a, lVar2);
                }
                Object y = b.mo24572y();
                if (y == C11063b.m42612h()) {
                    C11069f.m42638c(cVar);
                }
                return y;
            } catch (Throwable th) {
                b.mo24552M();
                throw th;
            }
        }

        /* renamed from: i */
        public final boolean mo23865i() {
            this.f29092a = BufferedChannelKt.m46421z();
            Throwable g0 = BufferedChannel.this.mo23831g0();
            if (g0 == null) {
                return false;
            }
            throw C12007n0.m47912o(g0);
        }

        /* renamed from: j */
        public final void mo23866j() {
            C12078p<? super Boolean> pVar = this.f29093b;
            Intrinsics.checkNotNull(pVar);
            this.f29093b = null;
            this.f29092a = BufferedChannelKt.m46421z();
            Throwable g0 = BufferedChannel.this.mo23831g0();
            if (g0 == null) {
                Result.C10852a aVar = Result.f28060a;
                pVar.resumeWith(Result.m38702b(Boolean.FALSE));
                return;
            }
            Result.C10852a aVar2 = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11661u0.m45734a(g0)));
        }

        /* renamed from: k */
        public final boolean mo23867k(E e) {
            C12078p<? super Boolean> pVar = this.f29093b;
            Intrinsics.checkNotNull(pVar);
            C11300l<Throwable, C11079d2> lVar = null;
            this.f29093b = null;
            this.f29092a = e;
            Boolean bool = Boolean.TRUE;
            C11300l<E, C11079d2> lVar2 = BufferedChannel.this.f29090b;
            if (lVar2 != null) {
                lVar = OnUndeliveredElementKt.m47762a(lVar2, e, pVar.getContext());
            }
            return BufferedChannelKt.m46394F(pVar, bool, lVar);
        }

        /* renamed from: l */
        public final void mo23868l() {
            C12078p<? super Boolean> pVar = this.f29093b;
            Intrinsics.checkNotNull(pVar);
            this.f29093b = null;
            this.f29092a = BufferedChannelKt.m46421z();
            Throwable g0 = BufferedChannel.this.mo23831g0();
            if (g0 == null) {
                Result.C10852a aVar = Result.f28060a;
                pVar.resumeWith(Result.m38702b(Boolean.FALSE));
                return;
            }
            Result.C10852a aVar2 = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11661u0.m45734a(g0)));
        }

        public E next() {
            boolean z;
            E e = this.f29092a;
            if (e != BufferedChannelKt.f29139x) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f29092a = BufferedChannelKt.f29139x;
                if (e != BufferedChannelKt.m46421z()) {
                    return e;
                }
                throw C12007n0.m47912o(BufferedChannel.this.mo23842o0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: kotlinx.coroutines.channels.BufferedChannel$b */
    public static final class C11732b implements C12077o3 {
        @C12579k

        /* renamed from: a */
        public final C12072o<Boolean> f29095a;

        /* renamed from: b */
        public final /* synthetic */ C12078p<Boolean> f29096b;

        public C11732b(@C12579k C12072o<? super Boolean> oVar) {
            this.f29095a = oVar;
            Intrinsics.checkNotNull(oVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.f29096b = (C12078p) oVar;
        }

        @C12579k
        /* renamed from: a */
        public final C12072o<Boolean> mo23870a() {
            return this.f29095a;
        }

        /* renamed from: b */
        public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
            this.f29096b.mo23862b(l0Var, i);
        }
    }

    static {
        Class<BufferedChannel> cls = BufferedChannel.class;
        f29080d = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f29081e = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f29082f = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f29083g = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f29084v = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f29085w = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f29086x = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f29087y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f29088z = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public BufferedChannel(int i, @C12580l C11300l<? super E, C11079d2> lVar) {
        this.f29089a = i;
        this.f29090b = lVar;
        if (i >= 0) {
            this.bufferEnd = BufferedChannelKt.m46393E(i);
            this.completedExpandBuffersAndPauseFlag = mo23830f0();
            C11754l lVar2 = new C11754l(0, (C11754l) null, this, 3);
            this.sendSegment = lVar2;
            this.receiveSegment = lVar2;
            if (mo23773E0()) {
                lVar2 = BufferedChannelKt.f29116a;
                Intrinsics.checkNotNull(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = lVar2;
            this.f29091c = lVar != null ? new C11733xffb418de(this) : null;
            this._closeCause = BufferedChannelKt.f29107A;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    @C12095s1
    /* renamed from: A0 */
    public static /* synthetic */ void m46226A0() {
    }

    @C12095s1
    /* renamed from: D0 */
    public static /* synthetic */ void m46230D0() {
    }

    /* renamed from: G0 */
    private final void m46231G0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: b1 */
    public static /* synthetic */ <E> Object m46233b1(BufferedChannel<E> bufferedChannel, C11045c<? super E> cVar) {
        C11754l lVar;
        C11754l lVar2 = (C11754l) f29085w.get(bufferedChannel);
        while (!bufferedChannel.mo23827e()) {
            long andIncrement = f29081e.getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.f29117b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (lVar2.f29607c != j) {
                C11754l b = bufferedChannel.mo23820a0(j, lVar2);
                if (b == null) {
                    continue;
                } else {
                    lVar = b;
                }
            } else {
                lVar = lVar2;
            }
            Object C = bufferedChannel.mo23771D1(lVar, i2, andIncrement, (Object) null);
            if (C == BufferedChannelKt.f29130o) {
                throw new IllegalStateException("unexpected".toString());
            } else if (C == BufferedChannelKt.f29132q) {
                if (andIncrement < bufferedChannel.mo23846r0()) {
                    lVar.mo24349b();
                }
                lVar2 = lVar;
            } else if (C == BufferedChannelKt.f29131p) {
                return bufferedChannel.mo23834h1(lVar, i2, andIncrement, cVar);
            } else {
                lVar.mo24349b();
                return C;
            }
        }
        throw C12007n0.m47912o(bufferedChannel.mo23842o0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ <E> java.lang.Object m46234c1(kotlinx.coroutines.channels.BufferedChannel<E> r14, kotlin.coroutines.C11045c<? super kotlinx.coroutines.channels.C11749j<? extends E>> r15) {
        /*
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r14, r15)
        L_0x0018:
            r6 = r0
            java.lang.Object r15 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            kotlin.C11661u0.m45747n(r15)
            kotlinx.coroutines.channels.j r15 = (kotlinx.coroutines.channels.C11749j) r15
            java.lang.Object r14 = r15.mo23920o()
            goto L_0x00b6
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            kotlin.C11661u0.m45747n(r15)
            r15 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29085w
            java.lang.Object r1 = r1.get(r14)
            kotlinx.coroutines.channels.l r1 = (kotlinx.coroutines.channels.C11754l) r1
        L_0x0047:
            boolean r3 = r14.mo23827e()
            if (r3 == 0) goto L_0x0059
            kotlinx.coroutines.channels.j$b r15 = kotlinx.coroutines.channels.C11749j.f29170b
            java.lang.Throwable r14 = r14.mo23831g0()
            java.lang.Object r14 = r15.mo23925a(r14)
            goto L_0x00b6
        L_0x0059:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f29081e
            long r4 = r3.getAndIncrement(r14)
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r7 = (long) r3
            long r7 = r4 / r7
            long r9 = (long) r3
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r1.f29607c
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0079
            kotlinx.coroutines.channels.l r7 = r14.mo23820a0(r7, r1)
            if (r7 != 0) goto L_0x0077
            goto L_0x0047
        L_0x0077:
            r13 = r7
            goto L_0x007a
        L_0x0079:
            r13 = r1
        L_0x007a:
            r7 = r14
            r8 = r13
            r9 = r3
            r10 = r4
            r12 = r15
            java.lang.Object r1 = r7.mo23771D1(r8, r9, r10, r12)
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29130o
            if (r1 == r7) goto L_0x00b7
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29132q
            if (r1 != r7) goto L_0x009c
            long r7 = r14.mo23846r0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x009a
            r13.mo24349b()
        L_0x009a:
            r1 = r13
            goto L_0x0047
        L_0x009c:
            kotlinx.coroutines.internal.o0 r15 = kotlinx.coroutines.channels.BufferedChannelKt.f29131p
            if (r1 != r15) goto L_0x00ad
            r6.label = r2
            r1 = r14
            r2 = r13
            java.lang.Object r14 = r1.mo23826d1(r2, r3, r4, r6)
            if (r14 != r0) goto L_0x00b6
            return r0
        L_0x00ad:
            r13.mo24349b()
            kotlinx.coroutines.channels.j$b r14 = kotlinx.coroutines.channels.C11749j.f29170b
            java.lang.Object r14 = r14.mo23927c(r1)
        L_0x00b6:
            return r14
        L_0x00b7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m46234c1(kotlinx.coroutines.channels.BufferedChannel, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f1 */
    public static /* synthetic */ Object m46237f1(BufferedChannel bufferedChannel, Object obj, C11300l lVar, C11305q qVar, C11289a aVar, C11305q qVar2, int i, Object obj2) {
        C12077o3 o3Var;
        if (obj2 == null) {
            if ((i & 16) != 0) {
                qVar2 = BufferedChannel$receiveImpl$1.f29105f;
            }
            C11754l lVar2 = (C11754l) f29085w.get(bufferedChannel);
            while (!bufferedChannel.mo23827e()) {
                long andIncrement = f29081e.getAndIncrement(bufferedChannel);
                int i2 = BufferedChannelKt.f29117b;
                long j = andIncrement / ((long) i2);
                int i3 = (int) (andIncrement % ((long) i2));
                if (lVar2.f29607c != j) {
                    C11754l b = bufferedChannel.mo23820a0(j, lVar2);
                    if (b == null) {
                        continue;
                    } else {
                        lVar2 = b;
                    }
                }
                Object C = bufferedChannel.mo23771D1(lVar2, i3, andIncrement, obj);
                if (C == BufferedChannelKt.f29130o) {
                    if (obj instanceof C12077o3) {
                        o3Var = (C12077o3) obj;
                    } else {
                        o3Var = null;
                    }
                    if (o3Var != null) {
                        bufferedChannel.mo23810V0(o3Var, lVar2, i3);
                    }
                    return qVar.invoke(lVar2, Integer.valueOf(i3), Long.valueOf(andIncrement));
                } else if (C == BufferedChannelKt.f29132q) {
                    if (andIncrement < bufferedChannel.mo23846r0()) {
                        lVar2.mo24349b();
                    }
                } else if (C == BufferedChannelKt.f29131p) {
                    return qVar2.invoke(lVar2, Integer.valueOf(i3), Long.valueOf(andIncrement));
                } else {
                    lVar2.mo24349b();
                    return lVar.invoke(C);
                }
            }
            return aVar.invoke();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m46240j0() {
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m46242k0() {
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m46244l0() {
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m46246m0() {
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m46248n0() {
    }

    /* renamed from: o1 */
    public static /* synthetic */ <E> Object m46250o1(BufferedChannel<E> bufferedChannel, E e, C11045c<? super C11079d2> cVar) {
        C11754l lVar;
        BufferedChannel<E> bufferedChannel2 = bufferedChannel;
        C11754l lVar2 = (C11754l) f29084v.get(bufferedChannel);
        while (true) {
            long andIncrement = f29080d.getAndIncrement(bufferedChannel);
            long j = andIncrement & BufferedChannelKt.f29113G;
            boolean m = bufferedChannel.mo23767B0(andIncrement);
            int i = BufferedChannelKt.f29117b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (lVar2.f29607c != j2) {
                C11754l d = bufferedChannel.mo23822b0(j2, lVar2);
                if (d != null) {
                    lVar = d;
                } else if (m) {
                    Object R0 = bufferedChannel.mo23802R0(e, cVar);
                    if (R0 == C11063b.m42612h()) {
                        return R0;
                    }
                }
            } else {
                lVar = lVar2;
            }
            int D = bufferedChannel.mo23776F1(lVar, i2, e, j, (Object) null, m);
            if (D == 0) {
                lVar.mo24349b();
                break;
            } else if (D == 1) {
                break;
            } else if (D != 2) {
                if (D == 3) {
                    Object u1 = bufferedChannel.mo23851u1(lVar, i2, e, j, cVar);
                    if (u1 == C11063b.m42612h()) {
                        return u1;
                    }
                } else if (D != 4) {
                    if (D == 5) {
                        lVar.mo24349b();
                    }
                    lVar2 = lVar;
                } else {
                    if (j < bufferedChannel.mo23843p0()) {
                        lVar.mo24349b();
                    }
                    Object R02 = bufferedChannel.mo23802R0(e, cVar);
                    if (R02 == C11063b.m42612h()) {
                        return R02;
                    }
                }
            } else if (m) {
                lVar.mo24381r();
                Object R03 = bufferedChannel.mo23802R0(e, cVar);
                if (R03 == C11063b.m42612h()) {
                    return R03;
                }
            }
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        r0 = kotlin.Result.f28060a;
        r9.resumeWith(kotlin.Result.m38702b(kotlin.coroutines.jvm.internal.C11064a.m42615a(true)));
     */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ <E> java.lang.Object m46253q1(kotlinx.coroutines.channels.BufferedChannel<E> r18, E r19, kotlin.coroutines.C11045c<? super java.lang.Boolean> r20) {
        /*
            r8 = r18
            kotlinx.coroutines.p r9 = new kotlinx.coroutines.p
            kotlin.coroutines.c r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.mo24537e0()
            kotlin.jvm.functions.l<E, kotlin.d2> r0 = r8.f29090b
            r11 = 0
            if (r0 != 0) goto L_0x0016
            r0 = r10
            goto L_0x0017
        L_0x0016:
            r0 = r11
        L_0x0017:
            if (r0 == 0) goto L_0x00d1
            kotlinx.coroutines.channels.BufferedChannel$b r12 = new kotlinx.coroutines.channels.BufferedChannel$b
            r12.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29084v
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
        L_0x0028:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f29080d
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r1 & r3
            boolean r15 = r8.mo23767B0(r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r2 = (long) r1
            long r2 = r13 / r2
            long r4 = (long) r1
            long r4 = r13 % r4
            int r7 = (int) r4
            long r4 = r0.f29607c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            kotlinx.coroutines.channels.l r1 = r8.mo23822b0(r2, r0)
            if (r1 != 0) goto L_0x0053
            if (r15 == 0) goto L_0x0028
            goto L_0x009b
        L_0x0053:
            r6 = r1
            goto L_0x0056
        L_0x0055:
            r6 = r0
        L_0x0056:
            r0 = r18
            r1 = r6
            r2 = r7
            r3 = r19
            r4 = r13
            r16 = r6
            r6 = r12
            r17 = r7
            r7 = r15
            int r0 = r0.mo23776F1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b1
            if (r0 == r10) goto L_0x00b6
            r1 = 2
            if (r0 == r1) goto L_0x0096
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r1 = 4
            if (r0 == r1) goto L_0x007e
            r1 = 5
            if (r0 == r1) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            r16.mo24349b()
        L_0x007b:
            r0 = r16
            goto L_0x0028
        L_0x007e:
            long r0 = r18.mo23843p0()
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            r16.mo24349b()
            goto L_0x009b
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0096:
            if (r15 == 0) goto L_0x00a9
            r16.mo24381r()
        L_0x009b:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r11)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            r9.resumeWith(r0)
            goto L_0x00c3
        L_0x00a9:
            r1 = r16
            r0 = r17
            r8.mo23812W0(r12, r1, r0)
            goto L_0x00c3
        L_0x00b1:
            r1 = r16
            r1.mo24349b()
        L_0x00b6:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r10)
            java.lang.Object r0 = kotlin.Result.m38702b(r0)
            r9.resumeWith(r0)
        L_0x00c3:
            java.lang.Object r0 = r9.mo24572y()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r0 != r1) goto L_0x00d0
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r20)
        L_0x00d0:
            return r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m46253q1(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: s1 */
    public static /* synthetic */ Object m46256s1(BufferedChannel bufferedChannel, Object obj, Object obj2, C11289a aVar, C11304p pVar, C11289a aVar2, C11306r rVar, int i, Object obj3) {
        BufferedChannel$sendImpl$1 bufferedChannel$sendImpl$1;
        C11754l lVar;
        C12077o3 o3Var;
        BufferedChannel bufferedChannel2 = bufferedChannel;
        Object obj4 = obj2;
        if (obj3 == null) {
            if ((i & 32) != 0) {
                bufferedChannel$sendImpl$1 = BufferedChannel$sendImpl$1.f29106f;
            } else {
                bufferedChannel$sendImpl$1 = rVar;
            }
            C11754l lVar2 = (C11754l) f29084v.get(bufferedChannel2);
            while (true) {
                long andIncrement = f29080d.getAndIncrement(bufferedChannel2);
                long j = andIncrement & BufferedChannelKt.f29113G;
                boolean m = bufferedChannel2.mo23767B0(andIncrement);
                int i2 = BufferedChannelKt.f29117b;
                long j2 = j / ((long) i2);
                int i3 = (int) (j % ((long) i2));
                if (lVar2.f29607c != j2) {
                    C11754l d = bufferedChannel2.mo23822b0(j2, lVar2);
                    if (d != null) {
                        lVar = d;
                    } else if (m) {
                        return aVar2.invoke();
                    }
                } else {
                    lVar = lVar2;
                }
                int D = bufferedChannel.mo23776F1(lVar, i3, obj, j, obj2, m);
                if (D == 0) {
                    lVar.mo24349b();
                    return aVar.invoke();
                } else if (D == 1) {
                    return aVar.invoke();
                } else {
                    if (D != 2) {
                        if (D == 3) {
                            return bufferedChannel$sendImpl$1.invoke(lVar, Integer.valueOf(i3), obj, Long.valueOf(j));
                        } else if (D != 4) {
                            if (D == 5) {
                                lVar.mo24349b();
                            }
                            lVar2 = lVar;
                        } else {
                            if (j < bufferedChannel.mo23843p0()) {
                                lVar.mo24349b();
                            }
                            return aVar2.invoke();
                        }
                    } else if (m) {
                        lVar.mo24381r();
                        return aVar2.invoke();
                    } else {
                        if (obj4 instanceof C12077o3) {
                            o3Var = (C12077o3) obj4;
                        } else {
                            o3Var = null;
                        }
                        if (o3Var != null) {
                            bufferedChannel2.mo23812W0(o3Var, lVar, i3);
                        }
                        return pVar.invoke(lVar, Integer.valueOf(i3));
                    }
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m46259u0(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 1;
            }
            bufferedChannel.mo23849t0(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    @C12095s1
    /* renamed from: y0 */
    public static /* synthetic */ void m46264y0() {
    }

    /* renamed from: A1 */
    public final void mo23766A1(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, Long> lVar, Object obj) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, lVar.invoke(Long.valueOf(j)).longValue()));
    }

    /* renamed from: B0 */
    public final boolean mo23767B0(long j) {
        return mo23856x0(j, false);
    }

    /* renamed from: B1 */
    public final boolean mo23768B1(C11754l<E> lVar, int i, long j) {
        Object y = lVar.mo23939y(i);
        if (!(y instanceof C12077o3) || j < f29081e.get(this) || !lVar.mo23934t(i, y, BufferedChannelKt.f29124i)) {
            return mo23770C1(lVar, i, j);
        }
        if (mo23860z1(y, lVar, i)) {
            lVar.mo23930C(i, BufferedChannelKt.f29121f);
            return true;
        }
        lVar.mo23930C(i, BufferedChannelKt.f29127l);
        lVar.mo23940z(i, false);
        return false;
    }

    /* renamed from: C0 */
    public boolean mo23769C0() {
        return false;
    }

    /* renamed from: C1 */
    public final boolean mo23770C1(C11754l<E> lVar, int i, long j) {
        while (true) {
            Object y = lVar.mo23939y(i);
            if (y instanceof C12077o3) {
                if (j < f29081e.get(this)) {
                    if (lVar.mo23934t(i, y, new C11765u((C12077o3) y))) {
                        return true;
                    }
                } else if (lVar.mo23934t(i, y, BufferedChannelKt.f29124i)) {
                    if (mo23860z1(y, lVar, i)) {
                        lVar.mo23930C(i, BufferedChannelKt.f29121f);
                        return true;
                    }
                    lVar.mo23930C(i, BufferedChannelKt.f29127l);
                    lVar.mo23940z(i, false);
                    return false;
                }
            } else if (y == BufferedChannelKt.f29127l) {
                return false;
            } else {
                if (y == null) {
                    if (lVar.mo23934t(i, y, BufferedChannelKt.f29122g)) {
                        return true;
                    }
                } else if (y == BufferedChannelKt.f29121f || y == BufferedChannelKt.f29125j || y == BufferedChannelKt.f29126k || y == BufferedChannelKt.f29128m || y == BufferedChannelKt.m46421z()) {
                    return true;
                } else {
                    if (y != BufferedChannelKt.f29123h) {
                        throw new IllegalStateException(("Unexpected cell state: " + y).toString());
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: D1 */
    public final Object mo23771D1(C11754l<E> lVar, int i, long j, Object obj) {
        Object y = lVar.mo23939y(i);
        if (y == null) {
            if (j >= (f29080d.get(this) & BufferedChannelKt.f29113G)) {
                if (obj == null) {
                    return BufferedChannelKt.f29131p;
                }
                if (lVar.mo23934t(i, y, obj)) {
                    mo23803S();
                    return BufferedChannelKt.f29130o;
                }
            }
        } else if (y == BufferedChannelKt.f29121f && lVar.mo23934t(i, y, BufferedChannelKt.f29126k)) {
            mo23803S();
            return lVar.mo23928A(i);
        }
        return mo23774E1(lVar, i, j, obj);
    }

    /* renamed from: E */
    public final boolean mo23772E(long j) {
        return j < mo23830f0() || j < mo23843p0() + ((long) this.f29089a);
    }

    /* renamed from: E0 */
    public final boolean mo23773E0() {
        long f0 = mo23830f0();
        return f0 == 0 || f0 == Long.MAX_VALUE;
    }

    /* renamed from: E1 */
    public final Object mo23774E1(C11754l<E> lVar, int i, long j, Object obj) {
        while (true) {
            Object y = lVar.mo23939y(i);
            if (y == null || y == BufferedChannelKt.f29122g) {
                if (j < (f29080d.get(this) & BufferedChannelKt.f29113G)) {
                    if (lVar.mo23934t(i, y, BufferedChannelKt.f29125j)) {
                        mo23803S();
                        return BufferedChannelKt.f29132q;
                    }
                } else if (obj == null) {
                    return BufferedChannelKt.f29131p;
                } else {
                    if (lVar.mo23934t(i, y, obj)) {
                        mo23803S();
                        return BufferedChannelKt.f29130o;
                    }
                }
            } else if (y == BufferedChannelKt.f29121f) {
                if (lVar.mo23934t(i, y, BufferedChannelKt.f29126k)) {
                    mo23803S();
                    return lVar.mo23928A(i);
                }
            } else if (y == BufferedChannelKt.f29127l) {
                return BufferedChannelKt.f29132q;
            } else {
                if (y == BufferedChannelKt.f29125j) {
                    return BufferedChannelKt.f29132q;
                }
                if (y == BufferedChannelKt.m46421z()) {
                    mo23803S();
                    return BufferedChannelKt.f29132q;
                } else if (y != BufferedChannelKt.f29124i && lVar.mo23934t(i, y, BufferedChannelKt.f29123h)) {
                    boolean z = y instanceof C11765u;
                    if (z) {
                        y = ((C11765u) y).f29182a;
                    }
                    if (mo23860z1(y, lVar, i)) {
                        lVar.mo23930C(i, BufferedChannelKt.f29126k);
                        mo23803S();
                        return lVar.mo23928A(i);
                    }
                    lVar.mo23930C(i, BufferedChannelKt.f29127l);
                    lVar.mo23940z(i, false);
                    if (z) {
                        mo23803S();
                    }
                    return BufferedChannelKt.f29132q;
                }
            }
        }
    }

    /* renamed from: F */
    public boolean mo23750F(@C12580l Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return mo23793N(th, true);
    }

    /* renamed from: F0 */
    public final void mo23775F0(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* renamed from: F1 */
    public final int mo23776F1(C11754l<E> lVar, int i, E e, long j, Object obj, boolean z) {
        lVar.mo23931D(i, e);
        if (z) {
            return mo23778G1(lVar, i, e, j, obj, z);
        }
        Object y = lVar.mo23939y(i);
        if (y == null) {
            if (mo23772E(j)) {
                if (lVar.mo23934t(i, (Object) null, BufferedChannelKt.f29121f)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (lVar.mo23934t(i, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (y instanceof C12077o3) {
            lVar.mo23935u(i);
            if (mo23858y1(y, e)) {
                lVar.mo23930C(i, BufferedChannelKt.f29126k);
                mo23806T0();
                return 0;
            }
            if (lVar.mo23936v(i, BufferedChannelKt.f29128m) != BufferedChannelKt.f29128m) {
                lVar.mo23940z(i, true);
            }
            return 5;
        }
        return mo23778G1(lVar, i, e, j, obj, z);
    }

    /* renamed from: G */
    public final void mo23777G(C11754l<E> lVar, long j) {
        Object c = C12008o.m47919c((Object) null, 1, (DefaultConstructorMarker) null);
        loop0:
        while (lVar != null) {
            for (int i = BufferedChannelKt.f29117b - 1; -1 < i; i--) {
                if ((lVar.f29607c * ((long) BufferedChannelKt.f29117b)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object y = lVar.mo23939y(i);
                    if (y == null || y == BufferedChannelKt.f29122g) {
                        if (lVar.mo23934t(i, y, BufferedChannelKt.m46421z())) {
                            lVar.mo24381r();
                            break;
                        }
                    } else if (y instanceof C11765u) {
                        if (lVar.mo23934t(i, y, BufferedChannelKt.m46421z())) {
                            c = C12008o.m47924h(c, ((C11765u) y).f29182a);
                            lVar.mo23940z(i, true);
                            break;
                        }
                    } else if (!(y instanceof C12077o3)) {
                        break;
                    } else if (lVar.mo23934t(i, y, BufferedChannelKt.m46421z())) {
                        c = C12008o.m47924h(c, y);
                        lVar.mo23940z(i, true);
                        break;
                    }
                }
            }
            lVar = (C11754l) lVar.mo24354g();
        }
        if (c == null) {
            return;
        }
        if (!(c instanceof ArrayList)) {
            mo23839l1((C12077o3) c);
            return;
        }
        Intrinsics.checkNotNull(c, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) c;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            mo23839l1((C12077o3) arrayList.get(size));
        }
    }

    /* renamed from: G1 */
    public final int mo23778G1(C11754l<E> lVar, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object y = lVar.mo23939y(i);
            if (y == null) {
                if (!mo23772E(j) || z) {
                    if (z) {
                        if (lVar.mo23934t(i, (Object) null, BufferedChannelKt.f29127l)) {
                            lVar.mo23940z(i, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (lVar.mo23934t(i, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (lVar.mo23934t(i, (Object) null, BufferedChannelKt.f29121f)) {
                    return 1;
                }
            } else if (y == BufferedChannelKt.f29122g) {
                if (lVar.mo23934t(i, y, BufferedChannelKt.f29121f)) {
                    return 1;
                }
            } else if (y == BufferedChannelKt.f29128m) {
                lVar.mo23935u(i);
                return 5;
            } else if (y == BufferedChannelKt.f29125j) {
                lVar.mo23935u(i);
                return 5;
            } else if (y == BufferedChannelKt.m46421z()) {
                lVar.mo23935u(i);
                mo23799Q();
                return 4;
            } else {
                lVar.mo23935u(i);
                if (y instanceof C11765u) {
                    y = ((C11765u) y).f29182a;
                }
                if (mo23858y1(y, e)) {
                    lVar.mo23930C(i, BufferedChannelKt.f29126k);
                    mo23806T0();
                    return 0;
                }
                if (lVar.mo23936v(i, BufferedChannelKt.f29128m) != BufferedChannelKt.f29128m) {
                    lVar.mo23940z(i, true);
                }
                return 5;
            }
        }
    }

    /* renamed from: H */
    public void mo23779H(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29088z;
        if (!C16563a.m75000a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != BufferedChannelKt.f29140y) {
                    if (obj == BufferedChannelKt.f29141z) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!C16563a.m75000a(f29088z, this, BufferedChannelKt.f29140y, BufferedChannelKt.f29141z));
            lVar.invoke(mo23831g0());
        }
    }

    /* renamed from: H0 */
    public final long mo23780H0(C11754l<E> lVar) {
        do {
            int i = BufferedChannelKt.f29117b;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (lVar.f29607c * ((long) BufferedChannelKt.f29117b)) + ((long) i);
                    if (j < mo23843p0()) {
                        return -1;
                    }
                    while (true) {
                        Object y = lVar.mo23939y(i);
                        if (y == null || y == BufferedChannelKt.f29122g) {
                            if (lVar.mo23934t(i, y, BufferedChannelKt.m46421z())) {
                                lVar.mo24381r();
                                break;
                            }
                        } else if (y == BufferedChannelKt.f29121f) {
                            return j;
                        }
                    }
                } else {
                    lVar = (C11754l) lVar.mo24354g();
                }
            }
        } while (lVar != null);
        return -1;
    }

    /* renamed from: H1 */
    public final void mo23781H1(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29081e;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j || f29081e.compareAndSet(this, j2, j)) {
            }
            j2 = atomicLongFieldUpdater.get(this);
            return;
        } while (f29081e.compareAndSet(this, j2, j));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @C11587t0(expression = "tryReceive().getOrNull()", imports = {}))
    @C12580l
    /* renamed from: I */
    public E mo23782I() {
        return C11744g.C11745a.m46598d(this);
    }

    /* renamed from: I0 */
    public final void mo23783I0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29080d;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.m46418w(BufferedChannelKt.f29113G & j, 1)));
    }

    /* renamed from: I1 */
    public final void mo23784I1(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29080d;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = BufferedChannelKt.f29113G & j2;
            if (j3 < j) {
            } else {
                return;
            }
        } while (!f29080d.compareAndSet(this, j2, BufferedChannelKt.m46418w(j3, (int) (j2 >> 60))));
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [java.lang.Object, kotlinx.coroutines.internal.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23785J() {
        /*
            r10 = this;
            boolean r0 = r10.mo23773E0()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29086x
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.l r3 = kotlinx.coroutines.channels.BufferedChannelKt.f29116a
            if (r0 != r3) goto L_0x0016
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r1
        L_0x0017:
            if (r0 == 0) goto L_0x001a
            goto L_0x0052
        L_0x001a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0035:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29085w
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
            long r3 = r0.f29607c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29086x
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
            long r5 = r0.f29607c
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x004f
            r0 = r2
            goto L_0x0050
        L_0x004f:
            r0 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x022b
        L_0x0052:
            r0 = 3
            kotlinx.coroutines.channels.l[] r0 = new kotlinx.coroutines.channels.C11754l[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29085w
            java.lang.Object r3 = r3.get(r10)
            r0[r1] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29084v
            java.lang.Object r3 = r3.get(r10)
            r0[r2] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29086x
            java.lang.Object r3 = r3.get(r10)
            r4 = 2
            r0[r4] = r3
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x007d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0099
            java.lang.Object r4 = r0.next()
            r5 = r4
            kotlinx.coroutines.channels.l r5 = (kotlinx.coroutines.channels.C11754l) r5
            kotlinx.coroutines.channels.l r6 = kotlinx.coroutines.channels.BufferedChannelKt.f29116a
            if (r5 == r6) goto L_0x0092
            r5 = r2
            goto L_0x0093
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r5 == 0) goto L_0x007d
            r3.add(r4)
            goto L_0x007d
        L_0x0099:
            java.util.Iterator r0 = r3.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0225
            java.lang.Object r3 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L_0x00ae
            goto L_0x00c8
        L_0x00ae:
            r4 = r3
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C11754l) r4
            long r4 = r4.f29607c
        L_0x00b3:
            java.lang.Object r6 = r0.next()
            r7 = r6
            kotlinx.coroutines.channels.l r7 = (kotlinx.coroutines.channels.C11754l) r7
            long r7 = r7.f29607c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c2
            r3 = r6
            r4 = r7
        L_0x00c2:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L_0x00b3
        L_0x00c8:
            kotlinx.coroutines.channels.l r3 = (kotlinx.coroutines.channels.C11754l) r3
            kotlinx.coroutines.internal.f r0 = r3.mo24354g()
            if (r0 != 0) goto L_0x00d2
            r0 = r2
            goto L_0x00d3
        L_0x00d2:
            r0 = r1
        L_0x00d3:
            if (r0 == 0) goto L_0x020a
        L_0x00d5:
            kotlinx.coroutines.internal.f r0 = r3.mo24352e()
            if (r0 == 0) goto L_0x0209
            kotlinx.coroutines.internal.f r0 = r3.mo24352e()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
            kotlinx.coroutines.internal.f r0 = r0.mo24354g()
            if (r0 == 0) goto L_0x00fc
            kotlinx.coroutines.internal.f r0 = r3.mo24352e()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
            kotlinx.coroutines.internal.f r0 = r0.mo24354g()
            if (r0 != r3) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r0 = r1
            goto L_0x00fd
        L_0x00fc:
            r0 = r2
        L_0x00fd:
            if (r0 == 0) goto L_0x01ee
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            r4 = r1
            r5 = r4
        L_0x0103:
            if (r4 >= r0) goto L_0x01a4
            java.lang.Object r6 = r3.mo23939y(r4)
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29121f
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 != 0) goto L_0x01a0
            boolean r7 = r6 instanceof kotlinx.coroutines.C12077o3
            if (r7 != 0) goto L_0x01a0
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29128m
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0121
            r7 = r2
            goto L_0x0129
        L_0x0121:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29127l
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
        L_0x0129:
            if (r7 == 0) goto L_0x012d
            r7 = r2
            goto L_0x0135
        L_0x012d:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.m46421z()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
        L_0x0135:
            java.lang.String r8 = "Check failed."
            if (r7 == 0) goto L_0x0151
            java.lang.Object r6 = r3.mo23938x(r4)
            if (r6 != 0) goto L_0x0141
            r6 = r2
            goto L_0x0142
        L_0x0141:
            r6 = r1
        L_0x0142:
            if (r6 == 0) goto L_0x0147
            int r5 = r5 + 1
            goto L_0x01a0
        L_0x0147:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x0151:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29125j
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x015d
            r7 = r2
            goto L_0x0165
        L_0x015d:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29126k
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
        L_0x0165:
            if (r7 == 0) goto L_0x017d
            java.lang.Object r6 = r3.mo23938x(r4)
            if (r6 != 0) goto L_0x016f
            r6 = r2
            goto L_0x0170
        L_0x016f:
            r6 = r1
        L_0x0170:
            if (r6 == 0) goto L_0x0173
            goto L_0x01a0
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r8.toString()
            r0.<init>(r1)
            throw r0
        L_0x017d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected segment cell state: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ".\nChannel state: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            int r4 = r4 + 1
            goto L_0x0103
        L_0x01a4:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            if (r5 != r0) goto L_0x01e2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29085w
            java.lang.Object r0 = r0.get(r10)
            if (r3 == r0) goto L_0x01c3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29084v
            java.lang.Object r0 = r0.get(r10)
            if (r3 == r0) goto L_0x01c3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29086x
            java.lang.Object r0 = r0.get(r10)
            if (r3 != r0) goto L_0x01c1
            goto L_0x01c3
        L_0x01c1:
            r0 = r1
            goto L_0x01c4
        L_0x01c3:
            r0 = r2
        L_0x01c4:
            if (r0 == 0) goto L_0x01c7
            goto L_0x01e2
        L_0x01c7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Logically removed segment is reachable.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01e2:
            kotlinx.coroutines.internal.f r0 = r3.mo24352e()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r3 = r0
            kotlinx.coroutines.channels.l r3 = (kotlinx.coroutines.channels.C11754l) r3
            goto L_0x00d5
        L_0x01ee:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "The `segment.next.prev === segment` invariant is violated.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0209:
            return
        L_0x020a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0225:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x022b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "bufferEndSegment should not have lower id than receiveSegment.\nChannel state: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23785J():void");
    }

    /* renamed from: J0 */
    public final void mo23786J0() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29080d;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.m46418w(BufferedChannelKt.f29113G & j, 3)));
    }

    /* renamed from: J1 */
    public final void mo23787J1(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long j3;
        if (!mo23773E0()) {
            do {
            } while (mo23830f0() <= j);
            int g = BufferedChannelKt.f29118c;
            int i = 0;
            while (i < g) {
                long f0 = mo23830f0();
                if (f0 != (4611686018427387903L & f29083g.get(this)) || f0 != mo23830f0()) {
                    i++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f29083g;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, BufferedChannelKt.m46417v(j2 & 4611686018427387903L, true)));
            while (true) {
                long f02 = mo23830f0();
                atomicLongFieldUpdater = f29083g;
                long j4 = atomicLongFieldUpdater.get(this);
                long j5 = j4 & 4611686018427387903L;
                if ((BufferedChannelKt.f29114H & j4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (f02 == j5 && f02 == mo23830f0()) {
                    break;
                } else if (!z) {
                    atomicLongFieldUpdater.compareAndSet(this, j4, BufferedChannelKt.m46417v(j5, true));
                }
            }
            do {
                j3 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, BufferedChannelKt.m46417v(j3 & 4611686018427387903L, false)));
        }
    }

    /* renamed from: K */
    public final C11754l<E> mo23788K() {
        C11754l lVar = f29086x.get(this);
        C11754l lVar2 = (C11754l) f29084v.get(this);
        if (lVar2.f29607c > ((C11754l) lVar).f29607c) {
            lVar = lVar2;
        }
        C11754l lVar3 = (C11754l) f29085w.get(this);
        if (lVar3.f29607c > ((C11754l) lVar).f29607c) {
            lVar = lVar3;
        }
        return (C11754l) C11988e.m47808d((C11990f) lVar);
    }

    /* renamed from: K0 */
    public final void mo23789K0() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29080d;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                j2 = BufferedChannelKt.m46418w(j & BufferedChannelKt.f29113G, 2);
            } else if (i == 1) {
                j2 = BufferedChannelKt.m46418w(j & BufferedChannelKt.f29113G, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return kotlinx.coroutines.channels.C11749j.f29170b.mo23925a(mo23845q0());
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo23751L(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f29080d
            long r0 = r0.get(r14)
            boolean r0 = r14.mo23853v1(r0)
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.channels.j$b r15 = kotlinx.coroutines.channels.C11749j.f29170b
            java.lang.Object r15 = r15.mo23926b()
            return r15
        L_0x0013:
            kotlinx.coroutines.internal.o0 r8 = kotlinx.coroutines.channels.BufferedChannelKt.f29127l
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29084v
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f29080d
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.mo23767B0(r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f29607c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            kotlinx.coroutines.channels.l r1 = r14.mo23822b0(r2, r0)
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0021
            goto L_0x008e
        L_0x004c:
            r13 = r1
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.mo23776F1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            if (r0 == r1) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 4
            if (r0 == r1) goto L_0x0071
            r1 = 5
            if (r0 == r1) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r13.mo24349b()
        L_0x006f:
            r0 = r13
            goto L_0x0021
        L_0x0071:
            long r0 = r14.mo23843p0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            r13.mo24349b()
            goto L_0x008e
        L_0x007d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0089:
            if (r11 == 0) goto L_0x0099
            r13.mo24381r()
        L_0x008e:
            kotlinx.coroutines.channels.j$b r15 = kotlinx.coroutines.channels.C11749j.f29170b
            java.lang.Throwable r0 = r14.mo23845q0()
            java.lang.Object r15 = r15.mo23925a(r0)
            goto L_0x00bb
        L_0x0099:
            boolean r15 = r8 instanceof kotlinx.coroutines.C12077o3
            if (r15 == 0) goto L_0x00a0
            kotlinx.coroutines.o3 r8 = (kotlinx.coroutines.C12077o3) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r14.mo23812W0(r8, r13, r12)
        L_0x00a6:
            r13.mo24381r()
            kotlinx.coroutines.channels.j$b r15 = kotlinx.coroutines.channels.C11749j.f29170b
            java.lang.Object r15 = r15.mo23926b()
            goto L_0x00bb
        L_0x00b0:
            r13.mo24349b()
        L_0x00b3:
            kotlinx.coroutines.channels.j$b r15 = kotlinx.coroutines.channels.C11749j.f29170b
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            java.lang.Object r15 = r15.mo23927c(r0)
        L_0x00bb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23751L(java.lang.Object):java.lang.Object");
    }

    /* renamed from: L0 */
    public final void mo23790L0(long j, C11754l<E> lVar) {
        boolean z;
        C11754l<E> lVar2;
        C11754l<E> lVar3;
        while (lVar.f29607c < j && (lVar3 = (C11754l) lVar.mo24352e()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.mo24355h() || (lVar2 = (C11754l) lVar.mo24352e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29086x;
                while (true) {
                    C12003l0 l0Var = (C12003l0) atomicReferenceFieldUpdater.get(this);
                    z = true;
                    if (l0Var.f29607c >= lVar.f29607c) {
                        break;
                    } else if (!lVar.mo24382s()) {
                        z = false;
                        break;
                    } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, l0Var, lVar)) {
                        if (l0Var.mo24380o()) {
                            l0Var.mo24359l();
                        }
                    } else if (lVar.mo24380o()) {
                        lVar.mo24359l();
                    }
                }
                if (z) {
                    return;
                }
            } else {
                lVar = lVar2;
            }
        }
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @C11587t0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: M */
    public boolean mo23791M(E e) {
        return C11744g.C11745a.m46597c(this, e);
    }

    /* renamed from: M0 */
    public void mo23792M0() {
    }

    /* renamed from: N */
    public boolean mo23793N(@C12580l Throwable th, boolean z) {
        if (z) {
            mo23783I0();
        }
        boolean a = C16563a.m75000a(f29087y, this, BufferedChannelKt.f29107A, th);
        if (z) {
            mo23786J0();
        } else {
            mo23789K0();
        }
        mo23799Q();
        mo23792M0();
        if (a) {
            mo23852v0();
        }
        return a;
    }

    /* renamed from: N0 */
    public final void mo23794N0(C12072o<? super C11749j<? extends E>> oVar) {
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(C11749j.m46631b(C11749j.f29170b.mo23925a(mo23831g0()))));
    }

    /* renamed from: O */
    public final void mo23795O(long j) {
        mo23838k1(mo23797P(j));
    }

    /* renamed from: O0 */
    public final void mo23796O0(C12072o<? super E> oVar) {
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(C11661u0.m45734a(mo23842o0())));
    }

    /* renamed from: P */
    public final C11754l<E> mo23797P(long j) {
        C11754l<E> K = mo23788K();
        if (mo23769C0()) {
            long H0 = mo23780H0(K);
            if (H0 != -1) {
                mo23801R(H0);
            }
        }
        mo23777G(K, j);
        return K;
    }

    /* renamed from: P0 */
    public final void mo23798P0(C12131j<?> jVar) {
        jVar.mo24707e(BufferedChannelKt.m46421z());
    }

    /* renamed from: Q */
    public final void mo23799Q() {
        mo23758i0();
    }

    /* renamed from: Q0 */
    public final void mo23800Q0(E e, C12131j<?> jVar) {
        C11300l<E, C11079d2> lVar = this.f29090b;
        if (lVar != null) {
            OnUndeliveredElementKt.m47763b(lVar, e, jVar.getContext());
        }
        jVar.mo24707e(BufferedChannelKt.m46421z());
    }

    /* renamed from: R */
    public final void mo23801R(long j) {
        UndeliveredElementException d;
        C11754l lVar = (C11754l) f29085w.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29081e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.f29089a) + j2, mo23830f0())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    int i = BufferedChannelKt.f29117b;
                    long j3 = j2 / ((long) i);
                    int i2 = (int) (j2 % ((long) i));
                    if (lVar.f29607c != j3) {
                        C11754l a0 = mo23820a0(j3, lVar);
                        if (a0 == null) {
                            continue;
                        } else {
                            lVar = a0;
                        }
                    }
                    Object D1 = mo23771D1(lVar, i2, j2, (Object) null);
                    if (D1 != BufferedChannelKt.f29132q) {
                        lVar.mo24349b();
                        C11300l<E, C11079d2> lVar2 = this.f29090b;
                        if (!(lVar2 == null || (d = OnUndeliveredElementKt.m47765d(lVar2, D1, (UndeliveredElementException) null, 2, (Object) null)) == null)) {
                            throw d;
                        }
                    } else if (j2 < mo23846r0()) {
                        lVar.mo24349b();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: R0 */
    public final Object mo23802R0(E e, C11045c<? super C11079d2> cVar) {
        UndeliveredElementException d;
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C11300l<E, C11079d2> lVar = this.f29090b;
        if (lVar == null || (d = OnUndeliveredElementKt.m47765d(lVar, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            Throwable q0 = mo23845q0();
            Result.C10852a aVar = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11661u0.m45734a(q0)));
        } else {
            C11414o.m43942a(d, mo23845q0());
            Result.C10852a aVar2 = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11661u0.m45734a(d)));
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: S */
    public final void mo23803S() {
        if (!mo23773E0()) {
            C11754l lVar = (C11754l) f29086x.get(this);
            while (true) {
                long andIncrement = f29082f.getAndIncrement(this);
                int i = BufferedChannelKt.f29117b;
                long j = andIncrement / ((long) i);
                if (mo23846r0() <= andIncrement) {
                    if (lVar.f29607c < j && lVar.mo24352e() != null) {
                        mo23790L0(j, lVar);
                    }
                    m46259u0(this, 0, 1, (Object) null);
                    return;
                }
                if (lVar.f29607c != j) {
                    C11754l Z = mo23817Z(j, lVar, andIncrement);
                    if (Z == null) {
                        continue;
                    } else {
                        lVar = Z;
                    }
                }
                if (mo23768B1(lVar, (int) (andIncrement % ((long) i)), andIncrement)) {
                    m46259u0(this, 0, 1, (Object) null);
                    return;
                }
                m46259u0(this, 0, 1, (Object) null);
            }
        }
    }

    /* renamed from: S0 */
    public final void mo23804S0(E e, C12072o<? super C11079d2> oVar) {
        C11300l<E, C11079d2> lVar = this.f29090b;
        if (lVar != null) {
            OnUndeliveredElementKt.m47763b(lVar, e, oVar.getContext());
        }
        Throwable q0 = mo23845q0();
        Result.C10852a aVar = Result.f28060a;
        oVar.resumeWith(Result.m38702b(C11661u0.m45734a(q0)));
    }

    @C12579k
    /* renamed from: T */
    public C12126e<E> mo23805T() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.f29097a;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.f29098a;
        Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12127f(this, (C11305q) C11370u0.m43701q(bufferedChannel$onReceive$1, 3), (C11305q) C11370u0.m43701q(bufferedChannel$onReceive$2, 3), this.f29091c);
    }

    /* renamed from: T0 */
    public void mo23806T0() {
    }

    @C12579k
    /* renamed from: U */
    public C12126e<C11749j<E>> mo23807U() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.f29099a;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.f29100a;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12127f(this, (C11305q) C11370u0.m43701q(bufferedChannel$onReceiveCatching$1, 3), (C11305q) C11370u0.m43701q(bufferedChannel$onReceiveCatching$2, 3), this.f29091c);
    }

    /* renamed from: U0 */
    public void mo23808U0() {
    }

    @C12579k
    /* renamed from: V */
    public C12126e<E> mo23809V() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.f29101a;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.f29102a;
        Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12127f(this, (C11305q) C11370u0.m43701q(bufferedChannel$onReceiveOrNull$1, 3), (C11305q) C11370u0.m43701q(bufferedChannel$onReceiveOrNull$2, 3), this.f29091c);
    }

    /* renamed from: V0 */
    public final void mo23810V0(C12077o3 o3Var, C11754l<E> lVar, int i) {
        mo23808U0();
        o3Var.mo23862b(lVar, i);
    }

    @C12579k
    /* renamed from: W */
    public Object mo23811W() {
        C11754l lVar;
        C12077o3 o3Var;
        long j = f29081e.get(this);
        long j2 = f29080d.get(this);
        if (mo23859z0(j2)) {
            return C11749j.f29170b.mo23925a(mo23831g0());
        }
        if (j >= (j2 & BufferedChannelKt.f29113G)) {
            return C11749j.f29170b.mo23926b();
        }
        C12009o0 i = BufferedChannelKt.f29128m;
        C11754l lVar2 = (C11754l) f29085w.get(this);
        while (!mo23827e()) {
            long andIncrement = f29081e.getAndIncrement(this);
            int i2 = BufferedChannelKt.f29117b;
            long j3 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (lVar2.f29607c != j3) {
                C11754l b = mo23820a0(j3, lVar2);
                if (b == null) {
                    continue;
                } else {
                    lVar = b;
                }
            } else {
                lVar = lVar2;
            }
            Object C = mo23771D1(lVar, i3, andIncrement, i);
            if (C == BufferedChannelKt.f29130o) {
                if (i instanceof C12077o3) {
                    o3Var = (C12077o3) i;
                } else {
                    o3Var = null;
                }
                if (o3Var != null) {
                    mo23810V0(o3Var, lVar, i3);
                }
                mo23787J1(andIncrement);
                lVar.mo24381r();
                return C11749j.f29170b.mo23926b();
            } else if (C == BufferedChannelKt.f29132q) {
                if (andIncrement < mo23846r0()) {
                    lVar.mo24349b();
                }
                lVar2 = lVar;
            } else if (C != BufferedChannelKt.f29131p) {
                lVar.mo24349b();
                return C11749j.f29170b.mo23927c(C);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return C11749j.f29170b.mo23925a(mo23831g0());
    }

    /* renamed from: W0 */
    public final void mo23812W0(C12077o3 o3Var, C11754l<E> lVar, int i) {
        o3Var.mo23862b(lVar, i + BufferedChannelKt.f29117b);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @C11587t0(expression = "receiveCatching().getOrNull()", imports = {}))
    @C12580l
    @C11112h
    /* renamed from: X */
    public Object mo23813X(@C12579k C11045c<? super E> cVar) {
        return C11744g.C11745a.m46599e(this, cVar);
    }

    /* renamed from: X0 */
    public final Object mo23814X0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.m46421z()) {
            return obj2;
        }
        throw mo23842o0();
    }

    @C12580l
    /* renamed from: Y */
    public Object mo23815Y(@C12579k C11045c<? super C11749j<? extends E>> cVar) {
        return m46234c1(this, cVar);
    }

    /* renamed from: Y0 */
    public final Object mo23816Y0(Object obj, Object obj2) {
        Object obj3;
        if (obj2 == BufferedChannelKt.m46421z()) {
            obj3 = C11749j.f29170b.mo23925a(mo23831g0());
        } else {
            obj3 = C11749j.f29170b.mo23927c(obj2);
        }
        return C11749j.m46631b(obj3);
    }

    /* renamed from: Z */
    public final C11754l<E> mo23817Z(long j, C11754l<E> lVar, long j2) {
        Object g;
        boolean z;
        long j3 = j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29086x;
        C11304p pVar = (C11304p) BufferedChannelKt.m46420y();
        C11754l<E> lVar2 = lVar;
        do {
            g = C11988e.m47811g(lVar2, j3, pVar);
            if (C12005m0.m47894h(g)) {
                break;
            }
            C12003l0 f = C12005m0.m47892f(g);
            while (true) {
                C12003l0 l0Var = (C12003l0) atomicReferenceFieldUpdater.get(this);
                if (l0Var.f29607c >= f.f29607c) {
                    break;
                } else if (!f.mo24382s()) {
                    z = false;
                    continue;
                    break;
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, l0Var, f)) {
                    if (l0Var.mo24380o()) {
                        l0Var.mo24359l();
                    }
                } else if (f.mo24380o()) {
                    f.mo24359l();
                }
            }
            z = true;
            continue;
        } while (!z);
        if (C12005m0.m47894h(g)) {
            mo23799Q();
            mo23790L0(j, lVar);
            m46259u0(this, 0, 1, (Object) null);
            return null;
        }
        C11754l<E> lVar3 = (C11754l) C12005m0.m47892f(g);
        long j4 = lVar3.f29607c;
        if (j4 <= j3) {
            return lVar3;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29082f;
        int i = BufferedChannelKt.f29117b;
        if (atomicLongFieldUpdater.compareAndSet(this, j2 + 1, ((long) i) * j4)) {
            mo23849t0((lVar3.f29607c * ((long) i)) - j2);
            return null;
        }
        m46259u0(this, 0, 1, (Object) null);
        return null;
    }

    /* renamed from: Z0 */
    public final Object mo23818Z0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.m46421z()) {
            return obj2;
        }
        if (mo23831g0() == null) {
            return null;
        }
        throw mo23842o0();
    }

    /* renamed from: a */
    public final void mo23819a(@C12580l CancellationException cancellationException) {
        mo23750F(cancellationException);
    }

    /* renamed from: a0 */
    public final C11754l<E> mo23820a0(long j, C11754l<E> lVar) {
        Object g;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29085w;
        C11304p pVar = (C11304p) BufferedChannelKt.m46420y();
        do {
            g = C11988e.m47811g(lVar, j, pVar);
            if (C12005m0.m47894h(g)) {
                break;
            }
            C12003l0 f = C12005m0.m47892f(g);
            while (true) {
                C12003l0 l0Var = (C12003l0) atomicReferenceFieldUpdater.get(this);
                z = true;
                if (l0Var.f29607c >= f.f29607c) {
                    break;
                } else if (!f.mo24382s()) {
                    z = false;
                    continue;
                    break;
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, l0Var, f)) {
                    if (l0Var.mo24380o()) {
                        l0Var.mo24359l();
                        continue;
                    } else {
                        continue;
                    }
                } else if (f.mo24380o()) {
                    f.mo24359l();
                }
            }
        } while (!z);
        if (C12005m0.m47894h(g)) {
            mo23799Q();
            if (lVar.f29607c * ((long) BufferedChannelKt.f29117b) >= mo23846r0()) {
                return null;
            }
            lVar.mo24349b();
            return null;
        }
        C11754l<E> lVar2 = (C11754l) C12005m0.m47892f(g);
        if (!mo23773E0() && j <= mo23830f0() / ((long) BufferedChannelKt.f29117b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f29086x;
            while (true) {
                C12003l0 l0Var2 = (C12003l0) atomicReferenceFieldUpdater2.get(this);
                if (l0Var2.f29607c >= lVar2.f29607c || !lVar2.mo24382s()) {
                    break;
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater2, this, l0Var2, lVar2)) {
                    if (l0Var2.mo24380o()) {
                        l0Var2.mo24359l();
                    }
                } else if (lVar2.mo24380o()) {
                    lVar2.mo24359l();
                }
            }
        }
        long j2 = lVar2.f29607c;
        if (j2 <= j) {
            return lVar2;
        }
        int i = BufferedChannelKt.f29117b;
        mo23781H1(j2 * ((long) i));
        if (lVar2.f29607c * ((long) i) >= mo23846r0()) {
            return null;
        }
        lVar2.mo24349b();
        return null;
    }

    /* renamed from: a1 */
    public final Object mo23821a1(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.m46421z()) {
            return this;
        }
        throw mo23845q0();
    }

    /* renamed from: b0 */
    public final C11754l<E> mo23822b0(long j, C11754l<E> lVar) {
        Object g;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29084v;
        C11304p pVar = (C11304p) BufferedChannelKt.m46420y();
        do {
            g = C11988e.m47811g(lVar, j, pVar);
            if (C12005m0.m47894h(g)) {
                break;
            }
            C12003l0 f = C12005m0.m47892f(g);
            while (true) {
                C12003l0 l0Var = (C12003l0) atomicReferenceFieldUpdater.get(this);
                z = true;
                if (l0Var.f29607c >= f.f29607c) {
                    break;
                } else if (!f.mo24382s()) {
                    z = false;
                    continue;
                    break;
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, l0Var, f)) {
                    if (l0Var.mo24380o()) {
                        l0Var.mo24359l();
                        continue;
                    } else {
                        continue;
                    }
                } else if (f.mo24380o()) {
                    f.mo24359l();
                }
            }
        } while (!z);
        if (C12005m0.m47894h(g)) {
            mo23799Q();
            if (lVar.f29607c * ((long) BufferedChannelKt.f29117b) >= mo23843p0()) {
                return null;
            }
            lVar.mo24349b();
            return null;
        }
        C11754l<E> lVar2 = (C11754l) C12005m0.m47892f(g);
        long j2 = lVar2.f29607c;
        if (j2 <= j) {
            return lVar2;
        }
        int i = BufferedChannelKt.f29117b;
        mo23784I1(j2 * ((long) i));
        if (lVar2.f29607c * ((long) i) >= mo23843p0()) {
            return null;
        }
        lVar2.mo24349b();
        return null;
    }

    /* renamed from: c */
    public final boolean mo23823c(@C12580l Throwable th) {
        return mo23750F(th);
    }

    @C12580l
    /* renamed from: c0 */
    public Object mo23824c0(@C12579k C11045c<? super E> cVar) {
        return m46233b1(this, cVar);
    }

    public final void cancel() {
        mo23750F((Throwable) null);
    }

    /* renamed from: d0 */
    public boolean mo23756d0(@C12580l Throwable th) {
        return mo23793N(th, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23826d1(kotlinx.coroutines.channels.C11754l<E> r11, int r12, long r13, kotlin.coroutines.C11045c<? super kotlinx.coroutines.channels.C11749j<? extends E>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.channels.l r11 = (kotlinx.coroutines.channels.C11754l) r11
            java.lang.Object r11 = r0.L$0
            kotlinx.coroutines.channels.BufferedChannel r11 = (kotlinx.coroutines.channels.BufferedChannel) r11
            kotlin.C11661u0.m45747n(r15)
            goto L_0x0131
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            kotlin.C11661u0.m45747n(r15)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.I$0 = r12
            r0.J$0 = r13
            r0.label = r3
            kotlin.coroutines.c r15 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)
            kotlinx.coroutines.p r15 = kotlinx.coroutines.C12089r.m48295b(r15)
            kotlinx.coroutines.channels.s r8 = new kotlinx.coroutines.channels.s     // Catch:{ all -> 0x0138 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15, r2)     // Catch:{ all -> 0x0138 }
            r8.<init>(r15)     // Catch:{ all -> 0x0138 }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.mo23771D1(r3, r4, r5, r7)     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.internal.o0 r3 = kotlinx.coroutines.channels.BufferedChannelKt.f29130o     // Catch:{ all -> 0x0138 }
            if (r2 != r3) goto L_0x006d
            r10.mo23810V0(r8, r11, r12)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x006d:
            kotlinx.coroutines.internal.o0 r12 = kotlinx.coroutines.channels.BufferedChannelKt.f29132q     // Catch:{ all -> 0x0138 }
            r9 = 0
            if (r2 != r12) goto L_0x0107
            long r2 = r10.mo23846r0()     // Catch:{ all -> 0x0138 }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x007f
            r11.mo24349b()     // Catch:{ all -> 0x0138 }
        L_0x007f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f29085w     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.channels.l r11 = (kotlinx.coroutines.channels.C11754l) r11     // Catch:{ all -> 0x0138 }
        L_0x0089:
            boolean r12 = r10.mo23827e()     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x0094
            r10.mo23794N0(r15)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x0094:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = f29081e     // Catch:{ all -> 0x0138 }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x0138 }
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b     // Catch:{ all -> 0x0138 }
            long r2 = (long) r14     // Catch:{ all -> 0x0138 }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x0138 }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x0138 }
            long r4 = r11.f29607c     // Catch:{ all -> 0x0138 }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b3
            kotlinx.coroutines.channels.l r2 = r10.mo23820a0(r2, r11)     // Catch:{ all -> 0x0138 }
            if (r2 != 0) goto L_0x00b2
            goto L_0x0089
        L_0x00b2:
            r11 = r2
        L_0x00b3:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.mo23771D1(r3, r4, r5, r7)     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.internal.o0 r3 = kotlinx.coroutines.channels.BufferedChannelKt.f29130o     // Catch:{ all -> 0x0138 }
            if (r2 != r3) goto L_0x00c6
            r10.mo23810V0(r8, r11, r14)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x00c6:
            kotlinx.coroutines.internal.o0 r14 = kotlinx.coroutines.channels.BufferedChannelKt.f29132q     // Catch:{ all -> 0x0138 }
            if (r2 != r14) goto L_0x00d8
            long r2 = r10.mo23846r0()     // Catch:{ all -> 0x0138 }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0089
            r11.mo24349b()     // Catch:{ all -> 0x0138 }
            goto L_0x0089
        L_0x00d8:
            kotlinx.coroutines.internal.o0 r12 = kotlinx.coroutines.channels.BufferedChannelKt.f29131p     // Catch:{ all -> 0x0138 }
            if (r2 == r12) goto L_0x00fb
            r11.mo24349b()     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.channels.j$b r11 = kotlinx.coroutines.channels.C11749j.f29170b     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.mo23927c(r2)     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.channels.j r11 = kotlinx.coroutines.channels.C11749j.m46631b(r11)     // Catch:{ all -> 0x0138 }
            kotlin.jvm.functions.l<E, kotlin.d2> r12 = r10.f29090b     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x00f7
            kotlin.coroutines.CoroutineContext r13 = r15.getContext()     // Catch:{ all -> 0x0138 }
            kotlin.jvm.functions.l r9 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47762a(r12, r2, r13)     // Catch:{ all -> 0x0138 }
        L_0x00f7:
            r15.mo24532O(r11, r9)     // Catch:{ all -> 0x0138 }
            goto L_0x0121
        L_0x00fb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0138 }
            java.lang.String r12 = "unexpected"
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0138 }
            r11.<init>(r12)     // Catch:{ all -> 0x0138 }
            throw r11     // Catch:{ all -> 0x0138 }
        L_0x0107:
            r11.mo24349b()     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.channels.j$b r11 = kotlinx.coroutines.channels.C11749j.f29170b     // Catch:{ all -> 0x0138 }
            java.lang.Object r11 = r11.mo23927c(r2)     // Catch:{ all -> 0x0138 }
            kotlinx.coroutines.channels.j r11 = kotlinx.coroutines.channels.C11749j.m46631b(r11)     // Catch:{ all -> 0x0138 }
            kotlin.jvm.functions.l<E, kotlin.d2> r12 = r10.f29090b     // Catch:{ all -> 0x0138 }
            if (r12 == 0) goto L_0x00f7
            kotlin.coroutines.CoroutineContext r13 = r15.getContext()     // Catch:{ all -> 0x0138 }
            kotlin.jvm.functions.l r9 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47762a(r12, r2, r13)     // Catch:{ all -> 0x0138 }
            goto L_0x00f7
        L_0x0121:
            java.lang.Object r15 = r15.mo24572y()
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r15 != r11) goto L_0x012e
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)
        L_0x012e:
            if (r15 != r1) goto L_0x0131
            return r1
        L_0x0131:
            kotlinx.coroutines.channels.j r15 = (kotlinx.coroutines.channels.C11749j) r15
            java.lang.Object r11 = r15.mo23920o()
            return r11
        L_0x0138:
            r11 = move-exception
            r15.mo24552M()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23826d1(kotlinx.coroutines.channels.l, int, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: e */
    public boolean mo23827e() {
        return mo23859z0(f29080d.get(this));
    }

    /* renamed from: e0 */
    public final Object mo23828e0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, ? extends Object> lVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
        return obj2;
    }

    /* renamed from: e1 */
    public final <R> R mo23829e1(Object obj, C11300l<? super E, ? extends R> lVar, C11305q<? super C11754l<E>, ? super Integer, ? super Long, ? extends R> qVar, C11289a<? extends R> aVar, C11305q<? super C11754l<E>, ? super Integer, ? super Long, ? extends R> qVar2) {
        C12077o3 o3Var;
        C11754l lVar2 = (C11754l) f29085w.get(this);
        while (!mo23827e()) {
            long andIncrement = f29081e.getAndIncrement(this);
            int i = BufferedChannelKt.f29117b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (lVar2.f29607c != j) {
                C11754l b = mo23820a0(j, lVar2);
                if (b == null) {
                    continue;
                } else {
                    lVar2 = b;
                }
            }
            Object C = mo23771D1(lVar2, i2, andIncrement, obj);
            if (C == BufferedChannelKt.f29130o) {
                if (obj instanceof C12077o3) {
                    o3Var = (C12077o3) obj;
                } else {
                    o3Var = null;
                }
                if (o3Var != null) {
                    mo23810V0(o3Var, lVar2, i2);
                }
                return qVar.invoke(lVar2, Integer.valueOf(i2), Long.valueOf(andIncrement));
            } else if (C == BufferedChannelKt.f29132q) {
                if (andIncrement < mo23846r0()) {
                    lVar2.mo24349b();
                }
            } else if (C == BufferedChannelKt.f29131p) {
                return qVar2.invoke(lVar2, Integer.valueOf(i2), Long.valueOf(andIncrement));
            } else {
                lVar2.mo24349b();
                return lVar.invoke(C);
            }
        }
        return aVar.invoke();
    }

    /* renamed from: f0 */
    public final long mo23830f0() {
        return f29082f.get(this);
    }

    @C12580l
    /* renamed from: g0 */
    public final Throwable mo23831g0() {
        return (Throwable) f29087y.get(this);
    }

    /* renamed from: g1 */
    public final void mo23832g1(C11754l<E> lVar, int i, long j, C12077o3 o3Var, C11300l<? super E, C11079d2> lVar2, C11289a<C11079d2> aVar) {
        Object C = mo23771D1(lVar, i, j, o3Var);
        if (C == BufferedChannelKt.f29130o) {
            mo23810V0(o3Var, lVar, i);
        } else if (C == BufferedChannelKt.f29132q) {
            if (j < mo23846r0()) {
                lVar.mo24349b();
            }
            C11754l lVar3 = (C11754l) f29085w.get(this);
            while (!mo23827e()) {
                long andIncrement = f29081e.getAndIncrement(this);
                int i2 = BufferedChannelKt.f29117b;
                long j2 = andIncrement / ((long) i2);
                int i3 = (int) (andIncrement % ((long) i2));
                if (lVar3.f29607c != j2) {
                    C11754l b = mo23820a0(j2, lVar3);
                    if (b == null) {
                        continue;
                    } else {
                        lVar3 = b;
                    }
                }
                Object C2 = mo23771D1(lVar3, i3, andIncrement, o3Var);
                if (C2 == BufferedChannelKt.f29130o) {
                    if (!(o3Var instanceof C12077o3)) {
                        o3Var = null;
                    }
                    if (o3Var != null) {
                        mo23810V0(o3Var, lVar3, i3);
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                    return;
                } else if (C2 == BufferedChannelKt.f29132q) {
                    if (andIncrement < mo23846r0()) {
                        lVar3.mo24349b();
                    }
                } else if (C2 != BufferedChannelKt.f29131p) {
                    lVar3.mo24349b();
                    lVar2.invoke(C2);
                    return;
                } else {
                    throw new IllegalStateException("unexpected".toString());
                }
            }
            aVar.invoke();
        } else {
            lVar.mo24349b();
            lVar2.invoke(C);
        }
    }

    @C12579k
    /* renamed from: h */
    public C12128g<E, BufferedChannel<E>> mo23833h() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.f29103a;
        Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.f29104a;
        Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12129h(this, (C11305q) C11370u0.m43701q(bufferedChannel$onSend$1, 3), (C11305q) C11370u0.m43701q(bufferedChannel$onSend$2, 3), (C11305q) null, 8, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: h0 */
    public Object mo23757h0(E e, @C12579k C11045c<? super C11079d2> cVar) {
        return m46250o1(this, e, cVar);
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: type inference failed for: r7v3, types: [kotlinx.coroutines.o3] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23834h1(kotlinx.coroutines.channels.C11754l<E> r9, int r10, long r11, kotlin.coroutines.C11045c<? super E> r13) {
        /*
            r8 = this;
            kotlin.coroutines.c r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r13)
            kotlinx.coroutines.p r0 = kotlinx.coroutines.C12089r.m48295b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.mo23771D1(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f29130o     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x001c
            r8.mo23810V0(r0, r9, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x001c:
            kotlinx.coroutines.internal.o0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.f29132q     // Catch:{ all -> 0x00d1 }
            r7 = 0
            if (r1 != r10) goto L_0x00b3
            long r1 = r8.mo23846r0()     // Catch:{ all -> 0x00d1 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002e
            r9.mo24349b()     // Catch:{ all -> 0x00d1 }
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f29085w     // Catch:{ all -> 0x00d1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00d1 }
            kotlinx.coroutines.channels.l r9 = (kotlinx.coroutines.channels.C11754l) r9     // Catch:{ all -> 0x00d1 }
        L_0x0038:
            boolean r10 = r8.mo23827e()     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0043
            r8.mo23796O0(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f29081e     // Catch:{ all -> 0x00d1 }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x00d1 }
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b     // Catch:{ all -> 0x00d1 }
            long r1 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x00d1 }
            long r3 = r9.f29607c     // Catch:{ all -> 0x00d1 }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0062
            kotlinx.coroutines.channels.l r1 = r8.mo23820a0(r1, r9)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0061
            goto L_0x0038
        L_0x0061:
            r9 = r1
        L_0x0062:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.mo23771D1(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.f29130o     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x007c
            boolean r10 = r0 instanceof kotlinx.coroutines.C12077o3     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0076
            r7 = r0
        L_0x0076:
            if (r7 == 0) goto L_0x00c3
            r8.mo23810V0(r7, r9, r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x007c:
            kotlinx.coroutines.internal.o0 r12 = kotlinx.coroutines.channels.BufferedChannelKt.f29132q     // Catch:{ all -> 0x00d1 }
            if (r1 != r12) goto L_0x008e
            long r1 = r8.mo23846r0()     // Catch:{ all -> 0x00d1 }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0038
            r9.mo24349b()     // Catch:{ all -> 0x00d1 }
            goto L_0x0038
        L_0x008e:
            kotlinx.coroutines.internal.o0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.f29131p     // Catch:{ all -> 0x00d1 }
            if (r1 == r10) goto L_0x00a7
            r9.mo24349b()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.l<E, kotlin.d2> r9 = r8.f29090b     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.l r7 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47762a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            r0.mo24532O(r1, r7)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            r9.mo24349b()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.l<E, kotlin.d2> r9 = r8.f29090b     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            kotlin.jvm.functions.l r7 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47762a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a3
        L_0x00c3:
            java.lang.Object r9 = r0.mo24572y()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r9 != r10) goto L_0x00d0
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r13)
        L_0x00d0:
            return r9
        L_0x00d1:
            r9 = move-exception
            r0.mo24552M()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23834h1(kotlinx.coroutines.channels.l, int, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: i0 */
    public boolean mo23758i0() {
        return mo23767B0(f29080d.get(this));
    }

    /* renamed from: i1 */
    public final void mo23835i1(C12131j<?> jVar, Object obj) {
        C12077o3 o3Var;
        C11754l lVar = (C11754l) f29085w.get(this);
        while (!mo23827e()) {
            long andIncrement = f29081e.getAndIncrement(this);
            int i = BufferedChannelKt.f29117b;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (lVar.f29607c != j) {
                C11754l b = mo23820a0(j, lVar);
                if (b == null) {
                    continue;
                } else {
                    lVar = b;
                }
            }
            Object C = mo23771D1(lVar, i2, andIncrement, jVar);
            if (C == BufferedChannelKt.f29130o) {
                if (jVar instanceof C12077o3) {
                    o3Var = (C12077o3) jVar;
                } else {
                    o3Var = null;
                }
                if (o3Var != null) {
                    mo23810V0(o3Var, lVar, i2);
                    return;
                }
                return;
            } else if (C == BufferedChannelKt.f29132q) {
                if (andIncrement < mo23846r0()) {
                    lVar.mo24349b();
                }
            } else if (C != BufferedChannelKt.f29131p) {
                lVar.mo24349b();
                jVar.mo24707e(C);
                return;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        mo23798P0(jVar);
    }

    public boolean isEmpty() {
        if (!mo23827e() && !mo23848s0()) {
            return !mo23827e();
        }
        return false;
    }

    @C12579k
    public ChannelIterator<E> iterator() {
        return new C11731a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        r14.mo24707e(kotlin.C11079d2.f28267a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23759j1(@org.jetbrains.annotations.C12579k kotlinx.coroutines.selects.C12131j<?> r14, @org.jetbrains.annotations.C12580l java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29084v
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.l r0 = (kotlinx.coroutines.channels.C11754l) r0
        L_0x000a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f29080d
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = r13.mo23767B0(r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.f29607c
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0035
            kotlinx.coroutines.channels.l r5 = r13.mo23822b0(r5, r0)
            if (r5 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x000a
            goto L_0x0073
        L_0x0034:
            r0 = r5
        L_0x0035:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = r5.mo23776F1(r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L_0x0085
            r6 = 1
            if (r5 == r6) goto L_0x0088
            r6 = 2
            if (r5 == r6) goto L_0x006e
            r1 = 3
            if (r5 == r1) goto L_0x0062
            r1 = 4
            if (r5 == r1) goto L_0x0056
            r1 = 5
            if (r5 == r1) goto L_0x0052
            goto L_0x000a
        L_0x0052:
            r0.mo24349b()
            goto L_0x000a
        L_0x0056:
            long r1 = r13.mo23843p0()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0073
            r0.mo24349b()
            goto L_0x0073
        L_0x0062:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            java.lang.String r15 = r15.toString()
            r14.<init>(r15)
            throw r14
        L_0x006e:
            if (r1 == 0) goto L_0x0077
            r0.mo24381r()
        L_0x0073:
            r13.mo23800Q0(r15, r14)
            goto L_0x008d
        L_0x0077:
            boolean r15 = r14 instanceof kotlinx.coroutines.C12077o3
            if (r15 == 0) goto L_0x007e
            kotlinx.coroutines.o3 r14 = (kotlinx.coroutines.C12077o3) r14
            goto L_0x007f
        L_0x007e:
            r14 = 0
        L_0x007f:
            if (r14 == 0) goto L_0x008d
            r13.mo23812W0(r14, r0, r2)
            goto L_0x008d
        L_0x0085:
            r0.mo24349b()
        L_0x0088:
            kotlin.d2 r15 = kotlin.C11079d2.f28267a
            r14.mo24707e(r15)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23759j1(kotlinx.coroutines.selects.j, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (kotlinx.coroutines.channels.C11754l) r12.mo24354g();
     */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23838k1(kotlinx.coroutines.channels.C11754l<E> r12) {
        /*
            r11 = this;
            kotlin.jvm.functions.l<E, kotlin.d2> r0 = r11.f29090b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.C12008o.m47919c(r1, r2, r1)
        L_0x0008:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f29607c
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.mo23939y(r4)
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29126k
            if (r8 == r9) goto L_0x00bb
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29121f
            if (r8 != r9) goto L_0x0048
            long r9 = r11.mo23843p0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m46421z()
            boolean r8 = r12.mo23934t(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.mo23938x(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47764c(r0, r5, r1)
        L_0x0040:
            r12.mo23935u(r4)
            r12.mo24381r()
            goto L_0x00af
        L_0x0048:
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29122g
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof kotlinx.coroutines.C12077o3
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.C11765u
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29124i
            if (r8 == r9) goto L_0x00bb
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29123h
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29124i
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.mo23843p0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.C11765u
            if (r9 == 0) goto L_0x0080
            r9 = r8
            kotlinx.coroutines.channels.u r9 = (kotlinx.coroutines.channels.C11765u) r9
            kotlinx.coroutines.o3 r9 = r9.f29182a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            kotlinx.coroutines.o3 r9 = (kotlinx.coroutines.C12077o3) r9
        L_0x0083:
            kotlinx.coroutines.internal.o0 r10 = kotlinx.coroutines.channels.BufferedChannelKt.m46421z()
            boolean r8 = r12.mo23934t(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.mo23938x(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m47764c(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = kotlinx.coroutines.internal.C12008o.m47924h(r3, r9)
            r12.mo23935u(r4)
            r12.mo24381r()
            goto L_0x00af
        L_0x00a2:
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.channels.BufferedChannelKt.m46421z()
            boolean r8 = r12.mo23934t(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.mo24381r()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            kotlinx.coroutines.internal.f r12 = r12.mo24354g()
            kotlinx.coroutines.channels.l r12 = (kotlinx.coroutines.channels.C11754l) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            kotlinx.coroutines.o3 r3 = (kotlinx.coroutines.C12077o3) r3
            r11.mo23840m1(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            kotlinx.coroutines.o3 r0 = (kotlinx.coroutines.C12077o3) r0
            r11.mo23840m1(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23838k1(kotlinx.coroutines.channels.l):void");
    }

    /* renamed from: l1 */
    public final void mo23839l1(C12077o3 o3Var) {
        mo23841n1(o3Var, true);
    }

    /* renamed from: m1 */
    public final void mo23840m1(C12077o3 o3Var) {
        mo23841n1(o3Var, false);
    }

    /* renamed from: n1 */
    public final void mo23841n1(C12077o3 o3Var, boolean z) {
        Throwable th;
        if (o3Var instanceof C11732b) {
            C12072o<Boolean> a = ((C11732b) o3Var).mo23870a();
            Result.C10852a aVar = Result.f28060a;
            a.resumeWith(Result.m38702b(Boolean.FALSE));
        } else if (o3Var instanceof C12072o) {
            C11045c cVar = (C11045c) o3Var;
            Result.C10852a aVar2 = Result.f28060a;
            if (z) {
                th = mo23842o0();
            } else {
                th = mo23845q0();
            }
            cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        } else if (o3Var instanceof C11762s) {
            C12078p<C11749j<? extends E>> pVar = ((C11762s) o3Var).f29181a;
            Result.C10852a aVar3 = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11749j.m46631b(C11749j.f29170b.mo23925a(mo23831g0()))));
        } else if (o3Var instanceof C11731a) {
            ((C11731a) o3Var).mo23868l();
        } else if (o3Var instanceof C12131j) {
            ((C12131j) o3Var).mo24711h(this, BufferedChannelKt.m46421z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + o3Var).toString());
        }
    }

    /* renamed from: o0 */
    public final Throwable mo23842o0() {
        Throwable g0 = mo23831g0();
        return g0 == null ? new ClosedReceiveChannelException(C11755m.f29176a) : g0;
    }

    /* renamed from: p0 */
    public final long mo23843p0() {
        return f29081e.get(this);
    }

    @C12580l
    /* renamed from: p1 */
    public Object mo23844p1(E e, @C12579k C11045c<? super Boolean> cVar) {
        return m46253q1(this, e, cVar);
    }

    @C12579k
    /* renamed from: q0 */
    public final Throwable mo23845q0() {
        Throwable g0 = mo23831g0();
        return g0 == null ? new ClosedSendChannelException(C11755m.f29176a) : g0;
    }

    /* renamed from: r0 */
    public final long mo23846r0() {
        return f29080d.get(this) & BufferedChannelKt.f29113G;
    }

    /* renamed from: r1 */
    public final <R> R mo23847r1(E e, @C12580l Object obj, @C12579k C11289a<? extends R> aVar, @C12579k C11304p<? super C11754l<E>, ? super Integer, ? extends R> pVar, @C12579k C11289a<? extends R> aVar2, @C12579k C11306r<? super C11754l<E>, ? super Integer, ? super E, ? super Long, ? extends R> rVar) {
        C11754l lVar;
        C12077o3 o3Var;
        Object obj2 = obj;
        C11754l lVar2 = (C11754l) f29084v.get(this);
        while (true) {
            long andIncrement = f29080d.getAndIncrement(this);
            long j = andIncrement & BufferedChannelKt.f29113G;
            boolean m = mo23767B0(andIncrement);
            int i = BufferedChannelKt.f29117b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (lVar2.f29607c != j2) {
                C11754l d = mo23822b0(j2, lVar2);
                if (d != null) {
                    lVar = d;
                } else if (m) {
                    return aVar2.invoke();
                }
            } else {
                lVar = lVar2;
            }
            int D = mo23776F1(lVar, i2, e, j, obj, m);
            if (D == 0) {
                lVar.mo24349b();
                return aVar.invoke();
            } else if (D == 1) {
                return aVar.invoke();
            } else {
                if (D != 2) {
                    if (D == 3) {
                        return rVar.invoke(lVar, Integer.valueOf(i2), e, Long.valueOf(j));
                    } else if (D != 4) {
                        if (D == 5) {
                            lVar.mo24349b();
                        }
                        lVar2 = lVar;
                    } else {
                        if (j < mo23843p0()) {
                            lVar.mo24349b();
                        }
                        return aVar2.invoke();
                    }
                } else if (m) {
                    lVar.mo24381r();
                    return aVar2.invoke();
                } else {
                    if (obj2 instanceof C12077o3) {
                        o3Var = (C12077o3) obj2;
                    } else {
                        o3Var = null;
                    }
                    if (o3Var != null) {
                        mo23812W0(o3Var, lVar, i2);
                    }
                    return pVar.invoke(lVar, Integer.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: s0 */
    public final boolean mo23848s0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29085w;
            C11754l lVar = (C11754l) atomicReferenceFieldUpdater.get(this);
            long p0 = mo23843p0();
            if (mo23846r0() <= p0) {
                return false;
            }
            int i = BufferedChannelKt.f29117b;
            long j = p0 / ((long) i);
            if (lVar.f29607c == j || (lVar = mo23820a0(j, lVar)) != null) {
                lVar.mo24349b();
                if (mo23854w0(lVar, (int) (p0 % ((long) i)), p0)) {
                    return true;
                }
                f29081e.compareAndSet(this, p0, p0 + 1);
            } else if (((C11754l) atomicReferenceFieldUpdater.get(this)).f29607c < j) {
                return false;
            }
        }
    }

    /* renamed from: t0 */
    public final void mo23849t0(long j) {
        boolean z;
        boolean z2;
        if ((f29083g.addAndGet(this, j) & BufferedChannelKt.f29114H) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            do {
                if ((f29083g.get(this) & BufferedChannelKt.f29114H) != 0) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            } while (z2);
        }
    }

    /* renamed from: t1 */
    public final void mo23850t1(C11754l<E> lVar, int i, E e, long j, C12077o3 o3Var, C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        C11754l lVar2;
        C12077o3 o3Var2 = o3Var;
        int D = mo23776F1(lVar, i, e, j, o3Var, false);
        if (D == 0) {
            C11754l<E> lVar3 = lVar;
            lVar.mo24349b();
            aVar.invoke();
        } else if (D == 1) {
            aVar.invoke();
        } else if (D == 2) {
            mo23812W0(o3Var2, lVar, i);
        } else if (D == 4) {
            if (j < mo23843p0()) {
                lVar.mo24349b();
            }
            aVar2.invoke();
        } else if (D == 5) {
            lVar.mo24349b();
            C11754l lVar4 = (C11754l) f29084v.get(this);
            while (true) {
                long andIncrement = f29080d.getAndIncrement(this);
                long j2 = andIncrement & BufferedChannelKt.f29113G;
                boolean m = mo23767B0(andIncrement);
                int i2 = BufferedChannelKt.f29117b;
                long j3 = j2 / ((long) i2);
                int i3 = (int) (j2 % ((long) i2));
                if (lVar4.f29607c != j3) {
                    C11754l d = mo23822b0(j3, lVar4);
                    if (d != null) {
                        lVar2 = d;
                    } else if (m) {
                        aVar2.invoke();
                        return;
                    }
                } else {
                    lVar2 = lVar4;
                }
                C11754l lVar5 = lVar2;
                int i4 = i3;
                int D2 = mo23776F1(lVar2, i3, e, j2, o3Var, m);
                if (D2 == 0) {
                    lVar5.mo24349b();
                    aVar.invoke();
                    return;
                } else if (D2 == 1) {
                    aVar.invoke();
                    return;
                } else if (D2 != 2) {
                    if (D2 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (D2 != 4) {
                        if (D2 == 5) {
                            lVar5.mo24349b();
                        }
                        lVar4 = lVar5;
                    } else {
                        if (j2 < mo23843p0()) {
                            lVar5.mo24349b();
                        }
                        aVar2.invoke();
                        return;
                    }
                } else if (m) {
                    lVar5.mo24381r();
                    aVar2.invoke();
                    return;
                } else {
                    if (!(o3Var2 instanceof C12077o3)) {
                        o3Var2 = null;
                    }
                    if (o3Var2 != null) {
                        mo23812W0(o3Var2, lVar5, i4);
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("unexpected".toString());
        }
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [kotlinx.coroutines.internal.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e1, code lost:
        r3 = r3.mo24352e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        if (r3 != null) goto L_0x0209;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29080d
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x001e
            if (r2 == r3) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f29089a
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            kotlinx.coroutines.channels.l[] r2 = new kotlinx.coroutines.channels.C11754l[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29085w
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29084v
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f29086x
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r2.next()
            r8 = r4
            kotlinx.coroutines.channels.l r8 = (kotlinx.coroutines.channels.C11754l) r8
            kotlinx.coroutines.channels.l r9 = kotlinx.coroutines.channels.BufferedChannelKt.f29116a
            if (r8 == r9) goto L_0x0083
            r8 = r7
            goto L_0x0084
        L_0x0083:
            r8 = r6
        L_0x0084:
            if (r8 == 0) goto L_0x006e
            r3.add(r4)
            goto L_0x006e
        L_0x008a:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x020d
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009f
            goto L_0x00b9
        L_0x009f:
            r4 = r3
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C11754l) r4
            long r8 = r4.f29607c
        L_0x00a4:
            java.lang.Object r4 = r2.next()
            r10 = r4
            kotlinx.coroutines.channels.l r10 = (kotlinx.coroutines.channels.C11754l) r10
            long r10 = r10.f29607c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b3
            r3 = r4
            r8 = r10
        L_0x00b3:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a4
        L_0x00b9:
            kotlinx.coroutines.channels.l r3 = (kotlinx.coroutines.channels.C11754l) r3
            long r10 = r16.mo23843p0()
            long r12 = r16.mo23846r0()
        L_0x00c3:
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            r4 = r6
        L_0x00c6:
            if (r4 >= r2) goto L_0x01e1
            long r8 = r3.f29607c
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d8
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ea
        L_0x00d8:
            java.lang.Object r15 = r3.mo23939y(r4)
            java.lang.Object r6 = r3.mo23938x(r4)
            boolean r7 = r15 instanceof kotlinx.coroutines.C12072o
            if (r7 == 0) goto L_0x00fa
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ee
            if (r14 < 0) goto L_0x00ee
            java.lang.String r7 = "receive"
            goto L_0x01a7
        L_0x00ee:
            if (r14 >= 0) goto L_0x00f6
            if (r7 < 0) goto L_0x00f6
            java.lang.String r7 = "send"
            goto L_0x01a7
        L_0x00f6:
            java.lang.String r7 = "cont"
            goto L_0x01a7
        L_0x00fa:
            boolean r7 = r15 instanceof kotlinx.coroutines.selects.C12131j
            if (r7 == 0) goto L_0x0114
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0108
            if (r14 < 0) goto L_0x0108
            java.lang.String r7 = "onReceive"
            goto L_0x01a7
        L_0x0108:
            if (r14 >= 0) goto L_0x0110
            if (r7 < 0) goto L_0x0110
            java.lang.String r7 = "onSend"
            goto L_0x01a7
        L_0x0110:
            java.lang.String r7 = "select"
            goto L_0x01a7
        L_0x0114:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.C11762s
            if (r7 == 0) goto L_0x011c
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a7
        L_0x011c:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel.C11732b
            if (r7 == 0) goto L_0x0124
            java.lang.String r7 = "sendBroadcast"
            goto L_0x01a7
        L_0x0124:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.C11765u
            if (r7 == 0) goto L_0x0140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a7
        L_0x0140:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29123h
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x014c
            r7 = 1
            goto L_0x0154
        L_0x014c:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29124i
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x0154:
            if (r7 == 0) goto L_0x0159
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a7
        L_0x0159:
            if (r15 != 0) goto L_0x015d
            r7 = 1
            goto L_0x0165
        L_0x015d:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29122g
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x0165:
            if (r7 == 0) goto L_0x0169
            r7 = 1
            goto L_0x0171
        L_0x0169:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29126k
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x0171:
            if (r7 == 0) goto L_0x0175
            r7 = 1
            goto L_0x017d
        L_0x0175:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29125j
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x017d:
            if (r7 == 0) goto L_0x0181
            r7 = 1
            goto L_0x0189
        L_0x0181:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29128m
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x0189:
            if (r7 == 0) goto L_0x018d
            r7 = 1
            goto L_0x0195
        L_0x018d:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.f29127l
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x0195:
            if (r7 == 0) goto L_0x0199
            r7 = 1
            goto L_0x01a1
        L_0x0199:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.channels.BufferedChannelKt.m46421z()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r7)
        L_0x01a1:
            if (r7 != 0) goto L_0x01db
            java.lang.String r7 = r15.toString()
        L_0x01a7:
            if (r6 == 0) goto L_0x01c9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01db
        L_0x01c9:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01db:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c6
        L_0x01e1:
            kotlinx.coroutines.internal.f r2 = r3.mo24352e()
            r3 = r2
            kotlinx.coroutines.channels.l r3 = (kotlinx.coroutines.channels.C11754l) r3
            if (r3 != 0) goto L_0x0209
        L_0x01ea:
            char r2 = kotlin.text.StringsKt___StringsKt.last(r1)
            if (r2 != r5) goto L_0x01ff
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L_0x01ff:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0209:
            r6 = 0
            r7 = 1
            goto L_0x00c3
        L_0x020d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0122 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0123  */
    /* renamed from: u1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23851u1(kotlinx.coroutines.channels.C11754l<E> r21, int r22, E r23, long r24, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            kotlin.coroutines.c r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r26)
            kotlinx.coroutines.p r10 = kotlinx.coroutines.C12089r.m48295b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.mo23776F1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x0101
            r11 = 1
            if (r1 == r11) goto L_0x00f8
            r12 = 2
            if (r1 == r12) goto L_0x00f0
            r13 = 4
            if (r1 == r13) goto L_0x00e3
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d9
            r21.mo24349b()     // Catch:{ all -> 0x0126 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29084v     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0126 }
            kotlinx.coroutines.channels.l r1 = (kotlinx.coroutines.channels.C11754l) r1     // Catch:{ all -> 0x0126 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29080d     // Catch:{ all -> 0x0126 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0126 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.mo23767B0(r2)     // Catch:{ all -> 0x0126 }
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b     // Catch:{ all -> 0x0126 }
            long r3 = (long) r2     // Catch:{ all -> 0x0126 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0126 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0126 }
            long r5 = r1.f29607c     // Catch:{ all -> 0x0126 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006a
            kotlinx.coroutines.channels.l r2 = r9.mo23822b0(r3, r1)     // Catch:{ all -> 0x0126 }
            if (r2 != 0) goto L_0x0068
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.mo23804S0(r0, r10)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x0068:
            r7 = r2
            goto L_0x006b
        L_0x006a:
            r7 = r1
        L_0x006b:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.mo23776F1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0126 }
            if (r1 == 0) goto L_0x00cb
            if (r1 == r11) goto L_0x00bf
            if (r1 == r12) goto L_0x00a8
            r2 = 3
            if (r1 == r2) goto L_0x009e
            if (r1 == r13) goto L_0x0092
            if (r1 == r15) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r21.mo24349b()     // Catch:{ all -> 0x0126 }
        L_0x008f:
            r1 = r21
            goto L_0x0039
        L_0x0092:
            long r1 = r20.mo23843p0()     // Catch:{ all -> 0x0126 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.mo24349b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00a8:
            if (r18 == 0) goto L_0x00ae
            r21.mo24381r()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00ae:
            boolean r0 = r10 instanceof kotlinx.coroutines.C12077o3     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x00b4
            r0 = r10
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            if (r0 == 0) goto L_0x010f
            r2 = r21
            r1 = r19
            r9.mo23812W0(r0, r2, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00bf:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0126 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0126 }
        L_0x00c7:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00cb:
            r2 = r21
            r2.mo24349b()     // Catch:{ all -> 0x0126 }
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0126 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x00d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0126 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0126 }
            r0.<init>(r1)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x00e3:
            long r1 = r20.mo23843p0()     // Catch:{ all -> 0x0126 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.mo24349b()     // Catch:{ all -> 0x0126 }
            goto L_0x0063
        L_0x00f0:
            r0 = r21
            r1 = r22
            r9.mo23812W0(r10, r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x00f8:
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0126 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x0101:
            r0 = r21
            r21.mo24349b()     // Catch:{ all -> 0x0126 }
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0126 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = kotlin.Result.m38702b(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x00c7
        L_0x010f:
            java.lang.Object r0 = r10.mo24572y()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r0 != r1) goto L_0x011c
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r26)
        L_0x011c:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            if (r0 != r1) goto L_0x0123
            return r0
        L_0x0123:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a
            return r0
        L_0x0126:
            r0 = move-exception
            r10.mo24552M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23851u1(kotlinx.coroutines.channels.l, int, java.lang.Object, long, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: v0 */
    public final void mo23852v0() {
        Object obj;
        C12009o0 o0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29088z;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                o0Var = BufferedChannelKt.f29140y;
            } else {
                o0Var = BufferedChannelKt.f29141z;
            }
        } while (!C16563a.m75000a(atomicReferenceFieldUpdater, this, obj, o0Var));
        if (obj != null) {
            C11300l lVar = (C11300l) C11370u0.m43701q(obj, 1);
            ((C11300l) obj).invoke(mo23831g0());
        }
    }

    /* renamed from: v1 */
    public final boolean mo23853v1(long j) {
        if (mo23767B0(j)) {
            return false;
        }
        return !mo23772E(j & BufferedChannelKt.f29113G);
    }

    /* renamed from: w0 */
    public final boolean mo23854w0(C11754l<E> lVar, int i, long j) {
        Object y;
        do {
            y = lVar.mo23939y(i);
            if (y != null && y != BufferedChannelKt.f29122g) {
                if (y == BufferedChannelKt.f29121f) {
                    return true;
                }
                if (y == BufferedChannelKt.f29127l || y == BufferedChannelKt.m46421z() || y == BufferedChannelKt.f29126k || y == BufferedChannelKt.f29125j) {
                    return false;
                }
                if (y == BufferedChannelKt.f29124i) {
                    return true;
                }
                if (y != BufferedChannelKt.f29123h && j == mo23843p0()) {
                    return true;
                }
                return false;
            }
        } while (!lVar.mo23934t(i, y, BufferedChannelKt.f29125j));
        mo23803S();
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23855w1() {
        return mo23853v1(f29080d.get(this));
    }

    /* renamed from: x0 */
    public final boolean mo23856x0(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            mo23797P(j & BufferedChannelKt.f29113G);
            if (z && mo23848s0()) {
                return false;
            }
        } else if (i == 3) {
            mo23795O(j & BufferedChannelKt.f29113G);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [kotlinx.coroutines.internal.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12579k
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo23857x1() {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "S="
            r1.append(r2)
            long r2 = r11.mo23846r0()
            r1.append(r2)
            java.lang.String r2 = ",R="
            r1.append(r2)
            long r2 = r11.mo23843p0()
            r1.append(r2)
            java.lang.String r2 = ",B="
            r1.append(r2)
            long r2 = r11.mo23830f0()
            r1.append(r2)
            java.lang.String r2 = ",B'="
            r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29083g
            long r2 = r2.get(r11)
            r1.append(r2)
            java.lang.String r2 = ",C="
            r1.append(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29080d
            long r3 = r2.get(r11)
            r5 = 60
            long r3 = r3 >> r5
            int r3 = (int) r3
            r1.append(r3)
            r3 = 44
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            long r1 = r2.get(r11)
            long r1 = r1 >> r5
            int r1 = (int) r1
            r2 = 3
            r4 = 2
            r5 = 1
            if (r1 == r5) goto L_0x0076
            if (r1 == r4) goto L_0x0070
            if (r1 == r2) goto L_0x006a
            goto L_0x007b
        L_0x006a:
            java.lang.String r1 = "CANCELLED,"
            r0.append(r1)
            goto L_0x007b
        L_0x0070:
            java.lang.String r1 = "CLOSED,"
            r0.append(r1)
            goto L_0x007b
        L_0x0076:
            java.lang.String r1 = "CANCELLATION_STARTED,"
            r0.append(r1)
        L_0x007b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "SEND_SEGM="
            r1.append(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f29084v
            java.lang.Object r7 = r6.get(r11)
            java.lang.String r7 = kotlinx.coroutines.C12090r0.m48301b(r7)
            r1.append(r7)
            java.lang.String r7 = ",RCV_SEGM="
            r1.append(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f29085w
            java.lang.Object r8 = r7.get(r11)
            java.lang.String r8 = kotlinx.coroutines.C12090r0.m48301b(r8)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            boolean r1 = r11.mo23773E0()
            if (r1 != 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = ",EB_SEGM="
            r1.append(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f29086x
            java.lang.Object r8 = r8.get(r11)
            java.lang.String r8 = kotlinx.coroutines.C12090r0.m48301b(r8)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x00cf:
            java.lang.String r1 = "  "
            r0.append(r1)
            kotlinx.coroutines.channels.l[] r1 = new kotlinx.coroutines.channels.C11754l[r2]
            java.lang.Object r2 = r7.get(r11)
            r7 = 0
            r1[r7] = r2
            java.lang.Object r2 = r6.get(r11)
            r1[r5] = r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f29086x
            java.lang.Object r2 = r2.get(r11)
            r1[r4] = r2
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.m40448L(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00fa:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0116
            java.lang.Object r4 = r1.next()
            r6 = r4
            kotlinx.coroutines.channels.l r6 = (kotlinx.coroutines.channels.C11754l) r6
            kotlinx.coroutines.channels.l r8 = kotlinx.coroutines.channels.BufferedChannelKt.f29116a
            if (r6 == r8) goto L_0x010f
            r6 = r5
            goto L_0x0110
        L_0x010f:
            r6 = r7
        L_0x0110:
            if (r6 == 0) goto L_0x00fa
            r2.add(r4)
            goto L_0x00fa
        L_0x0116:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0231
            java.lang.Object r2 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L_0x012b
            goto L_0x0145
        L_0x012b:
            r4 = r2
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C11754l) r4
            long r4 = r4.f29607c
        L_0x0130:
            java.lang.Object r6 = r1.next()
            r8 = r6
            kotlinx.coroutines.channels.l r8 = (kotlinx.coroutines.channels.C11754l) r8
            long r8 = r8.f29607c
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x013f
            r2 = r6
            r4 = r8
        L_0x013f:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L_0x0130
        L_0x0145:
            kotlinx.coroutines.channels.l r2 = (kotlinx.coroutines.channels.C11754l) r2
        L_0x0147:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = kotlinx.coroutines.C12090r0.m48301b(r2)
            r1.append(r4)
            java.lang.String r4 = "=["
            r1.append(r4)
            boolean r4 = r2.mo24355h()
            if (r4 == 0) goto L_0x0161
            java.lang.String r4 = "*"
            goto L_0x0163
        L_0x0161:
            java.lang.String r4 = ""
        L_0x0163:
            r1.append(r4)
            long r4 = r2.f29607c
            r1.append(r4)
            java.lang.String r4 = ",prev="
            r1.append(r4)
            kotlinx.coroutines.internal.f r4 = r2.mo24354g()
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C11754l) r4
            r5 = 0
            if (r4 == 0) goto L_0x017e
            java.lang.String r4 = kotlinx.coroutines.C12090r0.m48301b(r4)
            goto L_0x017f
        L_0x017e:
            r4 = r5
        L_0x017f:
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.f29117b
            r4 = r7
        L_0x018f:
            if (r4 >= r1) goto L_0x01fe
            java.lang.Object r6 = r2.mo23939y(r4)
            java.lang.Object r8 = r2.mo23938x(r4)
            boolean r9 = r6 instanceof kotlinx.coroutines.C12072o
            if (r9 == 0) goto L_0x01a0
            java.lang.String r6 = "cont"
            goto L_0x01d4
        L_0x01a0:
            boolean r9 = r6 instanceof kotlinx.coroutines.selects.C12131j
            if (r9 == 0) goto L_0x01a7
            java.lang.String r6 = "select"
            goto L_0x01d4
        L_0x01a7:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.C11762s
            if (r9 == 0) goto L_0x01ae
            java.lang.String r6 = "receiveCatching"
            goto L_0x01d4
        L_0x01ae:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.BufferedChannel.C11732b
            if (r9 == 0) goto L_0x01b5
            java.lang.String r6 = "send(broadcast)"
            goto L_0x01d4
        L_0x01b5:
            boolean r9 = r6 instanceof kotlinx.coroutines.channels.C11765u
            if (r9 == 0) goto L_0x01d0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "EB("
            r9.append(r10)
            r9.append(r6)
            r6 = 41
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            goto L_0x01d4
        L_0x01d0:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x01d4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 91
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = "]=("
            r9.append(r10)
            r9.append(r6)
            r9.append(r3)
            r9.append(r8)
            java.lang.String r6 = "),"
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x018f
        L_0x01fe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "next="
            r1.append(r4)
            kotlinx.coroutines.internal.f r4 = r2.mo24352e()
            kotlinx.coroutines.channels.l r4 = (kotlinx.coroutines.channels.C11754l) r4
            if (r4 == 0) goto L_0x0214
            java.lang.String r5 = kotlinx.coroutines.C12090r0.m48301b(r4)
        L_0x0214:
            r1.append(r5)
            java.lang.String r4 = "]  "
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            kotlinx.coroutines.internal.f r1 = r2.mo24352e()
            r2 = r1
            kotlinx.coroutines.channels.l r2 = (kotlinx.coroutines.channels.C11754l) r2
            if (r2 != 0) goto L_0x0147
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0231:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.mo23857x1():java.lang.String");
    }

    /* renamed from: y1 */
    public final boolean mo23858y1(Object obj, E e) {
        if (obj instanceof C12131j) {
            return ((C12131j) obj).mo24711h(this, e);
        }
        C11300l<Throwable, C11079d2> lVar = null;
        if (obj instanceof C11762s) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C11762s sVar = (C11762s) obj;
            C12078p<C11749j<? extends E>> pVar = sVar.f29181a;
            C11749j b = C11749j.m46631b(C11749j.f29170b.mo23927c(e));
            C11300l<E, C11079d2> lVar2 = this.f29090b;
            if (lVar2 != null) {
                lVar = OnUndeliveredElementKt.m47762a(lVar2, e, sVar.f29181a.getContext());
            }
            return BufferedChannelKt.m46394F(pVar, b, lVar);
        } else if (obj instanceof C11731a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((C11731a) obj).mo23867k(e);
        } else if (obj instanceof C12072o) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C12072o oVar = (C12072o) obj;
            C11300l<E, C11079d2> lVar3 = this.f29090b;
            if (lVar3 != null) {
                lVar = OnUndeliveredElementKt.m47762a(lVar3, e, oVar.getContext());
            }
            return BufferedChannelKt.m46394F(oVar, e, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    /* renamed from: z0 */
    public final boolean mo23859z0(long j) {
        return mo23856x0(j, true);
    }

    /* renamed from: z1 */
    public final boolean mo23860z1(Object obj, C11754l<E> lVar, int i) {
        if (obj instanceof C12072o) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.m46395G((C12072o) obj, C11079d2.f28267a, (C11300l) null, 2, (Object) null);
        } else if (obj instanceof C12131j) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult I = ((SelectImplementation) obj).mo24700I(this, C11079d2.f28267a);
            if (I == TrySelectDetailedResult.REREGISTER) {
                lVar.mo23935u(i);
            }
            if (I == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof C11732b) {
            return BufferedChannelKt.m46395G(((C11732b) obj).mo23870a(), Boolean.TRUE, (C11300l) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BufferedChannel(int i, C11300l lVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : lVar);
    }
}
