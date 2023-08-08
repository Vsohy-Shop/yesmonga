package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.sync.C12141b;

public final class ChannelFlowMerge$collectTo$2<T> implements C11908f {

    /* renamed from: a */
    public final /* synthetic */ C11723c2 f29475a;

    /* renamed from: b */
    public final /* synthetic */ C12141b f29476b;

    /* renamed from: c */
    public final /* synthetic */ C11760r<T> f29477c;

    /* renamed from: d */
    public final /* synthetic */ C11937m<T> f29478d;

    public ChannelFlowMerge$collectTo$2(C11723c2 c2Var, C12141b bVar, C11760r<? super T> rVar, C11937m<T> mVar) {
        this.f29475a = c2Var;
        this.f29476b = bVar;
        this.f29477c = rVar;
        this.f29478d = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(@org.jetbrains.annotations.C12579k final kotlinx.coroutines.flow.C11907e<? extends T> r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C11907e) r8
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) r0
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.C11661u0.m45747n(r9)
            kotlinx.coroutines.c2 r9 = r7.f29475a
            if (r9 == 0) goto L_0x0043
            kotlinx.coroutines.C11804f2.m46950A(r9)
        L_0x0043:
            kotlinx.coroutines.sync.b r9 = r7.f29476b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r9.mo24757e(r0)
            if (r9 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r7
        L_0x0053:
            kotlinx.coroutines.channels.r<T> r1 = r0.f29477c
            r2 = 0
            r3 = 0
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.internal.m<T> r9 = r0.f29478d
            kotlinx.coroutines.sync.b r0 = r0.f29476b
            r5 = 0
            r4.<init>(r8, r9, r0, r5)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r1, r2, r3, r4, r5, r6)
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.emit(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }
}
