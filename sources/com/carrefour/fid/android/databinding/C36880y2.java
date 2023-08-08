package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y2 */
public final class C36880y2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91965a;
    @C0359n0

    /* renamed from: b */
    public final Button f91966b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f91967c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91968d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91969e;

    public C36880y2(@C0359n0 ScrollView scrollView, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91965a = scrollView;
        this.f91966b = button;
        this.f91967c = imageView;
        this.f91968d = textView;
        this.f91969e = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36880y2 m151235a(@C0359n0 View view) {
        int i = R.id.button_success;
        Button button = (Button) C20753c.m96463a(view, R.id.button_success);
        if (button != null) {
            i = R.id.image_success_logo;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_success_logo);
            if (imageView != null) {
                i = R.id.text_success_message;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_success_message);
                if (textView != null) {
                    i = R.id.text_success_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_success_title);
                    if (textView2 != null) {
                        return new C36880y2((ScrollView) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36880y2 m151236c(@C0359n0 LayoutInflater layoutInflater) {
        return m151237d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36880y2 m151237d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_success_handle, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151235a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91965a;
    }
}
