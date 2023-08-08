package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.C0352k;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.core.content.C17318d;
import com.google.android.material.C31076a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.material.color.p */
public class C31261p {

    /* renamed from: a */
    public static final String f75250a = "p";

    @C0376v0(api = 21)
    /* renamed from: a */
    public static void m125918a(@C0359n0 Map<Integer, Integer> map, @C0359n0 TypedArray typedArray, @C0363p0 TypedArray typedArray2, @C0354l int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && m125922e(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(C31266s.m125958i(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @C0376v0(api = 30)
    /* renamed from: b */
    public static boolean m125919b(Context context, Map<Integer, Integer> map) {
        ResourcesLoader a = C31233h.m125820a(context, map);
        if (a == null) {
            return false;
        }
        context.getResources().addLoaders(new ResourcesLoader[]{a});
        return true;
    }

    @C0359n0
    /* renamed from: c */
    public static void m125920c(@C0359n0 Context context, @C0359n0 C31262q qVar) {
        if (m125923f()) {
            Map<Integer, Integer> d = m125921d(context, qVar);
            int e = qVar.mo89228e(0);
            if (m125919b(context, d) && e != 0) {
                C31268u.m125972a(context, e);
            }
        }
    }

    @C0376v0(api = 21)
    /* renamed from: d */
    public static Map<Integer, Integer> m125921d(Context context, C31262q qVar) {
        TypedArray typedArray;
        HashMap hashMap = new HashMap();
        int c = C31266s.m125952c(context, qVar.mo89225b(), f75250a);
        for (int i : qVar.mo89227d()) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(C31266s.m125958i(C17318d.m79723f(context, i), c)));
        }
        C31259n c2 = qVar.mo89226c();
        if (c2 != null) {
            int[] d = c2.mo89223d();
            if (d.length > 0) {
                int e = c2.mo89224e();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d);
                if (e != 0) {
                    typedArray = new ContextThemeWrapper(context, e).obtainStyledAttributes(d);
                } else {
                    typedArray = null;
                }
                m125918a(hashMap, obtainStyledAttributes, typedArray, c);
                obtainStyledAttributes.recycle();
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    public static boolean m125922e(int i) {
        return 28 <= i && i <= 31;
    }

    @C0352k(api = 30)
    /* renamed from: f */
    public static boolean m125923f() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @C0359n0
    /* renamed from: g */
    public static Context m125924g(@C0359n0 Context context, @C0359n0 C31262q qVar) {
        if (!m125923f()) {
            return context;
        }
        Map<Integer, Integer> d = m125921d(context, qVar);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, qVar.mo89228e(C31076a.C31090n.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (m125919b(contextThemeWrapper, d)) {
            return contextThemeWrapper;
        }
        return context;
    }
}
