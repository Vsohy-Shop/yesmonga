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

/* renamed from: com.carrefour.fid.android.databinding.l */
public final class C36748l implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91159a;
    @C0359n0

    /* renamed from: b */
    public final Button f91160b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91161c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91162d;

    public C36748l(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91159a = constraintLayout;
        this.f91160b = button;
        this.f91161c = imageView;
        this.f91162d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36748l m150719a(@C0359n0 View view) {
        int i = R.id.channelTryAgain;
        Button button = (Button) C20753c.m96463a(view, R.id.channelTryAgain);
        if (button != null) {
            i = R.id.errorChannelImage;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.errorChannelImage);
            if (imageView != null) {
                i = R.id.errorChannelText;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.errorChannelText);
                if (textView != null) {
                    return new C36748l((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36748l m150720c(@C0359n0 LayoutInflater layoutInflater) {
        return m150721d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36748l m150721d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.channel_error_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150719a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91159a;
    }
}
