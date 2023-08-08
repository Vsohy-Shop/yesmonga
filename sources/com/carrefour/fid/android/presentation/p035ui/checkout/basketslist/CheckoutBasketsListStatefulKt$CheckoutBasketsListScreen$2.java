package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist;

import androidx.compose.foundation.layout.C2366i0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23460b;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.analytics.C23456a;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.Collection;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCheckoutBasketsListStateful.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n1774#2,4:188\n*S KotlinDebug\n*F\n+ 1 CheckoutBasketsListStateful.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2\n*L\n108#1:188,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2 */
public final class CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2 extends Lambda implements C11305q<C2366i0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23460b, C11079d2> $actioner;
    final /* synthetic */ C23456a $analytics;
    final /* synthetic */ C28892e<List<Basket>> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutBasketsListStatefulKt$CheckoutBasketsListScreen$2(C28892e<? extends List<Basket>> eVar, C23456a aVar, C11300l<? super C23460b, C11079d2> lVar, int i) {
        super(3);
        this.$state = eVar;
        this.$analytics = aVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2366i0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2366i0 i0Var, @C12580l C8592o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(i0Var, "it");
        if ((i & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-182176482, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.CheckoutBasketsListScreen.<anonymous> (CheckoutBasketsListStateful.kt:102)");
            }
            C28892e<List<Basket>> eVar = this.$state;
            if (Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28896d.f70785b) ? true : Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28894b.f70781b)) {
                oVar.mo14918M(-79226996);
                CheckoutBasketsListStatefulKt.m104515a(oVar, 0);
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28893a) {
                oVar.mo14918M(-79226944);
                C23456a aVar = this.$analytics;
                C11300l<C23460b, C11079d2> lVar = this.$actioner;
                int i3 = C28892e.C28893a.f70779c;
                int i4 = this.$$dirty;
                CheckoutBasketsListStatefulKt.m104519e((C28892e.C28893a) this.$state, aVar, lVar, oVar, i3 | (i4 & 112) | (i4 & 896));
                oVar.mo15002m0();
            } else if (eVar instanceof C28892e.C28895c) {
                oVar.mo14918M(-79226830);
                Iterable<Basket> iterable = (Iterable) ((C28892e.C28895c) this.$state).mo84088d();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    i2 = 0;
                    for (Basket D : iterable) {
                        if ((D.mo116819D() > 0) && (i2 = i2 + 1) < 0) {
                            CollectionsKt__CollectionsKt.m40458V();
                        }
                    }
                } else {
                    i2 = 0;
                }
                if (i2 == 1) {
                    C11300l<C23460b, C11079d2> lVar2 = this.$actioner;
                    BasketType N = ((Basket) CollectionsKt___CollectionsKt.m40706w2((List) ((C28892e.C28895c) this.$state).mo84088d())).mo116829N();
                    if (N == null) {
                        N = BasketType.BASKET_V4_DRIVE;
                    }
                    lVar2.invoke(new C23460b.C23464d(false, N, ((Basket) CollectionsKt___CollectionsKt.m40706w2((List) ((C28892e.C28895c) this.$state).mo84088d())).mo116822G(), ((Basket) CollectionsKt___CollectionsKt.m40706w2((List) ((C28892e.C28895c) this.$state).mo84088d())).mo116830O()));
                } else {
                    CheckoutBasketsListStatefulKt.m104516b((List) ((C28892e.C28895c) this.$state).mo84088d(), this.$actioner, oVar, ((this.$$dirty >> 3) & 112) | 8);
                }
                oVar.mo15002m0();
            } else {
                oVar.mo14918M(-79226159);
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}
