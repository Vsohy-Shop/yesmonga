package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.C34025b;
import java.nio.ByteBuffer;

@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.f */
public class C34036f {

    /* renamed from: a */
    public static final C40777k f82675a = new C40777k("MLKitImageUtils", "");

    /* renamed from: b */
    public static C34036f f82676b = new C34036f();

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public static C34036f m136944b() {
        return f82676b;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public C41016d mo98988a(@RecentlyNonNull C34025b bVar) throws MlKitException {
        int h = bVar.mo98958h();
        if (h == -1) {
            return C41019f.m166811T6((Bitmap) C40843u.m166202l(bVar.mo98956f()));
        }
        if (h != 17) {
            if (h == 35) {
                return C41019f.m166811T6(bVar.mo98960j());
            }
            if (h != 842094169) {
                int h2 = bVar.mo98958h();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(h2);
                throw new MlKitException(sb.toString(), 3);
            }
        }
        return C41019f.m166811T6((ByteBuffer) C40843u.m166202l(bVar.mo98957g()));
    }

    @C40473a
    /* renamed from: c */
    public int mo98989c(@RecentlyNonNull C34025b bVar) {
        return bVar.mo98958h();
    }

    @C40473a
    @TargetApi(19)
    /* renamed from: d */
    public int mo98990d(@RecentlyNonNull C34025b bVar) {
        if (bVar.mo98958h() == -1) {
            return ((Bitmap) C40843u.m166202l(bVar.mo98956f())).getAllocationByteCount();
        }
        if (bVar.mo98958h() == 17 || bVar.mo98958h() == 842094169) {
            return ((ByteBuffer) C40843u.m166202l(bVar.mo98957g())).limit();
        }
        if (bVar.mo98958h() != 35) {
            return 0;
        }
        return (((Image.Plane[]) C40843u.m166202l(bVar.mo98961k()))[0].getBuffer().limit() * 3) / 2;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: e */
    public Matrix mo98991e(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(((float) (-i)) / 2.0f, ((float) (-i2)) / 2.0f);
        matrix.postRotate((float) (i3 * 90));
        int i5 = i3 % 2;
        if (i5 != 0) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (i5 == 0) {
            i = i2;
        }
        matrix.postTranslate(((float) i4) / 2.0f, ((float) i) / 2.0f);
        return matrix;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a9 A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be A[Catch:{ FileNotFoundException -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[Catch:{ FileNotFoundException -> 0x00cb }, RETURN, SYNTHETIC] */
    @androidx.annotation.RecentlyNonNull
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo98992f(@androidx.annotation.RecentlyNonNull android.content.ContentResolver r11, @androidx.annotation.RecentlyNonNull android.net.Uri r12) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "MLKitImageUtils"
            android.graphics.Bitmap r8 = android.provider.MediaStore.Images.Media.getBitmap(r11, r12)     // Catch:{ FileNotFoundException -> 0x00cb }
            if (r8 == 0) goto L_0x00c3
            java.lang.String r1 = "content"
            java.lang.String r2 = r12.getScheme()     // Catch:{ FileNotFoundException -> 0x00cb }
            boolean r1 = r1.equals(r2)     // Catch:{ FileNotFoundException -> 0x00cb }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "file"
            java.lang.String r4 = r12.getScheme()     // Catch:{ FileNotFoundException -> 0x00cb }
            boolean r1 = r1.equals(r4)     // Catch:{ FileNotFoundException -> 0x00cb }
            if (r1 != 0) goto L_0x0023
            goto L_0x006e
        L_0x0023:
            java.io.InputStream r11 = r11.openInputStream(r12)     // Catch:{ IOException -> 0x0042 }
            if (r11 == 0) goto L_0x0039
            androidx.exifinterface.media.a r1 = new androidx.exifinterface.media.a     // Catch:{ all -> 0x002f }
            r1.<init>((java.io.InputStream) r11)     // Catch:{ all -> 0x002f }
            goto L_0x003a
        L_0x002f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r11 = move-exception
            r1.addSuppressed(r11)     // Catch:{ IOException -> 0x0042 }
        L_0x0038:
            throw r1     // Catch:{ IOException -> 0x0042 }
        L_0x0039:
            r1 = r3
        L_0x003a:
            if (r11 == 0) goto L_0x0064
            r11.close()     // Catch:{ IOException -> 0x0040 }
            goto L_0x0064
        L_0x0040:
            r11 = move-exception
            goto L_0x0044
        L_0x0042:
            r11 = move-exception
            r1 = r3
        L_0x0044:
            com.google.android.gms.common.internal.k r4 = f82675a     // Catch:{ FileNotFoundException -> 0x00cb }
            java.lang.String r5 = java.lang.String.valueOf(r12)     // Catch:{ FileNotFoundException -> 0x00cb }
            int r6 = r5.length()     // Catch:{ FileNotFoundException -> 0x00cb }
            int r6 = r6 + 48
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00cb }
            r7.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00cb }
            java.lang.String r6 = "failed to open file to read rotation meta data: "
            r7.append(r6)     // Catch:{ FileNotFoundException -> 0x00cb }
            r7.append(r5)     // Catch:{ FileNotFoundException -> 0x00cb }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00cb }
            r4.mo134433f(r0, r5, r11)     // Catch:{ FileNotFoundException -> 0x00cb }
        L_0x0064:
            if (r1 != 0) goto L_0x0067
            goto L_0x006e
        L_0x0067:
            java.lang.String r11 = "Orientation"
            r2 = 1
            int r2 = r1.mo56507r(r11, r2)     // Catch:{ FileNotFoundException -> 0x00cb }
        L_0x006e:
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x00cb }
            r11.<init>()     // Catch:{ FileNotFoundException -> 0x00cb }
            int r4 = r8.getWidth()     // Catch:{ FileNotFoundException -> 0x00cb }
            int r5 = r8.getHeight()     // Catch:{ FileNotFoundException -> 0x00cb }
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r6 = 1119092736(0x42b40000, float:90.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            switch(r2) {
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009e;
                case 5: goto L_0x0097;
                case 6: goto L_0x0093;
                case 7: goto L_0x008c;
                case 8: goto L_0x0088;
                default: goto L_0x0086;
            }     // Catch:{ FileNotFoundException -> 0x00cb }
        L_0x0086:
            r6 = r3
            goto L_0x00b2
        L_0x0088:
            r11.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x008c:
            r11.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x00cb }
            r11.postScale(r7, r9)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x0093:
            r11.postRotate(r6)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x0097:
            r11.postRotate(r6)     // Catch:{ FileNotFoundException -> 0x00cb }
            r11.postScale(r7, r9)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x009e:
            r11.postScale(r9, r7)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x00a2:
            r1 = 1127481344(0x43340000, float:180.0)
            r11.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x00cb }
        L_0x00a7:
            r6 = r11
            goto L_0x00b2
        L_0x00a9:
            android.graphics.Matrix r11 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x00cb }
            r11.<init>()     // Catch:{ FileNotFoundException -> 0x00cb }
            r11.postScale(r7, r9)     // Catch:{ FileNotFoundException -> 0x00cb }
            goto L_0x00a7
        L_0x00b2:
            if (r6 == 0) goto L_0x00c2
            r2 = 0
            r3 = 0
            r7 = 1
            r1 = r8
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x00cb }
            if (r8 == r11) goto L_0x00c2
            r8.recycle()     // Catch:{ FileNotFoundException -> 0x00cb }
            r8 = r11
        L_0x00c2:
            return r8
        L_0x00c3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ FileNotFoundException -> 0x00cb }
            java.lang.String r1 = "The image Uri could not be resolved."
            r11.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00cb }
            throw r11     // Catch:{ FileNotFoundException -> 0x00cb }
        L_0x00cb:
            r11 = move-exception
            com.google.android.gms.common.internal.k r1 = f82675a
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r2 = r12.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 21
            r3.<init>(r2)
            java.lang.String r2 = "Could not open file: "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r1.mo134433f(r0, r12, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.common.internal.C34036f.mo98992f(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }
}
