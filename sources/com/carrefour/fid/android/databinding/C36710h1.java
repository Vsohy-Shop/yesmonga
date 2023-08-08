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
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.h1 */
public final class C36710h1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90928a;
    @C0359n0

    /* renamed from: b */
    public final Button f90929b;
    @C0359n0

    /* renamed from: c */
    public final Group f90930c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f90931d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90932e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f90933f;
    @C0359n0

    /* renamed from: g */
    public final TextView f90934g;
    @C0359n0

    /* renamed from: h */
    public final TextView f90935h;
    @C0359n0

    /* renamed from: i */
    public final TextView f90936i;
    @C0359n0

    /* renamed from: j */
    public final TextView f90937j;
    @C0359n0

    /* renamed from: k */
    public final C36757l8 f90938k;

    public C36710h1(@C0359n0 LinearLayout linearLayout, @C0359n0 Button button, @C0359n0 Group group, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 ImageView imageView2, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 C36757l8 l8Var) {
        this.f90928a = linearLayout;
        this.f90929b = button;
        this.f90930c = group;
        this.f90931d = imageView;
        this.f90932e = textView;
        this.f90933f = imageView2;
        this.f90934g = textView2;
        this.f90935h = textView3;
        this.f90936i = textView4;
        this.f90937j = textView5;
        this.f90938k = l8Var;
    }

    @C0359n0
    /* renamed from: a */
    public static C36710h1 m150567a(@C0359n0 View view) {
        int i = R.id.button_checkout_payment_error_retry;
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
                                            i = R.id.toolbar_checkout_payment_error;
                                            View a = C20753c.m96463a(view, R.id.toolbar_checkout_payment_error);
                                            if (a != null) {
                                                return new C36710h1((LinearLayout) view, button, group, imageView, textView, imageView2, textView2, textView3, textView4, textView5, C36757l8.m150755a(a));
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
    public static C36710h1 m150568c(@C0359n0 LayoutInflater layoutInflater) {
        return m150569d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36710h1 m150569d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_payment_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150567a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90928a;
    }
}
