package androidx.compose.runtime;

import kotlin.C11079d2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,224:1\n314#2,11:225\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n51#1:225,11\n*E\n"})
public final class ProduceStateScopeImpl<T> implements C8546h1<T>, C8700z0<T> {
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f22700a;

    /* renamed from: b */
    public final /* synthetic */ C8700z0<T> f22701b;

    public ProduceStateScopeImpl(@C12579k C8700z0<T> z0Var, @C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(z0Var, "state");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f22700a = coroutineContext;
        this.f22701b = z0Var;
    }

    @C12579k
    /* renamed from: d */
    public C11300l<T, C11079d2> mo15189d() {
        return this.f22701b.mo15189d();
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f22700a;
    }

    public T getValue() {
        return this.f22701b.getValue();
    }

    /* renamed from: j */
    public T mo15191j() {
        return this.f22701b.mo15191j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo15192n0(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11289a<kotlin.C11079d2> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.functions.a r5 = (kotlin.jvm.functions.C11289a) r5
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x005e }
            goto L_0x0058
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            r0.L$0 = r5     // Catch:{ all -> 0x005e }
            r0.label = r3     // Catch:{ all -> 0x005e }
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch:{ all -> 0x005e }
            kotlin.coroutines.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)     // Catch:{ all -> 0x005e }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x005e }
            r6.mo24537e0()     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r6.mo24572y()     // Catch:{ all -> 0x005e }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ all -> 0x005e }
            if (r6 != r2) goto L_0x0055
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)     // Catch:{ all -> 0x005e }
        L_0x0055:
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x005e }
            r6.<init>()     // Catch:{ all -> 0x005e }
            throw r6     // Catch:{ all -> 0x005e }
        L_0x005e:
            r6 = move-exception
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.mo15192n0(kotlin.jvm.functions.a, kotlin.coroutines.c):java.lang.Object");
    }

    public void setValue(T t) {
        this.f22701b.setValue(t);
    }
}
