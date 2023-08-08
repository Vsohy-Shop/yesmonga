package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class VideoDecoder<T> implements C22278g<T, Bitmap> {

    /* renamed from: d */
    public static final String f57460d = "VideoDecoder";

    /* renamed from: e */
    public static final long f57461e = -1;
    @C0344h1

    /* renamed from: f */
    public static final int f57462f = 2;

    /* renamed from: g */
    public static final C22139e<Long> f57463g = C22139e.m100833b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C22384a());

    /* renamed from: h */
    public static final C22139e<Integer> f57464h = C22139e.m100833b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C22385b());

    /* renamed from: i */
    public static final C22389e f57465i = new C22389e();

    /* renamed from: a */
    public final C22390f<T> f57466a;

    /* renamed from: b */
    public final C22162e f57467b;

    /* renamed from: c */
    public final C22389e f57468c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C22384a implements C22139e.C22141b<Long> {

        /* renamed from: a */
        public final ByteBuffer f57469a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void mo65845a(@C0359n0 byte[] bArr, @C0359n0 Long l, @C0359n0 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f57469a) {
                this.f57469a.position(0);
                messageDigest.update(this.f57469a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C22385b implements C22139e.C22141b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f57470a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void mo65845a(@C0359n0 byte[] bArr, @C0359n0 Integer num, @C0359n0 MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f57470a) {
                    this.f57470a.position(0);
                    messageDigest.update(this.f57470a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C22386c implements C22390f<AssetFileDescriptor> {
        public C22386c() {
        }

        /* renamed from: b */
        public void mo66392a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C22386c(C22384a aVar) {
            this();
        }
    }

    @C0376v0(23)
    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C22387d implements C22390f<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class C22388a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f57471a;

            public C22388a(ByteBuffer byteBuffer) {
                this.f57471a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f57471a.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f57471a.limit())) {
                    return -1;
                }
                this.f57471a.position((int) j);
                int min = Math.min(i2, this.f57471a.remaining());
                this.f57471a.get(bArr, i, min);
                return min;
            }
        }

        /* renamed from: b */
        public void mo66392a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C22388a(byteBuffer));
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public static class C22389e {
        /* renamed from: a */
        public MediaMetadataRetriever mo66398a() {
            return new MediaMetadataRetriever();
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public interface C22390f<T> {
        /* renamed from: a */
        void mo66392a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C22391g implements C22390f<ParcelFileDescriptor> {
        /* renamed from: b */
        public void mo66392a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(C22162e eVar, C22390f<T> fVar) {
        this(eVar, fVar, f57465i);
    }

    /* renamed from: c */
    public static C22278g<AssetFileDescriptor, Bitmap> m101662c(C22162e eVar) {
        return new VideoDecoder(eVar, new C22386c((C22384a) null));
    }

    @C0376v0(api = 23)
    /* renamed from: d */
    public static C22278g<ByteBuffer, Bitmap> m101663d(C22162e eVar) {
        return new VideoDecoder(eVar, new C22387d());
    }

    @C0363p0
    /* renamed from: e */
    public static Bitmap m101664e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f57447f) {
            bitmap = null;
        } else {
            bitmap = m101666g(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        }
        if (bitmap == null) {
            bitmap = m101665f(mediaMetadataRetriever, j, i);
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: f */
    public static Bitmap m101665f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @C0363p0
    @TargetApi(27)
    /* renamed from: g */
    public static Bitmap m101666g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = downsampleStrategy.mo66378b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static C22278g<ParcelFileDescriptor, Bitmap> m101667h(C22162e eVar) {
        return new VideoDecoder(eVar, new C22391g());
    }

    /* renamed from: a */
    public boolean mo66236a(@C0359n0 T t, @C0359n0 C22277f fVar) {
        return true;
    }

    /* renamed from: b */
    public C22270s<Bitmap> mo66237b(@C0359n0 T t, int i, int i2, @C0359n0 C22277f fVar) throws IOException {
        int i3;
        long longValue = ((Long) fVar.mo66232c(f57463g)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) fVar.mo66232c(f57464h);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar.mo66232c(DownsampleStrategy.f57449h);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f57448g;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever a = this.f57468c.mo66398a();
            try {
                this.f57466a.mo66392a(a, t);
                Bitmap e = m101664e(a, longValue, num.intValue(), i, i2, downsampleStrategy2);
                if (i3 < 29) {
                    a.release();
                }
                return C22411h.m101762e(e, this.f57467b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    a.close();
                } else {
                    a.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    @C0344h1
    public VideoDecoder(C22162e eVar, C22390f<T> fVar, C22389e eVar2) {
        this.f57467b = eVar;
        this.f57466a = fVar;
        this.f57468c = eVar2;
    }
}
