package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.databinding.m5 */
public final class C36764m5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91298a;
    @C0359n0

    /* renamed from: b */
    public final Barrier f91299b;
    @C0359n0

    /* renamed from: c */
    public final Group f91300c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91301d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91302e;
    @C0359n0

    /* renamed from: f */
    public final Barrier f91303f;
    @C0359n0

    /* renamed from: g */
    public final MaterialButton f91304g;
    @C0359n0

    /* renamed from: h */
    public final Button f91305h;
    @C0359n0

    /* renamed from: i */
    public final Group f91306i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91307j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91308k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91309l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91310m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91311n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91312o;
    @C0359n0

    /* renamed from: p */
    public final AppCompatTextView f91313p;
    @C0359n0

    /* renamed from: q */
    public final View f91314q;
    @C0359n0

    /* renamed from: r */
    public final View f91315r;

    public C36764m5(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Barrier barrier, @C0359n0 Group group, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 Barrier barrier2, @C0359n0 MaterialButton materialButton, @C0359n0 Button button, @C0359n0 Group group2, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 View view, @C0359n0 View view2) {
        this.f91298a = constraintLayout;
        this.f91299b = barrier;
        this.f91300c = group;
        this.f91301d = imageView;
        this.f91302e = textView;
        this.f91303f = barrier2;
        this.f91304g = materialButton;
        this.f91305h = button;
        this.f91306i = group2;
        this.f91307j = textView2;
        this.f91308k = textView3;
        this.f91309l = textView4;
        this.f91310m = textView5;
        this.f91311n = textView6;
        this.f91312o = textView7;
        this.f91313p = appCompatTextView;
        this.f91314q = view;
        this.f91315r = view2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36764m5 m150783a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.additional_order_bottom_barrier;
        Barrier barrier = (Barrier) C20753c.m96463a(view2, R.id.additional_order_bottom_barrier);
        if (barrier != null) {
            i = R.id.additional_order_info;
            Group group = (Group) C20753c.m96463a(view2, R.id.additional_order_info);
            if (group != null) {
                i = R.id.additional_order_info_imageview_holder;
                ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.additional_order_info_imageview_holder);
                if (imageView != null) {
                    i = R.id.additional_order_info_textview_holder;
                    TextView textView = (TextView) C20753c.m96463a(view2, R.id.additional_order_info_textview_holder);
                    if (textView != null) {
                        i = R.id.additional_order_top_barrier;
                        Barrier barrier2 = (Barrier) C20753c.m96463a(view2, R.id.additional_order_top_barrier);
                        if (barrier2 != null) {
                            i = R.id.button_holder_additional_order;
                            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, R.id.button_holder_additional_order);
                            if (materialButton != null) {
                                i = R.id.button_holder_order_online_order_again;
                                Button button = (Button) C20753c.m96463a(view2, R.id.button_holder_order_online_order_again);
                                if (button != null) {
                                    i = R.id.group_holder_order_online_slot;
                                    Group group2 = (Group) C20753c.m96463a(view2, R.id.group_holder_order_online_slot);
                                    if (group2 != null) {
                                        i = R.id.text_holder_order_online_amount;
                                        TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_amount);
                                        if (textView2 != null) {
                                            i = R.id.text_holder_order_online_command_number;
                                            TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_command_number);
                                            if (textView3 != null) {
                                                i = R.id.text_holder_order_online_details;
                                                TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_details);
                                                if (textView4 != null) {
                                                    i = R.id.text_holder_order_online_slot;
                                                    TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_slot);
                                                    if (textView5 != null) {
                                                        i = R.id.text_holder_order_online_slot_value;
                                                        TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_slot_value);
                                                        if (textView6 != null) {
                                                            i = R.id.text_holder_order_online_status;
                                                            TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_holder_order_online_status);
                                                            if (textView7 != null) {
                                                                i = R.id.text_holder_order_online_type;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view2, R.id.text_holder_order_online_type);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.view_holder_order_online_divider_order_details;
                                                                    View a = C20753c.m96463a(view2, R.id.view_holder_order_online_divider_order_details);
                                                                    if (a != null) {
                                                                        i = R.id.view_holder_order_online_divider_top;
                                                                        View a2 = C20753c.m96463a(view2, R.id.view_holder_order_online_divider_top);
                                                                        if (a2 != null) {
                                                                            return new C36764m5((ConstraintLayout) view2, barrier, group, imageView, textView, barrier2, materialButton, button, group2, textView2, textView3, textView4, textView5, textView6, textView7, appCompatTextView, a, a2);
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
    public static C36764m5 m150784c(@C0359n0 LayoutInflater layoutInflater) {
        return m150785d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36764m5 m150785d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_order_online_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150783a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91298a;
    }
}
