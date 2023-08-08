package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.C11043a;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C12044k0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.android.b */
public final class C11709b extends C11043a implements C12044k0 {
    @C12580l
    private volatile Object _preHandler = this;

    public C11709b() {
        super(C12044k0.f29686v0);
    }

    /* renamed from: O */
    public final Method mo23718O() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    /* renamed from: P */
    public void mo23719P(@C12579k CoroutineContext coroutineContext, @C12579k Throwable th) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Method O = mo23718O();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (O != null) {
                obj = O.invoke((Object) null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
