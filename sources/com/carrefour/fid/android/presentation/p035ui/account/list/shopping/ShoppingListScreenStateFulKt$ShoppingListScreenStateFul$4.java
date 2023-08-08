package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import android.content.Context;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.NotificationComponent;
import com.carrefour.fid.android.domain.exceptions.BasketClosedStoreThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketExpiredFacilityStoreIdThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketItemQuantityExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.BasketThrowable;
import com.carrefour.fid.android.domain.exceptions.CategoryLimitationExceededThrowable;
import com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable;
import com.carrefour.fid.android.domain.exceptions.ShoppingListThrowable;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23066f;
import com.carrefour.fid.android.presentation.p035ui.account.list.shopping.C23081i;
import com.carrefour.fid.android.shared.p046io.NetworkException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4", mo22502f = "ShoppingListScreenStateFul.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ Context $context;
    final /* synthetic */ C11289a<C11079d2> $onOpenServiceSelection;
    final /* synthetic */ C11907e<C23081i> $sideEffect;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4$1", mo22502f = "ShoppingListScreenStateFul.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4$1 */
    public static final class C230501 extends SuspendLambda implements C11304p<C23081i, C11045c<? super C11079d2>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C230501 r0 = new C230501(lVar, context, aVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C23081i iVar, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C230501) create(iVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            boolean z;
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C23081i iVar = (C23081i) this.L$0;
                if (iVar instanceof C23081i.C23082a) {
                    C23081i.C23082a aVar = (C23081i.C23082a) iVar;
                    Throwable d = aVar.mo67799d();
                    if (d instanceof CategoryLimitationExceededThrowable) {
                        C11300l<C23066f, C11079d2> lVar = lVar;
                        NotificationComponent.Variant variant = NotificationComponent.Variant.WARNING;
                        String string = context.getResources().getString(R.string.product_category_limit_exceeded);
                        Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…_category_limit_exceeded)");
                        lVar.invoke(new C23066f.C23071e(variant, string));
                    } else if (d instanceof BasketItemQuantityExceededThrowable) {
                        C11300l<C23066f, C11079d2> lVar2 = lVar;
                        NotificationComponent.Variant variant2 = NotificationComponent.Variant.ERROR;
                        String string2 = context.getResources().getString(R.string.fec_basket_module_product_quantity_excecced);
                        Intrinsics.checkNotNullExpressionValue(string2, "context.resources.getStr…roduct_quantity_excecced)");
                        lVar2.invoke(new C23066f.C23071e(variant2, string2));
                    } else if (d instanceof BasketThrowable) {
                        C11300l<C23066f, C11079d2> lVar3 = lVar;
                        NotificationComponent.Variant variant3 = NotificationComponent.Variant.ERROR;
                        String string3 = context.getResources().getString(((BasketThrowable) aVar.mo67799d()).mo114267a().mo114265q());
                        Intrinsics.checkNotNullExpressionValue(string3, "context.resources.getStr…rowable.error.resourceId)");
                        lVar3.invoke(new C23066f.C23071e(variant3, string3));
                    } else if (d instanceof ShoppingListThrowable) {
                        C11300l<C23066f, C11079d2> lVar4 = lVar;
                        NotificationComponent.Variant variant4 = NotificationComponent.Variant.WARNING;
                        String string4 = context.getResources().getString(R.string.general_error_parameters_server_not_responding_03);
                        Intrinsics.checkNotNullExpressionValue(string4, "context.resources.getStr…server_not_responding_03)");
                        lVar4.invoke(new C23066f.C23071e(variant4, string4));
                    } else {
                        if (d instanceof BasketClosedStoreThrowable) {
                            z = true;
                        } else {
                            z = d instanceof BasketExpiredFacilityStoreIdThrowable;
                        }
                        if (z) {
                            C11300l<C23066f, C11079d2> lVar5 = lVar;
                            NotificationComponent.Variant variant5 = NotificationComponent.Variant.WARNING;
                            String string5 = context.getResources().getString(R.string.basket_error_closed_store);
                            Intrinsics.checkNotNullExpressionValue(string5, "context.resources.getStr…asket_error_closed_store)");
                            lVar5.invoke(new C23066f.C23071e(variant5, string5));
                        } else if (d instanceof NetworkException) {
                            C11300l<C23066f, C11079d2> lVar6 = lVar;
                            NotificationComponent.Variant variant6 = NotificationComponent.Variant.ERROR;
                            String string6 = context.getResources().getString(R.string.general_error_no_network_message);
                            Intrinsics.checkNotNullExpressionValue(string6, "context.resources.getStr…error_no_network_message)");
                            lVar6.invoke(new C23066f.C23071e(variant6, string6));
                        } else if (d instanceof RequireServiceSelectionThrowable) {
                            aVar.invoke();
                        }
                    }
                }
                return C11079d2.f28267a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4(C11907e<? extends C23081i> eVar, C11300l<? super C23066f, C11079d2> lVar, Context context, C11289a<C11079d2> aVar, C11045c<? super ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4> cVar) {
        super(2, cVar);
        this.$sideEffect = eVar;
        this.$actioner = lVar;
        this.$context = context;
        this.$onOpenServiceSelection = aVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4 shoppingListScreenStateFulKt$ShoppingListScreenStateFul$4 = new ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4(this.$sideEffect, this.$actioner, this.$context, this.$onOpenServiceSelection, cVar);
        shoppingListScreenStateFulKt$ShoppingListScreenStateFul$4.L$0 = obj;
        return shoppingListScreenStateFulKt$ShoppingListScreenStateFul$4;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C11907e<C23081i> eVar = this.$sideEffect;
            final C11300l<C23066f, C11079d2> lVar = this.$actioner;
            final Context context = this.$context;
            final C11289a<C11079d2> aVar = this.$onOpenServiceSelection;
            C11909g.m47412V0(C11909g.m47448f1(eVar, new C230501((C11045c<? super C230501>) null)), (C12074o0) this.L$0);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$4) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
