package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import com.carrefour.fid.android.presentation.viewmodels.physicalstore.C27121d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1", mo22502f = "PhysicalStoreScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1 */
public final class PhysicalStoreScreenKt$PhysicalStoreStateful$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11289a<C11079d2> $onArsenalError;
    final /* synthetic */ C11289a<C11079d2> $onNavigateToCatalogs;
    final /* synthetic */ C11300l<Boolean, C11079d2> $onNavigationToCouponFragment;
    final /* synthetic */ C11305q<String, String, String, C11079d2> $onOpenArsenalWebView;
    final /* synthetic */ C11300l<String, C11079d2> $onOpenCatalogWebView;
    final /* synthetic */ C11907e<C27121d> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1$1", mo22502f = "PhysicalStoreScreen.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$1$1 */
    public static final class C253231 extends SuspendLambda implements C11304p<C27121d, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C253231 r0 = new C253231(lVar, qVar, aVar, lVar2, aVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C27121d dVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C253231) create(dVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C27121d dVar = (C27121d) this.L$0;
                if (dVar instanceof C27121d.C27122a) {
                    lVar.invoke(C11064a.m42615a(((C27121d.C27122a) dVar).mo78853d()));
                } else if (dVar instanceof C27121d.C27123b) {
                    C27121d.C27123b bVar = (C27121d.C27123b) dVar;
                    qVar.invoke(bVar.mo78862f(), bVar.mo78864h(), bVar.mo78863g());
                } else if (Intrinsics.areEqual((Object) dVar, (Object) C27121d.C27126e.f65969a)) {
                    aVar.invoke();
                } else if (dVar instanceof C27121d.C27124c) {
                    lVar2.invoke(((C27121d.C27124c) dVar).mo78869d());
                } else if (Intrinsics.areEqual((Object) dVar, (Object) C27121d.C27125d.f65967a)) {
                    aVar2.invoke();
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreStateful$1(C11907e<? extends C27121d> eVar, C11300l<? super Boolean, C11079d2> lVar, C11305q<? super String, ? super String, ? super String, C11079d2> qVar, C11289a<C11079d2> aVar, C11300l<? super String, C11079d2> lVar2, C11289a<C11079d2> aVar2, C11045c<? super PhysicalStoreScreenKt$PhysicalStoreStateful$1> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$onNavigationToCouponFragment = lVar;
        this.$onOpenArsenalWebView = qVar;
        this.$onArsenalError = aVar;
        this.$onOpenCatalogWebView = lVar2;
        this.$onNavigateToCatalogs = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        PhysicalStoreScreenKt$PhysicalStoreStateful$1 physicalStoreScreenKt$PhysicalStoreStateful$1 = new PhysicalStoreScreenKt$PhysicalStoreStateful$1(this.$sideEffect, this.$onNavigationToCouponFragment, this.$onOpenArsenalWebView, this.$onArsenalError, this.$onOpenCatalogWebView, this.$onNavigateToCatalogs, cVar);
        physicalStoreScreenKt$PhysicalStoreStateful$1.L$0 = obj;
        return physicalStoreScreenKt$PhysicalStoreStateful$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C27121d> eVar = this.$sideEffect;
            final C11300l<Boolean, C11079d2> lVar = this.$onNavigationToCouponFragment;
            final C11305q<String, String, String, C11079d2> qVar = this.$onOpenArsenalWebView;
            final C11289a<C11079d2> aVar = this.$onArsenalError;
            final C11300l<String, C11079d2> lVar2 = this.$onOpenCatalogWebView;
            final C11289a<C11079d2> aVar2 = this.$onNavigateToCatalogs;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C253231((C11045c<? super C253231>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((PhysicalStoreScreenKt$PhysicalStoreStateful$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
