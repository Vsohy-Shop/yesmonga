package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.j */
public final class C36728j implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CardView f91035a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f91036b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91037c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91038d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91039e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91040f;

    public C36728j(@C0359n0 CardView cardView, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f91035a = cardView;
        this.f91036b = imageView;
        this.f91037c = textView;
        this.f91038d = textView2;
        this.f91039e = textView3;
        this.f91040f = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36728j m150639a(@C0359n0 View view) {
        int i = R.id.image_order_information_arrow;
        ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_order_information_arrow);
        if (imageView != null) {
            i = R.id.text_order_information_description;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_order_information_description);
            if (textView != null) {
                i = R.id.text_order_information_icon;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_order_information_icon);
                if (textView2 != null) {
                    i = R.id.text_order_information_title;
                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_order_information_title);
                    if (textView3 != null) {
                        i = R.id.view_separator;
                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.view_separator);
                        if (textView4 != null) {
                            return new C36728j((CardView) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36728j m150640c(@C0359n0 LayoutInflater layoutInflater) {
        return m150641d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36728j m150641d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_view_order_information, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150639a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CardView getRoot() {
        return this.f91035a;
    }
}
