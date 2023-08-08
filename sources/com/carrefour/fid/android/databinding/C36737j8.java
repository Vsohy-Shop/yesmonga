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

/* renamed from: com.carrefour.fid.android.databinding.j8 */
public final class C36737j8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91098a;
    @C0359n0

    /* renamed from: b */
    public final Button f91099b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91100c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91101d;

    public C36737j8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91098a = constraintLayout;
        this.f91099b = button;
        this.f91100c = imageView;
        this.f91101d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36737j8 m150675a(@C0359n0 View view) {
        int i = R.id.notification_button;
        Button button = (Button) C20753c.m96463a(view, R.id.notification_button);
        if (button != null) {
            i = R.id.notification_iv;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.notification_iv);
            if (imageView != null) {
                i = R.id.notification_text;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.notification_text);
                if (textView != null) {
                    return new C36737j8((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36737j8 m150676c(@C0359n0 LayoutInflater layoutInflater) {
        return m150677d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36737j8 m150677d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.subscribe_to_news_notification_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150675a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91098a;
    }
}
