package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.util.WeakHashMap;

/* renamed from: androidx.core.hardware.display.a */
public final class C17664a {

    /* renamed from: b */
    public static final WeakHashMap<Context, C17664a> f46014b = new WeakHashMap<>();

    /* renamed from: c */
    public static final String f46015c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a */
    public final Context f46016a;

    @C0376v0(17)
    /* renamed from: androidx.core.hardware.display.a$a */
    public static class C17665a {
        @C0373u
        /* renamed from: a */
        public static Display m80851a(DisplayManager displayManager, int i) {
            return displayManager.getDisplay(i);
        }

        @C0373u
        /* renamed from: b */
        public static Display[] m80852b(DisplayManager displayManager) {
            return displayManager.getDisplays();
        }
    }

    public C17664a(Context context) {
        this.f46016a = context;
    }

    @C0359n0
    /* renamed from: d */
    public static C17664a m80847d(@C0359n0 Context context) {
        C17664a aVar;
        WeakHashMap<Context, C17664a> weakHashMap = f46014b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new C17664a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @C0363p0
    /* renamed from: a */
    public Display mo52078a(int i) {
        return C17665a.m80851a((DisplayManager) this.f46016a.getSystemService("display"), i);
    }

    @C0359n0
    /* renamed from: b */
    public Display[] mo52079b() {
        return C17665a.m80852b((DisplayManager) this.f46016a.getSystemService("display"));
    }

    @C0359n0
    /* renamed from: c */
    public Display[] mo52080c(@C0363p0 String str) {
        return C17665a.m80852b((DisplayManager) this.f46016a.getSystemService("display"));
    }
}
