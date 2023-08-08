package com.urbanairship.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17992m;
import com.urbanairship.C36059m;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/* renamed from: com.urbanairship.util.y */
public final class C9684y {

    /* renamed from: com.urbanairship.util.y$b */
    public static final class C9686b {

        /* renamed from: a */
        public final Drawable f26517a;

        /* renamed from: b */
        public final long f26518b;

        public C9686b(Drawable drawable, long j) {
            this.f26517a = drawable;
            this.f26518b = j;
        }
    }

    /* renamed from: com.urbanairship.util.y$c */
    public interface C9687c<T> {
        /* renamed from: a */
        T mo19651a(File file) throws IOException;
    }

    /* renamed from: com.urbanairship.util.y$d */
    public static class C9688d {

        /* renamed from: a */
        public final int f26519a;

        /* renamed from: b */
        public final int f26520b;

        public C9688d(int i, int i2) {
            this.f26519a = i;
            this.f26520b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9688d dVar = (C9688d) obj;
            if (this.f26519a == dVar.f26519a && this.f26520b == dVar.f26520b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C17992m.m81741b(Integer.valueOf(this.f26519a), Integer.valueOf(this.f26520b));
        }
    }

    /* renamed from: e */
    public static int m36251e(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i6 / i5 > i4 && i7 / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    @C0359n0
    /* renamed from: f */
    public static C9688d m36252f(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 0 || i2 == 0) {
            throw new IllegalArgumentException("Failed to calculate target size! width and height must be greater than zero.");
        } else if (i3 == 0 && i4 == 0) {
            throw new IllegalArgumentException("Failed to calculate target size! reqWidth and reqHeight may not both be zero.");
        } else {
            if (i3 != 0) {
                i5 = i3;
            } else if (i5 <= 0) {
                i5 = (int) (((double) i4) * (((double) i) / ((double) i2)));
            }
            if (i4 == 0) {
                if (i6 > 0) {
                    i4 = i6;
                } else {
                    i4 = (int) (((double) i3) * (((double) i2) / ((double) i)));
                }
            }
            return new C9688d(i5, i4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m36253g(@androidx.annotation.C0359n0 android.content.Context r7, @androidx.annotation.C0359n0 java.net.URL r8, com.urbanairship.util.C9684y.C9687c<T> r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Deleted temp file: %s"
            java.lang.String r1 = "Failed to delete temp file: %s"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            java.lang.String r5 = "Fetching image from: %s"
            com.urbanairship.C36059m.m148419o(r5, r3)
            r3 = 0
            java.lang.String r5 = r8.toString()     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            boolean r5 = android.webkit.URLUtil.isFileUrl(r5)     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            if (r5 == 0) goto L_0x0025
            java.io.File r7 = new java.io.File     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            java.net.URI r5 = r8.toURI()     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            r7.<init>(r5)     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            r5 = r4
            goto L_0x005b
        L_0x0025:
            java.lang.String r5 = "ua_"
            java.lang.String r6 = ".temp"
            java.io.File r7 = r7.getCacheDir()     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            java.io.File r7 = java.io.File.createTempFile(r5, r6, r7)     // Catch:{ URISyntaxException -> 0x0083, all -> 0x0080 }
            com.urbanairship.util.p$a r5 = com.urbanairship.util.C9670p.m36232b(r8, r7)     // Catch:{ URISyntaxException -> 0x007e, all -> 0x0079 }
            boolean r5 = r5.f26491b     // Catch:{ URISyntaxException -> 0x007e, all -> 0x0079 }
            if (r5 != 0) goto L_0x005a
            java.lang.String r9 = "Failed to fetch image from: %s"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ URISyntaxException -> 0x007e, all -> 0x0079 }
            r5[r4] = r8     // Catch:{ URISyntaxException -> 0x007e, all -> 0x0079 }
            com.urbanairship.C36059m.m148419o(r9, r5)     // Catch:{ URISyntaxException -> 0x007e, all -> 0x0079 }
            if (r7 == 0) goto L_0x0059
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x0052
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            com.urbanairship.C36059m.m148419o(r0, r8)
            goto L_0x0059
        L_0x0052:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            com.urbanairship.C36059m.m148419o(r1, r8)
        L_0x0059:
            return r3
        L_0x005a:
            r5 = r2
        L_0x005b:
            java.lang.Object r8 = r9.mo19651a(r7)     // Catch:{ URISyntaxException -> 0x0085 }
            if (r5 == 0) goto L_0x0078
            if (r7 == 0) goto L_0x0078
            boolean r9 = r7.delete()
            if (r9 == 0) goto L_0x0071
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r4] = r7
            com.urbanairship.C36059m.m148419o(r0, r9)
            goto L_0x0078
        L_0x0071:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r4] = r7
            com.urbanairship.C36059m.m148419o(r1, r9)
        L_0x0078:
            return r8
        L_0x0079:
            r8 = move-exception
            r3 = r7
            r7 = r8
            r5 = r2
            goto L_0x00ab
        L_0x007e:
            r5 = r2
            goto L_0x0085
        L_0x0080:
            r7 = move-exception
            r5 = r4
            goto L_0x00ab
        L_0x0083:
            r7 = r3
            r5 = r4
        L_0x0085:
            java.lang.String r9 = "ImageUtils - Invalid URL: %s "
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a8 }
            r6[r4] = r8     // Catch:{ all -> 0x00a8 }
            com.urbanairship.C36059m.m148409e(r9, r6)     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x00a0
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            com.urbanairship.C36059m.m148419o(r0, r8)
            goto L_0x00a7
        L_0x00a0:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            com.urbanairship.C36059m.m148419o(r1, r8)
        L_0x00a7:
            return r3
        L_0x00a8:
            r8 = move-exception
            r3 = r7
            r7 = r8
        L_0x00ab:
            if (r5 == 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00c4
            boolean r8 = r3.delete()
            if (r8 == 0) goto L_0x00bd
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r3
            com.urbanairship.C36059m.m148419o(r0, r8)
            goto L_0x00c4
        L_0x00bd:
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r3
            com.urbanairship.C36059m.m148419o(r1, r8)
        L_0x00c4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.util.C9684y.m36253g(android.content.Context, java.net.URL, com.urbanairship.util.y$c):java.lang.Object");
    }

