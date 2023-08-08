package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.startup.C20496b;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements C20496b<C19998c> {

    /* renamed from: a */
    public static final int f51184a = 5000;

    @C0376v0(16)
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C19996a {
        @C0373u
        /* renamed from: c */
        public static void m92952c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new C20018m(runnable));
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C19997b {
        @C0373u
        /* renamed from: a */
        public static Handler m92953a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C19998c {
    }

    /* renamed from: k */
    public static void m92945k(@C0359n0 Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C20017l(context));
    }

    @C0359n0
    public List<Class<? extends C20496b<?>>> dependencies() {
        return Collections.emptyList();
    }

    @C0359n0
    /* renamed from: e */
    public C19998c mo55933a(@C0359n0 Context context) {
        mo59258f(context.getApplicationContext());
        return new C19998c();
    }

    @C0376v0(16)
    /* renamed from: f */
    public void mo59258f(@C0359n0 Context context) {
        C19996a.m92952c(new C20016k(this, context));
    }

    /* renamed from: g */
    public void m92942h(@C0359n0 Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = C19997b.m92953a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new C20015j(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
