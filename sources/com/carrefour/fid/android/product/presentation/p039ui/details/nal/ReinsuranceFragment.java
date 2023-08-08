package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

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
import androidx.navigation.C19766m;
import androidx.navigation.NavController;
import androidx.navigation.fragment.C19736g;
import dagger.hilt.android.C10164b;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceFragment;", "Lcom/carrefour/fid/android/shared/base/q;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/carrefour/fid/android/product/presentation/ui/details/nal/q;", "f", "Landroidx/navigation/m;", "J0", "()Lcom/carrefour/fid/android/product/presentation/ui/details/nal/q;", "args", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nReinsuranceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReinsuranceFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,39:1\n42#2,3:40\n*S KotlinDebug\n*F\n+ 1 ReinsuranceFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/nal/ReinsuranceFragment\n*L\n22#1:40,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.ReinsuranceFragment */
public final class ReinsuranceFragment extends C27863h {
    @C12579k

    /* renamed from: f */
    public final C19766m f67452f = new C19766m(C11342l0.m43547d(C27902q.class), new ReinsuranceFragment$special$$inlined$navArgs$1(this));

    /* renamed from: J0 */
    public final C27902q mo80898J0() {
        return (C27902q) this.f67452f.getValue();
    }

    @C12579k
    public View onCreateView(@C12579k LayoutInflater layoutInflater, @C12580l ViewGroup viewGroup, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        NavController a = C19736g.m91827a(this);
        C19499w viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.C15808b(viewLifecycleOwner));
        composeView.setContent(C8553b.m31049c(-118458084, true, new ReinsuranceFragment$onCreateView$view$1$1(this, a)));
        return composeView;
    }
}
