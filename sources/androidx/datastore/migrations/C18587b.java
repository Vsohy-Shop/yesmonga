package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10975r0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.datastore.migrations.b */
public final class C18587b {
    @C12579k

    /* renamed from: a */
    public final SharedPreferences f47435a;
    @C12580l

    /* renamed from: b */
    public final Set<String> f47436b;

    public C18587b(@C12579k SharedPreferences sharedPreferences, @C12580l Set<String> set) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "prefs");
        this.f47435a = sharedPreferences;
        this.f47436b = set;
    }

    /* renamed from: i */
    public static /* synthetic */ String m84080i(C18587b bVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return bVar.mo53602h(str, str2);
    }

    /* renamed from: k */
    public static /* synthetic */ Set m84081k(C18587b bVar, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return bVar.mo53603j(str, set);
    }

    /* renamed from: a */
    public final String mo53595a(String str) {
        Set<String> set = this.f47436b;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Can't access key outside migration: ", str).toString());
    }

    /* renamed from: b */
    public final boolean mo53596b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.contains(mo53595a(str));
    }

    @C12579k
    /* renamed from: c */
    public final Map<String, Object> mo53597c() {
        boolean z;
        Map<String, ?> all = this.f47435a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            Set<String> set = this.f47436b;
            if (set == null) {
                z = true;
            } else {
                z = set.contains(str);
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C10975r0.m41400j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt___CollectionsKt.m40582V5((Iterable) value);
            }
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }

    /* renamed from: d */
    public final boolean mo53598d(@C12579k String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.getBoolean(mo53595a(str), z);
    }

    /* renamed from: e */
    public final float mo53599e(@C12579k String str, float f) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.getFloat(mo53595a(str), f);
    }

    /* renamed from: f */
    public final int mo53600f(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.getInt(mo53595a(str), i);
    }

    /* renamed from: g */
    public final long mo53601g(@C12579k String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.getLong(mo53595a(str), j);
    }

    @C12580l
    /* renamed from: h */
    public final String mo53602h(@C12579k String str, @C12580l String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.f47435a.getString(mo53595a(str), str2);
    }

    @C12580l
    /* renamed from: j */
    public final Set<String> mo53603j(@C12579k String str, @C12580l Set<String> set) {
        Intrinsics.checkNotNullParameter(str, "key");
        Set<String> stringSet = this.f47435a.getStringSet(mo53595a(str), set);
        if (stringSet == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.m40577U5(stringSet);
    }
}
