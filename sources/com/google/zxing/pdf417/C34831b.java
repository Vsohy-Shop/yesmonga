package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34644b;
import com.google.zxing.C34760j;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34712d;
import com.google.zxing.multi.C34770c;
import com.google.zxing.pdf417.decoder.C34846i;
import com.google.zxing.pdf417.detector.C34847a;
import com.google.zxing.pdf417.detector.C34848b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.pdf417.b */
public final class C34831b implements C34760j, C34770c {

    /* renamed from: a */
    public static final C34761k[] f84538a = new C34761k[0];

    /* renamed from: e */
    public static C34761k[] m142212e(C34644b bVar, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        C34848b b = C34847a.m142368b(bVar, map, z);
        for (C34762l[] next : b.mo103131b()) {
            C34712d i = C34846i.m142351i(b.mo103130a(), next[4], next[5], next[6], next[7], m142215h(next), m142213f(next));
            C34761k kVar = new C34761k(i.mo102692j(), i.mo102689g(), next, BarcodeFormat.PDF_417);
            kVar.mo102881j(ResultMetadataType.ERROR_CORRECTION_LEVEL, i.mo102684b());
            C34832c cVar = (C34832c) i.mo102688f();
            if (cVar != null) {
                kVar.mo102881j(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(kVar);
        }
        return (C34761k[]) arrayList.toArray(f84538a);
    }

    /* renamed from: f */
    public static int m142213f(C34762l[] lVarArr) {
        return Math.max(Math.max(m142214g(lVarArr[0], lVarArr[4]), (m142214g(lVarArr[6], lVarArr[2]) * 17) / 18), Math.max(m142214g(lVarArr[1], lVarArr[5]), (m142214g(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    public static int m142214g(C34762l lVar, C34762l lVar2) {
        if (lVar == null || lVar2 == null) {
            return 0;
        }
        return (int) Math.abs(lVar.mo102883c() - lVar2.mo102883c());
    }

    /* renamed from: h */
    public static int m142215h(C34762l[] lVarArr) {
        return Math.min(Math.min(m142216i(lVarArr[0], lVarArr[4]), (m142216i(lVarArr[6], lVarArr[2]) * 17) / 18), Math.min(m142216i(lVarArr[1], lVarArr[5]), (m142216i(lVarArr[7], lVarArr[3]) * 17) / 18));
    }

    /* renamed from: i */
    public static int m142216i(C34762l lVar, C34762l lVar2) {
        if (lVar == null || lVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(lVar.mo102883c() - lVar2.mo102883c());
    }

    /* renamed from: a */
    public C34761k mo102419a(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException, ChecksumException {
        C34761k kVar;
        C34761k[] e = m142212e(bVar, map, false);
        if (e.length != 0 && (kVar = e[0]) != null) {
            return kVar;
        }
        throw NotFoundException.m141229a();
    }

    /* renamed from: b */
    public C34761k[] mo102894b(C34644b bVar) throws NotFoundException {
        return mo102895d(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: c */
    public C34761k mo102420c(C34644b bVar) throws NotFoundException, FormatException, ChecksumException {
        return mo102419a(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: d */
    public C34761k[] mo102895d(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        try {
            return m142212e(bVar, map, true);
        } catch (ChecksumException | FormatException unused) {
            throw NotFoundException.m141229a();
        }
    }

    public void reset() {
    }
}
