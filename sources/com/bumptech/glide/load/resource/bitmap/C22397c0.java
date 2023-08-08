package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22099b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C22127k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.util.C22614a;
import com.bumptech.glide.util.C22633m;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c0 */
public interface C22397c0 {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c0$a */
    public static final class C22398a implements C22397c0 {

        /* renamed from: a */
        public final byte[] f57502a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f57503b;

        /* renamed from: c */
        public final C22157b f57504c;

        public C22398a(byte[] bArr, List<ImageHeaderParser> list, C22157b bVar) {
            this.f57502a = bArr;
            this.f57503b = list;
            this.f57504c = bVar;
        }

        @C0363p0
        /* renamed from: a */
        public Bitmap mo66410a(BitmapFactory.Options options) {
            byte[] bArr = this.f57502a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        /* renamed from: b */
        public void mo66411b() {
        }

        /* renamed from: c */
        public int mo66412c() throws IOException {
            return C22099b.m100711c(this.f57503b, ByteBuffer.wrap(this.f57502a), this.f57504c);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo66413d() throws IOException {
            return C22099b.m100715g(this.f57503b, ByteBuffer.wrap(this.f57502a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c0$b */
    public static final class C22399b implements C22397c0 {

        /* renamed from: a */
        public final ByteBuffer f57505a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f57506b;

        /* renamed from: c */
        public final C22157b f57507c;

        public C22399b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, C22157b bVar) {
            this.f57505a = byteBuffer;
            this.f57506b = list;
            this.f57507c = bVar;
        }

        @C0363p0
        /* renamed from: a */
        public Bitmap mo66410a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(mo66414e(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo66411b() {
        }

        /* renamed from: c */
        public int mo66412c() throws IOException {
            return C22099b.m100711c(this.f57506b, C22614a.m102577d(this.f57505a), this.f57507c);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo66413d() throws IOException {
            return C22099b.m100715g(this.f57506b, C22614a.m102577d(this.f57505a));
        }

        /* renamed from: e */
        public final InputStream mo66414e() {
            return C22614a.m102580g(C22614a.m102577d(this.f57505a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c0$c */
    public static final class C22400c implements C22397c0 {

        /* renamed from: a */
        public final File f57508a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f57509b;

        /* renamed from: c */
        public final C22157b f57510c;

        public C22400c(File file, List<ImageHeaderParser> list, C22157b bVar) {
            this.f57508a = file;
            this.f57509b = list;
            this.f57510c = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[SYNTHETIC, Splitter:B:13:0x001d] */
        @androidx.annotation.C0363p0
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.Bitmap mo66410a(android.graphics.BitmapFactory.Options r5) throws java.io.FileNotFoundException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x001a }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001a }
                java.io.File r3 = r4.f57508a     // Catch:{ all -> 0x001a }
                r2.<init>(r3)     // Catch:{ all -> 0x001a }
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r4.f57510c     // Catch:{ all -> 0x001a }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x001a }
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r1, r0, r5)     // Catch:{ all -> 0x0017 }
                r1.close()     // Catch:{ IOException -> 0x0016 }
            L_0x0016:
                return r5
            L_0x0017:
                r5 = move-exception
                r0 = r1
                goto L_0x001b
            L_0x001a:
                r5 = move-exception
            L_0x001b:
                if (r0 == 0) goto L_0x0020
                r0.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22397c0.C22400c.mo66410a(android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
        }

        /* renamed from: b */
        public void mo66411b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[SYNTHETIC, Splitter:B:13:0x0023] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo66412c() throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x001d }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001d }
                java.io.File r3 = r5.f57508a     // Catch:{ all -> 0x001d }
                r2.<init>(r3)     // Catch:{ all -> 0x001d }
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r5.f57510c     // Catch:{ all -> 0x001d }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x001d }
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r5.f57509b     // Catch:{ all -> 0x001b }
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r5.f57510c     // Catch:{ all -> 0x001b }
                int r0 = com.bumptech.glide.load.C22099b.m100710b(r0, r1, r2)     // Catch:{ all -> 0x001b }
                r1.close()     // Catch:{ IOException -> 0x001a }
            L_0x001a:
                return r0
            L_0x001b:
                r0 = move-exception
                goto L_0x0021
            L_0x001d:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L_0x0021:
                if (r1 == 0) goto L_0x0026
                r1.close()     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22397c0.C22400c.mo66412c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[SYNTHETIC, Splitter:B:13:0x0023] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo66413d() throws java.io.IOException {
            /*
                r5 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x001d }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x001d }
                java.io.File r3 = r5.f57508a     // Catch:{ all -> 0x001d }
                r2.<init>(r3)     // Catch:{ all -> 0x001d }
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r5.f57510c     // Catch:{ all -> 0x001d }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x001d }
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r5.f57509b     // Catch:{ all -> 0x001b }
                com.bumptech.glide.load.engine.bitmap_recycle.b r2 = r5.f57510c     // Catch:{ all -> 0x001b }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.C22099b.m100714f(r0, r1, r2)     // Catch:{ all -> 0x001b }
                r1.close()     // Catch:{ IOException -> 0x001a }
            L_0x001a:
                return r0
            L_0x001b:
                r0 = move-exception
                goto L_0x0021
            L_0x001d:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L_0x0021:
                if (r1 == 0) goto L_0x0026
                r1.close()     // Catch:{ IOException -> 0x0026 }
            L_0x0026:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22397c0.C22400c.mo66413d():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c0$d */
    public static final class C22401d implements C22397c0 {

        /* renamed from: a */
        public final C22127k f57511a;

        /* renamed from: b */
        public final C22157b f57512b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f57513c;

        public C22401d(InputStream inputStream, List<ImageHeaderParser> list, C22157b bVar) {
            this.f57512b = (C22157b) C22633m.m102624d(bVar);
            this.f57513c = (List) C22633m.m102624d(list);
            this.f57511a = new C22127k(inputStream, bVar);
        }

        @C0363p0
        /* renamed from: a */
        public Bitmap mo66410a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f57511a.mo65777a(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo66411b() {
            this.f57511a.mo65821c();
        }

        /* renamed from: c */
        public int mo66412c() throws IOException {
            return C22099b.m100710b(this.f57513c, this.f57511a.mo65777a(), this.f57512b);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo66413d() throws IOException {
            return C22099b.m100714f(this.f57513c, this.f57511a.mo65777a(), this.f57512b);
        }
    }

    @C0376v0(21)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.c0$e */
    public static final class C22402e implements C22397c0 {

        /* renamed from: a */
        public final C22157b f57514a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f57515b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f57516c;

        public C22402e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C22157b bVar) {
            this.f57514a = (C22157b) C22633m.m102624d(bVar);
            this.f57515b = (List) C22633m.m102624d(list);
            this.f57516c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @C0363p0
        /* renamed from: a */
        public Bitmap mo66410a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f57516c.mo65777a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo66411b() {
        }

        /* renamed from: c */
        public int mo66412c() throws IOException {
            return C22099b.m100709a(this.f57515b, this.f57516c, this.f57514a);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo66413d() throws IOException {
            return C22099b.m100713e(this.f57515b, this.f57516c, this.f57514a);
        }
    }

    @C0363p0
    /* renamed from: a */
    Bitmap mo66410a(BitmapFactory.Options options) throws IOException;

    /* renamed from: b */
    void mo66411b();

    /* renamed from: c */
    int mo66412c() throws IOException;

    /* renamed from: d */
    ImageHeaderParser.ImageType mo66413d() throws IOException;
}
