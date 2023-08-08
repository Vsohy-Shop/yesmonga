package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import android.content.Context;
import androidx.compose.runtime.C8700z0;
import com.carrefour.fid.android.presentation.p035ui.coupons.analytics.C23787a;
import com.carrefour.fid.android.presentation.p035ui.coupons.list.C23886i;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$handleSideEffects$1", mo22502f = "CouponsListStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$handleSideEffects$1 */
public final class CouponsListStatefulKt$handleSideEffects$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C23787a $analytics;
    final /* synthetic */ Context $context;
    final /* synthetic */ C11304p<Boolean, Pair<String, String>, C11079d2> $displaySnackbar;
    final /* synthetic */ C8700z0<List<String>> $loadingButtonIds;
    final /* synthetic */ C11289a<C11079d2> $navigateToBarCode;
    final /* synthetic */ C11907e<C23886i> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$handleSideEffects$1$1", mo22502f = "CouponsListStateful.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.CouponsListStatefulKt$handleSideEffects$1$1 */
    public static final class C238391 extends SuspendLambda implements C11304p<C23886i, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C238391 r0 = new C238391(z0Var, pVar, context, aVar, aVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C23886i iVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C238391) create(iVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C23886i iVar = (C23886i) this.L$0;
                if (iVar instanceof C23886i.C23889c) {
                    z0Var.setValue(CollectionsKt__CollectionsKt.m40441E());
                    C11304p<Boolean, Pair<String, String>, C11079d2> pVar = pVar;
                    Boolean a = C11064a.m42615a(false);
                    C23886i.C23889c cVar = (C23886i.C23889c) iVar;
                    boolean h = cVar.mo69969h();
                    Throwable g = cVar.mo69968g();
                    pVar.invoke(a, C23842b.m105566a(context, true, h, false, cVar.mo69967f(), g));
                } else if (iVar instanceof C23886i.C23892f) {
                    z0Var.setValue(((C23886i.C23892f) iVar).mo69994d());
                } else if (iVar instanceof C23886i.C23891e) {
                    z0Var.setValue(CollectionsKt__CollectionsKt.m40441E());
                    C23886i.C23891e eVar = (C23886i.C23891e) iVar;
                    pVar.invoke(C11064a.m42615a(true), C23842b.m105566a(context, false, eVar.mo69988g(), eVar.mo69989h(), eVar.mo69987f(), (Throwable) null));
                } else if (iVar instanceof C23886i.C23890d) {
                    z0Var.setValue(CollectionsKt__CollectionsKt.m40441E());
                    C23886i.C23890d dVar = (C23886i.C23890d) iVar;
                    pVar.invoke(C11064a.m42615a(false), C23842b.m105566a(context, true, dVar.mo69978g(), dVar.mo69979h(), dVar.mo69977f(), (Throwable) null));
                } else if (iVar instanceof C23886i.C23887a) {
                    aVar.mo69676e();
                    aVar2.invoke();
                } else if (iVar instanceof C23886i.C23888b) {
                    pVar.invoke(C11064a.m42615a(false), C23842b.m105566a(context, true, true, false, false, (Throwable) null));
                    aVar2.invoke();
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponsListStatefulKt$handleSideEffects$1(C11907e<? extends C23886i> eVar, C8700z0<List<String>> z0Var, C11304p<? super Boolean, ? super Pair<String, String>, C11079d2> pVar, Context context, C23787a aVar, C11289a<C11079d2> aVar2, C11045c<? super CouponsListStatefulKt$handleSideEffects$1> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$loadingButtonIds = z0Var;
        this.$displaySnackbar = pVar;
        this.$context = context;
        this.$analytics = aVar;
        this.$navigateToBarCode = aVar2;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        CouponsListStatefulKt$handleSideEffects$1 couponsListStatefulKt$handleSideEffects$1 = new CouponsListStatefulKt$handleSideEffects$1(this.$sideEffect, this.$loadingButtonIds, this.$displaySnackbar, this.$context, this.$analytics, this.$navigateToBarCode, cVar);
        couponsListStatefulKt$handleSideEffects$1.L$0 = obj;
        return couponsListStatefulKt$handleSideEffects$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C23886i> eVar = this.$sideEffect;
            final C8700z0<List<String>> z0Var = this.$loadingButtonIds;
            final C11304p<Boolean, Pair<String, String>, C11079d2> pVar = this.$displaySnackbar;
            final Context context = this.$context;
            final C23787a aVar = this.$analytics;
            final C11289a<C11079d2> aVar2 = this.$navigateToBarCode;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C238391((C11045c<? super C238391>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CouponsListStatefulKt$handleSideEffects$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
