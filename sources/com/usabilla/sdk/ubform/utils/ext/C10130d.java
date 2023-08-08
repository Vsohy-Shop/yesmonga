package com.usabilla.sdk.ubform.utils.ext;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.exifinterface.media.C19135a;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.usabilla.sdk.ubform.utils.ext.d */
public final class C10130d {
    @C12579k
    /* renamed from: a */
    public static final Bitmap m38331a(@C12579k Bitmap bitmap, @C12579k InputStream inputStream) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Bitmap bitmap2 = bitmap;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m38333c(new C19135a(inputStream)), true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, 0, 0, width, height, matrix, true)");
        return createBitmap;
    }

    @C12579k
    /* renamed from: b */
    public static final Bitmap m38332b(@C12579k Bitmap bitmap, @C12579k String str) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(str, "path");
        Bitmap bitmap2 = bitmap;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), m38333c(new C19135a(str)), true);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(this, 0, 0, width, height, matrix, true)");
        return createBitmap;
    }

    /* renamed from: c */
    public static final Matrix m38333c(C19135a aVar) {
        int r = aVar.mo56507r(C19135a.f48683C, 0);
        Matrix matrix = new Matrix();
        switch (r) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return matrix;
        }
        return matrix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        throw r3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m38334d(@org.jetbrains.annotations.C12579k android.graphics.Bitmap r2, @org.jetbrains.annotations.C12579k java.io.File r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.File r0 = r3.getParentFile()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0027 }
            r1 = 100
            r2.compress(r3, r1, r0)     // Catch:{ all -> 0x0027 }
            r0.flush()     // Catch:{ all -> 0x0027 }
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0027 }
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r0, r2)
            return
        L_0x0027:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r3 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.C10130d.m38334d(android.graphics.Bitmap, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r1);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m38335e(@org.jetbrains.annotations.C12579k byte[] r1, @org.jetbrains.annotations.C12579k java.io.File r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            r0.write(r1)     // Catch:{ all -> 0x0019 }
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0019 }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usabilla.sdk.ubform.utils.ext.C10130d.m38335e(byte[], java.io.File):void");
    }
}
