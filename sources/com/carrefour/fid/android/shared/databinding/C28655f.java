package com.carrefour.fid.android.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.shared.C28444b;

/* renamed from: com.carrefour.fid.android.shared.databinding.f */
public final class C28655f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f70264a;
    @C0359n0

    /* renamed from: b */
    public final Button f70265b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f70266c;
    @C0359n0

    /* renamed from: d */
    public final TextView f70267d;
    @C0359n0

    /* renamed from: e */
    public final TextView f70268e;

    public C28655f(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f70264a = constraintLayout;
        this.f70265b = button;
        this.f70266c = imageView;
        this.f70267d = textView;
        this.f70268e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C28655f m118640a(@C0359n0 View view) {
        int i = C28444b.C28454j.button_empty_view;
        Button button = (Button) C20753c.m96463a(view, i);
        if (button != null) {
            i = C28444b.C28454j.image_view_empty_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, i);
            if (imageView != null) {
                i = C28444b.C28454j.text_view_empty_message;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C28444b.C28454j.text_view_empty_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        return new C28655f((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28655f m118641c(@C0359n0 LayoutInflater layoutInflater) {
        return m118642d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28655f m118642d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.C28457m.view_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118640a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f70264a;
    }
}
