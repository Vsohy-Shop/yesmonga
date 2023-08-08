package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0353k0;
import androidx.annotation.C0376v0;
import androidx.lifecycle.C19470t;
import java.lang.reflect.Field;

@C0376v0(19)
final class ImmLeaksCleaner implements C19470t {

    /* renamed from: b */
    public static final int f667b = 0;

    /* renamed from: c */
    public static final int f668c = 1;

    /* renamed from: d */
    public static final int f669d = 2;

    /* renamed from: e */
    public static int f670e;

    /* renamed from: f */
    public static Field f671f;

    /* renamed from: g */
    public static Field f672g;

    /* renamed from: v */
    public static Field f673v;

    /* renamed from: a */
    public Activity f674a;

    public ImmLeaksCleaner(Activity activity) {
        this.f674a = activity;
    }

    @C0353k0
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public static void m1238a() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            f670e = 2;
            Field declaredField = cls.getDeclaredField("mServedView");
            f672g = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mNextServedView");
            f673v = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mH");
            f671f = declaredField3;
            declaredField3.setAccessible(true);
            f670e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo750i(@androidx.annotation.C0359n0 androidx.lifecycle.C19499w r3, @androidx.annotation.C0359n0 androidx.lifecycle.Lifecycle.C19372Event r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.C19372Event.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f670e
            if (r3 != 0) goto L_0x000c
            m1238a()
        L_0x000c:
            int r3 = f670e
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f674a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f671f     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f672g     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f673v     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo750i(androidx.lifecycle.w, androidx.lifecycle.Lifecycle$Event):void");
    }
}
