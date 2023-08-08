package com.skydoves.landscapist;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.skydoves.landscapist.ImageLoad__ImageLoadKt$executeImageLoading$2", mo22502f = "ImageLoad.kt", mo22503i = {}, mo22504l = {72, 72}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lcom/skydoves/landscapist/h;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 6, 0})
public final class ImageLoad__ImageLoadKt$executeImageLoading$2 extends SuspendLambda implements C11304p<C11908f<? super C35334h>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C11045c<? super C11907e<? extends C35334h>>, Object> $executeImageRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageLoad__ImageLoadKt$executeImageLoading$2(C11300l<? super C11045c<? super C11907e<? extends C35334h>>, ? extends Object> lVar, C11045c<? super ImageLoad__ImageLoadKt$executeImageLoading$2> cVar) {
        super(2, cVar);
        this.$executeImageRequest = lVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ImageLoad__ImageLoadKt$executeImageLoading$2 imageLoad__ImageLoadKt$executeImageLoading$2 = new ImageLoad__ImageLoadKt$executeImageLoading$2(this.$executeImageRequest, cVar);
        imageLoad__ImageLoadKt$executeImageLoading$2.L$0 = obj;
        return imageLoad__ImageLoadKt$executeImageLoading$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super C35334h> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ImageLoad__ImageLoadKt$executeImageLoading$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0045
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0037
        L_0x0022:
            kotlin.C11661u0.m45747n(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.jvm.functions.l<kotlin.coroutines.c<? super kotlinx.coroutines.flow.e<? extends com.skydoves.landscapist.h>>, java.lang.Object> r5 = r4.$executeImageRequest
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r5.invoke(r4)
            if (r5 != r0) goto L_0x0037
            return r0
        L_0x0037:
            kotlinx.coroutines.flow.e r5 = (kotlinx.coroutines.flow.C11907e) r5
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.C11909g.m47471m0(r1, r5, r4)
            if (r5 != r0) goto L_0x0045
            return r0
        L_0x0045:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.landscapist.ImageLoad__ImageLoadKt$executeImageLoading$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
