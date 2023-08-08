package com.carrefour.fid.android.analytics.data.analytics.firebasemodels;

import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C10975r0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import kotlin.text.C11622t;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFirebaseModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/FirebaseModelKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n3864#2:38\n4387#2,2:39\n457#3:41\n403#3:42\n442#3:47\n392#3:48\n457#3:53\n403#3:54\n442#3:59\n392#3:60\n1238#4,4:43\n1238#4,4:49\n1238#4,4:55\n1238#4,4:61\n*S KotlinDebug\n*F\n+ 1 FirebaseModel.kt\ncom/carrefour/fid/android/analytics/data/analytics/firebasemodels/FirebaseModelKt\n*L\n16#1:38\n16#1:39,2\n23#1:41\n23#1:42\n24#1:47\n24#1:48\n33#1:53\n33#1:54\n34#1:59\n34#1:60\n23#1:43,4\n24#1:49,4\n33#1:55,4\n34#1:61,4\n*E\n"})
public final class FirebaseModelKt {

    /* renamed from: a */
    public static final int f33568a = 40;

    /* renamed from: b */
    public static final int f33569b = 100;

    /* renamed from: c */
    public static final int f33570c = 24;

    /* renamed from: d */
    public static final int f33571d = 36;

    @C12579k
    /* renamed from: a */
    public static final String m58699a(@C12579k String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            if (Character.isLetterOrDigit(c) || C11600b.m45189r(c) || c == '-' || c == '|') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(Character.valueOf(c));
            }
        }
        return StringKt.m118906O(C11622t.replace$default(new Regex("\\s+").mo23336m(CollectionsKt___CollectionsKt.m40639h3(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, FirebaseModelKt$firebaseFormulated$2.f33572f, 30, (Object) null), " "), " ", "-", false, 4, (Object) null));
    }

    @C12579k
    /* renamed from: b */
    public static final Map<String, Object> m58700b(@C12579k Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(StringsKt___StringsKt.take((String) entry.getKey(), 40), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof String) {
                value = StringsKt___StringsKt.take((String) value, 40);
            }
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }

    @C12579k
    /* renamed from: c */
    public static final Map<String, String> m58701c(@C12579k Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(StringsKt___StringsKt.take((String) entry.getKey(), 24), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), StringsKt___StringsKt.take((String) entry2.getValue(), 36));
        }
        return linkedHashMap2;
    }
}
