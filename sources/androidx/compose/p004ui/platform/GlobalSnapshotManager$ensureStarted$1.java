package androidx.compose.p004ui.platform;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.channels.C11744g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", mo22502f = "GlobalSnapshotManager.android.kt", mo22503i = {0}, mo22504l = {63}, mo22505m = "invokeSuspend", mo22506n = {"$this$consume$iv$iv"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nGlobalSnapshotManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,55:1\n103#2:56\n80#2,6:57\n104#2,2:63\n90#2:65\n86#2,4:66\n*S KotlinDebug\n*F\n+ 1 GlobalSnapshotManager.android.kt\nandroidx/compose/ui/platform/GlobalSnapshotManager$ensureStarted$1\n*L\n45#1:56\n45#1:57,6\n45#1:63,2\n45#1:65\n45#1:66,4\n*E\n"})
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
public final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11744g<C11079d2> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(C11744g<C11079d2> gVar, C11045c<? super GlobalSnapshotManager$ensureStarted$1> cVar) {
        super(2, cVar);
        this.$channel = gVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0060 }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r6.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r6.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.C11661u0.m45747n(r7)     // Catch:{ all -> 0x0063 }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
            goto L_0x0041
        L_0x001b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0023:
            kotlin.C11661u0.m45747n(r7)
            kotlinx.coroutines.channels.g<kotlin.d2> r3 = r6.$channel
            kotlinx.coroutines.channels.ChannelIterator r7 = r3.iterator()     // Catch:{ all -> 0x0063 }
            r1 = r7
            r7 = r6
        L_0x002e:
            r7.L$0 = r3     // Catch:{ all -> 0x0063 }
            r7.L$1 = r1     // Catch:{ all -> 0x0063 }
            r7.label = r2     // Catch:{ all -> 0x0063 }
            java.lang.Object r4 = r1.mo23863c(r7)     // Catch:{ all -> 0x0063 }
            if (r4 != r0) goto L_0x003b
            return r0
        L_0x003b:
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0041:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0060 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0059
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0060 }
            kotlin.d2 r7 = (kotlin.C11079d2) r7     // Catch:{ all -> 0x0060 }
            androidx.compose.runtime.snapshots.f$a r7 = androidx.compose.runtime.snapshots.C8646f.f23196e     // Catch:{ all -> 0x0060 }
            r7.mo16631l()     // Catch:{ all -> 0x0060 }
            r7 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002e
        L_0x0059:
            r7 = 0
            kotlinx.coroutines.channels.C11755m.m46690b(r4, r7)
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        L_0x0060:
            r7 = move-exception
            r3 = r4
            goto L_0x0064
        L_0x0063:
            r7 = move-exception
        L_0x0064:
            throw r7     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            kotlinx.coroutines.channels.C11755m.m46690b(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
