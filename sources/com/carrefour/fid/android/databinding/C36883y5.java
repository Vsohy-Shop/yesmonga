package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.y5 */
public final class C36883y5 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f91978a;
    @C0359n0

    /* renamed from: b */
    public final View f91979b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91980c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91981d;
    @C0359n0

    /* renamed from: e */
    public final Group f91982e;
    @C0359n0

    /* renamed from: f */
    public final AppCompatTextView f91983f;
    @C0359n0

    /* renamed from: g */
    public final AppCompatTextView f91984g;
    @C0359n0

    /* renamed from: h */
    public final AppCompatImageView f91985h;

    public C36883y5(@C0359n0 View view, @C0359n0 View view2, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 Group group, @C0359n0 AppCompatTextView appCompatTextView, @C0359n0 AppCompatTextView appCompatTextView2, @C0359n0 AppCompatImageView appCompatImageView) {
        this.f91978a = view;
        this.f91979b = view2;
        this.f91980c = textView;
        this.f91981d = textView2;
        this.f91982e = group;
        this.f91983f = appCompatTextView;
        this.f91984g = appCompatTextView2;
        this.f91985h = appCompatImageView;
    }

    @C0359n0
    /* renamed from: a */
    public static C36883y5 m151247a(@C0359n0 View view) {
        int i = R.id.home_fid_background_view;
        View a = C20753c.m96463a(view, R.id.home_fid_background_view);
        if (a != null) {
            i = R.id.home_fid_card_description;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.home_fid_card_description);
            if (textView != null) {
                i = R.id.home_fid_create_card;
                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.home_fid_create_card);
                if (textView2 != null) {
                    i = R.id.home_fid_group;
                    Group group = (Group) C20753c.m96463a(view, R.id.home_fid_group);
                    if (group != null) {
                        i = R.id.home_fid_header_see_all;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C20753c.m96463a(view, R.id.home_fid_header_see_all);
                        if (appCompatTextView != null) {
                            i = R.id.home_fid_header_text;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C20753c.m96463a(view, R.id.home_fid_header_text);
                            if (appCompatTextView2 != null) {
                                i = R.id.home_fid_icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view, R.id.home_fid_icon);
                                if (appCompatImageView != null) {
                                    return new C36883y5(view, a, textView, textView2, group, appCompatTextView, appCompatTextView2, appCompatImageView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C36883y5 m151248b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.home_fid_card_layout, viewGroup);
            return m151247a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f91978a;
    }
}
