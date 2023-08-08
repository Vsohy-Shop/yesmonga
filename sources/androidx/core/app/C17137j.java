package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.core.app.j */
public final class C17137j {

    /* renamed from: a */
    public static final String f45379a = "ActivityRecreator";

    /* renamed from: b */
    public static final Class<?> f45380b;

    /* renamed from: c */
    public static final Field f45381c = m79365b();

    /* renamed from: d */
    public static final Field f45382d = m79369f();

    /* renamed from: e */
    public static final Method f45383e;

    /* renamed from: f */
    public static final Method f45384f;

    /* renamed from: g */
    public static final Method f45385g;

    /* renamed from: h */
    public static final Handler f45386h = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.j$a */
    public class C17138a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C17141d f45387a;

        /* renamed from: b */
        public final /* synthetic */ Object f45388b;

        public C17138a(C17141d dVar, Object obj) {
            this.f45387a = dVar;
            this.f45388b = obj;
        }

        public void run() {
            this.f45387a.f45393a = this.f45388b;
        }
    }

    /* renamed from: androidx.core.app.j$b */
    public class C17139b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f45389a;

        /* renamed from: b */
        public final /* synthetic */ C17141d f45390b;

        public C17139b(Application application, C17141d dVar) {
            this.f45389a = application;
            this.f45390b = dVar;
        }

        public void run() {
            this.f45389a.unregisterActivityLifecycleCallbacks(this.f45390b);
        }
    }

    /* renamed from: androidx.core.app.j$c */
    public class C17140c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f45391a;

        /* renamed from: b */
        public final /* synthetic */ Object f45392b;

        public C17140c(Object obj, Object obj2) {
            this.f45391a = obj;
            this.f45392b = obj2;
        }

        public void run() {
            try {
                Method method = C17137j.f45383e;
                if (method != null) {
                    method.invoke(this.f45391a, new Object[]{this.f45392b, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C17137j.f45384f.invoke(this.f45391a, new Object[]{this.f45392b, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: androidx.core.app.j$d */
    public static final class C17141d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f45393a;

        /* renamed from: b */
        public Activity f45394b;

        /* renamed from: c */
        public final int f45395c;

        /* renamed from: d */
        public boolean f45396d = false;

        /* renamed from: e */
        public boolean f45397e = false;

        /* renamed from: f */
        public boolean f45398f = false;

        public C17141d(@C0359n0 Activity activity) {
            this.f45394b = activity;
            this.f45395c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f45394b == activity) {
                this.f45394b = null;
                this.f45397e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f45397e && !this.f45398f && !this.f45396d && C17137j.m79371h(this.f45393a, this.f45395c, activity)) {
                this.f45398f = true;
                this.f45393a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f45394b == activity) {
                this.f45396d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m79364a();
        f45380b = a;
        f45383e = m79367d(a);
        f45384f = m79366c(a);
        f45385g = m79368e(a);
    }

    /* renamed from: a */
    public static Class<?> m79364a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m79365b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m79366c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m79367d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m79368e(Class<?> cls) {
        Class<Configuration> cls2 = Configuration.class;
        Class<List> cls3 = List.class;
        if (m79370g() && cls != null) {
            try {
                Class cls4 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, cls3, cls3, Integer.TYPE, cls4, cls2, cls2, cls4, cls4});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m79369f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m79370g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    public static boolean m79371h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f45382d.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f45386h.postAtFrontOfQueue(new C17140c(f45381c.get(activity), obj2));
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m79372i(@C0359n0 Activity activity) {
        Object obj;
        Application application;
        C17141d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m79370g() && f45385g == null) {
            return false;
        } else {
            if (f45384f == null && f45383e == null) {
                return false;
            }
            try {
                Object obj2 = f45382d.get(activity);
                if (obj2 == null || (obj = f45381c.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C17141d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f45386h;
                handler.post(new C17138a(dVar, obj2));
                if (m79370g()) {
                    Method method = f45385g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C17139b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
