package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.j1 */
public final class C37057j1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ImageView f92700a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f92701b;

    public C37057j1(@C0359n0 ImageView imageView, @C0359n0 ImageView imageView2) {
        this.f92700a = imageView;
        this.f92701b = imageView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C37057j1 m152005a(@C0359n0 View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new C37057j1(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C37057j1 m152006c(@C0359n0 LayoutInflater layoutInflater) {
        return m152007d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C37057j1 m152007d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36896b.C36909m.ds_item_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m152005a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ImageView getRoot() {
        return this.f92700a;
    }
}
