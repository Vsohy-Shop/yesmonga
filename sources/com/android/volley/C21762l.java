package com.android.volley;

import androidx.annotation.C0363p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.android.volley.l */
public class C21762l {

    /* renamed from: a */
    public final int f56297a;

    /* renamed from: b */
    public final byte[] f56298b;
    @C0363p0

    /* renamed from: c */
    public final Map<String, String> f56299c;
    @C0363p0

    /* renamed from: d */
    public final List<C21759i> f56300d;

    /* renamed from: e */
    public final boolean f56301e;

    /* renamed from: f */
    public final long f56302f;

    @Deprecated
    public C21762l(int i, byte[] bArr, @C0363p0 Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m100063a(map), z, j);
    }

    @C0363p0
    /* renamed from: a */
    public static List<C21759i> m100063a(@C0363p0 Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new C21759i((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    @C0363p0
    /* renamed from: b */
    public static Map<String, String> m100064b(@C0363p0 List<C21759i> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C21759i next : list) {
            treeMap.put(next.mo64934a(), next.mo64935b());
        }
        return treeMap;
    }

    public C21762l(int i, byte[] bArr, boolean z, long j, @C0363p0 List<C21759i> list) {
        this(i, bArr, m100064b(list), list, z, j);
    }

    @Deprecated
    public C21762l(int i, byte[] bArr, @C0363p0 Map<String, String> map, boolean z) {
        this(i, bArr, map, z, 0);
    }

    public C21762l(byte[] bArr) {
        this(200, bArr, false, 0, (List<C21759i>) Collections.emptyList());
    }

    @Deprecated
    public C21762l(byte[] bArr, @C0363p0 Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }

    public C21762l(int i, byte[] bArr, @C0363p0 Map<String, String> map, @C0363p0 List<C21759i> list, boolean z, long j) {
        this.f56297a = i;
        this.f56298b = bArr;
        this.f56299c = map;
        if (list == null) {
            this.f56300d = null;
        } else {
            this.f56300d = Collections.unmodifiableList(list);
        }
        this.f56301e = z;
        this.f56302f = j;
    }
}
