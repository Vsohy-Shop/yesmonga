package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.v4 */
public final class C36853v4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91800a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91801b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91802c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91803d;
    @C0359n0

    /* renamed from: e */
    public final Group f91804e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91805f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91806g;
    @C0359n0

    /* renamed from: h */
    public final View f91807h;

    public C36853v4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 Group group, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 View view) {
        this.f91800a = constraintLayout;
        this.f91801b = imageView;
        this.f91802c = textView;
        this.f91803d = textView2;
        this.f91804e = group;
        this.f91805f = textView3;
        this.f91806g = textView4;
        this.f91807h = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36853v4 m151129a(@C0359n0 View view) {
        int i = R.id.image_holder_order_offline_details_bottom_fidelity_card;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_holder_order_offline_details_bottom_fidelity_card);
        if (imageView != null) {
            i = R.id.text_holder_order_offline_details_bottom_fidelity_card;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_fidelity_card);
            if (textView != null) {
                i = R.id.text_holder_order_offline_details_bottom_fidelity_number;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_fidelity_number);
                if (textView2 != null) {
                    i = R.id.text_holder_order_offline_details_fidelity_reward;
                    Group group = (Group) C20753c.m96463a(view, R.id.text_holder_order_offline_details_fidelity_reward);
                    if (group != null) {
                        i = R.id.text_holder_order_offline_details_fidelity_reward_amount;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_fidelity_reward_amount);
                        if (textView3 != null) {
                            i = R.id.text_holder_order_offline_details_fidelity_reward_desc;
                            TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_fidelity_reward_desc);
                            if (textView4 != null) {
                                i = R.id.view_holder_order_offline_details_divider_end;
                                View a = C20753c.m96463a(view, R.id.view_holder_order_offline_details_divider_end);
                                if (a != null) {
                                    return new C36853v4((ConstraintLayout) view, imageView, textView, textView2, group, textView3, textView4, a);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36853v4 m151130c(@C0359n0 LayoutInflater layoutInflater) {
        return m151131d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36853v4 m151131d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_fidelity_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151129a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91800a;
    }
}
