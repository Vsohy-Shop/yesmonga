package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34644b;
import com.google.zxing.C34761k;
import com.google.zxing.C34762l;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.C34712d;
import com.google.zxing.common.C34717f;
import com.google.zxing.multi.C34770c;
import com.google.zxing.multi.qrcode.detector.C34773a;
import com.google.zxing.qrcode.C34856a;
import com.google.zxing.qrcode.decoder.C34872f;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public final class QRCodeMultiReader extends C34856a implements C34770c {

    /* renamed from: c */
    public static final C34761k[] f84312c = new C34761k[0];

    /* renamed from: d */
    public static final C34762l[] f84313d = new C34762l[0];

    public static final class SAComparator implements Serializable, Comparator<C34761k> {
        private SAComparator() {
        }

        /* renamed from: a */
        public int compare(C34761k kVar, C34761k kVar2) {
            Map<ResultMetadataType, Object> e = kVar.mo102876e();
            ResultMetadataType resultMetadataType = ResultMetadataType.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e.get(resultMetadataType)).intValue(), ((Integer) kVar2.mo102876e().get(resultMetadataType)).intValue());
        }
    }

    /* renamed from: h */
    public static List<C34761k> m141962h(List<C34761k> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C34761k> arrayList2 = new ArrayList<>();
        for (C34761k next : list) {
            if (next.mo102876e().containsKey(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        Collections.sort(arrayList2, new SAComparator());
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        for (C34761k kVar : arrayList2) {
            sb.append(kVar.mo102878g());
            byte[] d = kVar.mo102875d();
            byteArrayOutputStream.write(d, 0, d.length);
            Iterable<byte[]> iterable = (Iterable) kVar.mo102876e().get(ResultMetadataType.BYTE_SEGMENTS);
            if (iterable != null) {
                for (byte[] bArr : iterable) {
                    byteArrayOutputStream2.write(bArr, 0, bArr.length);
                }
            }
        }
        C34761k kVar2 = new C34761k(sb.toString(), byteArrayOutputStream.toByteArray(), f84313d, BarcodeFormat.QR_CODE);
        if (byteArrayOutputStream2.size() > 0) {
            kVar2.mo102881j(ResultMetadataType.BYTE_SEGMENTS, Collections.singletonList(byteArrayOutputStream2.toByteArray()));
        }
        arrayList.add(kVar2);
        return arrayList;
    }

    /* renamed from: b */
    public C34761k[] mo102894b(C34644b bVar) throws NotFoundException {
        return mo102895d(bVar, (Map<DecodeHintType, ?>) null);
    }

    /* renamed from: d */
    public C34761k[] mo102895d(C34644b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        for (C34717f fVar : new C34773a(bVar.mo102478b()).mo102902n(map)) {
            try {
                C34712d c = mo103153f().mo103170c(fVar.mo102707a(), map);
                C34762l[] b = fVar.mo102708b();
                if (c.mo102688f() instanceof C34872f) {
                    ((C34872f) c.mo102688f()).mo103178a(b);
                }
                C34761k kVar = new C34761k(c.mo102692j(), c.mo102689g(), b, BarcodeFormat.QR_CODE);
                List<byte[]> a = c.mo102683a();
                if (a != null) {
                    kVar.mo102881j(ResultMetadataType.BYTE_SEGMENTS, a);
                }
                String b2 = c.mo102684b();
                if (b2 != null) {
                    kVar.mo102881j(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
                }
                if (c.mo102693k()) {
                    kVar.mo102881j(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c.mo102691i()));
                    kVar.mo102881j(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(c.mo102690h()));
                }
                arrayList.add(kVar);
            } catch (ReaderException unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return f84312c;
        }
        return (C34761k[]) m141962h(arrayList).toArray(f84312c);
    }
}
