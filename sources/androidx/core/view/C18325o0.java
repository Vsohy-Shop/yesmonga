package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.view.o0 */
public class C18325o0 {

    /* renamed from: a */
    public static boolean f46987a = false;

    /* renamed from: b */
    public static Method f46988b = null;

    /* renamed from: c */
    public static boolean f46989c = false;

    /* renamed from: d */
    public static Field f46990d;

    /* renamed from: androidx.core.view.o0$a */
    public interface C18326a {
        /* renamed from: n */
        boolean mo1520n(@C0359n0 KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m83023a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f46987a) {
            try {
                f46988b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f46987a = true;
        }
        Method method = f46988b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m83024b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m83023a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C18196h2.m82656z(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    public static boolean m83025c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener f = m83028f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C18196h2.m82656z(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m83026d(@C0359n0 View view, @C0359n0 KeyEvent keyEvent) {
        return C18196h2.m82468A(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m83027e(@C0359n0 C18326a aVar, @C0363p0 View view, @C0363p0 Window.Callback callback, @C0359n0 KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo1520n(keyEvent);
        }
        if (callback instanceof Activity) {
            return m83024b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m83025c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C18196h2.m82656z(view, keyEvent)) && !aVar.mo1520n(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m83028f(Dialog dialog) {
        if (!f46989c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f46990d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f46989c = true;
        }
        Field field = f46990d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
