package com.carrefour.fid.android.presentation.p035ui.product.filter.adapter;

import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.databinding.C36784o5;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.ecommerce.utils.C38215e;
import com.carrefour.fid.android.presentation.models.FacetModel;
import com.carrefour.fid.android.presentation.models.extension.TermModelKt;
import com.carrefour.fid.android.presentation.p035ui.product.filter.ProductListFiltersFacetTermsFragment;
import java.util.Locale;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nProductListFiltersFacetViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListFiltersFacetViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersFacetViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,54:1\n262#2,2:55\n262#2,2:57\n262#2,2:59\n*S KotlinDebug\n*F\n+ 1 ProductListFiltersFacetViewHolder.kt\ncom/carrefour/fid/android/presentation/ui/product/filter/adapter/ProductListFiltersFacetViewHolder\n*L\n42#1:55,2\n47#1:57,2\n50#1:59,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.filter.adapter.f */
public final class C25436f extends RecyclerView.C20061e0 {

    /* renamed from: b */
    public static final int f62589b = 8;
    @C12579k

    /* renamed from: a */
    public final C36784o5 f62590a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25436f(@C12579k C36784o5 o5Var) {
        super(o5Var.getRoot());
        Intrinsics.checkNotNullParameter(o5Var, "binding");
        this.f62590a = o5Var;
    }

    /* renamed from: c */
    public final void mo74130c(@C12579k FacetModel facetModel) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        Intrinsics.checkNotNullParameter(facetModel, ProductListFiltersFacetTermsFragment.f62548f);
        this.f62590a.f91445f.setText(facetModel.mo121573X());
        boolean z3 = true;
        int i4 = 0;
        if (!Intrinsics.areEqual((Object) facetModel.mo121582h0(), (Object) "checkbox") || facetModel.mo121580f0() > 0) {
            ConstraintLayout b = this.f62590a.getRoot();
            Intrinsics.checkNotNullExpressionValue(b, "binding.root");
            String string = this.f62590a.getRoot().getContext().getString(R.string.accessibility_select_filter_facet, new Object[]{facetModel.mo121573X()});
            Intrinsics.checkNotNullExpressionValue(string, "binding.root.context.get…filter_facet, facet.name)");
            ViewKt.m152120b(b, string, true);
        }
        ImageView imageView = this.f62590a.f91441b;
        imageView.setVisibility(8);
        String X = facetModel.mo121573X();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = X.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual((Object) lowerCase, (Object) "promo")) {
            i = R.drawable.ic_promo_filter;
        } else if (Intrinsics.areEqual((Object) lowerCase, (Object) C38215e.f96826c)) {
            i = R.drawable.ic_apple_filter;
        } else {
            i = R.drawable.ic_carte_filter;
        }
        imageView.setImageResource(i);
        TextView textView = this.f62590a.f91444e;
        textView.setText(TermModelKt.m159610b(facetModel.mo121578e0()));
        Intrinsics.checkNotNullExpressionValue(textView, "bind$lambda$1");
        if (TermModelKt.m159612d(facetModel.mo121578e0()) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        Switch switchR = this.f62590a.f91443d;
        switchR.setChecked(facetModel.mo121574Z());
        Intrinsics.checkNotNullExpressionValue(switchR, "bind$lambda$2");
        if (!Intrinsics.areEqual((Object) facetModel.mo121582h0(), (Object) "checkbox") || facetModel.mo121580f0() > 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        switchR.setVisibility(i3);
        ImageView imageView2 = this.f62590a.f91442c;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.imageProductListFiltersFacetIconArrow");
        if (Intrinsics.areEqual((Object) facetModel.mo121582h0(), (Object) "checkbox") && facetModel.mo121580f0() <= 0) {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        imageView2.setVisibility(i4);
    }

    @C12579k
    /* renamed from: d */
    public final C36784o5 mo74131d() {
        return this.f62590a;
    }
}
