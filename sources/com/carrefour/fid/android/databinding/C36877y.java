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

/* renamed from: com.carrefour.fid.android.databinding.y */
public final class C36877y implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91938a;
    @C0359n0

    /* renamed from: b */
    public final Button f91939b;
    @C0359n0

    /* renamed from: c */
    public final Button f91940c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91941d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91942e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91943f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91944g;

    public C36877y(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91938a = constraintLayout;
        this.f91939b = button;
        this.f91940c = button2;
        this.f91941d = imageView;
        this.f91942e = textView;
        this.f91943f = textView2;
        this.f91944g = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36877y m151223a(@C0359n0 View view) {
        int i = R.id.button_account_home_anonymous_legal_info;
        Button button = (Button) C20753c.m96463a(view, R.id.button_account_home_anonymous_legal_info);
        if (button != null) {
            i = R.id.button_account_home_anonymous_login;
            Button button2 = (Button) C20753c.m96463a(view, R.id.button_account_home_anonymous_login);
            if (button2 != null) {
                i = R.id.image_account_home_anonymous;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_account_home_anonymous);
                if (imageView != null) {
                    i = R.id.text_account_home_anonymous_message;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_account_home_anonymous_message);
                    if (textView != null) {
                        i = R.id.text_account_home_anonymous_title;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_account_home_anonymous_title);
                        if (textView2 != null) {
                            i = R.id.text_account_home_anonymous_version_info;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_account_home_anonymous_version_info);
                            if (textView3 != null) {
                                return new C36877y((ConstraintLayout) view, button, button2, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36877y m151224c(@C0359n0 LayoutInflater layoutInflater) {
        return m151225d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36877y m151225d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_home_anonymous, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151223a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91938a;
    }
}
