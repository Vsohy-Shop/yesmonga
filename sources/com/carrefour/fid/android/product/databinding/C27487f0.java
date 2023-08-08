package com.carrefour.fid.android.product.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.f0 */
public final class C27487f0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f66665a;
    @C0359n0

    /* renamed from: b */
    public final ProgressBar f66666b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f66667c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f66668d;

    public C27487f0(@C0359n0 Toolbar toolbar, @C0359n0 ProgressBar progressBar, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2) {
        this.f66665a = toolbar;
        this.f66666b = progressBar;
        this.f66667c = imageButton;
        this.f66668d = imageButton2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27487f0 m115673a(@C0359n0 View view) {
        int i = C27609f.C27619j.add_to_shopping_list_progress_bar;
        ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
        if (progressBar != null) {
            i = C27609f.C27619j.button_holder_product_details_shopping_list;
            ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
            if (imageButton != null) {
                i = C27609f.C27619j.button_toolbar_pdp_back;
                ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, i);
                if (imageButton2 != null) {
                    return new C27487f0((Toolbar) view, progressBar, imageButton, imageButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27487f0 m115674c(@C0359n0 LayoutInflater layoutInflater) {
        return m115675d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27487f0 m115675d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.toolbar_pdp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115673a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f66665a;
    }
}
