package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.u4 */
public final class C36843u4 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91747a;
    @C0359n0

    /* renamed from: b */
    public final Group f91748b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91749c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91750d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91751e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91752f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91753g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91754h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91755i;
    @C0359n0

    /* renamed from: j */
    public final View f91756j;
    @C0359n0

    /* renamed from: k */
    public final View f91757k;
    @C0359n0

    /* renamed from: l */
    public final View f91758l;

    public C36843u4(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Group group, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 View view, @C0359n0 View view2, @C0359n0 View view3) {
        this.f91747a = constraintLayout;
        this.f91748b = group;
        this.f91749c = textView;
        this.f91750d = textView2;
        this.f91751e = textView3;
        this.f91752f = textView4;
        this.f91753g = textView5;
        this.f91754h = textView6;
        this.f91755i = textView7;
        this.f91756j = view;
        this.f91757k = view2;
        this.f91758l = view3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36843u4 m151093a(@C0359n0 View view) {
        int i = R.id.group_holder_order_offline_details_bottom_amount_discount;
        Group group = (Group) C20753c.m96463a(view, R.id.group_holder_order_offline_details_bottom_amount_discount);
        if (group != null) {
            i = R.id.text_holder_order_offline_details_bottom_amount_before_discount;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_amount_before_discount);
            if (textView != null) {
                i = R.id.text_holder_order_offline_details_bottom_amount_discount;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_amount_discount);
                if (textView2 != null) {
                    i = R.id.text_holder_order_offline_details_bottom_paid_by;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_paid_by);
                    if (textView3 != null) {
                        i = R.id.text_holder_order_offline_details_bottom_total;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_total);
                        if (textView4 != null) {
                            i = R.id.text_holder_order_offline_details_bottom_total_amount;
                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_total_amount);
                            if (textView5 != null) {
                                i = R.id.text_holder_order_offline_details_bottom_total_before_discount;
                                TextView textView6 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_total_before_discount);
                                if (textView6 != null) {
                                    i = R.id.text_holder_order_offline_details_bottom_total_discount;
                                    TextView textView7 = (TextView) C20753c.m96463a(view, R.id.text_holder_order_offline_details_bottom_total_discount);
                                    if (textView7 != null) {
                                        i = R.id.view_holder_order_offline_details_background;
                                        View a = C20753c.m96463a(view, R.id.view_holder_order_offline_details_background);
                                        if (a != null) {
                                            i = R.id.view_holder_order_offline_details_divider;
                                            View a2 = C20753c.m96463a(view, R.id.view_holder_order_offline_details_divider);
                                            if (a2 != null) {
                                                i = R.id.view_holder_order_offline_details_separator;
                                                View a3 = C20753c.m96463a(view, R.id.view_holder_order_offline_details_separator);
                                                if (a3 != null) {
                                                    return new C36843u4((ConstraintLayout) view, group, textView, textView2, textView3, textView4, textView5, textView6, textView7, a, a2, a3);
                                                }
                                            }
                                        }
                                    }
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
    public static C36843u4 m151094c(@C0359n0 LayoutInflater layoutInflater) {
        return m151095d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36843u4 m151095d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_details_offline_bottom, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151093a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91747a;
    }
}
