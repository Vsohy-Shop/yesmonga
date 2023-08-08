package androidx.window.layout;

import android.app.Activity;
import com.carrefour.fid.android.shared.constant.C28531e0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", mo22502f = "WindowInfoTrackerImpl.kt", mo22503i = {0, 0, 1, 1}, mo22504l = {54, 55}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "listener", "$this$flow", "listener"}, mo22507s = {"L$0", "L$1", "L$0", "L$1"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/window/layout/t;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends SuspendLambda implements C11304p<C11908f<? super C21073t>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, C11045c<? super WindowInfoTrackerImpl$windowLayoutInfo$1> cVar) {
        super(2, cVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* renamed from: i */
    public static final void m97355i(C11744g gVar, C21073t tVar) {
        Intrinsics.checkNotNullExpressionValue(tVar, C28531e0.f69094x);
        gVar.mo23751L(tVar);
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, cVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    @C12580l
    /* renamed from: h */
    public final Object invoke(@C12579k C11908f<? super C21073t> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[Catch:{ all -> 0x00a1 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r9.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.d r4 = (androidx.core.util.C17970d) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.C11908f) r5
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x00a3 }
            r10 = r5
            goto L_0x0063
        L_0x001f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0027:
            java.lang.Object r1 = r9.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$1
            androidx.core.util.d r4 = (androidx.core.util.C17970d) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.C11908f) r5
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x00a3 }
            r6 = r5
            r5 = r9
            goto L_0x0076
        L_0x0039:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.C11908f) r10
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            kotlinx.coroutines.channels.g r1 = kotlinx.coroutines.channels.C11748i.m46625d(r5, r1, r6, r4, r6)
            androidx.window.layout.s r4 = new androidx.window.layout.s
            r4.<init>(r1)
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.p r5 = r5.f54265c
            android.app.Activity r6 = r9.$activity
            androidx.profileinstaller.f r7 = new androidx.profileinstaller.f
            r7.<init>()
            r5.mo62972a(r6, r7, r4)
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0063:
            r5 = r9
        L_0x0064:
            r5.L$0 = r10     // Catch:{ all -> 0x00a1 }
            r5.L$1 = r4     // Catch:{ all -> 0x00a1 }
            r5.L$2 = r1     // Catch:{ all -> 0x00a1 }
            r5.label = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r6 = r1.mo23863c(r5)     // Catch:{ all -> 0x00a1 }
            if (r6 != r0) goto L_0x0073
            return r0
        L_0x0073:
            r8 = r6
            r6 = r10
            r10 = r8
        L_0x0076:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00a1 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00a1 }
            if (r10 == 0) goto L_0x0095
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x00a1 }
            androidx.window.layout.t r10 = (androidx.window.layout.C21073t) r10     // Catch:{ all -> 0x00a1 }
            r5.L$0 = r6     // Catch:{ all -> 0x00a1 }
            r5.L$1 = r4     // Catch:{ all -> 0x00a1 }
            r5.L$2 = r1     // Catch:{ all -> 0x00a1 }
            r5.label = r2     // Catch:{ all -> 0x00a1 }
            java.lang.Object r10 = r6.emit(r10, r5)     // Catch:{ all -> 0x00a1 }
            if (r10 != r0) goto L_0x0093
            return r0
        L_0x0093:
            r10 = r6
            goto L_0x0064
        L_0x0095:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r5.this$0
            androidx.window.layout.p r10 = r10.f54265c
            r10.mo62973b(r4)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x00a1:
            r10 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r10 = move-exception
            r5 = r9
        L_0x00a5:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r5.this$0
            androidx.window.layout.p r0 = r0.f54265c
            r0.mo62973b(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
