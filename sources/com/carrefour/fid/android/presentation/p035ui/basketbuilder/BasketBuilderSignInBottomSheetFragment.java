package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.databinding.C36698g;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.C25972p;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0002R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/basketbuilder/BasketBuilderSignInBottomSheetFragment;", "Lcom/carrefour/fid/android/design/components/widgets/a;", "Lcom/carrefour/fid/android/databinding/g;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "onResume", "initListener", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/p;", "f", "Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/p;", "R0", "()Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/p;", "S0", "(Lcom/carrefour/fid/android/presentation/viewmodels/basketbuilder/p;)V", "analyticsViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderSignInBottomSheetFragment */
public final class BasketBuilderSignInBottomSheetFragment extends C23230q<C36698g> {

    /* renamed from: g */
    public static final int f58888g = 8;
    @Inject

    /* renamed from: f */
    public C25972p f58889f;

    public BasketBuilderSignInBottomSheetFragment() {
        super(C232071.f58890a, C232082.f58891a, true);
    }

    @C12579k
    /* renamed from: R0 */
    public final C25972p mo68023R0() {
        C25972p pVar = this.f58889f;
        if (pVar != null) {
            return pVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsViewModel");
        return null;
    }

    /* renamed from: S0 */
    public final void mo68024S0(@C12579k C25972p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f58889f = pVar;
    }

    public final void initListener() {
        ((C36698g) getBinding()).getRoot().setOnPrimaryButtonClickListener(new BasketBuilderSignInBottomSheetFragment$initListener$1(this));
    }

    public void onResume() {
        super.onResume();
        mo68023R0().mo75396b();
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        initListener();
    }
}
