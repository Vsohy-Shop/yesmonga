package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.domain.models.basket.BasketAmounts;
import com.carrefour.fid.android.domain.models.delivery.C38017b;
import com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.analytics.C23614a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nNonFoodCheckoutStep2Screen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,932:1\n288#2,2:933\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2Screen.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6\n*L\n294#1:933,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6 */
public final class NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C23614a $analytics;
    final /* synthetic */ C8578k2<C26191b> $state;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodCheckoutStep2ScreenKt$NonFoodCheckoutStep2Stateful$6(C8578k2<C26191b> k2Var, C23614a aVar, NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel) {
        super(0);
        this.$state = k2Var;
        this.$analytics = aVar;
        this.$viewModel = nonFoodCheckoutStep2ViewModel;
    }

    @C12579k
    public final Boolean invoke() {
        C38017b bVar;
        boolean z;
        BasketAmounts f;
        Object obj;
        List list = (List) C28897f.m119478b(this.$state.getValue().mo76128n());
        Double d = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C26191b.C26193b) obj).mo76156f()) {
                    break;
                }
            }
            C26191b.C26193b bVar2 = (C26191b.C26193b) obj;
            if (bVar2 != null) {
                bVar = bVar2.mo76154e();
                C26191b.C26194c cVar = (C26191b.C26194c) C28897f.m119478b(this.$state.getValue().mo76129o());
                if (!(cVar == null || (f = cVar.mo76164f()) == null)) {
                    d = Double.valueOf(f.mo116868D());
                }
                if (bVar != null || d == null) {
                    z = false;
                } else {
                    this.$analytics.mo69148j(this.$viewModel.mo75975F0());
                    this.$analytics.mo69147i(d.doubleValue(), bVar, this.$viewModel.mo75978I0());
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        bVar = null;
        C26191b.C26194c cVar2 = (C26191b.C26194c) C28897f.m119478b(this.$state.getValue().mo76129o());
        d = Double.valueOf(f.mo116868D());
        if (bVar != null) {
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
