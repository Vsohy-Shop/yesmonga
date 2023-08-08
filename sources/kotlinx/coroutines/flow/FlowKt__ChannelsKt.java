package kotlinx.coroutines.flow;

import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C11740d;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.C11927d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,176:1\n106#2:177\n*S KotlinDebug\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n153#1:177\n*E\n"})
public final /* synthetic */ class FlowKt__ChannelsKt {

    @C11363r0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Channels.kt\nkotlinx/coroutines/flow/FlowKt__ChannelsKt\n*L\n1#1,112:1\n154#2,2:113\n*E\n"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ChannelsKt$a */
    public static final class C11818a implements C11907e<T> {

        /* renamed from: a */
        public final /* synthetic */ C11740d f29294a;

        public C11818a(C11740d dVar) {
            this.f29294a = dVar;
        }

        @C12580l
        public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
            Object l0 = C11909g.m47468l0(fVar, this.f29294a.mo23749A(), cVar);
            if (l0 == C11063b.m42612h()) {
                return l0;
            }
            return C11079d2.f28267a;
        }
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @C12579k
    /* renamed from: b */
    public static final <T> C11907e<T> m47001b(@C12579k C11740d<T> dVar) {
        return new C11818a(dVar);
    }

    @C12579k
    /* renamed from: c */
    public static final <T> C11907e<T> m47002c(@C12579k ReceiveChannel<? extends T> receiveChannel) {
        return new C11904b(receiveChannel, true, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: d */
    public static final <T> Object m47003d(@C12579k C11908f<? super T> fVar, @C12579k ReceiveChannel<? extends T> receiveChannel, @C12579k C11045c<? super C11079d2> cVar) {
        Object e = m47004e(fVar, receiveChannel, true, cVar);
        return e == C11063b.m42612h() ? e : C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r8 != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        kotlinx.coroutines.channels.C11755m.m46690b(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a3, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[Catch:{ all -> 0x009d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m47004e(kotlinx.coroutines.flow.C11908f<? super T> r6, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r7, boolean r8, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x009b }
        L_0x0039:
            r9 = r6
            r6 = r2
            goto L_0x0060
        L_0x003c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0044:
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.channels.ChannelIterator r6 = (kotlinx.coroutines.channels.ChannelIterator) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.flow.f r2 = (kotlinx.coroutines.flow.C11908f) r2
            kotlin.C11661u0.m45747n(r9)     // Catch:{ all -> 0x009b }
            goto L_0x0075
        L_0x0056:
            kotlin.C11661u0.m45747n(r9)
            kotlinx.coroutines.flow.C11909g.m47477o0(r6)
            kotlinx.coroutines.channels.ChannelIterator r9 = r7.iterator()     // Catch:{ all -> 0x009b }
        L_0x0060:
            r0.L$0 = r6     // Catch:{ all -> 0x009b }
            r0.L$1 = r7     // Catch:{ all -> 0x009b }
            r0.L$2 = r9     // Catch:{ all -> 0x009b }
            r0.Z$0 = r8     // Catch:{ all -> 0x009b }
            r0.label = r4     // Catch:{ all -> 0x009b }
            java.lang.Object r2 = r9.mo23863c(r0)     // Catch:{ all -> 0x009b }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L_0x0075:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x009b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x0092
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x009b }
            r0.L$0 = r2     // Catch:{ all -> 0x009b }
            r0.L$1 = r7     // Catch:{ all -> 0x009b }
            r0.L$2 = r6     // Catch:{ all -> 0x009b }
            r0.Z$0 = r8     // Catch:{ all -> 0x009b }
            r0.label = r3     // Catch:{ all -> 0x009b }
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch:{ all -> 0x009b }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x0092:
            if (r8 == 0) goto L_0x0098
            r6 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
        L_0x0098:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            return r6
        L_0x009b:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x009d }
        L_0x009d:
            r9 = move-exception
            if (r8 == 0) goto L_0x00a3
            kotlinx.coroutines.channels.C11755m.m46690b(r7, r6)
        L_0x00a3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.m47004e(kotlinx.coroutines.flow.f, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f */
    public static final <T> ReceiveChannel<T> m47005f(@C12579k C11907e<? extends T> eVar, @C12579k C12074o0 o0Var) {
        return C11927d.m47584b(eVar).mo24225n(o0Var);
    }

    @C12579k
    /* renamed from: g */
    public static final <T> C11907e<T> m47006g(@C12579k ReceiveChannel<? extends T> receiveChannel) {
        return new C11904b(receiveChannel, false, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }
}
