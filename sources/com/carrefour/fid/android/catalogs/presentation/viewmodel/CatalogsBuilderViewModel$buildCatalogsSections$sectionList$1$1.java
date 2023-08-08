package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import androidx.lifecycle.C19500w0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $forceStoreDisplayIfAvailable;
    final /* synthetic */ CatalogsBuilderViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$1$1", mo22502f = "CatalogsBuilderViewModel.kt", mo22503i = {}, mo22504l = {153}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$1$1 */
    public static final class C396091 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C396091(catalogsBuilderViewModel, z, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                CatalogsBuilderViewModel catalogsBuilderViewModel = catalogsBuilderViewModel;
                boolean z = z;
                this.label = 1;
                if (catalogsBuilderViewModel.mo130845m0(z, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C396091) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$1(CatalogsBuilderViewModel catalogsBuilderViewModel, boolean z) {
        super(0);
        this.this$0 = catalogsBuilderViewModel;
        this.$forceStoreDisplayIfAvailable = z;
    }

    public final void invoke() {
        C12074o0 a = C19500w0.m90846a(this.this$0);
        final CatalogsBuilderViewModel catalogsBuilderViewModel = this.this$0;
        final boolean z = this.$forceStoreDisplayIfAvailable;
        C11723c2 unused = C12038j.m48061f(a, (CoroutineContext) null, (CoroutineStart) null, new C396091((C11045c<? super C396091>) null), 3, (Object) null);
    }
}
