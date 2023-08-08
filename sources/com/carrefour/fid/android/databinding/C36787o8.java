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

/* renamed from: com.carrefour.fid.android.databinding.o8 */
public final class C36787o8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f91451a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91452b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f91453c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f91454d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91455e;

    public C36787o8(@C0359n0 Toolbar toolbar, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 ImageButton imageButton3, @C0359n0 TextView textView) {
        this.f91451a = toolbar;
        this.f91452b = imageButton;
        this.f91453c = imageButton2;
        this.f91454d = imageButton3;
        this.f91455e = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36787o8 m150875a(@C0359n0 View view) {
        int i = R.id.button_product_list_filter_back;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_product_list_filter_back);
        if (imageButton != null) {
            i = R.id.button_product_list_filter_close;
            ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, R.id.button_product_list_filter_close);
            if (imageButton2 != null) {
                i = R.id.button_product_list_filter_reset;
                ImageButton imageButton3 = (ImageButton) C20753c.m96463a(view, R.id.button_product_list_filter_reset);
                if (imageButton3 != null) {
                    i = R.id.text_product_list_filter_title;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_product_list_filter_title);
                    if (textView != null) {
                        return new C36787o8((Toolbar) view, imageButton, imageButton2, imageButton3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36787o8 m150876c(@C0359n0 LayoutInflater layoutInflater) {
        return m150877d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36787o8 m150877d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_product_list_filters, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150875a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f91451a;
    }
}
