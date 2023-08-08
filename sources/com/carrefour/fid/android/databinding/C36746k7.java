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

/* renamed from: com.carrefour.fid.android.databinding.k7 */
public final class C36746k7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91150a;
    @C0359n0

    /* renamed from: b */
    public final Button f91151b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91152c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91153d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91154e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91155f;

    public C36746k7(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91150a = constraintLayout;
        this.f91151b = button;
        this.f91152c = imageView;
        this.f91153d = textView;
        this.f91154e = textView2;
        this.f91155f = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36746k7 m150711a(@C0359n0 View view) {
        int i = R.id.service_stations_btn_plp;
        Button button = (Button) C20753c.m96463a(view, R.id.service_stations_btn_plp);
        if (button != null) {
            i = R.id.service_stations_header;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.service_stations_header);
            if (imageView != null) {
                i = R.id.service_stations_result_success_subtitle;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.service_stations_result_success_subtitle);
                if (textView != null) {
                    i = R.id.service_stations_result_success_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.service_stations_result_success_title);
                    if (textView2 != null) {
                        i = R.id.text_view_countdown;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_view_countdown);
                        if (textView3 != null) {
                            return new C36746k7((ConstraintLayout) view, button, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36746k7 m150712c(@C0359n0 LayoutInflater layoutInflater) {
        return m150713d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36746k7 m150713d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_stations_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150711a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91150a;
    }
}
