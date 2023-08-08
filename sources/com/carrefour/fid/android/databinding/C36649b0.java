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

/* renamed from: com.carrefour.fid.android.databinding.b0 */
public final class C36649b0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90586a;
    @C0359n0

    /* renamed from: b */
    public final Button f90587b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90588c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90589d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90590e;

    public C36649b0(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f90586a = constraintLayout;
        this.f90587b = button;
        this.f90588c = imageView;
        this.f90589d = textView;
        this.f90590e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36649b0 m150325a(@C0359n0 View view) {
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
                        return new C36649b0((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36649b0 m150326c(@C0359n0 LayoutInflater layoutInflater) {
        return m150327d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36649b0 m150327d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150325a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90586a;
    }
}
