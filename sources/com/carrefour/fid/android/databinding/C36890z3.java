package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.z3 */
public final class C36890z3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f92019a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f92020b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92021c;

    public C36890z3(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView) {
        this.f92019a = linearLayout;
        this.f92020b = imageButton;
        this.f92021c = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36890z3 m151273a(@C0359n0 View view) {
        int i = R.id.button_account_list_store_memo;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_account_list_store_memo);
        if (imageButton != null) {
            i = R.id.text_account_list_store_memo;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_account_list_store_memo);
            if (textView != null) {
                return new C36890z3((LinearLayout) view, imageButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36890z3 m151274c(@C0359n0 LayoutInflater layoutInflater) {
        return m151275d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36890z3 m151275d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.holder_account_list_store_memo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151273a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f92019a;
    }
}
