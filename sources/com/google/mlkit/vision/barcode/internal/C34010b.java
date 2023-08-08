package com.google.mlkit.vision.barcode.internal;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.annotation.C0344h1;
import com.google.android.gms.internal.mlkit_vision_barcode.C38557ba;
import com.google.android.gms.internal.mlkit_vision_barcode.C38699m9;
import com.google.android.gms.internal.mlkit_vision_barcode.C38725o9;
import com.google.android.gms.internal.mlkit_vision_barcode.C38767s0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzje;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjf;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlb;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.vision.barcode.C33982a;
import com.google.mlkit.vision.barcode.C34004c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.mlkit.vision.barcode.internal.b */
public final class C34010b {

    /* renamed from: a */
    public static final SparseArray<zzjq> f82606a;

    /* renamed from: b */
    public static final SparseArray<zzjr> f82607b;
    @C0344h1

    /* renamed from: c */
    public static final AtomicReference<Boolean> f82608c = new AtomicReference<>();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d */
    public static final Map<Integer, zzlb> f82609d;

    static {
        SparseArray<zzjq> sparseArray = new SparseArray<>();
        f82606a = sparseArray;
        SparseArray<zzjr> sparseArray2 = new SparseArray<>();
        f82607b = sparseArray2;
        sparseArray.put(-1, zzjq.FORMAT_UNKNOWN);
        sparseArray.put(1, zzjq.FORMAT_CODE_128);
        sparseArray.put(2, zzjq.FORMAT_CODE_39);
        sparseArray.put(4, zzjq.FORMAT_CODE_93);
        sparseArray.put(8, zzjq.FORMAT_CODABAR);
        sparseArray.put(16, zzjq.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzjq.FORMAT_EAN_13);
        sparseArray.put(64, zzjq.FORMAT_EAN_8);
        sparseArray.put(128, zzjq.FORMAT_ITF);
        sparseArray.put(256, zzjq.FORMAT_QR_CODE);
        sparseArray.put(512, zzjq.FORMAT_UPC_A);
        sparseArray.put(1024, zzjq.FORMAT_UPC_E);
        sparseArray.put(2048, zzjq.FORMAT_PDF417);
        sparseArray.put(4096, zzjq.FORMAT_AZTEC);
        sparseArray2.put(0, zzjr.TYPE_UNKNOWN);
        sparseArray2.put(1, zzjr.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzjr.TYPE_EMAIL);
        sparseArray2.put(3, zzjr.TYPE_ISBN);
        sparseArray2.put(4, zzjr.TYPE_PHONE);
        sparseArray2.put(5, zzjr.TYPE_PRODUCT);
        sparseArray2.put(6, zzjr.TYPE_SMS);
        sparseArray2.put(7, zzjr.TYPE_TEXT);
        sparseArray2.put(8, zzjr.TYPE_URL);
        sparseArray2.put(9, zzjr.TYPE_WIFI);
        sparseArray2.put(10, zzjr.TYPE_GEO);
        sparseArray2.put(11, zzjr.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzjr.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f82609d = hashMap;
        hashMap.put(1, zzlb.CODE_128);
        hashMap.put(2, zzlb.CODE_39);
        hashMap.put(4, zzlb.CODE_93);
        hashMap.put(8, zzlb.CODABAR);
        hashMap.put(16, zzlb.DATA_MATRIX);
        hashMap.put(32, zzlb.EAN_13);
        hashMap.put(64, zzlb.EAN_8);
        hashMap.put(128, zzlb.ITF);
        hashMap.put(256, zzlb.QR_CODE);
        hashMap.put(512, zzlb.UPC_A);
        hashMap.put(1024, zzlb.UPC_E);
        hashMap.put(2048, zzlb.PDF417);
        hashMap.put(4096, zzlb.AZTEC);
    }

    /* renamed from: a */
    public static zzjq m136822a(@C33982a.C33985b int i) {
        zzjq zzjq = f82606a.get(i);
        if (zzjq == null) {
            return zzjq.FORMAT_UNKNOWN;
        }
        return zzjq;
    }

    /* renamed from: b */
    public static zzjr m136823b(@C33982a.C33986c int i) {
        zzjr zzjr = f82607b.get(i);
        if (zzjr == null) {
            return zzjr.TYPE_UNKNOWN;
        }
        return zzjr;
    }

    /* renamed from: c */
    public static C38725o9 m136824c(C34004c cVar) {
        int a = cVar.mo98922a();
        C38767s0 s0Var = new C38767s0();
        if (a == 0) {
            s0Var.mo122499f(f82609d.values());
        } else {
            for (Map.Entry next : f82609d.entrySet()) {
                if ((((Integer) next.getKey()).intValue() & a) != 0) {
                    s0Var.mo122498e((zzlb) next.getValue());
                }
            }
        }
        C38699m9 m9Var = new C38699m9();
        m9Var.mo122429b(s0Var.mo122500g());
        return m9Var.mo122430c();
    }

    /* renamed from: d */
    public static String m136825d() {
        return true != m136827f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    /* renamed from: e */
    public static void m136826e(C38557ba baVar, zzje zzje) {
        baVar.mo122237b(new C34009a(zzje), zzjf.ON_DEVICE_BARCODE_LOAD);
    }

    /* renamed from: f */
    public static boolean m136827f() {
        AtomicReference<Boolean> atomicReference = f82608c;
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean b = C34021m.m136871b(C33947j.m136584c().mo98718b());
        atomicReference.set(Boolean.valueOf(b));
        return b;
    }
}
