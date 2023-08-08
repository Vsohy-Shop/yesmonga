package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.service.CustomerServiceCardView;

/* renamed from: com.carrefour.fid.android.databinding.g1 */
public final class C36700g1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90860a;
    @C0359n0

    /* renamed from: b */
    public final Button f90861b;
    @C0359n0

    /* renamed from: c */
    public final Button f90862c;
    @C0359n0

    /* renamed from: d */
    public final Button f90863d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f90864e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90865f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90866g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90867h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90868i;
    @C0359n0

    /* renamed from: j */
    public final ImageView f90869j;
    @C0359n0

    /* renamed from: k */
    public final TextView f90870k;
    @C0359n0

    /* renamed from: l */
    public final TextView f90871l;
    @C0359n0

    /* renamed from: m */
    public final TextView f90872m;
    @C0359n0

    /* renamed from: n */
    public final C36757l8 f90873n;
    @C0359n0

    /* renamed from: o */
    public final ConstraintLayout f90874o;
    @C0359n0

    /* renamed from: p */
    public final CustomerServiceCardView f90875p;

    public C36700g1(@C0359n0 LinearLayout linearLayout, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 Button button3, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 ImageView imageView2, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 C36757l8 l8Var, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 CustomerServiceCardView customerServiceCardView) {
        this.f90860a = linearLayout;
        this.f90861b = button;
        this.f90862c = button2;
        this.f90863d = button3;
        this.f90864e = imageView;
        this.f90865f = textView;
        this.f90866g = textView2;
        this.f90867h = textView3;
        this.f90868i = textView4;
        this.f90869j = imageView2;
        this.f90870k = textView5;
        this.f90871l = textView6;
        this.f90872m = textView7;
        this.f90873n = l8Var;
        this.f90874o = constraintLayout;
        this.f90875p = customerServiceCardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36700g1 m150527a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.button_checkout_confirmation_agenda;
        Button button = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_agenda);
        if (button != null) {
            i = R.id.button_checkout_confirmation_critizr;
            Button button2 = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_critizr);
            if (button2 != null) {
                i = R.id.button_checkout_confirmation_track;
                Button button3 = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_track);
                if (button3 != null) {
                    i = R.id.text_checkout_confirmation_address_image;
                    ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_address_image);
                    if (imageView != null) {
                        i = R.id.text_checkout_confirmation_address_part1;
                        TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_address_part1);
                        if (textView != null) {
                            i = R.id.text_checkout_confirmation_address_part2;
                            TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_address_part2);
                            if (textView2 != null) {
                                i = R.id.text_checkout_confirmation_information;
                                TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_information);
                                if (textView3 != null) {
                                    i = R.id.text_checkout_confirmation_slot;
                                    TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_slot);
                                    if (textView4 != null) {
                                        i = R.id.text_checkout_confirmation_slot_image;
                                        ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_slot_image);
                                        if (imageView2 != null) {
                                            i = R.id.text_checkout_confirmation_subtitle;
                                            TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_subtitle);
                                            if (textView5 != null) {
                                                i = R.id.text_checkout_confirmation_thanks;
                                                TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_thanks);
                                                if (textView6 != null) {
                                                    i = R.id.text_checkout_confirmation_title;
                                                    TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_title);
                                                    if (textView7 != null) {
                                                        i = R.id.toolbar_checkout_payment_confirmation;
                                                        View a = C20753c.m96463a(view2, R.id.toolbar_checkout_payment_confirmation);
                                                        if (a != null) {
                                                            C36757l8 a2 = C36757l8.m150755a(a);
                                                            i = R.id.view_checkout_confirmation;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, R.id.view_checkout_confirmation);
                                                            if (constraintLayout != null) {
                                                                i = R.id.view_checkout_confirmation_customer_service;
                                                                CustomerServiceCardView customerServiceCardView = (CustomerServiceCardView) C20753c.m96463a(view2, R.id.view_checkout_confirmation_customer_service);
                                                                if (customerServiceCardView != null) {
                                                                    return new C36700g1((LinearLayout) view2, button, button2, button3, imageView, textView, textView2, textView3, textView4, imageView2, textView5, textView6, textView7, a2, constraintLayout, customerServiceCardView);
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
    public static C36700g1 m150528c(@C0359n0 LayoutInflater layoutInflater) {
        return m150529d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36700g1 m150529d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150527a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90860a;
    }
}
