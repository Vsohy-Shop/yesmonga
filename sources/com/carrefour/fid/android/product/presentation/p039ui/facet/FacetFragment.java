package com.carrefour.fid.android.product.presentation.p039ui.facet;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.compose.p004ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.internal.C8553b;
import androidx.lifecycle.C19499w;
import com.carrefour.fid.android.performance.C38326b;
import com.carrefour.fid.android.product.presentation.p039ui.facet.analytics.C27950a;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/facet/FacetFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/carrefour/fid/android/product/presentation/ui/facet/analytics/a;", "f", "Lcom/carrefour/fid/android/product/presentation/ui/facet/analytics/a;", "I0", "()Lcom/carrefour/fid/android/product/presentation/ui/facet/analytics/a;", "K0", "(Lcom/carrefour/fid/android/product/presentation/ui/facet/analytics/a;)V", "analytics", "Lcom/carrefour/fid/android/performance/b;", "g", "Lcom/carrefour/fid/android/performance/b;", "J0", "()Lcom/carrefour/fid/android/performance/b;", "L0", "(Lcom/carrefour/fid/android/performance/b;)V", "performance", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.FacetFragment */
public final class FacetFragment extends C27955d {
    @Inject

    /* renamed from: f */
    public C27950a f67778f;
    @Inject

    /* renamed from: g */
    public C38326b f67779g;

    @C12579k
    /* renamed from: I0 */
    public final C27950a mo81358I0() {
        C27950a aVar = this.f67778f;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    @C12579k
    /* renamed from: J0 */
    public final C38326b mo81359J0() {
        C38326b bVar = this.f67779g;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performance");
        return null;
    }

    /* renamed from: K0 */
    public final void mo81360K0(@C12579k C27950a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f67778f = aVar;
    }

    /* renamed from: L0 */
    public final void mo81361L0(@C12579k C38326b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f67779g = bVar;
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(-752643952, true, new FacetFragment$onCreateView$1$1(this)));
        return composeView;
    }
}
