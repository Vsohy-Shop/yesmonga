package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.C2455e;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.checkout.presentation.p071ui.basket.component.CheckoutSummaryKt;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.basket.BasketPromotionCode;
import com.carrefour.fid.android.domain.models.basket.BasketReturnableBags;
import com.carrefour.fid.android.presentation.models.C38454b;
import com.carrefour.fid.android.presentation.models.OfferProductModel;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.C23520c;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step1.component.ClearBasketComponentKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep1Stateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,600:1\n1855#2:601\n1856#2:614\n1045#2:615\n1855#2:616\n1856#2:629\n171#3,12:602\n171#3,12:617\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2\n*L\n347#1:601\n347#1:614\n366#1:615\n366#1:616\n366#1:629\n358#1:602,12\n373#1:617,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2 */
public final class NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23520c, C11079d2> $actioner;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ List<C38454b> $bundles;
    final /* synthetic */ Map<String, List<OfferProductModel>> $offers;
    final /* synthetic */ boolean $showPreparationFees;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 NonFoodCheckoutStep1Stateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step1/NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2\n*L\n1#1,328:1\n366#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step1.NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$a */
    public static final class C23507a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C11006g.m42424l((String) t, (String) t2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2(List<C38454b> list, Map<String, ? extends List<? extends OfferProductModel>> map, C11300l<? super C23520c, C11079d2> lVar, int i, Basket basket, boolean z) {
        super(1);
        this.$bundles = list;
        this.$offers = map;
        this.$actioner = lVar;
        this.$$dirty = i;
        this.$basket = basket;
        this.$showPreparationFees = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        LazyListScope lazyListScope2 = lazyListScope;
        Intrinsics.checkNotNullParameter(lazyListScope2, "$this$LazyColumn");
        C11300l<C23520c, C11079d2> lVar = this.$actioner;
        int i = this.$$dirty;
        Iterator it = this.$bundles.iterator();
        while (true) {
            C23499x185822bb nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$invoke$lambda$1$$inlined$itemsIndexed$default$1 = null;
            if (!it.hasNext()) {
                break;
            }
            C38454b bVar = (C38454b) it.next();
            if (!bVar.mo122002f().isEmpty()) {
                LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(-128173645, true, new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$1(bVar)), 3, (Object) null);
            }
            List<OfferProductModel> f = bVar.mo122002f();
            NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 = NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2.f59429f;
            int size = f.size();
            if (nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2 != null) {
                nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$invoke$lambda$1$$inlined$itemsIndexed$default$1 = new C23499x185822bb(nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$1$2, f);
            }
            lazyListScope2.mo8310k(size, nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$invoke$lambda$1$$inlined$itemsIndexed$default$1, new C23500x185822bc(f), C8553b.m31049c(-1091073711, true, new C23501x185822bd(f, lVar, i)));
        }
        Map<String, List<OfferProductModel>> map = this.$offers;
        C11300l<C23520c, C11079d2> lVar2 = this.$actioner;
        int i2 = this.$$dirty;
        for (String str : CollectionsKt___CollectionsKt.m40675p5(this.$offers.keySet(), new C23507a())) {
            List list = map.get(str);
            if (list != null) {
                LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(993303949, true, new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$1(str, list)), 3, (Object) null);
                NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$2 nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$2 = NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$2.f59430f;
                lazyListScope2.mo8310k(list.size(), nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$2 != null ? new C23502x91df56be(nonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$3$2, list) : null, new C23503x91df56bf(list), C8553b.m31049c(-1091073711, true, new C23504x91df56c0(list, lVar2, i2)));
            }
        }
        final C11300l<C23520c, C11079d2> lVar3 = this.$actioner;
        final int i3 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(-1952181848, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                Intrinsics.checkNotNullParameter(eVar, "$this$item");
                if ((i & 81) != 16 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-1952181848, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketListDetails.<anonymous>.<anonymous> (NonFoodCheckoutStep1Stateful.kt:380)");
                    }
                    C11300l<C23520c, C11079d2> lVar = lVar3;
                    oVar.mo14918M(1157296644);
                    boolean n0 = oVar.mo15006n0(lVar);
                    Object N = oVar.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new NonFoodCheckoutStep1StatefulKt$CheckoutBasketListDetails$2$4$1$1(lVar);
                        oVar.mo14893C(N);
                    }
                    oVar.mo15002m0();
                    ClearBasketComponentKt.m104748a((C8767m) null, (C11289a) N, oVar, 0, 1);
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 3, (Object) null);
        final Basket basket = this.$basket;
        final boolean z = this.$showPreparationFees;
        final int i4 = this.$$dirty;
        LazyListScope.m10824g(lazyListScope, (Object) null, (Object) null, C8553b.m31049c(-26084193, true, new C11305q<C2455e, C8592o, Integer, C11079d2>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((C2455e) obj, (C8592o) obj2, ((Number) obj3).intValue());
                return C11079d2.f28267a;
            }

            @C8540g
            @C8570j(applier = "androidx.compose.ui.UiComposable")
            public final void invoke(@C12579k C2455e eVar, @C12580l C8592o oVar, int i) {
                Intrinsics.checkNotNullParameter(eVar, "$this$item");
                if ((i & 81) != 16 || !oVar.mo15011p()) {
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29845w0(-26084193, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step1.CheckoutBasketListDetails.<anonymous>.<anonymous> (NonFoodCheckoutStep1Stateful.kt:386)");
                    }
                    Basket basket = basket;
                    if ((basket != null ? basket.mo116855w() : null) != null) {
                        C8767m k = PaddingKt.m10024k(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 16));
                        BasketAmounts w = basket.mo116855w();
                        BasketPromotionCode E = basket.mo116820E();
                        BasketReturnableBags H = basket.mo116823H();
                        int i2 = 0;
                        for (Number intValue : basket.mo116821F().values()) {
                            i2 += intValue.intValue();
                        }
                        CheckoutSummaryKt.m162552a(k, w, E, H, i2, z, 0, oVar, ((i4 << 3) & 458752) | 4672, 64);
                    }
                    if (ComposerKt.m29813g0()) {
                        ComposerKt.m29843v0();
                        return;
                    }
                    return;
                }
                oVar.mo14958a0();
            }
        }), 3, (Object) null);
        this.$actioner.invoke(C23520c.C23530e.C23532b.f59460a);
    }
}
