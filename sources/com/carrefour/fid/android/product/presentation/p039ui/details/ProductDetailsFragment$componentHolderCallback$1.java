package com.carrefour.fid.android.product.presentation.p039ui.details;

import android.view.View;
import androidx.lifecycle.C19501x;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.product.C27609f;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsFragment;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.ProductDetailsFragment$componentHolderCallback$1 */
public final class ProductDetailsFragment$componentHolderCallback$1 implements ProductDetailsFragment.C27747a {

    /* renamed from: a */
    public final /* synthetic */ ProductDetailsFragment f67304a;

    public ProductDetailsFragment$componentHolderCallback$1(ProductDetailsFragment productDetailsFragment) {
        this.f67304a = productDetailsFragment;
    }

    /* renamed from: a */
    public void mo80594a(int i) {
        float f;
        RecyclerView recyclerView = this.f67304a.mo80573h1().f66744d;
        float y = recyclerView.getY();
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            f = childAt.getY();
        } else {
            f = 0.0f;
        }
        float f2 = y + f;
        ProductDetailsFragment productDetailsFragment = this.f67304a;
        C11723c2 unused = C12038j.m48061f(C19501x.m90847a(productDetailsFragment), (CoroutineContext) null, (CoroutineStart) null, new C27758xdbe128c6(productDetailsFragment.mo80573h1().getRoot(), f2, (C11045c<? super C27758xdbe128c6>) null), 3, (Object) null);
    }

    /* renamed from: b */
    public void mo80595b() {
        ProductDetailsFragment productDetailsFragment = this.f67304a;
        String string = productDetailsFragment.getString(C27609f.C27627r.general_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.general_information)");
        String string2 = this.f67304a.getString(C27609f.C27627r.customer_dialog_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.customer_dialog_text)");
        FragmentKt.m118828p(productDetailsFragment, string, string2, new C27759xdaa8edd2(this.f67304a));
    }
}
