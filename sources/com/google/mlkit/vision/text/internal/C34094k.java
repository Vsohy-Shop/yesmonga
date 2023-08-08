package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.util.SparseArray;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.mlkit_vision_text_common.C29986a1;
import com.google.android.gms.internal.mlkit_vision_text_common.C30009c;
import com.google.android.gms.internal.mlkit_vision_text_common.C30034e0;
import com.google.android.gms.internal.mlkit_vision_text_common.C30106k0;
import com.google.android.gms.internal.mlkit_vision_text_common.C30260wa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbm;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.mlkit.vision.text.C34049b;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.vision.text.internal.k */
public final class C34094k {
    @C40974d0

    /* renamed from: a */
    public static final C30260wa f82753a = C30260wa.m121917a("\n");

    /* renamed from: b */
    public static final Comparator<Map.Entry<String, Integer>> f82754b = C34093j.f82752a;

    /* renamed from: a */
    public static C34049b m137049a(zzl[] zzlArr) {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (zzl zzl : zzlArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzl.f72630x);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzl.f72630x, sparseArray2);
            }
            sparseArray2.append(zzl.f72631y, zzl);
        }
        C30034e0 w = zzbm.m121992w();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i2);
            C30034e0 w2 = zzbm.m121992w();
            for (int i3 = i; i3 < sparseArray3.size(); i3++) {
                w2.mo85081c((zzl) sparseArray3.valueAt(i3));
            }
            zzbm d = w2.mo85082d();
            List a = C30106k0.m121751a(d, C34089f.f82748a);
            zzf zzf = ((zzl) d.get(i)).f72622b;
            C29986a1 H = d.listIterator(i);
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            while (H.hasNext()) {
                zzf zzf2 = ((zzl) H.next()).f72622b;
                int i8 = zzf.f72419a;
                int i9 = zzf.f72420b;
                C29986a1 a1Var = H;
                double sin = Math.sin(Math.toRadians((double) zzf.f72423e));
                double cos = Math.cos(Math.toRadians((double) zzf.f72423e));
                SparseArray sparseArray4 = sparseArray;
                int i10 = i2;
                Point[] pointArr = new Point[4];
                C30034e0 e0Var = w;
                List list = a;
                Point point = new Point(zzf2.f72419a, zzf2.f72420b);
                pointArr[0] = point;
                point.offset(-i8, -i9);
                Point point2 = pointArr[0];
                int i11 = point2.x;
                int i12 = point2.y;
                int i13 = i4;
                int i14 = (int) ((((double) i11) * cos) + (((double) i12) * sin));
                int i15 = (int) ((((double) (-i11)) * sin) + (((double) i12) * cos));
                point2.x = i14;
                point2.y = i15;
                pointArr[1] = new Point(zzf2.f72421c + i14, i15);
                pointArr[2] = new Point(zzf2.f72421c + i14, zzf2.f72422d + i15);
                pointArr[3] = new Point(i14, i15 + zzf2.f72422d);
                i4 = i13;
                i7 = i7;
                for (int i16 = 0; i16 < 4; i16++) {
                    Point point3 = pointArr[i16];
                    i5 = Math.min(i5, point3.x);
                    i4 = Math.max(i4, point3.x);
                    i6 = Math.min(i6, point3.y);
                    i7 = Math.max(i7, point3.y);
                }
                H = a1Var;
                sparseArray = sparseArray4;
                i2 = i10;
                w = e0Var;
                a = list;
            }
            C30034e0 e0Var2 = w;
            SparseArray sparseArray5 = sparseArray;
            int i17 = i2;
            List list2 = a;
            int i18 = zzf.f72419a;
            int i19 = zzf.f72420b;
            double sin2 = Math.sin(Math.toRadians((double) zzf.f72423e));
            double cos2 = Math.cos(Math.toRadians((double) zzf.f72423e));
            int i20 = i4;
            int i21 = i7;
            Point[] pointArr2 = {new Point(i5, i6), new Point(i20, i6), new Point(i20, i21), new Point(i5, i21)};
            for (int i22 = 0; i22 < 4; i22++) {
                Point point4 = pointArr2[i22];
                int i23 = point4.x;
                int i24 = point4.y;
                Point point5 = point4;
                point5.x = (int) ((((double) i23) * cos2) - (((double) i24) * sin2));
                point5.y = (int) ((((double) i23) * sin2) + (((double) i24) * cos2));
                point5.offset(i18, i19);
            }
            List asList = Arrays.asList(pointArr2);
            List list3 = list2;
            C30034e0 e0Var3 = e0Var2;
            e0Var3.mo85081c(new C34049b.C34053d(f82753a.mo85381b(C30106k0.m121751a(list3, C34091h.f82750a)), C34086c.m137039a(asList), asList, m137050b(list3), list3));
            i2 = i17 + 1;
            w = e0Var3;
            i = 0;
            sparseArray = sparseArray5;
        }
        zzbm d2 = w.mo85082d();
        return new C34049b(f82753a.mo85381b(C30106k0.m121751a(d2, C34092i.f82751a)), d2);
    }

    /* renamed from: b */
    public static String m137050b(List<C34049b.C34051b> list) {
        int i;
        HashMap hashMap = new HashMap();
        for (C34049b.C34051b c : list) {
            String c2 = c.mo99010c();
            if (hashMap.containsKey(c2)) {
                i = ((Integer) hashMap.get(c2)).intValue();
            } else {
                i = 0;
            }
            hashMap.put(c2, Integer.valueOf(i + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, f82754b)).getKey();
        if (C30009c.m121601b(str)) {
            return "und";
        }
        return str;
    }
}
