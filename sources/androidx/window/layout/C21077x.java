package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.annotation.C0344h1;
import androidx.annotation.C0376v0;
import androidx.appcompat.widget.C0696c;
import com.usabilla.sdk.ubform.sdk.banner.BannerFragment;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.window.layout.x */
public final class C21077x implements WindowMetricsCalculator {
    @C12579k

    /* renamed from: b */
    public static final C21077x f54327b = new C21077x();
    @C12579k

    /* renamed from: c */
    public static final String f54328c;

    static {
        String simpleName = C21077x.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f54328c = simpleName;
    }

    @C12579k
    /* renamed from: c */
    public C21074u mo62954c(@C12579k Activity activity) {
        Rect rect;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = C21042d.f54272a.mo62963a(activity);
        } else if (i >= 29) {
            rect = mo63027h(activity);
        } else if (i >= 28) {
            rect = mo63026g(activity);
        } else {
            rect = mo63025f(activity);
        }
        return new C21074u(rect);
    }

    @C12579k
    /* renamed from: d */
    public C21074u mo62955d(@C12579k Activity activity) {
        Rect rect;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        if (Build.VERSION.SDK_INT >= 30) {
            rect = C21042d.f54272a.mo62964b(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "display");
            Point k = mo63030k(defaultDisplay);
            rect = new Rect(0, 0, k.x, k.y);
        }
        return new C21074u(rect);
    }

    @C0376v0(14)
    @C12579k
    /* renamed from: e */
    public final Rect mo63024e(@C12579k Activity activity) {
        int i;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        Point k = mo63030k(defaultDisplay);
        Rect rect = new Rect();
        int i2 = k.x;
        if (i2 == 0 || (i = k.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i2;
            rect.bottom = i;
        }
        return rect;
    }

    @C0376v0(24)
    @C12579k
    /* renamed from: f */
    public final Rect mo63025f(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C21039a.f54271a.mo62962a(activity)) {
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            Point k = mo63030k(defaultDisplay);
            int j = mo63029j(activity);
            int i = rect.bottom;
            if (i + j == k.y) {
                rect.bottom = i + j;
            } else {
                int i2 = rect.right;
                if (i2 + j == k.x) {
                    rect.right = i2 + j;
                }
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @C0376v0(28)
    @C12579k
    /* renamed from: g */
    public final Rect mo63026g(@C12579k Activity activity) {
        DisplayCutout i;
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C21039a.f54271a.mo62962a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke != null) {
                    rect.set((Rect) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke2 != null) {
                    rect.set((Rect) invoke2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
        } catch (NoSuchFieldException unused) {
            mo63031l(activity, rect);
        } catch (NoSuchMethodException unused2) {
            mo63031l(activity, rect);
        } catch (IllegalAccessException unused3) {
            mo63031l(activity, rect);
        } catch (InvocationTargetException unused4) {
            mo63031l(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C21043e eVar = C21043e.f54273a;
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "currentDisplay");
        eVar.mo62965a(defaultDisplay, point);
        C21039a aVar = C21039a.f54271a;
        if (!aVar.mo62962a(activity)) {
            int j = mo63029j(activity);
            int i2 = rect.bottom;
            if (i2 + j == point.y) {
                rect.bottom = i2 + j;
            } else {
                int i3 = rect.right;
                if (i3 + j == point.x) {
                    rect.right = i3 + j;
                } else if (rect.left == j) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.mo62962a(activity) && (i = mo63028i(defaultDisplay)) != null) {
            int i4 = rect.left;
            C21044f fVar = C21044f.f54274a;
            if (i4 == fVar.mo62967b(i)) {
                rect.left = 0;
            }
            if (point.x - rect.right == fVar.mo62968c(i)) {
                rect.right += fVar.mo62968c(i);
            }
            if (rect.top == fVar.mo62969d(i)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == fVar.mo62966a(i)) {
                rect.bottom += fVar.mo62966a(i);
            }
        }
        return rect;
    }

    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @C0376v0(29)
    @C12579k
    /* renamed from: h */
    public final Rect mo63027h(@C12579k Activity activity) {
        Intrinsics.checkNotNullParameter(activity, C0696c.f2306r);
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (NoSuchFieldException unused) {
            return mo63026g(activity);
        } catch (NoSuchMethodException unused2) {
            return mo63026g(activity);
        } catch (IllegalAccessException unused3) {
            return mo63026g(activity);
        } catch (InvocationTargetException unused4) {
            return mo63026g(activity);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    @C0376v0(28)
    /* renamed from: i */
    public final DisplayCutout mo63028i(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", new Class[]{newInstance.getClass()});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, new Object[]{newInstance});
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (C21075v.m97439a(obj)) {
                return C21076w.m97440a(obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: j */
    public final int mo63029j(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(BannerFragment.f27307X, BannerFragment.f27308Y, "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @C0344h1
    @C0376v0(14)
    @C12579k
    /* renamed from: k */
    public final Point mo63030k(@C12579k Display display) {
        Intrinsics.checkNotNullParameter(display, "display");
        Point point = new Point();
        C21043e.f54273a.mo62965a(display, point);
        return point;
    }

    /* renamed from: l */
    public final void mo63031l(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
