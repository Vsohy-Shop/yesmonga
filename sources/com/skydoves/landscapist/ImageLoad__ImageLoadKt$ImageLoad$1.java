package com.skydoves.landscapist;

import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.skydoves.landscapist.ImageLoad__ImageLoadKt$ImageLoad$1", mo22502f = "ImageLoad.kt", mo22503i = {}, mo22504l = {57, 59}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class ImageLoad__ImageLoadKt$ImageLoad$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C11045c<? super C11907e<? extends C35334h>>, Object> $executeImageRequest;
    final /* synthetic */ C8700z0<C35334h> $state$delegate;
    int label;

    /* renamed from: com.skydoves.landscapist.ImageLoad__ImageLoadKt$ImageLoad$1$a */
    public static final class C35313a implements C11908f<C35334h> {

        /* renamed from: a */
        public final /* synthetic */ C8700z0<C35334h> f86778a;

        public C35313a(C8700z0<C35334h> z0Var) {
            this.f86778a = z0Var;
        }

        @C12580l
        /* renamed from: c */
        public final Object emit(@C12579k C35334h hVar, @C12579k C11045c<? super C11079d2> cVar) {
            ImageLoad__ImageLoadKt.m145580c(this.f86778a, hVar);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoad__ImageLoadKt$ImageLoad$1(C11300l<? super C11045c<? super C11907e<? extends C35334h>>, ? extends Object> lVar, C8700z0<C35334h> z0Var, C11045c<? super ImageLoad__ImageLoadKt$ImageLoad$1> cVar) {
        super(2, cVar);
        this.$executeImageRequest = lVar;
        this.$state$delegate = z0Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ImageLoad__ImageLoadKt$ImageLoad$1(this.$executeImageRequest, this.$state$delegate, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11300l<C11045c<? super C11907e<? extends C35334h>>, Object> lVar = this.$executeImageRequest;
            this.label = 1;
            obj = ImageLoad__ImageLoadKt.m145583f(lVar, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else if (i == 2) {
            C11661u0.m45747n(obj);
            return C11079d2.f28267a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C35313a aVar = new C35313a(this.$state$delegate);
        this.label = 2;
        if (((C11907e) obj).collect(aVar, this) == h) {
            return h;
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ImageLoad__ImageLoadKt$ImageLoad$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
