package androidx.compose.p004ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.C19499w;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", mo22502f = "WindowRecomposer.android.kt", mo22503i = {0}, mo22504l = {392}, mo22505m = "invokeSuspend", mo22506n = {"durationScaleJob"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 */
public final class C15823x149b840a extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ C15821xff837ba9 $self;
    final /* synthetic */ C19499w $source;
    final /* synthetic */ Ref.ObjectRef<C15843a1> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15823x149b840a(Ref.ObjectRef<C15843a1> objectRef, Recomposer recomposer, C19499w wVar, C15821xff837ba9 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, C11045c<? super C15823x149b840a> cVar) {
        super(2, cVar);
        this.$systemDurationScaleSettingConsumer = objectRef;
        this.$recomposer = recomposer;
        this.$source = wVar;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C15823x149b840a windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new C15823x149b840a(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, cVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            java.lang.Object r0 = r11.L$0
            kotlinx.coroutines.c2 r0 = (kotlinx.coroutines.C11723c2) r0
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0014 }
            goto L_0x006c
        L_0x0014:
            r12 = move-exception
            goto L_0x0086
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001f:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            kotlinx.coroutines.o0 r4 = (kotlinx.coroutines.C12074o0) r4
            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.platform.a1> r12 = r11.$systemDurationScaleSettingConsumer     // Catch:{ all -> 0x0084 }
            T r12 = r12.element     // Catch:{ all -> 0x0084 }
            androidx.compose.ui.platform.a1 r12 = (androidx.compose.p004ui.platform.C15843a1) r12     // Catch:{ all -> 0x0084 }
            if (r12 == 0) goto L_0x005d
            android.view.View r1 = r11.$this_createLifecycleAwareWindowRecomposer     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0084 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0084 }
            java.lang.String r5 = "context.applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)     // Catch:{ all -> 0x0084 }
            kotlinx.coroutines.flow.u r1 = androidx.compose.p004ui.platform.WindowRecomposer_androidKt.m71146e(r1)     // Catch:{ all -> 0x0084 }
            java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0084 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0084 }
            float r5 = r5.floatValue()     // Catch:{ all -> 0x0084 }
            r12.mo45638e(r5)     // Catch:{ all -> 0x0084 }
            r5 = 0
            r6 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch:{ all -> 0x0084 }
            r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0084 }
            r8 = 3
            r9 = 0
            kotlinx.coroutines.c2 r12 = kotlinx.coroutines.C12038j.m48061f(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0084 }
            goto L_0x005e
        L_0x005d:
            r12 = r3
        L_0x005e:
            androidx.compose.runtime.Recomposer r1 = r11.$recomposer     // Catch:{ all -> 0x007f }
            r11.L$0 = r12     // Catch:{ all -> 0x007f }
            r11.label = r2     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r1.mo15236M0(r11)     // Catch:{ all -> 0x007f }
            if (r1 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r0 = r12
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            kotlinx.coroutines.C11723c2.C11724a.m46184b(r0, r3, r2, r3)
        L_0x0071:
            androidx.lifecycle.w r12 = r11.$source
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.$self
            r12.mo57467d(r0)
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x007f:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x0086
        L_0x0084:
            r12 = move-exception
            r0 = r3
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            kotlinx.coroutines.C11723c2.C11724a.m46184b(r0, r3, r2, r3)
        L_0x008b:
            androidx.lifecycle.w r0 = r11.$source
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.$self
            r0.mo57467d(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.platform.C15823x149b840a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C15823x149b840a) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
