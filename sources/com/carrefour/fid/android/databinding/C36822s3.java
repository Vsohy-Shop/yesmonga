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

/* renamed from: com.carrefour.fid.android.databinding.s3 */
public final class C36822s3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91629a;
    @C0359n0

    /* renamed from: b */
    public final Button f91630b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91631c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91632d;

    public C36822s3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView) {
        this.f91629a = constraintLayout;
        this.f91630b = button;
        this.f91631c = imageView;
        this.f91632d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36822s3 m151009a(@C0359n0 View view) {
        int i = R.id.btnChoisiMonMagasin;
        Button button = (Button) C20753c.m96463a(view, R.id.btnChoisiMonMagasin);
        if (button != null) {
            i = R.id.storeLocatorHomeImage;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.storeLocatorHomeImage);
            if (imageView != null) {
                i = R.id.storeLocatorHomeTitle;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.storeLocatorHomeTitle);
                if (textView != null) {
                    return new C36822s3((ConstraintLayout) view, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36822s3 m151010c(@C0359n0 LayoutInflater layoutInflater) {
        return m151011d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36822s3 m151011d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_store_locator_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151009a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91629a;
    }
}
