package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.e1 */
public class C0712e1 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f2362c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<C0712e1>> f2363d;

    /* renamed from: a */
    public final Resources f2364a;

    /* renamed from: b */
    public final Resources.Theme f2365b;

    public C0712e1(@C0359n0 Context context) {
        super(context);
        if (C0793t1.m3855d()) {
            C0793t1 t1Var = new C0793t1(this, context.getResources());
            this.f2364a = t1Var;
            Resources.Theme newTheme = t1Var.newTheme();
            this.f2365b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f2364a = new C0719g1(this, context.getResources());
        this.f2365b = null;
    }

    /* renamed from: a */
    public static boolean m3493a(@C0359n0 Context context) {
        if ((context instanceof C0712e1) || (context.getResources() instanceof C0719g1) || (context.getResources() instanceof C0793t1) || !C0793t1.m3855d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Context m3494b(@C0359n0 Context context) {
        C0712e1 e1Var;
        if (!m3493a(context)) {
            return context;
        }
        synchronized (f2362c) {
            ArrayList<WeakReference<C0712e1>> arrayList = f2363d;
            if (arrayList == null) {
                f2363d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f2363d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2363d.remove(size);
                    }
                }
                for (int size2 = f2363d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f2363d.get(size2);
                    if (weakReference2 != null) {
                        e1Var = (C0712e1) weakReference2.get();
                    } else {
                        e1Var = null;
                    }
                    if (e1Var != null && e1Var.getBaseContext() == context) {
                        return e1Var;
                    }
                }
            }
            C0712e1 e1Var2 = new C0712e1(context);
            f2363d.add(new WeakReference(e1Var2));
            return e1Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f2364a.getAssets();
    }

    public Resources getResources() {
        return this.f2364a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f2365b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f2365b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
