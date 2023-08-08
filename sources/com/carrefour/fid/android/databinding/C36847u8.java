package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.loyalty.CustomFidCardView;

/* renamed from: com.carrefour.fid.android.databinding.u8 */
public final class C36847u8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91775a;
    @C0359n0

    /* renamed from: b */
    public final View f91776b;
    @C0359n0

    /* renamed from: c */
    public final ScrollView f91777c;
    @C0359n0

    /* renamed from: d */
    public final CustomFidCardView f91778d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91779e;

    public C36847u8(@C0359n0 ScrollView scrollView, @C0359n0 View view, @C0359n0 ScrollView scrollView2, @C0359n0 CustomFidCardView customFidCardView, @C0359n0 TextView textView) {
        this.f91775a = scrollView;
        this.f91776b = view;
        this.f91777c = scrollView2;
        this.f91778d = customFidCardView;
        this.f91779e = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36847u8 m151105a(@C0359n0 View view) {
        int i = R.id.backdrop_handle;
        View a = C20753c.m96463a(view, R.id.backdrop_handle);
        if (a != null) {
            ScrollView scrollView = (ScrollView) view;
            i = R.id.splash_card_fid;
            CustomFidCardView customFidCardView = (CustomFidCardView) C20753c.m96463a(view, R.id.splash_card_fid);
            if (customFidCardView != null) {
                i = R.id.splash_label;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.splash_label);
                if (textView != null) {
                    return new C36847u8(scrollView, a, scrollView, customFidCardView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36847u8 m151106c(@C0359n0 LayoutInflater layoutInflater) {
        return m151107d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36847u8 m151107d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_splash_card_fid, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151105a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91775a;
    }
}
