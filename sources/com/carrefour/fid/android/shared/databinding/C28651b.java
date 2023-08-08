package com.carrefour.fid.android.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.b */
public final class C28651b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final FrameLayout f70253a;
    @C0359n0

    /* renamed from: b */
    public final TextView f70254b;

    public C28651b(@C0359n0 FrameLayout frameLayout, @C0359n0 TextView textView) {
        this.f70253a = frameLayout;
        this.f70254b = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C28651b m118624a(@C0359n0 View view) {
        int i = C28444b.C28454j.txtTitleDialog;
        TextView textView = (TextView) C20753c.m96463a(view, i);
        if (textView != null) {
            return new C28651b((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28651b m118625c(@C0359n0 LayoutInflater layoutInflater) {
        return m118626d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28651b m118626d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.alert_dialog_title_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118624a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f70253a;
    }
}
