package com.carrefour.fid.android.product.databinding;

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
import com.carrefour.fid.android.product.C27609f;

/* renamed from: com.carrefour.fid.android.product.databinding.k0 */
public final class C27497k0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f66708a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f66709b;
    @C0359n0

    /* renamed from: c */
    public final TextView f66710c;
    @C0359n0

    /* renamed from: d */
    public final TextView f66711d;

    public C27497k0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f66708a = constraintLayout;
        this.f66709b = imageButton;
        this.f66710c = textView;
        this.f66711d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C27497k0 m115709a(@C0359n0 View view) {
        int i = C27609f.C27619j.button_notification_close;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
        if (imageButton != null) {
            i = C27609f.C27619j.text_notification_message;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C27609f.C27619j.text_notification_title;
                TextView textView2 = (TextView) C20753c.m96463a(view, i);
                if (textView2 != null) {
                    return new C27497k0((ConstraintLayout) view, imageButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C27497k0 m115710c(@C0359n0 LayoutInflater layoutInflater) {
        return m115711d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C27497k0 m115711d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27609f.C27622m.view_product_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m115709a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f66708a;
    }
}
