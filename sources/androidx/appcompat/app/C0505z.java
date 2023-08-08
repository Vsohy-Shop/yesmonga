package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.z */
public class C0505z {

    /* renamed from: a */
    public static final String f1285a = "ResourcesFlusher";

    /* renamed from: b */
    public static Field f1286b;

    /* renamed from: c */
    public static boolean f1287c;

    /* renamed from: d */
    public static Class<?> f1288d;

    /* renamed from: e */
    public static boolean f1289e;

    /* renamed from: f */
    public static Field f1290f;

    /* renamed from: g */
    public static boolean f1291g;

    /* renamed from: h */
    public static Field f1292h;

    /* renamed from: i */
    public static boolean f1293i;

    @C0376v0(16)
    /* renamed from: androidx.appcompat.app.z$a */
    public static class C0506a {
        @C0373u
        /* renamed from: a */
        public static void m2344a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m2339a(@C0359n0 Resources resources) {
        if (Build.VERSION.SDK_INT < 28) {
            m2342d(resources);
        }
    }

    @C0376v0(21)
    /* renamed from: b */
    public static void m2340b(@C0359n0 Resources resources) {
        Map map;
        if (!f1287c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f1286b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1287c = true;
        }
        Field field = f1286b;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0021  */
    @androidx.annotation.C0376v0(23)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2341c(@androidx.annotation.C0359n0 android.content.res.Resources r3) {
        /*
            boolean r0 = f1287c
            if (r0 != 0) goto L_0x0014
            r0 = 1
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.String r2 = "mDrawableCache"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0012 }
            f1286b = r1     // Catch:{ NoSuchFieldException -> 0x0012 }
            r1.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x0012 }
        L_0x0012:
            f1287c = r0
        L_0x0014:
            java.lang.reflect.Field r0 = f1286b
            if (r0 == 0) goto L_0x001d
            java.lang.Object r3 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            if (r3 != 0) goto L_0x0021
            return
        L_0x0021:
            m2343e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0505z.m2341c(android.content.res.Resources):void");
    }

    @C0376v0(24)
    /* renamed from: d */
    public static void m2342d(@C0359n0 Resources resources) {
        Object obj;
        if (!f1293i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1292h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f1293i = true;
        }
        Field field = f1292h;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f1287c) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f1286b = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f1287c = true;
                }
                Field field2 = f1286b;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    m2343e(obj2);
                }
            }
        }
    }

    @C0376v0(16)
    /* renamed from: e */
    public static void m2343e(@C0359n0 Object obj) {
        LongSparseArray longSparseArray;
        if (!f1289e) {
            try {
                f1288d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f1289e = true;
        }
        Class<?> cls = f1288d;
        if (cls != null) {
            if (!f1291g) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f1290f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f1291g = true;
            }
            Field field = f1290f;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    C0506a.m2344a(longSparseArray);
                }
            }
        }
    }
}
