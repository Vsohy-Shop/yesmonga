package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* renamed from: com.carrefour.fid.android.design.components.databinding.z */
public final class C37089z implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92860a;
    @C0359n0

    /* renamed from: b */
    public final CircularProgressIndicator f92861b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92862c;

    public C37089z(@C0359n0 View view, @C0359n0 CircularProgressIndicator circularProgressIndicator, @C0359n0 TextView textView) {
        this.f92860a = view;
        this.f92861b = circularProgressIndicator;
        this.f92862c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37089z m152087a(@C0359n0 View view) {
        int i = C36896b.C36906j.quantity_loader;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) C20753c.m96463a(view, i);
        if (circularProgressIndicator != null) {
            i = C36896b.C36906j.quantity_text;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                return new C37089z(view, circularProgressIndicator, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37089z m152088b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_list_item_quantity, viewGroup);
            return m152087a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92860a;
    }
}
