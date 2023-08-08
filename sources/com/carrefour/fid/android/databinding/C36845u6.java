package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.u6 */
public final class C36845u6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91766a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91767b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91768c;
    @C0359n0

    /* renamed from: d */
    public final ProgressBar f91769d;

    public C36845u6(@C0359n0 View view, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ProgressBar progressBar) {
        this.f91766a = view;
        this.f91767b = imageView;
        this.f91768c = imageView2;
        this.f91769d = progressBar;
    }

    @C0359n0
    /* renamed from: a */
    public static C36845u6 m151099a(@C0359n0 View view) {
        int i = R.id.custom_progress_bar_iv_end;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.custom_progress_bar_iv_end);
        if (imageView != null) {
            i = R.id.custom_progress_bar_iv_start;
            ImageView imageView2 = (ImageView) C20753c.m96463a(view, R.id.custom_progress_bar_iv_start);
            if (imageView2 != null) {
                i = R.id.progress_fragment_attach_card_submit;
                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_fragment_attach_card_submit);
                if (progressBar != null) {
                    return new C36845u6(view, imageView, imageView2, progressBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36845u6 m151100b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.order_details_progress, viewGroup);
            return m151099a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91766a;
    }
}
