package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.q3 */
public final class C36802q3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91532a;
    @C0359n0

    /* renamed from: b */
    public final Button f91533b;
    @C0359n0

    /* renamed from: c */
    public final FrameLayout f91534c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91535d;

    public C36802q3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 FrameLayout frameLayout, @C0359n0 TextView textView) {
        this.f91532a = constraintLayout;
        this.f91533b = button;
        this.f91534c = frameLayout;
        this.f91535d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36802q3 m150933a(@C0359n0 View view) {
        int i = R.id.button_capture;
        Button button = (Button) C20753c.m96463a(view, R.id.button_capture);
        if (button != null) {
            i = R.id.camera_preview;
            FrameLayout frameLayout = (FrameLayout) C20753c.m96463a(view, R.id.camera_preview);
            if (frameLayout != null) {
                i = R.id.camera_scan;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.camera_scan);
                if (textView != null) {
                    return new C36802q3((ConstraintLayout) view, button, frameLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36802q3 m150934c(@C0359n0 LayoutInflater layoutInflater) {
        return m150935d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36802q3 m150935d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_service_stations_camera, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150933a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91532a;
    }
}
