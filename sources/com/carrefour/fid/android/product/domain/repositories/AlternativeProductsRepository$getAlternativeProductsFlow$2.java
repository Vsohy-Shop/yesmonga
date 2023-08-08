package com.carrefour.fid.android.product.domain.repositories;

import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository$getAlternativeProductsFlow$2", mo22502f = "AlternativeProductsRepository.kt", mo22503i = {0}, mo22504l = {20, 24}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow"}, mo22507s = {"L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/product/plp/c;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAlternativeProductsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeProductsRepository.kt\ncom/carrefour/fid/android/product/domain/repositories/AlternativeProductsRepository$getAlternativeProductsFlow$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class AlternativeProductsRepository$getAlternativeProductsFlow$2 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends List<? extends C38115c>>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ String $facilityServiceId;
    final /* synthetic */ String $gtin;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AlternativeProductsRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlternativeProductsRepository$getAlternativeProductsFlow$2(AlternativeProductsRepository alternativeProductsRepository, String str, String str2, C11045c<? super AlternativeProductsRepository$getAlternativeProductsFlow$2> cVar) {
        super(2, cVar);
        this.this$0 = alternativeProductsRepository;
        this.$gtin = str;
        this.$facilityServiceId = str2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        AlternativeProductsRepository$getAlternativeProductsFlow$2 alternativeProductsRepository$getAlternativeProductsFlow$2 = new AlternativeProductsRepository$getAlternativeProductsFlow$2(this.this$0, this.$gtin, this.$facilityServiceId, cVar);
        alternativeProductsRepository$getAlternativeProductsFlow$2.L$0 = obj;
        return alternativeProductsRepository$getAlternativeProductsFlow$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<? extends List<C38115c>>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((AlternativeProductsRepository$getAlternativeProductsFlow$2) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0067
        L_0x0012:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001a:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x0045
        L_0x0028:
            kotlin.C11661u0.m45747n(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository r7 = r6.this$0
            com.carrefour.fid.android.product.data.api.datasource.PlpProductListDataSource r7 = r7.f67038a
            java.lang.String r4 = r6.$gtin
            java.lang.String r5 = r6.$facilityServiceId
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.mo79831a(r4, r5, r6)
            if (r7 != r0) goto L_0x0045
            return r0
        L_0x0045:
            boolean r3 = kotlin.Result.m38710j(r7)
            if (r3 == 0) goto L_0x0053
            kotlin.Result$a r3 = kotlin.Result.f28060a
            com.carrefour.fid.android.product.domain.model.b r7 = (com.carrefour.fid.android.product.domain.model.C27584b) r7
            java.util.List r7 = r7.mo80078p()
        L_0x0053:
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            kotlin.Result r7 = kotlin.Result.m38701a(r7)
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L_0x0067
            return r0
        L_0x0067:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.repositories.AlternativeProductsRepository$getAlternativeProductsFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
