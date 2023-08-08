package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.s8 */
public final class C36827s8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91649a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91650b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91651c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91652d;

    public C36827s8(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageButton imageButton, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91649a = constraintLayout;
        this.f91650b = imageButton;
        this.f91651c = textView;
        this.f91652d = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36827s8 m151029a(@C0359n0 View view) {
        int i = R.id.button_notification_close;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_notification_close);
        if (imageButton != null) {
            i = R.id.text_notification_message;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_notification_message);
            if (textView != null) {
                i = R.id.text_notification_title;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_notification_title);
                if (textView2 != null) {
                    return new C36827s8((ConstraintLayout) view, imageButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36827s8 m151030c(@C0359n0 LayoutInflater layoutInflater) {
        return m151031d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36827s8 m151031d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.view_notification_default, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151029a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91649a;
    }
}
