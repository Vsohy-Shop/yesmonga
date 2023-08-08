package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.d1 */
public final class C38574d1 {
    @CheckForNull
    /* renamed from: a */
    public static <V> V m159889a(Map<?, V> map, @CheckForNull Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m159890b(Map<?, ?> map, @CheckForNull Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
