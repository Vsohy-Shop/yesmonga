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

/* renamed from: com.carrefour.fid.android.databinding.x */
public final class C36868x implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91879a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91880b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91881c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91882d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91883e;

    public C36868x(@C0359n0 ScrollView scrollView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f91879a = scrollView;
        this.f91880b = textView;
        this.f91881c = textView2;
        this.f91882d = textView3;
        this.f91883e = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36868x m151187a(@C0359n0 View view) {
        int i = R.id.tv_cgu_link;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.tv_cgu_link);
        if (textView != null) {
            i = R.id.tv_permission;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.tv_permission);
            if (textView2 != null) {
                i = R.id.tv_permission_result;
                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.tv_permission_result);
                if (textView3 != null) {
                    i = R.id.tv_settings_action;
                    TextView textView4 = (TextView) C20753c.m96463a(view, R.id.tv_settings_action);
                    if (textView4 != null) {
                        return new C36868x((ScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36868x m151188c(@C0359n0 LayoutInflater layoutInflater) {
        return m151189d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36868x m151189d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_data, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151187a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91879a;
    }
}
