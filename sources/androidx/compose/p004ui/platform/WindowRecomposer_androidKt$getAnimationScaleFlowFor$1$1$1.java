package androidx.compose.p004ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.compose.p004ui.platform.WindowRecomposer_androidKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.channels.C11744g;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", mo22502f = "WindowRecomposer.android.kt", mo22503i = {0, 1}, mo22504l = {115, 121}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow"}, mo22507s = {"L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 */
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements C11304p<C11908f<? super Float>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ C11744g<C11079d2> $channel;
    final /* synthetic */ WindowRecomposer_androidKt.C15820b $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, WindowRecomposer_androidKt.C15820b bVar, C11744g<C11079d2> gVar, Context context, C11045c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> cVar) {
        super(2, cVar);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = bVar;
        this.$channel = gVar;
        this.$applicationContext = context;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, cVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Float> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x008f }] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0091 }
            r10 = r4
            goto L_0x0048
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r4 = r9.L$0
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0091 }
            r5 = r4
            r4 = r9
            goto L_0x0059
        L_0x0031:
            kotlin.C11661u0.m45747n(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.f r10 = (kotlinx.coroutines.flow.C11908f) r10
            android.content.ContentResolver r1 = r9.$resolver
            android.net.Uri r4 = r9.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r6 = r9.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            kotlinx.coroutines.channels.g<kotlin.d2> r1 = r9.$channel     // Catch:{ all -> 0x0091 }
            kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x0048:
            r4 = r9
        L_0x0049:
            r4.L$0 = r10     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r1.mo23863c(r4)     // Catch:{ all -> 0x008f }
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x0059:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x008f }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x0085
            r1.next()     // Catch:{ all -> 0x008f }
            android.content.Context r10 = r4.$applicationContext     // Catch:{ all -> 0x008f }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r10)     // Catch:{ all -> 0x008f }
            r4.L$0 = r5     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r2     // Catch:{ all -> 0x008f }
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch:{ all -> 0x008f }
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r10 = r5
            goto L_0x0049
        L_0x0085:
            android.content.ContentResolver r10 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r0 = r4.$contentObserver
            r10.unregisterContentObserver(r0)
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            return r10
        L_0x008f:
            r10 = move-exception
            goto L_0x0093
        L_0x0091:
            r10 = move-exception
            r4 = r9
        L_0x0093:
            android.content.ContentResolver r0 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$b r1 = r4.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
