package com.google.mlkit.vision.text.bundled.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.util.C40974d0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29056av;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29090bs;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29237fs;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29384js;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29494mr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29794uv;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29795uw;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29864wr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbqd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbru;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbry;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsa;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.mlkit.vision.text.bundled.common.s */
public final class C34073s {
    @C40974d0

    /* renamed from: a */
    public static final C29494mr f82721a = C29494mr.m120742a("\n");

    /* renamed from: b */
    public static final Comparator<Map.Entry<String, Integer>> f82722b = C34072r.f82720a;

    /* renamed from: a */
    public static zbsa m137006a(C29795uw uwVar, @C0363p0 Matrix matrix) {
        String str;
        int i;
        Matrix matrix2 = matrix;
        List<C29794uv> x = uwVar.mo84897x();
        SparseArray sparseArray = new SparseArray();
        for (C29794uv next : x) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(next.mo84894w());
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(next.mo84894w(), sparseArray2);
            }
            sparseArray2.append(next.mo84895x(), next);
        }
        C29090bs w = zbqd.m121464w();
        int i2 = 0;
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i3);
            C29090bs w2 = zbqd.m121464w();
            for (int i4 = i2; i4 < sparseArray3.size(); i4++) {
                w2.mo84536c((C29794uv) sparseArray3.valueAt(i4));
            }
            zbqd d = w2.mo84537d();
            List a = C29237fs.m120389a(d, new C34068n(matrix2));
            C29056av y = ((C29794uv) d.get(i2)).mo84896y();
            C29384js H = d.listIterator(i2);
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            while (H.hasNext()) {
                C29056av y2 = ((C29794uv) H.next()).mo84896y();
                int x2 = y.mo84514x();
                int y3 = y.mo84515y();
                SparseArray sparseArray4 = sparseArray;
                double sin = Math.sin(Math.toRadians((double) y.mo84512v()));
                int i9 = i3;
                C29384js jsVar = H;
                double cos = Math.cos(Math.toRadians((double) y.mo84512v()));
                C29090bs bsVar = w;
                Point[] pointArr = new Point[4];
                List list = a;
                Point point = new Point(y2.mo84514x(), y2.mo84515y());
                pointArr[0] = point;
                point.offset(-x2, -y3);
                Point point2 = pointArr[0];
                int i10 = point2.x;
                int i11 = point2.y;
                int i12 = i5;
                int i13 = (int) ((((double) i10) * cos) + (((double) i11) * sin));
                int i14 = (int) ((((double) (-i10)) * sin) + (((double) i11) * cos));
                point2.x = i13;
                point2.y = i14;
                pointArr[1] = new Point(y2.mo84511A() + i13, i14);
                pointArr[2] = new Point(y2.mo84511A() + i13, y2.mo84513w() + i14);
                pointArr[3] = new Point(i13, i14 + y2.mo84513w());
                i5 = i12;
                i8 = i8;
                for (int i15 = 0; i15 < 4; i15++) {
                    Point point3 = pointArr[i15];
                    i6 = Math.min(i6, point3.x);
                    i5 = Math.max(i5, point3.x);
                    i7 = Math.min(i7, point3.y);
                    i8 = Math.max(i8, point3.y);
                }
                Matrix matrix3 = matrix;
                sparseArray = sparseArray4;
                i3 = i9;
                H = jsVar;
                w = bsVar;
                a = list;
            }
            C29090bs bsVar2 = w;
            SparseArray sparseArray5 = sparseArray;
            int i16 = i3;
            int i17 = i8;
            List list2 = a;
            int x3 = y.mo84514x();
            int y4 = y.mo84515y();
            double sin2 = Math.sin(Math.toRadians((double) y.mo84512v()));
            double cos2 = Math.cos(Math.toRadians((double) y.mo84512v()));
            int i18 = i5;
            int i19 = i17;
            Point[] pointArr2 = {new Point(i6, i7), new Point(i18, i7), new Point(i18, i19), new Point(i6, i19)};
            for (int i20 = 0; i20 < 4; i20++) {
                Point point4 = pointArr2[i20];
                int i21 = point4.x;
                int i22 = point4.y;
                Point point5 = point4;
                point5.x = (int) ((((double) i21) * cos2) - (((double) i22) * sin2));
                point5.y = (int) ((((double) i21) * sin2) + (((double) i22) * cos2));
                point5.offset(x3, y4);
            }
            List asList = Arrays.asList(pointArr2);
            List<zbry> list3 = list2;
            String b = f82721a.mo84722b(C29237fs.m120389a(list3, C34071q.f82719a));
            Matrix matrix4 = matrix;
            Rect a2 = C34064j.m136991a(asList, matrix4);
            HashMap hashMap = new HashMap();
            for (zbry M : list3) {
                String M2 = M.mo84984M();
                if (hashMap.containsKey(M2)) {
                    i = ((Integer) hashMap.get(M2)).intValue();
                } else {
                    i = 0;
                }
                hashMap.put(M2, Integer.valueOf(i + 1));
            }
            Set entrySet = hashMap.entrySet();
            if (!entrySet.isEmpty()) {
                String str2 = (String) ((Map.Entry) Collections.max(entrySet, f82722b)).getKey();
                if (!C29864wr.m121283b(str2)) {
                    str = str2;
                    C29090bs bsVar3 = bsVar2;
                    bsVar3.mo84536c(new zbru(b, a2, asList, str, list3));
                    i3 = i16 + 1;
                    matrix2 = matrix4;
                    w = bsVar3;
                    i2 = 0;
                    sparseArray = sparseArray5;
                }
            }
            str = "und";
            C29090bs bsVar32 = bsVar2;
            bsVar32.mo84536c(new zbru(b, a2, asList, str, list3));
            i3 = i16 + 1;
            matrix2 = matrix4;
            w = bsVar32;
            i2 = 0;
            sparseArray = sparseArray5;
        }
        zbqd d2 = w.mo84537d();
        return new zbsa(f82721a.mo84722b(C29237fs.m120389a(d2, C34070p.f82718a)), d2);
    }
}
