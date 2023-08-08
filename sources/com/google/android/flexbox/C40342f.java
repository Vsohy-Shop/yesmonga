package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.f */
public class C40342f {

    /* renamed from: a */
    public int f102820a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f102821b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f102822c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f102823d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f102824e;

    /* renamed from: f */
    public int f102825f;

    /* renamed from: g */
    public int f102826g;

    /* renamed from: h */
    public int f102827h;

    /* renamed from: i */
    public int f102828i;

    /* renamed from: j */
    public float f102829j;

    /* renamed from: k */
    public float f102830k;

    /* renamed from: l */
    public int f102831l;

    /* renamed from: m */
    public int f102832m;

    /* renamed from: n */
    public List<Integer> f102833n = new ArrayList();

    /* renamed from: o */
    public int f102834o;

    /* renamed from: p */
    public int f102835p;

    /* renamed from: q */
    public boolean f102836q;

    /* renamed from: r */
    public boolean f102837r;

    /* renamed from: a */
    public int mo133169a() {
        return this.f102826g;
    }

    /* renamed from: b */
    public int mo133170b() {
        return this.f102834o;
    }

    /* renamed from: c */
    public int mo133171c() {
        return this.f102827h;
    }

    /* renamed from: d */
    public int mo133172d() {
        return this.f102827h - this.f102828i;
    }

    /* renamed from: e */
    public int mo133173e() {
        return this.f102824e;
    }

    /* renamed from: f */
    public float mo133174f() {
        return this.f102829j;
    }

    /* renamed from: g */
    public float mo133175g() {
        return this.f102830k;
    }

    /* renamed from: h */
    public void mo133176h(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f102820a = Math.min(this.f102820a, (view.getLeft() - flexItem.mo133005b3()) - i);
        this.f102821b = Math.min(this.f102821b, (view.getTop() - flexItem.mo133014q1()) - i2);
        this.f102822c = Math.max(this.f102822c, view.getRight() + flexItem.mo132991F3() + i3);
        this.f102823d = Math.max(this.f102823d, view.getBottom() + flexItem.mo133004X2() + i4);
    }
}
