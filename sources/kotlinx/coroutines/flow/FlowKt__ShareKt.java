package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12169x;
import kotlinx.coroutines.C12179z;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
public final /* synthetic */ class FlowKt__ShareKt {
    @C12579k
    /* renamed from: a */
    public static final <T> C11944n<T> m47157a(@C12579k C11911i<T> iVar) {
        return new C11941k(iVar, (C11723c2) null);
    }

    @C12579k
    /* renamed from: b */
    public static final <T> C11952u<T> m47158b(@C12579k C11940j<T> jVar) {
        return new C11942l(jVar, (C11723c2) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> kotlinx.coroutines.flow.C11947q<T> m47159c(kotlinx.coroutines.flow.C11907e<? extends T> r7, int r8) {
        /*
            kotlinx.coroutines.channels.g$b r0 = kotlinx.coroutines.channels.C11744g.f29158x0
            int r0 = r0.mo23915a()
            int r0 = kotlin.ranges.C11479u.m44447u(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L_0x003d
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.e r2 = r1.mo24224k()
            if (r2 == 0) goto L_0x003d
            kotlinx.coroutines.flow.q r7 = new kotlinx.coroutines.flow.q
            int r3 = r1.f29471b
            r4 = -3
            if (r3 == r4) goto L_0x0026
            r4 = -2
            if (r3 == r4) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0035
        L_0x0026:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.f29472c
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L_0x0030
            if (r3 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            if (r8 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = r6
        L_0x0035:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.f29472c
            kotlin.coroutines.CoroutineContext r1 = r1.f29470a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003d:
            kotlinx.coroutines.flow.q r8 = new kotlinx.coroutines.flow.q
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f28243a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m47159c(kotlinx.coroutines.flow.e, int):kotlinx.coroutines.flow.q");
    }

    /* renamed from: d */
    public static final <T> C11723c2 m47160d(C12074o0 o0Var, CoroutineContext coroutineContext, C11907e<? extends T> eVar, C11911i<T> iVar, C11948r rVar, T t) {
        CoroutineStart coroutineStart;
        if (Intrinsics.areEqual((Object) rVar, (Object) C11948r.f29534a.mo24272c())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return C11965h.m47669d(o0Var, coroutineContext, coroutineStart, new FlowKt__ShareKt$launchSharing$1(rVar, eVar, iVar, t, (C11045c<? super FlowKt__ShareKt$launchSharing$1>) null));
    }

    /* renamed from: e */
    public static final <T> void m47161e(C12074o0 o0Var, CoroutineContext coroutineContext, C11907e<? extends T> eVar, C12169x<C11952u<T>> xVar) {
        C11723c2 unused = C12038j.m48061f(o0Var, coroutineContext, (CoroutineStart) null, new FlowKt__ShareKt$launchSharingDeferred$1(eVar, xVar, (C11045c<? super FlowKt__ShareKt$launchSharingDeferred$1>) null), 2, (Object) null);
    }

    @C12579k
    /* renamed from: f */
    public static final <T> C11944n<T> m47162f(@C12579k C11944n<? extends T> nVar, @C12579k C11304p<? super C11908f<? super T>, ? super C11045c<? super C11079d2>, ? extends Object> pVar) {
        return new SubscribedSharedFlow(nVar, pVar);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11944n<T> m47163g(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11948r rVar, int i) {
        C11947q<? extends T> c = m47159c(eVar, i);
        C11911i a = C11945o.m47609a(i, c.f29531b, c.f29532c);
        return new C11941k(a, m47160d(o0Var, c.f29533d, c.f29530a, a, rVar, C11945o.f29527a));
    }

    /* renamed from: h */
    public static /* synthetic */ C11944n m47164h(C11907e eVar, C12074o0 o0Var, C11948r rVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C11909g.m47368G1(eVar, o0Var, rVar, i);
    }

    @C12580l
    /* renamed from: i */
    public static final <T> Object m47165i(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11045c<? super C11952u<? extends T>> cVar) {
        C11947q<? extends T> c = m47159c(eVar, 1);
        C12169x c2 = C12179z.m48761c((C11723c2) null, 1, (Object) null);
        m47161e(o0Var, c.f29533d, c.f29530a, c2);
        return c2.mo24780v(cVar);
    }

    @C12579k
    /* renamed from: j */
    public static final <T> C11952u<T> m47166j(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var, @C12579k C11948r rVar, T t) {
        C11947q<? extends T> c = m47159c(eVar, 1);
        C11940j a = C11953v.m47628a(t);
        return new C11942l(a, m47160d(o0Var, c.f29533d, c.f29530a, a, rVar, t));
    }
}
