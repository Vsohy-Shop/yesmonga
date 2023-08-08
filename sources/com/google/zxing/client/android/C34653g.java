package com.google.zxing.client.android;

import android.content.Intent;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.android.C34659k;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.android.g */
public final class C34653g {

    /* renamed from: a */
    public static final Pattern f83842a = Pattern.compile(",");

    /* renamed from: b */
    public static final Set<BarcodeFormat> f83843b;

    /* renamed from: c */
    public static final Set<BarcodeFormat> f83844c;

    /* renamed from: d */
    public static final Set<BarcodeFormat> f83845d;

    /* renamed from: e */
    public static final Set<BarcodeFormat> f83846e;

    /* renamed from: f */
    public static final Set<BarcodeFormat> f83847f;

    /* renamed from: g */
    public static final Set<BarcodeFormat> f83848g;

    /* renamed from: h */
    public static final Set<BarcodeFormat> f83849h;

    /* renamed from: i */
    public static final Map<String, Set<BarcodeFormat>> f83850i;

    static {
        EnumSet of = EnumSet.of(BarcodeFormat.QR_CODE);
        f83846e = of;
        EnumSet of2 = EnumSet.of(BarcodeFormat.DATA_MATRIX);
        f83847f = of2;
        EnumSet of3 = EnumSet.of(BarcodeFormat.AZTEC);
        f83848g = of3;
        EnumSet of4 = EnumSet.of(BarcodeFormat.PDF_417);
        f83849h = of4;
        EnumSet of5 = EnumSet.of(BarcodeFormat.UPC_A, new BarcodeFormat[]{BarcodeFormat.UPC_E, BarcodeFormat.EAN_13, BarcodeFormat.EAN_8, BarcodeFormat.RSS_14, BarcodeFormat.RSS_EXPANDED});
        f83843b = of5;
        EnumSet of6 = EnumSet.of(BarcodeFormat.CODE_39, BarcodeFormat.CODE_93, BarcodeFormat.CODE_128, BarcodeFormat.ITF, BarcodeFormat.CODABAR);
        f83844c = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        f83845d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f83850i = hashMap;
        hashMap.put(C34659k.C34660a.f83873d, copyOf);
        hashMap.put(C34659k.C34660a.f83872c, of5);
        hashMap.put(C34659k.C34660a.f83874e, of);
        hashMap.put(C34659k.C34660a.f83875f, of2);
        hashMap.put(C34659k.C34660a.f83876g, of3);
        hashMap.put(C34659k.C34660a.f83877h, of4);
    }

    /* renamed from: a */
    public static Set<BarcodeFormat> m141350a(Intent intent) {
        List list;
        String stringExtra = intent.getStringExtra(C34659k.C34660a.f83878i);
        if (stringExtra != null) {
            list = Arrays.asList(f83842a.split(stringExtra));
        } else {
            list = null;
        }
        return m141351b(list, intent.getStringExtra(C34659k.C34660a.f83871b));
    }

    /* renamed from: b */
    public static Set<BarcodeFormat> m141351b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(BarcodeFormat.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(BarcodeFormat.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f83850i.get(str);
        }
        return null;
    }
}
