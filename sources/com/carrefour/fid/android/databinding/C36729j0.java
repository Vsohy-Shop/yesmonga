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
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j0 */
public final class C36729j0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91041a;
    @C0359n0

    /* renamed from: b */
    public final ComposeView f91042b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91043c;
    @C0359n0

    /* renamed from: d */
    public final Button f91044d;
    @C0359n0

    /* renamed from: e */
    public final Group f91045e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f91046f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91047g;
    @C0359n0

    /* renamed from: h */
    public final ImageView f91048h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91049i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91050j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91051k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91052l;

    public C36729j0(@C0359n0 LinearLayout linearLayout, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout2, @C0359n0 Button button, @C0359n0 Group group, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5) {
        this.f91041a = linearLayout;
        this.f91042b = composeView;
        this.f91043c = linearLayout2;
        this.f91044d = button;
        this.f91045e = group;
        this.f91046f = imageView;
        this.f91047g = textView;
        this.f91048h = imageView2;
        this.f91049i = textView2;
        this.f91050j = textView3;
        this.f91051k = textView4;
        this.f91052l = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36729j0 m150643a(@C0359n0 View view) {
        int i = R.id.additional_checkout_payment_error_header;
        ComposeView composeView = (ComposeView) C20753c.m96463a(view, R.id.additional_checkout_payment_error_header);
        if (composeView != null) {
            i = R.id.additional_checkout_payment_error_header_layout;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.additional_checkout_payment_error_header_layout);
            if (linearLayout != null) {
                i = R.id.button_checkout_payment_error_retry;
                Button button = (Button) C20753c.m96463a(view, R.id.button_checkout_payment_error_retry);
                if (button != null) {
                    i = R.id.group_checkout_payment_contact_bank;
                    Group group = (Group) C20753c.m96463a(view, R.id.group_checkout_payment_contact_bank);
                    if (group != null) {
                        i = R.id.image_checkout_payment_error;
                        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_checkout_payment_error);
                        if (imageView != null) {
                            i = R.id.text_checkout_payment_contact_bank;
                            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_checkout_payment_contact_bank);
                            if (textView != null) {
                                i = R.id.text_checkout_payment_contact_bank_phone_number;
                                ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.text_checkout_payment_contact_bank_phone_number);
                                if (imageView2 != null) {
                                    i = R.id.text_checkout_payment_contact_bank_time;
                                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_checkout_payment_contact_bank_time);
                                    if (textView2 != null) {
                                        i = R.id.text_checkout_payment_customer_service;
                                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_checkout_payment_customer_service);
                                        if (textView3 != null) {
                                            i = R.id.text_checkout_payment_error_subtitle;
                                            TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_checkout_payment_error_subtitle);
                                            if (textView4 != null) {
                                                i = R.id.text_checkout_payment_error_title;
                                                TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_checkout_payment_error_title);
                                                if (textView5 != null) {
                                                    return new C36729j0((LinearLayout) view, composeView, linearLayout, button, group, imageView, textView, imageView2, textView2, textView3, textView4, textView5);
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
    public static C36729j0 m150644c(@C0359n0 LayoutInflater layoutInflater) {
        return m150645d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36729j0 m150645d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_additional_order_checkout_payment_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150643a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91041a;
    }
}
