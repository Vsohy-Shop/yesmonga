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

/* renamed from: com.carrefour.fid.android.databinding.e6 */
public final class C36685e6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f90767a;
    @C0359n0

    /* renamed from: b */
    public final Button f90768b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90769c;
    @C0359n0

    /* renamed from: d */
    public final ConstraintLayout f90770d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90771e;

    public C36685e6(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 TextView textView) {
        this.f90767a = constraintLayout;
        this.f90768b = button;
        this.f90769c = imageView;
        this.f90770d = constraintLayout2;
        this.f90771e = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36685e6 m150469a(@C0359n0 View view) {
        int i = R.id.button_include_gaz_station;
        Button button = (Button) C20753c.m96463a(view, R.id.button_include_gaz_station);
        if (button != null) {
            i = R.id.image_include_gaz_station;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_include_gaz_station);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.text_include_gaz_station;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_include_gaz_station);
                if (textView != null) {
                    return new C36685e6(constraintLayout, button, imageView, constraintLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36685e6 m150470c(@C0359n0 LayoutInflater layoutInflater) {
        return m150471d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36685e6 m150471d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_gas_station, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150469a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f90767a;
    }
}
