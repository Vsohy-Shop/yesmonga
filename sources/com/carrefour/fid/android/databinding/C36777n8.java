package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: com.carrefour.fid.android.databinding.n8 */
public final class C36777n8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final CollapsingToolbarLayout f91381a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91382b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f91383c;
    @C0359n0

    /* renamed from: d */
    public final CollapsingToolbarLayout f91384d;
    @C0359n0

    /* renamed from: e */
    public final RecyclerView f91385e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91386f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91387g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91388h;

    public C36777n8(@C0359n0 CollapsingToolbarLayout collapsingToolbarLayout, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 CollapsingToolbarLayout collapsingToolbarLayout2, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f91381a = collapsingToolbarLayout;
        this.f91382b = imageButton;
        this.f91383c = imageButton2;
        this.f91384d = collapsingToolbarLayout2;
        this.f91385e = recyclerView;
        this.f91386f = textView;
        this.f91387g = textView2;
        this.f91388h = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36777n8 m150835a(@C0359n0 View view) {
        int i = R.id.button_toolbar_plp_filters;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_plp_filters);
        if (imageButton != null) {
            i = R.id.button_toolbar_plp_tag_line;
            ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_plp_tag_line);
            if (imageButton2 != null) {
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) view;
                i = R.id.recycler_toolbar_plp_tag_line;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.recycler_toolbar_plp_tag_line);
                if (recyclerView != null) {
                    i = R.id.text_toolbar_plp_filters;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_toolbar_plp_filters);
                    if (textView != null) {
                        i = R.id.text_toolbar_plp_subtitle;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_toolbar_plp_subtitle);
                        if (textView2 != null) {
                            i = R.id.text_toolbar_plp_title;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_toolbar_plp_title);
                            if (textView3 != null) {
                                return new C36777n8(collapsingToolbarLayout, imageButton, imageButton2, collapsingToolbarLayout, recyclerView, textView, textView2, textView3);
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
    public static C36777n8 m150836c(@C0359n0 LayoutInflater layoutInflater) {
        return m150837d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36777n8 m150837d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_plp_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150835a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public CollapsingToolbarLayout getRoot() {
        return this.f91381a;
    }
}
