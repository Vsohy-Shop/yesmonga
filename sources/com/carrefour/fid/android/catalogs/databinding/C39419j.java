package com.carrefour.fid.android.catalogs.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.catalogs.C39364b;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.catalogs.databinding.j */
public final class C39419j implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f100841a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f100842b;
    @C0359n0

    /* renamed from: c */
    public final TextView f100843c;
    @C0359n0

    /* renamed from: d */
    public final ViewPager2 f100844d;
    @C0359n0

    /* renamed from: e */
    public final ShimmerFrameLayout f100845e;
    @C0359n0

    /* renamed from: f */
    public final View f100846f;

    public C39419j(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 ViewPager2 viewPager2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 View view) {
        this.f100841a = constraintLayout;
        this.f100842b = imageView;
        this.f100843c = textView;
        this.f100844d = viewPager2;
        this.f100845e = shimmerFrameLayout;
        this.f100846f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.view_shimmer_store;
     */
    @androidx.annotation.C0359n0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.carrefour.fid.android.catalogs.databinding.C39419j m161565a(@androidx.annotation.C0359n0 android.view.View r9) {
        /*
            int r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.catalog_criteo_banner
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.catalog_page_number
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.catalog_view_pager
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r6 = r1
            androidx.viewpager2.widget.ViewPager2 r6 = (androidx.viewpager2.widget.ViewPager2) r6
            if (r6 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.catalogs_shimmer
            android.view.View r1 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            r7 = r1
            com.facebook.shimmer.ShimmerFrameLayout r7 = (com.facebook.shimmer.ShimmerFrameLayout) r7
            if (r7 == 0) goto L_0x003e
            int r0 = com.carrefour.fid.android.catalogs.C39364b.C39374j.view_shimmer_store
            android.view.View r8 = androidx.viewbinding.C20753c.m96463a(r9, r0)
            if (r8 == 0) goto L_0x003e
            com.carrefour.fid.android.catalogs.databinding.j r0 = new com.carrefour.fid.android.catalogs.databinding.j
            r3 = r9
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x003e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.catalogs.databinding.C39419j.m161565a(android.view.View):com.carrefour.fid.android.catalogs.databinding.j");
    }

    @C0359n0
    /* renamed from: c */
    public static C39419j m161566c(@C0359n0 LayoutInflater layoutInflater) {
        return m161567d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C39419j m161567d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39364b.C39377m.fragment_catalog_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m161565a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f100841a;
    }
}
