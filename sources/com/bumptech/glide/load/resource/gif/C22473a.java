package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.gifdecoder.C22068a;
import com.bumptech.glide.gifdecoder.C22072c;
import com.bumptech.glide.gifdecoder.C22073d;
import com.bumptech.glide.gifdecoder.C22075f;
import com.bumptech.glide.load.C22099b;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.C22278g;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.C22494k;
import com.bumptech.glide.util.C22628i;
import com.bumptech.glide.util.C22635o;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.gif.a */
public class C22473a implements C22278g<ByteBuffer, C22477c> {

    /* renamed from: f */
    public static final String f57607f = "BufferGifDecoder";

    /* renamed from: g */
    public static final C22474a f57608g = new C22474a();

    /* renamed from: h */
    public static final C22475b f57609h = new C22475b();

    /* renamed from: a */
    public final Context f57610a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f57611b;

    /* renamed from: c */
    public final C22475b f57612c;

    /* renamed from: d */
    public final C22474a f57613d;

    /* renamed from: e */
    public final C22476b f57614e;

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a */
    public static class C22474a {
        /* renamed from: a */
        public C22068a mo66496a(C22068a.C22069a aVar, C22072c cVar, ByteBuffer byteBuffer, int i) {
            return new C22075f(aVar, cVar, byteBuffer, i);
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.resource.gif.a$b */
    public static class C22475b {

        /* renamed from: a */
        public final Queue<C22073d> f57615a = C22635o.m102631f(0);

        /* renamed from: a */
        public synchronized C22073d mo66497a(ByteBuffer byteBuffer) {
            C22073d poll;
            poll = this.f57615a.poll();
            if (poll == null) {
                poll = new C22073d();
            }
            return poll.mo65654q(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void mo66498b(C22073d dVar) {
            dVar.mo65638a();
            this.f57615a.offer(dVar);
        }
    }

    public C22473a(Context context) {
        this(context, C22038b.m100356e(context).mo65484n().mo65446g(), C22038b.m100356e(context).mo65480h(), C22038b.m100356e(context).mo65479g());
    }

    /* renamed from: e */
    public static int m101960e(C22072c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo65634a() / i2, cVar.mo65637d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable(f57607f, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo65637d());
            sb.append("x");
            sb.append(cVar.mo65634a());
            sb.append("]");
        }
        return max;
    }

    @C0363p0
    /* renamed from: c */
    public final C22480e mo66493c(ByteBuffer byteBuffer, int i, int i2, C22073d dVar, C22277f fVar) {
        Bitmap.Config config;
        long b = C22628i.m102603b();
        try {
            C22072c d = dVar.mo65641d();
            if (d.mo65635b() > 0) {
                if (d.mo65636c() == 0) {
                    if (fVar.mo66232c(C22488i.f57662a) == DecodeFormat.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    C22068a a = this.f57613d.mo66496a(this.f57614e, d, byteBuffer, m101960e(d, i, i2));
                    a.mo65611e(config);
                    a.mo65608c();
                    Bitmap b2 = a.mo65607b();
                    if (b2 == null) {
                        if (Log.isLoggable(f57607f, 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(C22628i.m102602a(b));
                        }
                        return null;
                    }
                    C22480e eVar = new C22480e(new C22477c(this.f57610a, a, C22494k.m102047c(), i, i2, b2));
                    if (Log.isLoggable(f57607f, 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(C22628i.m102602a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(f57607f, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(C22628i.m102602a(b));
            }
        }
    }

    /* renamed from: d */
    public C22480e mo66237b(@C0359n0 ByteBuffer byteBuffer, int i, int i2, @C0359n0 C22277f fVar) {
        C22073d a = this.f57612c.mo66497a(byteBuffer);
        try {
            return mo66493c(byteBuffer, i, i2, a, fVar);
        } finally {
            this.f57612c.mo66498b(a);
        }
    }

    /* renamed from: f */
    public boolean mo66236a(@C0359n0 ByteBuffer byteBuffer, @C0359n0 C22277f fVar) throws IOException {
        if (((Boolean) fVar.mo66232c(C22488i.f57663b)).booleanValue() || C22099b.m100715g(this.f57611b, byteBuffer) != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    public C22473a(Context context, List<ImageHeaderParser> list, C22162e eVar, C22157b bVar) {
        this(context, list, eVar, bVar, f57609h, f57608g);
    }

    @C0344h1
    public C22473a(Context context, List<ImageHeaderParser> list, C22162e eVar, C22157b bVar, C22475b bVar2, C22474a aVar) {
        this.f57610a = context.getApplicationContext();
        this.f57611b = list;
        this.f57613d = aVar;
        this.f57614e = new C22476b(eVar, bVar);
        this.f57612c = bVar2;
    }
}
