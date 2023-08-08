package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import p015ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* renamed from: com.carrefour.fid.android.design.components.databinding.h0 */
public final class C37050h0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92680a;
    @C0359n0

    /* renamed from: b */
    public final ScrollingPagerIndicator f92681b;

    public C37050h0(@C0359n0 View view, @C0359n0 ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f92680a = view;
        this.f92681b = scrollingPagerIndicator;
    }

    @C0359n0
    /* renamed from: a */
    public static C37050h0 m151985a(@C0359n0 View view) {
        int i = C36896b.C36906j.scrolling_pager_indicator;
        ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C20753c.m96463a(view, i);
        if (scrollingPagerIndicator != null) {
            return new C37050h0(view, scrollingPagerIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37050h0 m151986b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_page_controls, viewGroup);
            return m151985a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92680a;
    }
}
