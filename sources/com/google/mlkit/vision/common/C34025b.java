package com.google.mlkit.vision.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_vision_common.C39228m7;
import com.google.android.gms.internal.mlkit_vision_common.C39246o7;
import com.google.mlkit.common.sdkinternal.C33945i;
import com.google.mlkit.vision.common.internal.C34035e;
import com.google.mlkit.vision.common.internal.C34036f;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.mlkit.vision.common.b */
public class C34025b implements C33945i {

    /* renamed from: h */
    public static final int f82644h = 17;

    /* renamed from: i */
    public static final int f82645i = 842094169;
    @C40473a

    /* renamed from: j */
    public static final int f82646j = -1;

    /* renamed from: k */
    public static final int f82647k = 35;
    @C0363p0

    /* renamed from: a */
    public volatile Bitmap f82648a;
    @C0363p0

    /* renamed from: b */
    public volatile ByteBuffer f82649b;
    @C0363p0

    /* renamed from: c */
    public volatile C34030f f82650c;

    /* renamed from: d */
    public final int f82651d;

    /* renamed from: e */
    public final int f82652e;

    /* renamed from: f */
    public final int f82653f;
    @C34026a

    /* renamed from: g */
    public final int f82654g;

    @Retention(RetentionPolicy.CLASS)
    /* renamed from: com.google.mlkit.vision.common.b$a */
    public @interface C34026a {
    }

    public C34025b(@C0359n0 Bitmap bitmap, int i) {
        this.f82648a = (Bitmap) C40843u.m166202l(bitmap);
        this.f82651d = bitmap.getWidth();
        this.f82652e = bitmap.getHeight();
        this.f82653f = i;
        this.f82654g = -1;
    }

    @C0359n0
    /* renamed from: a */
    public static C34025b m136893a(@RecentlyNonNull Bitmap bitmap, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C34025b bVar = new C34025b(bitmap, i);
        m136898n(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
        return bVar;
    }

    @C0359n0
    /* renamed from: b */
    public static C34025b m136894b(@RecentlyNonNull byte[] bArr, int i, int i2, int i3, @C34026a int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C34025b bVar = new C34025b(ByteBuffer.wrap((byte[]) C40843u.m166202l(bArr)), i, i2, i3, i4);
        m136898n(i4, 2, elapsedRealtime, i2, i, bArr.length, i3);
        return bVar;
    }

    @C0359n0
    /* renamed from: c */
    public static C34025b m136895c(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3, @C34026a int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C34025b bVar = new C34025b(byteBuffer, i, i2, i3, i4);
        m136898n(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return bVar;
    }

    @C0359n0
    /* renamed from: d */
    public static C34025b m136896d(@RecentlyNonNull Context context, @RecentlyNonNull Uri uri) throws IOException {
        C40843u.m166203m(context, "Please provide a valid Context");
        C40843u.m166203m(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap f = C34036f.m136944b().mo98992f(context.getContentResolver(), uri);
        C34025b bVar = new C34025b(f, 0);
        m136898n(-1, 4, elapsedRealtime, f.getHeight(), f.getWidth(), f.getAllocationByteCount(), 0);
        return bVar;
    }

    @C0359n0
    @C0376v0(19)
    /* renamed from: e */
    public static C34025b m136897e(@RecentlyNonNull Image image, int i) {
        boolean z;
        int i2;
        C34025b bVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C40843u.m166203m(image, "Please provide a valid image");
        boolean z2 = true;
        if (i == 0 || i == 90 || i == 180) {
            i2 = i;
            z = true;
        } else if (i == 270) {
            z = true;
            i2 = 270;
        } else {
            i2 = i;
            z = false;
        }
        C40843u.m166192b(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (!(image.getFormat() == 256 || image.getFormat() == 35)) {
            z2 = false;
        }
        C40843u.m166192b(z2, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            bVar = new C34025b(C34035e.m136930g().mo98982d(image, i2), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            bVar = new C34025b(image, image.getWidth(), image.getHeight(), i2);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i3 = limit;
        C34025b bVar2 = bVar;
        m136898n(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i3, i2);
        return bVar2;
    }

    /* renamed from: n */
    public static void m136898n(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        C39246o7.m161291a(C39228m7.m161282b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: f */
    public Bitmap mo98956f() {
        return this.f82648a;
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: g */
    public ByteBuffer mo98957g() {
        return this.f82649b;
    }

    @C40473a
    @C34026a
    /* renamed from: h */
    public int mo98958h() {
        return this.f82654g;
    }

    @C40473a
    /* renamed from: i */
    public int mo98959i() {
        return this.f82652e;
    }

    @C40473a
    @C0376v0(19)
    @RecentlyNullable
    /* renamed from: j */
    public Image mo98960j() {
        if (this.f82650c == null) {
            return null;
        }
        return this.f82650c.mo98970a();
    }

    @C40473a
    @C0376v0(19)
    @RecentlyNullable
    /* renamed from: k */
    public Image.Plane[] mo98961k() {
        if (this.f82650c == null) {
            return null;
        }
        return this.f82650c.mo98971b();
    }

    @C40473a
    /* renamed from: l */
    public int mo98962l() {
        return this.f82653f;
    }

    @C40473a
    /* renamed from: m */
    public int mo98963m() {
        return this.f82651d;
    }

    public C34025b(@C0359n0 Image image, int i, int i2, int i3) {
        C40843u.m166202l(image);
        this.f82650c = new C34030f(image);
        this.f82651d = i;
        this.f82652e = i2;
        this.f82653f = i3;
        this.f82654g = 35;
    }

    public C34025b(@C0359n0 ByteBuffer byteBuffer, int i, int i2, int i3, @C34026a int i4) {
        boolean z = true;
        if (i4 != 842094169) {
            if (i4 == 17) {
                i4 = 17;
            } else {
                z = false;
            }
        }
        C40843u.m166191a(z);
        this.f82649b = (ByteBuffer) C40843u.m166202l(byteBuffer);
        byteBuffer.rewind();
        this.f82651d = i;
        this.f82652e = i2;
        this.f82653f = i3;
        this.f82654g = i4;
    }
}
