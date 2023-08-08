package androidx.compose.p004ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0373u;
import com.google.firebase.crashlytics.C32648f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.text.android.k0 */
public final class C16086k0 implements C16096l0 {
    @C12579k

    /* renamed from: a */
    public static final C16087a f39978a = new C16087a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static boolean f39979b;
    @C12580l

    /* renamed from: c */
    public static Constructor<StaticLayout> f39980c;

    /* renamed from: androidx.compose.ui.text.android.k0$a */
    public static final class C16087a {
        public /* synthetic */ C16087a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final Constructor<StaticLayout> mo46478b() {
            if (C16086k0.f39979b) {
                return C16086k0.f39980c;
            }
            C16086k0.f39979b = true;
            Class<StaticLayout> cls = StaticLayout.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                C16086k0.f39980c = cls.getConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, TextDirectionHeuristic.class, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
            } catch (NoSuchMethodException unused) {
                C16086k0.f39980c = null;
            }
            return C16086k0.f39980c;
        }

        public C16087a() {
        }
    }

    @C12579k
    @C0373u
    /* renamed from: a */
    public StaticLayout mo46476a(@C12579k C16101n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, C32648f.f79206e);
        Constructor a = f39978a.mo46478b();
        StaticLayout staticLayout = null;
        if (a != null) {
            try {
                staticLayout = (StaticLayout) a.newInstance(new Object[]{n0Var.mo46519r(), Integer.valueOf(n0Var.mo46518q()), Integer.valueOf(n0Var.mo46506e()), n0Var.mo46516o(), Integer.valueOf(n0Var.mo46522u()), n0Var.mo46502a(), n0Var.mo46520s(), Float.valueOf(n0Var.mo46514m()), Float.valueOf(n0Var.mo46513l()), Boolean.valueOf(n0Var.mo46508g()), n0Var.mo46504c(), Integer.valueOf(n0Var.mo46505d()), Integer.valueOf(n0Var.mo46515n())});
            } catch (IllegalAccessException unused) {
                f39980c = null;
            } catch (InstantiationException unused2) {
                f39980c = null;
            } catch (InvocationTargetException unused3) {
                f39980c = null;
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(n0Var.mo46519r(), n0Var.mo46518q(), n0Var.mo46506e(), n0Var.mo46516o(), n0Var.mo46522u(), n0Var.mo46502a(), n0Var.mo46514m(), n0Var.mo46513l(), n0Var.mo46508g(), n0Var.mo46504c(), n0Var.mo46505d());
    }

    /* renamed from: b */
    public boolean mo46477b(@C12579k StaticLayout staticLayout, boolean z) {
        Intrinsics.checkNotNullParameter(staticLayout, "layout");
        return false;
    }
}
