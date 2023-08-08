package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.product.domain.model.C27583a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.PlpProductRepository$getProduct$1", mo22502f = "PlpProductRepository.kt", mo22503i = {0}, mo22504l = {50, 55}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/product/domain/model/a;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class PlpProductRepository$getProduct$1 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends C27583a>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $gtin;
    final /* synthetic */ String $slotSlice;
    final /* synthetic */ List<String> $storeServices;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PlpProductRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpProductRepository$getProduct$1(PlpProductRepository plpProductRepository, List<String> list, String str, String str2, C11045c<? super PlpProductRepository$getProduct$1> cVar) {
        super(2, cVar);
        this.this$0 = plpProductRepository;
        this.$storeServices = list;
        this.$gtin = str;
        this.$slotSlice = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PlpProductRepository$getProduct$1 plpProductRepository$getProduct$1 = new PlpProductRepository$getProduct$1(this.this$0, this.$storeServices, this.$gtin, this.$slotSlice, cVar);
        plpProductRepository$getProduct$1.L$0 = obj;
        return plpProductRepository$getProduct$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<C27583a>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PlpProductRepository$getProduct$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0057
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001a:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0047
        L_0x0028:
            kotlin.C11661u0.m45747n(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            com.carrefour.fid.android.product.domain.repositories.PlpProductRepository r8 = r7.this$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r8 = r8.f67048a
            java.util.List<java.lang.String> r4 = r7.$storeServices
            java.lang.String r5 = r7.$gtin
            java.lang.String r6 = r7.$slotSlice
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = r8.mo79833d(r4, r5, r6, r7)
            if (r8 != r0) goto L_0x0047
            return r0
        L_0x0047:
            kotlin.Result r8 = kotlin.Result.m38701a(r8)
            r3 = 0
            r7.L$0 = r3
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L_0x0057
            return r0
        L_0x0057:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.PlpProductRepository$getProduct$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
