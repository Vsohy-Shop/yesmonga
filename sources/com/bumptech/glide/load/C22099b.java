package com.bumptech.glide.load;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b */
public final class C22099b {

    /* renamed from: a */
    public static final int f56779a = 5242880;

    /* renamed from: com.bumptech.glide.load.b$a */
    public class C22100a implements C22107h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f56780a;

        public C22100a(InputStream inputStream) {
            this.f56780a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo65771a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo65766c(this.f56780a);
            } finally {
                this.f56780a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b$b */
    public class C22101b implements C22107h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f56781a;

        public C22101b(ByteBuffer byteBuffer) {
            this.f56781a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo65771a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo65764a(this.f56781a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b$c */
    public class C22102c implements C22107h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f56782a;

        /* renamed from: b */
        public final /* synthetic */ C22157b f56783b;

        public C22102c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C22157b bVar) {
            this.f56782a = parcelFileDescriptorRewinder;
            this.f56783b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo65771a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f56782a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo65777a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r4.f56783b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo65766c(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f56782a
                r0.mo65777a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f56782a
                r0.mo65777a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C22099b.C22102c.mo65771a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.b$d */
    public class C22103d implements C22106g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f56784a;

        /* renamed from: b */
        public final /* synthetic */ C22157b f56785b;

        public C22103d(ByteBuffer byteBuffer, C22157b bVar) {
            this.f56784a = byteBuffer;
            this.f56785b = bVar;
        }

        /* renamed from: a */
        public int mo65772a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo65765b(this.f56784a, this.f56785b);
        }
    }

    /* renamed from: com.bumptech.glide.load.b$e */
    public class C22104e implements C22106g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f56786a;

        /* renamed from: b */
        public final /* synthetic */ C22157b f56787b;

        public C22104e(InputStream inputStream, C22157b bVar) {
            this.f56786a = inputStream;
            this.f56787b = bVar;
        }

        /* renamed from: a */
        public int mo65772a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo65767d(this.f56786a, this.f56787b);
            } finally {
                this.f56786a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b$f */
    public class C22105f implements C22106g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f56788a;

        /* renamed from: b */
        public final /* synthetic */ C22157b f56789b;

        public C22105f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C22157b bVar) {
            this.f56788a = parcelFileDescriptorRewinder;
            this.f56789b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo65772a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f56788a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo65777a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r4.f56789b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.engine.bitmap_recycle.b r0 = r4.f56789b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo65767d(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f56788a
                r0.mo65777a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f56788a
                r0.mo65777a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C22099b.C22105f.mo65772a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.b$g */
    public interface C22106g {
        /* renamed from: a */
        int mo65772a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.b$h */
    public interface C22107h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo65771a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    @C0376v0(21)
    /* renamed from: a */
    public static int m100709a(@C0359n0 List<ImageHeaderParser> list, @C0359n0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @C0359n0 C22157b bVar) throws IOException {
        return m100712d(list, new C22105f(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: b */
    public static int m100710b(@C0359n0 List<ImageHeaderParser> list, @C0363p0 InputStream inputStream, @C0359n0 C22157b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m100712d(list, new C22104e(inputStream, bVar));
    }

    /* renamed from: c */
    public static int m100711c(@C0359n0 List<ImageHeaderParser> list, @C0363p0 ByteBuffer byteBuffer, @C0359n0 C22157b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m100712d(list, new C22103d(byteBuffer, bVar));
    }

    /* renamed from: d */
    public static int m100712d(@C0359n0 List<ImageHeaderParser> list, C22106g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = gVar.mo65772a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    @C0359n0
    @C0376v0(21)
    /* renamed from: e */
    public static ImageHeaderParser.ImageType m100713e(@C0359n0 List<ImageHeaderParser> list, @C0359n0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @C0359n0 C22157b bVar) throws IOException {
        return m100716h(list, new C22102c(parcelFileDescriptorRewinder, bVar));
    }

    @C0359n0
    /* renamed from: f */
    public static ImageHeaderParser.ImageType m100714f(@C0359n0 List<ImageHeaderParser> list, @C0363p0 InputStream inputStream, @C0359n0 C22157b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m100716h(list, new C22100a(inputStream));
    }

    @C0359n0
    /* renamed from: g */
    public static ImageHeaderParser.ImageType m100715g(@C0359n0 List<ImageHeaderParser> list, @C0363p0 ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m100716h(list, new C22101b(byteBuffer));
    }

    @C0359n0
    /* renamed from: h */
    public static ImageHeaderParser.ImageType m100716h(@C0359n0 List<ImageHeaderParser> list, C22107h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = hVar.mo65771a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
