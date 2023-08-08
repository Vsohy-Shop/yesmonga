package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.core.util.C18001r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0376v0(26)
/* renamed from: androidx.camera.core.internal.compat.b */
public final class C1595b {

    /* renamed from: a */
    public static final String f4531a = "ImageWriterCompatApi26";

    /* renamed from: b */
    public static Method f4532b;

    static {
        Class<ImageWriter> cls = ImageWriter.class;
        try {
            Class cls2 = Integer.TYPE;
            f4532b = cls.getMethod("newInstance", new Class[]{Surface.class, cls2, cls2});
        } catch (NoSuchMethodException unused) {
        }
    }

    @C0359n0
    /* renamed from: a */
    public static ImageWriter m6620a(@C0359n0 Surface surface, @C0337f0(from = 1) int i, int i2) {
        Throwable th = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C18001r.m81775l(f4532b.invoke((Object) null, new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}));
            } catch (IllegalAccessException | InvocationTargetException e) {
                th = e;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", th);
    }
}