    @C0363p0
    /* renamed from: h */
    public static Bitmap m36254h(@C0359n0 Context context, @C0359n0 URL url, int i, int i2) throws IOException {
        return m36255i(context, url, i, i2, -1, -1);
    }

    @C0363p0
    /* renamed from: i */
    public static Bitmap m36255i(@C0359n0 Context context, @C0359n0 URL url, int i, int i2, int i3, int i4) throws IOException {
        Bitmap bitmap = (Bitmap) m36253g(context, url, new C9682w(i, i2, i3, i4));
        if (bitmap != null) {
            C36059m.m148406b("Fetched image from: %s. Original image size: %dx%d. Requested image size: %dx%d. Bitmap size: %dx%d.", url, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        return bitmap;
    }

    @C0363p0
    /* renamed from: j */
    public static C9686b m36256j(@C0359n0 Context context, @C0359n0 URL url, int i, int i2) throws IOException {
        return m36257k(context, url, i, i2, -1, -1);
    }

    @C0363p0
    /* renamed from: k */
    public static C9686b m36257k(@C0359n0 Context context, @C0359n0 URL url, int i, int i2, int i3, int i4) throws IOException {
        if (Build.VERSION.SDK_INT >= 28) {
            return (C9686b) m36253g(context, url, new C9683x(i, i2, i3, i4));
        }
        Bitmap i5 = m36255i(context, url, i, i2, i3, i4);
        if (i5 == null) {
            return null;
        }
        return new C9686b(new BitmapDrawable(context.getResources(), i5), (long) i5.getByteCount());
    }

    /* renamed from: l */
    public static /* synthetic */ void m36258l(int i, int i2, int i3, int i4, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int width = imageInfo.getSize().getWidth();
        int height = imageInfo.getSize().getHeight();
        C9688d f = m36252f(width, height, i, i2, i3, i4);
        imageDecoder.setTargetSampleSize(m36251e(width, height, f.f26519a, f.f26520b));
    }

    /* renamed from: m */
    public static /* synthetic */ Bitmap m36259m(int i, int i2, int i3, int i4, File file) throws IOException {
        if (Build.VERSION.SDK_INT >= 28) {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new C9681v(i, i2, i3, i4));
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i5 = options.outWidth;
        int i6 = options.outHeight;
        C9688d f = m36252f(i5, i6, i, i2, i3, i4);
        options.inSampleSize = m36251e(i5, i6, f.f26519a, f.f26520b);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* renamed from: n */
    public static /* synthetic */ void m36260n(int i, int i2, int i3, int i4, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        int width = imageInfo.getSize().getWidth();
        int height = imageInfo.getSize().getHeight();
        C9688d f = m36252f(width, height, i, i2, i3, i4);
        imageDecoder.setTargetSampleSize(m36251e(width, height, f.f26519a, f.f26520b));
    }

    /* renamed from: o */
    public static /* synthetic */ C9686b m36261o(int i, int i2, int i3, int i4, File file) throws IOException {
        long j;
        Drawable a = ImageDecoder.decodeDrawable(ImageDecoder.createSource(file), new C9680u(i, i2, i3, i4));
        if (a instanceof BitmapDrawable) {
            j = (long) ((BitmapDrawable) a).getBitmap().getByteCount();
        } else {
            j = file.length();
        }
        return new C9686b(a, j);
    }
}
