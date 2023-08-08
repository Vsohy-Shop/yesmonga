package androidx.core.p027os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.k */
public final class C17800k {

    /* renamed from: a */
    public static final String f46185a = "HandlerCompat";

    @C0376v0(28)
    /* renamed from: androidx.core.os.k$a */
    public static class C17801a {
        /* renamed from: a */
        public static Handler m81192a(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* renamed from: b */
        public static Handler m81193b(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        /* renamed from: c */
        public static boolean m81194c(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    @C0376v0(29)
    /* renamed from: androidx.core.os.k$b */
    public static class C17802b {
        /* renamed from: a */
        public static boolean m81195a(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static Handler m81188a(@C0359n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17801a.m81192a(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    @C0359n0
    /* renamed from: b */
    public static Handler m81189b(@C0359n0 Looper looper, @C0359n0 Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17801a.m81193b(looper, callback);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, callback, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper, callback);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    @C0376v0(16)
    /* renamed from: c */
    public static boolean m81190c(@C0359n0 Handler handler, @C0359n0 Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C17802b.m81195a(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", new Class[]{Runnable.class}).invoke(handler, new Object[]{runnable})).booleanValue();
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException e2) {
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e2);
        }
    }

    /* renamed from: d */
    public static boolean m81191d(@C0359n0 Handler handler, @C0359n0 Runnable runnable, @C0363p0 Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17801a.m81194c(handler, runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
