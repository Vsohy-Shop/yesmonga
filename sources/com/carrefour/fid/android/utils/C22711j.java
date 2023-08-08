package com.carrefour.fid.android.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C34754g;
import com.google.zxing.WriterException;
import com.google.zxing.common.C34710b;
import com.journeyapps.barcodescanner.C34907b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nGenerateBarCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenerateBarCode.kt\ncom/carrefour/fid/android/utils/GenerateBarCodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n288#2,2:82\n518#2,7:84\n*S KotlinDebug\n*F\n+ 1 GenerateBarCode.kt\ncom/carrefour/fid/android/utils/GenerateBarCodeKt\n*L\n44#1:82,2\n47#1:84,7\n*E\n"})
/* renamed from: com.carrefour.fid.android.utils.j */
public final class C22711j {

    /* renamed from: a */
    public static final int f58201a = 0;

    @C12580l
    /* renamed from: a */
    public static final Bitmap m102878a(@C12579k String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "data");
        try {
            C34710b b = new C34754g().mo102423b(str, BarcodeFormat.CODABAR, i, i2);
            Intrinsics.checkNotNullExpressionValue(b, "multiFormatWriter.encode… widthImage, heightImage)");
            return new C34907b().mo103370a(b);
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m102879b(@org.jetbrains.annotations.C12579k java.lang.String r7, int r8, int r9) {
        /*
            java.lang.String r0 = "numCard"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.google.zxing.g r0 = new com.google.zxing.g
            r0.<init>()
            java.lang.String r1 = "utf-8"
            java.lang.String r7 = android.net.Uri.encode(r7, r1)
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_128
            com.google.zxing.common.b r7 = r0.mo102423b(r7, r1, r8, r9)
            r0 = 0
            kotlin.ranges.l r1 = kotlin.ranges.C11479u.m44378W1(r0, r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r5 = r9 / 2
            boolean r4 = r7.mo102666h(r4, r5)
            if (r4 == 0) goto L_0x001f
            goto L_0x003b
        L_0x003a:
            r2 = r3
        L_0x003b:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0044
            int r1 = r2.intValue()
            goto L_0x0045
        L_0x0044:
            r1 = r0
        L_0x0045:
            kotlin.ranges.l r2 = kotlin.ranges.C11479u.m44378W1(r0, r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r6 = r9 / 2
            boolean r5 = r7.mo102666h(r5, r6)
            if (r5 == 0) goto L_0x004d
            r3 = r4
            goto L_0x004d
        L_0x0068:
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0071
            int r2 = r3.intValue()
            goto L_0x0072
        L_0x0071:
            r2 = r8
        L_0x0072:
            if (r2 == r8) goto L_0x007f
            if (r1 == 0) goto L_0x007f
            int r8 = r2 - r1
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r3)
            goto L_0x0088
        L_0x007f:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r1)
            r2 = r8
            r8 = r1
            r1 = r0
        L_0x0088:
            if (r8 == 0) goto L_0x00a5
            r3 = r1
        L_0x008b:
            if (r3 >= r2) goto L_0x00a5
            r4 = r0
        L_0x008e:
            if (r4 >= r9) goto L_0x00a2
            int r5 = r3 - r1
            boolean r6 = r7.mo102666h(r3, r4)
            if (r6 == 0) goto L_0x009b
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x009c
        L_0x009b:
            r6 = -1
        L_0x009c:
            r8.setPixel(r5, r4, r6)
            int r4 = r4 + 1
            goto L_0x008e
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x008b
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.C22711j.m102879b(java.lang.String, int, int):android.graphics.Bitmap");
    }

    @C12580l
    /* renamed from: c */
    public static final Bitmap m102880c(@C12579k String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(str, "numCard");
        C34710b b = new C34754g().mo102423b(Uri.encode(str, "utf-8"), BarcodeFormat.CODE_128, i, i);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        if (createBitmap != null && i5 >= 0) {
            int i7 = 0;
            while (true) {
                if (i4 >= 0) {
                    int i8 = 0;
                    while (true) {
                        if (b.mo102666h(i7, i8)) {
                            i6 = -16777216;
                        } else {
                            i6 = -1;
                        }
                        createBitmap.setPixel(i7, i8, i6);
                        if (i8 == i4) {
                            break;
                        }
                        i8++;
                    }
                }
                if (i7 == i5) {
                    break;
                }
                i7++;
            }
        }
        return createBitmap;
    }
}
