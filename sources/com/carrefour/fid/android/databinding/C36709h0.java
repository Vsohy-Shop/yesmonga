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
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.service.CustomerServiceCardView;

/* renamed from: com.carrefour.fid.android.databinding.h0 */
public final class C36709h0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90915a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f90916b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f90917c;
    @C0359n0

    /* renamed from: d */
    public final Button f90918d;
    @C0359n0

    /* renamed from: e */
    public final Button f90919e;
    @C0359n0

    /* renamed from: f */
    public final Button f90920f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90921g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90922h;
    @C0359n0

    /* renamed from: i */
    public final ImageView f90923i;
    @C0359n0

    /* renamed from: j */
    public final TextView f90924j;
    @C0359n0

    /* renamed from: k */
    public final TextView f90925k;
    @C0359n0

    /* renamed from: l */
    public final ConstraintLayout f90926l;
    @C0359n0

    /* renamed from: m */
    public final CustomerServiceCardView f90927m;

    public C36709h0(@C0359n0 LinearLayout linearLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 Button button3, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 CustomerServiceCardView customerServiceCardView) {
        this.f90915a = linearLayout;
        this.f90916b = composeView;
        this.f90917c = linearLayout2;
        this.f90918d = button;
        this.f90919e = button2;
        this.f90920f = button3;
        this.f90921g = textView;
        this.f90922h = textView2;
        this.f90923i = imageView;
        this.f90924j = textView3;
        this.f90925k = textView4;
        this.f90926l = constraintLayout;
        this.f90927m = customerServiceCardView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36709h0 m150563a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.additional_checkout_confirmation_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view2, R.id.additional_checkout_confirmation_header);
        if (composeView != null) {
            i = R.id.additional_checkout_confirmation_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, R.id.additional_checkout_confirmation_header_layout);
            if (linearLayout != null) {
                i = R.id.button_checkout_confirmation_agenda;
                Button button = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_agenda);
                if (button != null) {
                    i = R.id.button_checkout_confirmation_critizr;
                    Button button2 = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_critizr);
                    if (button2 != null) {
                        i = R.id.button_checkout_confirmation_track;
                        Button button3 = (Button) C20753c.m96463a(view2, R.id.button_checkout_confirmation_track);
                        if (button3 != null) {
                            i = R.id.text_checkout_confirmation_information;
                            TextView textView = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_information);
                            if (textView != null) {
                                i = R.id.text_checkout_confirmation_slot;
                                TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_slot);
                                if (textView2 != null) {
                                    i = R.id.text_checkout_confirmation_slot_image;
                                    ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_slot_image);
                                    if (imageView != null) {
                                        i = R.id.text_checkout_confirmation_subtitle;
                                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_subtitle);
                                        if (textView3 != null) {
                                            i = R.id.text_checkout_confirmation_thanks;
                                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_checkout_confirmation_thanks);
                                            if (textView4 != null) {
                                                i = R.id.view_checkout_confirmation;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, R.id.view_checkout_confirmation);
                                                if (constraintLayout != null) {
                                                    i = R.id.view_checkout_confirmation_customer_service;
                                                    CustomerServiceCardView customerServiceCardView = (CustomerServiceCardView) C20753c.m96463a(view2, R.id.view_checkout_confirmation_customer_service);
                                                    if (customerServiceCardView != null) {
                                                        return new C36709h0((LinearLayout) view2, composeView, linearLayout, button, button2, button3, textView, textView2, imageView, textView3, textView4, constraintLayout, customerServiceCardView);
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
    public static C36709h0 m150564c(@C0359n0 LayoutInflater layoutInflater) {
        return m150565d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36709h0 m150565d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_checkout_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150563a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90915a;
    }
}
