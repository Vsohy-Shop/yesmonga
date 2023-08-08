package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* renamed from: com.carrefour.fid.android.design.components.databinding.j0 */
public final class C37056j0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92698a;
    @C0359n0

    /* renamed from: b */
    public final CircularProgressIndicator f92699b;

    public C37056j0(@C0359n0 View view, @C0359n0 CircularProgressIndicator circularProgressIndicator) {
        this.f92698a = view;
        this.f92699b = circularProgressIndicator;
    }

    @C0359n0
    /* renamed from: a */
    public static C37056j0 m152003a(@C0359n0 View view) {
        int i = C36896b.C36906j.loader;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C20753c.m96463a(view, i);
        if (circularProgressIndicator != null) {
            return new C37056j0(view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37056j0 m152004b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_list_item_loader, viewGroup);
            return m152003a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92698a;
    }
}
