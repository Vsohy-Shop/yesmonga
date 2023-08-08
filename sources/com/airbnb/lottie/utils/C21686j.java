package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.animation.C21439a;
import com.airbnb.lottie.animation.content.C21464t;
import com.airbnb.lottie.animation.keyframe.C21474c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.airbnb.lottie.utils.j */
public final class C21686j {

    /* renamed from: a */
    public static final int f56081a = 1000000000;

    /* renamed from: b */
    public static final ThreadLocal<PathMeasure> f56082b = new C21687a();

    /* renamed from: c */
    public static final ThreadLocal<Path> f56083c = new C21688b();

    /* renamed from: d */
    public static final ThreadLocal<Path> f56084d = new C21689c();

    /* renamed from: e */
    public static final ThreadLocal<float[]> f56085e = new C21690d();

    /* renamed from: f */
    public static final float f56086f = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: g */
    public static float f56087g = -1.0f;

    /* renamed from: com.airbnb.lottie.utils.j$a */
    public class C21687a extends ThreadLocal<PathMeasure> {
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.j$b */
    public class C21688b extends ThreadLocal<Path> {
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.j$c */
    public class C21689c extends ThreadLocal<Path> {
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.j$d */
    public class C21690d extends ThreadLocal<float[]> {
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m99800a(Path path, float f, float f2, float f3) {
        C21492e.m99017a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f56082b.get();
        Path path2 = f56083c.get();
        Path path3 = f56084d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C21492e.m99018b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C21492e.m99018b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C21685i.m99793g(min, length);
                max = (float) C21685i.m99793g(max, length);
            }
            if (min < 0.0f) {
                min = (float) C21685i.m99793g(min, length);
            }
            if (max < 0.0f) {
                max = (float) C21685i.m99793g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C21492e.m99018b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C21492e.m99018b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m99801b(Path path, @C0363p0 C21464t tVar) {
        if (tVar != null && !tVar.mo64056j()) {
            m99800a(path, ((C21474c) tVar.mo64054h()).mo64081p() / 100.0f, ((C21474c) tVar.mo64052d()).mo64081p() / 100.0f, ((C21474c) tVar.mo64053f()).mo64081p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m99802c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m99803d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m99804e() {
        if (f56087g == -1.0f) {
            f56087g = Resources.getSystem().getDisplayMetrics().density;
        }
        return f56087g;
    }

    /* renamed from: f */
    public static float m99805f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m99806g(Matrix matrix) {
        float[] fArr = f56085e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f56086f;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m99807h(Matrix matrix) {
        float[] fArr = f56085e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m99808i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m99809j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        return i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m99810k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m99811l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        C21439a aVar = new C21439a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return createBitmap;
    }

    /* renamed from: m */
    public static Bitmap m99812m(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: n */
    public static void m99813n(Canvas canvas, RectF rectF, Paint paint) {
        m99814o(canvas, rectF, paint, 31);
    }

    /* renamed from: o */
    public static void m99814o(Canvas canvas, RectF rectF, Paint paint, int i) {
        C21492e.m99017a("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C21492e.m99018b("Utils#saveLayer");
    }
}
