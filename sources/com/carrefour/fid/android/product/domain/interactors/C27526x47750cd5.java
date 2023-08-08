package com.carrefour.fid.android.product.domain.interactors;

import com.carrefour.fid.android.domain.interactors.product.C37758g;
import com.carrefour.fid.android.domain.models.criteo.C38011m;
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

@C11067d(mo22501c = "com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$getCriteoProductsFlow$2", mo22502f = "ProductGetConsolidatedCriteoProductsFlowUseCase.kt", mo22503i = {1, 2, 3, 4, 5}, mo22504l = {52, 56, 65, 69, 71, 75, 79}, mo22505m = "invokeSuspend", mo22506n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, mo22507s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/criteo/m;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase$getCriteoProductsFlow$2 */
public final class C27526x47750cd5 extends SuspendLambda implements C11304p<C11908f<? super Result<? extends C38011m>>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C37758g.C37759a $param;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ProductGetConsolidatedCriteoProductsFlowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27526x47750cd5(C37758g.C37759a aVar, ProductGetConsolidatedCriteoProductsFlowUseCase productGetConsolidatedCriteoProductsFlowUseCase, C11045c<? super C27526x47750cd5> cVar) {
        super(2, cVar);
        this.$param = aVar;
        this.this$0 = productGetConsolidatedCriteoProductsFlowUseCase;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        C27526x47750cd5 productGetConsolidatedCriteoProductsFlowUseCase$getCriteoProductsFlow$2 = new C27526x47750cd5(this.$param, this.this$0, cVar);
        productGetConsolidatedCriteoProductsFlowUseCase$getCriteoProductsFlow$2.L$0 = obj;
        return productGetConsolidatedCriteoProductsFlowUseCase$getCriteoProductsFlow$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super Result<? extends C38011m>> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((C27526x47750cd5) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlinx.coroutines.flow.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0090, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r3 = r11.$param;
        r4 = r11.this$0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ab, code lost:
        if (kotlin.Result.m38710j(r12) == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r12;
        r6 = new com.carrefour.fid.android.domain.interactors.utilities.C37890c.C37891a(r3.mo115028e(), (com.carrefour.fid.android.domain.models.luckycart.C38048b) null, com.carrefour.fid.android.shared.extension.C28762j0.m119069b(r5), com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r5));
        r5 = r4.f66826a;
        r11.L$0 = r1;
        r11.L$1 = r12;
        r11.L$2 = r3;
        r11.L$3 = r4;
        r11.label = 3;
        r5 = r5.m172966invokegIAlus(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d4, code lost:
        if (r5 != r0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d7, code lost:
        r9 = r3;
        r3 = r12;
        r12 = r9;
        r10 = r5;
        r5 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e1, code lost:
        if (kotlin.Result.m38710j(r1) == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e3, code lost:
        r6 = ((com.carrefour.fid.android.domain.utilities.C38207a) r1).mo119628e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        if (r6 == null) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ec, code lost:
        r7 = kotlin.Result.f28060a;
        r12 = kotlin.Result.m38701a(kotlin.Result.m38702b(r4.mo79954i(r6, r12.mo115030f())));
        r11.L$0 = r5;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.L$3 = null;
        r11.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010d, code lost:
        if (r5.emit(r12, r11) != r0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0110, code lost:
        r12 = kotlin.Result.f28060a;
        r12 = kotlin.Result.m38701a(kotlin.Result.m38702b(kotlin.C11661u0.m45734a(new java.lang.Throwable("Cannot get Criteo products"))));
        r11.L$0 = r5;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.L$3 = null;
        r11.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0134, code lost:
        if (r5.emit(r12, r11) != r0) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0136, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0138, code lost:
        r12 = kotlin.Result.m38705e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013c, code lost:
        if (r12 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x013e, code lost:
        r5 = kotlin.Result.f28060a;
        r12 = kotlin.Result.m38701a(kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r12)));
        r11.L$0 = r4;
        r11.L$1 = r3;
        r11.L$2 = r1;
        r11.L$3 = null;
        r11.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015b, code lost:
        if (r4.emit(r12, r11) != r0) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x015d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x015e, code lost:
        r1 = r3;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0160, code lost:
        r12 = r1;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
        r12 = r3;
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0165, code lost:
        r3 = kotlin.Result.m38705e(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0169, code lost:
        if (r3 == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x016b, code lost:
        r4 = kotlin.Result.f28060a;
        r3 = kotlin.Result.m38701a(kotlin.Result.m38702b(kotlin.C11661u0.m45734a(r3)));
        r11.L$0 = r12;
        r11.L$1 = null;
        r11.L$2 = null;
        r11.L$3 = null;
        r11.label = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0188, code lost:
        if (r1.emit(r3, r11) != r0) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018d, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r11.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005b;
                case 2: goto L_0x004d;
                case 3: goto L_0x002f;
                case 4: goto L_0x0022;
                case 5: goto L_0x0022;
                case 6: goto L_0x0017;
                case 7: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0012:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x018b
        L_0x0017:
            java.lang.Object r1 = r11.L$1
            java.lang.Object r3 = r11.L$0
            kotlinx.coroutines.flow.f r3 = (kotlinx.coroutines.flow.C11908f) r3
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0160
        L_0x0022:
            java.lang.Object r1 = r11.L$2
            java.lang.Object r3 = r11.L$1
            java.lang.Object r4 = r11.L$0
            kotlinx.coroutines.flow.f r4 = (kotlinx.coroutines.flow.C11908f) r4
            kotlin.C11661u0.m45747n(r12)
            goto L_0x0138
        L_0x002f:
            java.lang.Object r1 = r11.L$3
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r1 = (com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase) r1
            java.lang.Object r3 = r11.L$2
            com.carrefour.fid.android.domain.interactors.product.g$a r3 = (com.carrefour.fid.android.domain.interactors.product.C37758g.C37759a) r3
            java.lang.Object r4 = r11.L$1
            java.lang.Object r5 = r11.L$0
            kotlinx.coroutines.flow.f r5 = (kotlinx.coroutines.flow.C11908f) r5
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            r9 = r1
            r1 = r12
            r12 = r3
            r3 = r4
            r4 = r9
            goto L_0x00dd
        L_0x004d:
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            kotlin.C11661u0.m45747n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r12 = r12.mo21858l()
            goto L_0x00a3
        L_0x005b:
            kotlin.C11661u0.m45747n(r12)
            goto L_0x008e
        L_0x005f:
            kotlin.C11661u0.m45747n(r12)
            java.lang.Object r12 = r11.L$0
            r1 = r12
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.C11908f) r1
            com.carrefour.fid.android.domain.interactors.product.g$a r12 = r11.$param
            int r12 = r12.mo115030f()
            if (r12 >= 0) goto L_0x0091
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "criteoProductsCount cannot be negative"
            r12.<init>(r2)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            kotlin.Result r12 = kotlin.Result.m38701a(r12)
            r2 = 1
            r11.label = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L_0x008e
            return r0
        L_0x008e:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        L_0x0091:
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r12 = r11.this$0
            com.carrefour.fid.android.domain.interactors.service.k r12 = r12.f66827b
            r11.L$0 = r1
            r3 = 2
            r11.label = r3
            java.lang.Object r12 = r12.m172965invokeIoAF18A(r11)
            if (r12 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            com.carrefour.fid.android.domain.interactors.product.g$a r3 = r11.$param
            com.carrefour.fid.android.product.domain.interactors.ProductGetConsolidatedCriteoProductsFlowUseCase r4 = r11.this$0
            boolean r5 = kotlin.Result.m38710j(r12)
            if (r5 == 0) goto L_0x0165
            r5 = r12
            com.carrefour.fid.android.domain.models.service.models.k r5 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r5
            com.carrefour.fid.android.domain.interactors.utilities.c$a r6 = new com.carrefour.fid.android.domain.interactors.utilities.c$a
            com.carrefour.fid.android.domain.models.criteo.h r7 = r3.mo115028e()
            java.lang.String r8 = com.carrefour.fid.android.shared.extension.C28762j0.m119069b(r5)
            java.lang.String r5 = com.carrefour.fid.android.shared.extension.C28762j0.m119068a(r5)
            r6.<init>(r7, r2, r8, r5)
            com.carrefour.fid.android.domain.interactors.utilities.c r5 = r4.f66826a
            r11.L$0 = r1
            r11.L$1 = r12
            r11.L$2 = r3
            r11.L$3 = r4
            r7 = 3
            r11.label = r7
            java.lang.Object r5 = r5.m172966invokegIAlus(r6, r11)
            if (r5 != r0) goto L_0x00d7
            return r0
        L_0x00d7:
            r9 = r3
            r3 = r12
            r12 = r9
            r10 = r5
            r5 = r1
            r1 = r10
        L_0x00dd:
            boolean r6 = kotlin.Result.m38710j(r1)
            if (r6 == 0) goto L_0x0137
            r6 = r1
            com.carrefour.fid.android.domain.utilities.a r6 = (com.carrefour.fid.android.domain.utilities.C38207a) r6
            com.carrefour.fid.android.domain.models.criteo.c r6 = r6.mo119628e()
            if (r6 == 0) goto L_0x0110
            kotlin.Result$a r7 = kotlin.Result.f28060a
            int r12 = r12.mo115030f()
            com.carrefour.fid.android.domain.models.criteo.m r12 = r4.mo79954i(r6, r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            kotlin.Result r12 = kotlin.Result.m38701a(r12)
            r11.L$0 = r5
            r11.L$1 = r3
            r11.L$2 = r1
            r11.L$3 = r2
            r4 = 4
            r11.label = r4
            java.lang.Object r12 = r5.emit(r12, r11)
            if (r12 != r0) goto L_0x0137
            return r0
        L_0x0110:
            kotlin.Result$a r12 = kotlin.Result.f28060a
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r4 = "Cannot get Criteo products"
            r12.<init>(r4)
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            kotlin.Result r12 = kotlin.Result.m38701a(r12)
            r11.L$0 = r5
            r11.L$1 = r3
            r11.L$2 = r1
            r11.L$3 = r2
            r4 = 5
            r11.label = r4
            java.lang.Object r12 = r5.emit(r12, r11)
            if (r12 != r0) goto L_0x0137
            return r0
        L_0x0137:
            r4 = r5
        L_0x0138:
            java.lang.Throwable r12 = kotlin.Result.m38705e(r1)
            if (r12 == 0) goto L_0x0163
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r12 = kotlin.C11661u0.m45734a(r12)
            java.lang.Object r12 = kotlin.Result.m38702b(r12)
            kotlin.Result r12 = kotlin.Result.m38701a(r12)
            r11.L$0 = r4
            r11.L$1 = r3
            r11.L$2 = r1
            r11.L$3 = r2
            r1 = 6
            r11.label = r1
            java.lang.Object r12 = r4.emit(r12, r11)
            if (r12 != r0) goto L_0x015e
            return r0
        L_0x015e:
            r1 = r3
            r3 = r4
        L_0x0160:
            r12 = r1
            r1 = r3
            goto L_0x0165
        L_0x0163:
            r12 = r3
            r1 = r4
        L_0x0165:
            java.lang.Throwable r3 = kotlin.Result.m38705e(r12)
            if (r3 == 0) goto L_0x018b
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.Object r3 = kotlin.C11661u0.m45734a(r3)
            java.lang.Object r3 = kotlin.Result.m38702b(r3)
            kotlin.Result r3 = kotlin.Result.m38701a(r3)
            r11.L$0 = r12
            r11.L$1 = r2
            r11.L$2 = r2
            r11.L$3 = r2
            r12 = 7
            r11.label = r12
            java.lang.Object r12 = r1.emit(r3, r11)
            if (r12 != r0) goto L_0x018b
            return r0
        L_0x018b:
            kotlin.d2 r12 = kotlin.C11079d2.f28267a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.product.domain.interactors.C27526x47750cd5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
