package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.l8 */
public final class C36757l8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f91228a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91229b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91230c;

    public C36757l8(@C0359n0 Toolbar toolbar, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView) {
        this.f91228a = toolbar;
        this.f91229b = imageButton;
        this.f91230c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36757l8 m150755a(@C0359n0 View view) {
        int i = R.id.button_toolbar_checkout_confirmation;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_checkout_confirmation);
        if (imageButton != null) {
            i = R.id.text_toolbar_checkout_confirmation;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_toolbar_checkout_confirmation);
            if (textView != null) {
                return new C36757l8((Toolbar) view, imageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36757l8 m150756c(@C0359n0 LayoutInflater layoutInflater) {
        return m150757d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36757l8 m150757d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_checkout_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150755a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f91228a;
    }
}
