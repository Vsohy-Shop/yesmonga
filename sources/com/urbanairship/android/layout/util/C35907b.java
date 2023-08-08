package com.urbanairship.android.layout.util;

import android.content.res.ColorStateList;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.urbanairship.android.layout.util.b */
public class C35907b {

    /* renamed from: c */
    public static final int[] f88797c = new int[0];

    /* renamed from: a */
    public final List<Integer> f88798a = new ArrayList();

    /* renamed from: b */
    public final List<int[]> f88799b = new ArrayList();

    /* renamed from: a */
    public C35907b mo107548a(int i) {
        this.f88798a.add(Integer.valueOf(i));
        this.f88799b.add(f88797c);
        return this;
    }

    /* renamed from: b */
    public C35907b mo107549b(int i, int... iArr) {
        this.f88798a.add(Integer.valueOf(i));
        this.f88799b.add(iArr);
        return this;
    }

    /* renamed from: c */
    public ColorStateList mo107550c() {
        return new ColorStateList(mo107552e(), mo107551d());
    }

    /* renamed from: d */
    public final int[] mo107551d() {
        int[] iArr = new int[this.f88798a.size()];
        for (int i = 0; i < this.f88798a.size(); i++) {
            iArr[i] = this.f88798a.get(i).intValue();
        }
        return iArr;
    }

    /* renamed from: e */
    public final int[][] mo107552e() {
        int size = this.f88799b.size();
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = size;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        for (int i = 0; i < this.f88799b.size(); i++) {
            iArr2[i] = this.f88799b.get(i);
        }
        return iArr2;
    }
}
