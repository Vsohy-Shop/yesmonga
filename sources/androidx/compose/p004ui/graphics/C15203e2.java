package androidx.compose.p004ui.graphics;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCanvasUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,101:1\n26#2:102\n26#2:103\n*S KotlinDebug\n*F\n+ 1 CanvasUtils.android.kt\nandroidx/compose/ui/graphics/CanvasUtils\n*L\n54#1:102\n59#1:103\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.e2 */
public final class C15203e2 {
    @C12579k

    /* renamed from: a */
    public static final C15203e2 f37518a = new C15203e2();
    @C12580l

    /* renamed from: b */
    public static Method f37519b;
    @C12580l

    /* renamed from: c */
    public static Method f37520c;

    /* renamed from: d */
    public static boolean f37521d;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public final void mo42738a(@C12579k Canvas canvas, boolean z) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C15222h2.f37529a.mo42774a(canvas, z);
            return;
        }
        if (!f37521d) {
            Class<Canvas> cls = Canvas.class;
            if (i == 28) {
                Class<Class> cls2 = Class.class;
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f37519b = (Method) declaredMethod.invoke(cls, new Object[]{"insertReorderBarrier", new Class[0]});
                    f37520c = (Method) declaredMethod.invoke(cls, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f37519b = cls.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f37520c = cls.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f37519b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f37520c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f37521d = true;
        }
        if (z) {
            try {
                Method method4 = f37519b;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f37520c) != null) {
            Intrinsics.checkNotNull(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
