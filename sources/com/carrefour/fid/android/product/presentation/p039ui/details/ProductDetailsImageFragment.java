package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.fragment.app.C19232h;
import androidx.navigation.C19766m;
import androidx.navigation.fragment.C19736g;
import androidx.recyclerview.widget.C20227z;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.widgets.PageControlsComponent;
import com.carrefour.fid.android.product.databinding.C27482d;
import com.carrefour.fid.android.product.presentation.models.ProductImagesModel;
import com.carrefour.fid.android.product.presentation.p039ui.details.adapter.C27778h;
import com.carrefour.fid.android.shared.extension.ActivityKt;
import com.carrefour.fid.android.shared.util.C28936j;
import com.google.android.gms.analytics.ecommerce.C40383c;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10164b
@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006$"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsImageFragment;", "Lcom/carrefour/fid/android/shared/base/o;", "Lcom/carrefour/fid/android/product/databinding/d;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onViewCreated", "V0", "T0", "Lcom/carrefour/fid/android/product/presentation/models/ProductImagesModel;", "productImagesModel", "W0", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/h;", "f", "Lkotlin/z;", "S0", "()Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/h;", "productImageAdapter", "Lcom/carrefour/fid/android/product/presentation/ui/details/o;", "g", "Landroidx/navigation/m;", "R0", "()Lcom/carrefour/fid/android/product/presentation/ui/details/o;", "args", "Lcom/carrefour/fid/android/shared/util/j;", "v", "Lcom/carrefour/fid/android/shared/util/j;", "getFragmentUtil", "()Lcom/carrefour/fid/android/shared/util/j;", "setFragmentUtil", "(Lcom/carrefour/fid/android/shared/util/j;)V", "fragmentUtil", "<init>", "()V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductDetailsImageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductDetailsImageFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsImageFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,65:1\n42#2,3:66\n*S KotlinDebug\n*F\n+ 1 ProductDetailsImageFragment.kt\ncom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsImageFragment\n*L\n24#1:66,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsImageFragment */
public final class ProductDetailsImageFragment extends C27801b<C27482d> {

    /* renamed from: w */
    public static final int f67309w = 8;
    @C12579k

    /* renamed from: f */
    public final C11677z f67310f = C10864b0.m38748c(ProductDetailsImageFragment$productImageAdapter$2.f67314f);
    @C12579k

    /* renamed from: g */
    public final C19766m f67311g = new C19766m(C11342l0.m43547d(C27910o.class), new ProductDetailsImageFragment$special$$inlined$navArgs$1(this));
    @Inject

    /* renamed from: v */
    public C28936j f67312v;

    public ProductDetailsImageFragment() {
        super(C277601.f67313a);
    }

    /* renamed from: U0 */
    public static final void m116657U0(ProductDetailsImageFragment productDetailsImageFragment, View view) {
        Intrinsics.checkNotNullParameter(productDetailsImageFragment, "this$0");
        C19736g.m91827a(productDetailsImageFragment).mo58156s0();
    }

    /* renamed from: R0 */
    public final C27910o mo80614R0() {
        return (C27910o) this.f67311g.getValue();
    }

    /* renamed from: S0 */
    public final C27778h mo80615S0() {
        return (C27778h) this.f67310f.getValue();
    }

    /* renamed from: T0 */
    public final void mo80616T0() {
        ((C27482d) getBinding()).f66634d.setOnClickListener(new C27817n(this));
    }

    /* renamed from: V0 */
    public final void mo80617V0() {
        new C20227z().mo60274b(((C27482d) getBinding()).f66632b);
    }

    /* renamed from: W0 */
    public final void mo80618W0(ProductImagesModel productImagesModel) {
        if (productImagesModel != null) {
            mo80615S0().mo80720p(productImagesModel.mo80324e());
            RecyclerView recyclerView = ((C27482d) getBinding()).f66632b;
            recyclerView.setAdapter(mo80615S0());
            PageControlsComponent pageControlsComponent = ((C27482d) getBinding()).f66633c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "this");
            pageControlsComponent.mo113006u(recyclerView);
            if (productImagesModel.mo80326f() != 0) {
                recyclerView.mo59479G1(productImagesModel.mo80326f());
            }
        }
    }

    @C12579k
    public final C28936j getFragmentUtil() {
        C28936j jVar = this.f67312v;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fragmentUtil");
        return null;
    }

    public void onViewCreated(@C12579k View view, @C12580l Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, C40383c.f102945c);
        super.onViewCreated(view, bundle);
        C19232h requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ActivityKt.m118697g(requireActivity);
        getFragmentUtil().mo32776b(this);
        mo80617V0();
        mo80616T0();
        mo80618W0(mo80614R0().mo81124e());
    }

    public final void setFragmentUtil(@C12579k C28936j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f67312v = jVar;
    }
}
