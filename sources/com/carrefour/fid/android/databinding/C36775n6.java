package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.n6 */
public final class C36775n6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91371a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91372b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91373c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91374d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91375e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91376f;

    public C36775n6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f91371a = constraintLayout;
        this.f91372b = imageButton;
        this.f91373c = textView;
        this.f91374d = textView2;
        this.f91375e = textView3;
        this.f91376f = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36775n6 m150827a(@C0359n0 View view) {
        int i = R.id.button_text_online_shop_details_itinerary;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_text_online_shop_details_itinerary);
        if (imageButton != null) {
            i = R.id.text_online_shop_details_address;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_address);
            if (textView != null) {
                i = R.id.text_online_shop_details_slot;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_slot);
                if (textView2 != null) {
                    i = R.id.text_online_shop_details_title;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_title);
                    if (textView3 != null) {
                        i = R.id.text_online_shop_details_type;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_online_shop_details_type);
                        if (textView4 != null) {
                            return new C36775n6((ConstraintLayout) view, imageButton, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36775n6 m150828c(@C0359n0 LayoutInflater layoutInflater) {
        return m150829d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36775n6 m150829d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_online_store_shop_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150827a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91371a;
    }
}
