package com.usabilla.sdk.ubform.utils.ext;

import androidx.exifinterface.media.C19135a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$catchException$1", mo22502f = "ExtensionFlow.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H@"}, mo22516d2 = {"T", "R", "Lkotlinx/coroutines/flow/f;", "", "exception", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ExtensionFlowKt$catchException$1 extends SuspendLambda implements C11305q<C11908f<? super R>, Throwable, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<T, C11079d2> $catch;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExtensionFlowKt$catchException$1(C11300l<? super T, C11079d2> lVar, C11045c<? super ExtensionFlowKt$catchException$1> cVar) {
        super(3, cVar);
        this.$catch = lVar;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super R> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        ExtensionFlowKt$catchException$1 extensionFlowKt$catchException$1 = new ExtensionFlowKt$catchException$1(this.$catch, cVar);
        extensionFlowKt$catchException$1.L$0 = th;
        return extensionFlowKt$catchException$1.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    /* renamed from: h */
    public final Object mo21574h(@C12579k Object obj) {
        Throwable th = (Throwable) this.L$0;
        Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
        if (th instanceof Object) {
            this.$catch.invoke(th);
            return C11079d2.f28267a;
        }
        throw th;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            Throwable th = (Throwable) this.L$0;
            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
            if (th instanceof Object) {
                this.$catch.invoke(th);
                return C11079d2.f28267a;
            }
            throw th;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
