package com.skydoves.landscapist;

import com.skydoves.landscapist.C35334h;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.skydoves.landscapist.ImageLoad__ImageLoadKt$executeImageLoading$3", mo22502f = "ImageLoad.kt", mo22503i = {}, mo22504l = {75}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/skydoves/landscapist/h;", "", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class ImageLoad__ImageLoadKt$executeImageLoading$3 extends SuspendLambda implements C11305q<C11908f<? super C35334h>, Throwable, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public ImageLoad__ImageLoadKt$executeImageLoading$3(C11045c<? super ImageLoad__ImageLoadKt$executeImageLoading$3> cVar) {
        super(3, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C35334h> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
        ImageLoad__ImageLoadKt$executeImageLoading$3 imageLoad__ImageLoadKt$executeImageLoading$3 = new ImageLoad__ImageLoadKt$executeImageLoading$3(cVar);
        imageLoad__ImageLoadKt$executeImageLoading$3.L$0 = fVar;
        return imageLoad__ImageLoadKt$executeImageLoading$3.invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C35334h.C35335a aVar = new C35334h.C35335a((Object) null);
            this.label = 1;
            if (((C11908f) this.L$0).emit(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
