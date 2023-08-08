package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.l7 */
public final class C36756l7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91221a;
    @C0359n0

    /* renamed from: b */
    public final TextView f91222b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91223c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91224d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91225e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91226f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91227g;

    public C36756l7(@C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 ImageView imageView, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5) {
        this.f91221a = linearLayout;
        this.f91222b = textView;
        this.f91223c = textView2;
        this.f91224d = imageView;
        this.f91225e = textView3;
        this.f91226f = textView4;
        this.f91227g = textView5;
    }

    @C0359n0
    /* renamed from: a */
    public static C36756l7 m150751a(@C0359n0 View view) {
        int i = R.id.first_shimmer;
        TextView textView = (TextView) C20753c.m96463a(view, R.id.first_shimmer);
        if (textView != null) {
            i = R.id.four_shimmer;
            TextView textView2 = (TextView) C20753c.m96463a(view, R.id.four_shimmer);
            if (textView2 != null) {
                i = R.id.header;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.header);
                if (imageView != null) {
                    i = R.id.second_shimmer;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.second_shimmer);
                    if (textView3 != null) {
                        i = R.id.shimmer_title;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.shimmer_title);
                        if (textView4 != null) {
                            i = R.id.third_shimmer;
                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.third_shimmer);
                            if (textView5 != null) {
                                return new C36756l7((LinearLayout) view, textView, textView2, imageView, textView3, textView4, textView5);
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
    public static C36756l7 m150752c(@C0359n0 LayoutInflater layoutInflater) {
        return m150753d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36756l7 m150753d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_stations_shimmer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150751a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91221a;
    }
}
