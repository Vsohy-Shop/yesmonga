package com.carrefour.fid.android.databinding;

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
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j1 */
public final class C36730j1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91053a;
    @C0359n0

    /* renamed from: b */
    public final Button f91054b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91055c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91056d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91057e;

    public C36730j1(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91053a = constraintLayout;
        this.f91054b = button;
        this.f91055c = imageView;
        this.f91056d = textView;
        this.f91057e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36730j1 m150647a(@C0359n0 View view) {
        int i = R.id.button_empty_view;
        Button button = (Button) C20753c.m96463a(view, R.id.button_empty_view);
        if (button != null) {
            i = R.id.image_view_empty_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_view_empty_icon);
            if (imageView != null) {
                i = R.id.text_view_empty_message;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_view_empty_message);
                if (textView != null) {
                    i = R.id.text_view_empty_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_view_empty_title);
                    if (textView2 != null) {
                        return new C36730j1((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36730j1 m150648c(@C0359n0 LayoutInflater layoutInflater) {
        return m150649d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36730j1 m150649d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_step_1_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150647a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91053a;
    }
}
