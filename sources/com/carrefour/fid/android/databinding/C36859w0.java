package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.widgets.HubProductComponent;

/* renamed from: com.carrefour.fid.android.databinding.w0 */
public final class C36859w0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91830a;
    @C0359n0

    /* renamed from: b */
    public final HubProductComponent f91831b;
    @C0359n0

    /* renamed from: c */
    public final HubProductComponent f91832c;
    @C0359n0

    /* renamed from: d */
    public final HubProductComponent f91833d;

    public C36859w0(@C0359n0 LinearLayout linearLayout, @C0359n0 HubProductComponent hubProductComponent, @C0359n0 HubProductComponent hubProductComponent2, @C0359n0 HubProductComponent hubProductComponent3) {
        this.f91830a = linearLayout;
        this.f91831b = hubProductComponent;
        this.f91832c = hubProductComponent2;
        this.f91833d = hubProductComponent3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36859w0 m151153a(@C0359n0 View view) {
        int i = R.id.catalog_list_button;
        HubProductComponent hubProductComponent = (HubProductComponent) C20753c.m96463a(view, R.id.catalog_list_button);
        if (hubProductComponent != null) {
            i = R.id.favorites_list_button;
            HubProductComponent hubProductComponent2 = (HubProductComponent) C20753c.m96463a(view, R.id.favorites_list_button);
            if (hubProductComponent2 != null) {
                i = R.id.memo_button;
                HubProductComponent hubProductComponent3 = (HubProductComponent) C20753c.m96463a(view, R.id.memo_button);
                if (hubProductComponent3 != null) {
                    return new C36859w0((LinearLayout) view, hubProductComponent, hubProductComponent2, hubProductComponent3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36859w0 m151154c(@C0359n0 LayoutInflater layoutInflater) {
        return m151155d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36859w0 m151155d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basket_builder_my_lists, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151153a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91830a;
    }
}
