package androidx.webkit.internal;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.C0359n0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.C12530a;

/* renamed from: androidx.webkit.internal.p1 */
public class C20912p1 {

    /* renamed from: a */
    public static final String f54002a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";

    /* renamed from: b */
    public static final String f54003b = "createWebViewProviderFactory";

    /* renamed from: androidx.webkit.internal.p1$a */
    public static class C20913a {

        /* renamed from: a */
        public static final C20945y1 f54004a = new C20945y1(C20912p1.m96946d().getWebkitToCompatConverter());
    }

    /* renamed from: androidx.webkit.internal.p1$b */
    public static class C20914b {

        /* renamed from: a */
        public static final C20920r1 f54005a = C20912p1.m96943a();
    }

    @C0359n0
    /* renamed from: a */
    public static C20920r1 m96943a() {
        try {
            return new C20923s1((WebViewProviderFactoryBoundaryInterface) C12530a.m51109a(WebViewProviderFactoryBoundaryInterface.class, m96944b()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new C20930u0();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static InvocationHandler m96944b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler) Class.forName(f54002a, false, m96947e()).getDeclaredMethod(f54003b, new Class[0]).invoke((Object) null, new Object[0]);
    }

    @C0359n0
    /* renamed from: c */
    public static C20945y1 m96945c() {
        return C20913a.f54004a;
    }

    @C0359n0
    /* renamed from: d */
    public static C20920r1 m96946d() {
        return C20914b.f54005a;
    }

    @C0359n0
    /* renamed from: e */
    public static ClassLoader m96947e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C20877e0.m96855b();
        }
        return m96948f().getClass().getClassLoader();
    }

    /* renamed from: f */
    public static Object m96948f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
