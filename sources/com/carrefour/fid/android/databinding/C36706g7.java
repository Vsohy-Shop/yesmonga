package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.g7 */
public final class C36706g7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90901a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f90902b;
    @C0359n0

    /* renamed from: c */
    public final TextView f90903c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f90904d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90905e;

    public C36706g7(@C0359n0 LinearLayout linearLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout2, @C0359n0 TextView textView2) {
        this.f90901a = linearLayout;
        this.f90902b = imageView;
        this.f90903c = textView;
        this.f90904d = linearLayout2;
        this.f90905e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36706g7 m150551a(@C0359n0 View view) {
        int i = R.id.closeButton;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.closeButton);
        if (imageView != null) {
            i = R.id.description;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.description);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = R.id.title;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.title);
                if (textView2 != null) {
                    return new C36706g7(linearLayout, imageView, textView, linearLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36706g7 m150552c(@C0359n0 LayoutInflater layoutInflater) {
        return m150553d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36706g7 m150553d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_descritption_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150551a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90901a;
    }
}
