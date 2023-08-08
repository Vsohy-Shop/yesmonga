package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C16934c;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.installations.C33124s;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import kotlinx.serialization.json.C12412q;

@SuppressLint({"LogConditional"})
/* renamed from: androidx.constraintlayout.motion.widget.c */
public class C16878c {
    /* renamed from: a */
    public static void m77578a(ViewGroup.LayoutParams layoutParams, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + str + GlideException.C22148a.f56917d;
        System.out.println(" >>>>>>>>>>>>>>>>>>. dump " + str2 + GlideException.C22148a.f56917d + layoutParams.getClass().getName());
        Field[] fields = layoutParams.getClass().getFields();
        for (Field field : fields) {
            try {
                Object obj = field.get(layoutParams);
                String name = field.getName();
                if (name.contains("To")) {
                    if (!obj.toString().equals("-1")) {
                        System.out.println(str2 + C16934c.C16941f.f44804o + name + " " + obj);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(" <<<<<<<<<<<<<<<<< dump " + str2);
    }

    /* renamed from: b */
    public static void m77579b(ViewGroup viewGroup, String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + str + GlideException.C22148a.f56917d;
        int childCount = viewGroup.getChildCount();
        System.out.println(str + " children " + childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            System.out.println(str2 + "     " + m77588k(childAt));
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Field[] fields = layoutParams.getClass().getFields();
            for (int i2 = 0; i2 < fields.length; i2++) {
                Field field = fields[i2];
                try {
                    Object obj = field.get(layoutParams);
                    if (field.getName().contains("To")) {
                        if (!obj.toString().equals("-1")) {
                            System.out.println(str2 + C16934c.C16941f.f44804o + field.getName() + " " + obj);
                        }
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public static void m77580c(Object obj) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ")";
        Class<?> cls = obj.getClass();
        System.out.println(str + "------------- " + cls.getName() + " --------------------");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            try {
                Object obj2 = field.get(obj);
                if (field.getName().startsWith("layout_constraint")) {
                    if (!(obj2 instanceof Integer) || !obj2.toString().equals("-1")) {
                        if (!(obj2 instanceof Integer) || !obj2.toString().equals("0")) {
                            if (!(obj2 instanceof Float) || !obj2.toString().equals("1.0")) {
                                if (!(obj2 instanceof Float) || !obj2.toString().equals("0.5")) {
                                    System.out.println(str + C12412q.f30348a + field.getName() + " " + obj2);
                                }
                            }
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        System.out.println(str + "------------- " + cls.getSimpleName() + " --------------------");
    }

    /* renamed from: d */
    public static String m77581d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Field[] fields = MotionEvent.class.getFields();
        for (Field field : fields) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt((Object) null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    /* renamed from: e */
    public static String m77582e(int i) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[i + 2];
        return ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: f */
    public static String m77583f() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: g */
    public static String m77584g() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: h */
    public static String m77585h() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        return ".(" + stackTraceElement.getFileName() + C33124s.f80355c + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: i */
    public static String m77586i(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return "?" + i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = "? " + r6[r1] + " ";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m77587j(android.content.Context r5, int[] r6) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r0.<init>()     // Catch:{ Exception -> 0x0072 }
            int r1 = r6.length     // Catch:{ Exception -> 0x0072 }
            r0.append(r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r1 = "["
            r0.append(r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0072 }
            r1 = 0
        L_0x0013:
            int r2 = r6.length     // Catch:{ Exception -> 0x0072 }
            if (r1 >= r2) goto L_0x0060
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r2.<init>()     // Catch:{ Exception -> 0x0072 }
            r2.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = " "
            if (r1 != 0) goto L_0x0025
            java.lang.String r3 = ""
            goto L_0x0026
        L_0x0025:
            r3 = r0
        L_0x0026:
            r2.append(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0072 }
            android.content.res.Resources r3 = r5.getResources()     // Catch:{ NotFoundException -> 0x0038 }
            r4 = r6[r1]     // Catch:{ NotFoundException -> 0x0038 }
            java.lang.String r0 = r3.getResourceEntryName(r4)     // Catch:{ NotFoundException -> 0x0038 }
            goto L_0x004e
        L_0x0038:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r3.<init>()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = "? "
            r3.append(r4)     // Catch:{ Exception -> 0x0072 }
            r4 = r6[r1]     // Catch:{ Exception -> 0x0072 }
            r3.append(r4)     // Catch:{ Exception -> 0x0072 }
            r3.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0072 }
        L_0x004e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r3.<init>()     // Catch:{ Exception -> 0x0072 }
            r3.append(r2)     // Catch:{ Exception -> 0x0072 }
            r3.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0072 }
            int r1 = r1 + 1
            goto L_0x0013
        L_0x0060:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
            r5.<init>()     // Catch:{ Exception -> 0x0072 }
            r5.append(r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r6 = "]"
            r5.append(r6)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0072 }
            return r5
        L_0x0072:
            r5 = move-exception
            r5.toString()
            java.lang.String r5 = "UNKNOWN"
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C16878c.m77587j(android.content.Context, int[]):java.lang.String");
    }

    /* renamed from: k */
    public static String m77588k(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: l */
    public static String m77589l(MotionLayout motionLayout, int i) {
        return m77590m(motionLayout, i, -1);
    }

    /* renamed from: m */
    public static String m77590m(MotionLayout motionLayout, int i, int i2) {
        int length;
        if (i == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i);
        if (i2 == -1) {
            return resourceEntryName;
        }
        if (resourceEntryName.length() > i2) {
            resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
        }
        if (resourceEntryName.length() <= i2 || (length = resourceEntryName.replaceAll("[^_]", "").length()) <= 0) {
            return resourceEntryName;
        }
        int length2 = (resourceEntryName.length() - i2) / length;
        return resourceEntryName.replaceAll(CharBuffer.allocate(length2).toString().replace(0, '.') + C32920e.f79928l, C32920e.f79928l);
    }

    /* renamed from: n */
    public static void m77591n(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str3 = str3 + " ";
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(".(" + stackTrace[i2].getFileName() + C33124s.f80355c + stackTrace[i2].getLineNumber() + ") " + stackTrace[i2].getMethodName());
            sb.append(str3);
        }
    }

    /* renamed from: o */
    public static void m77592o(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str2 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            str2 = str2 + " ";
            PrintStream printStream = System.out;
            printStream.println(str + str2 + (".(" + stackTrace[i2].getFileName() + C33124s.f80355c + stackTrace[i2].getLineNumber() + ") ") + str2);
        }
    }
}
