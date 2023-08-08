package com.urbanairship.util;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.i0 */
public class C9655i0 implements C9660l {

    /* renamed from: a */
    public final List<String> f26465a;

    /* renamed from: b */
    public final Map<String, String> f26466b;

    /* renamed from: c */
    public final Context f26467c;

    public C9655i0(@C0359n0 Context context, @C0359n0 List<String> list, @C0359n0 Map<String, String> map) {
        this.f26467c = context;
        this.f26465a = list;
        this.f26466b = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[SYNTHETIC, Splitter:B:19:0x0040] */
    @androidx.annotation.C0359n0
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.urbanairship.util.C9655i0 m36167e(@androidx.annotation.C0359n0 android.content.Context r4, @androidx.annotation.C0359n0 java.lang.String r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "Failed to close input stream."
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.AssetManager r1 = r1.getAssets()
            java.lang.String r2 = ""
            java.lang.String[] r2 = r1.list(r2)
            if (r2 == 0) goto L_0x004b
            java.util.List r2 = java.util.Arrays.asList(r2)
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto L_0x004b
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.io.InputStream r5 = r1.open(r5)     // Catch:{ all -> 0x003c }
            r2.load(r5)     // Catch:{ all -> 0x003a }
            com.urbanairship.util.i0 r4 = m36168h(r4, r2)     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0039
            r5.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.urbanairship.C36059m.m148407c(r5, r0, r1)
        L_0x0039:
            return r4
        L_0x003a:
            r4 = move-exception
            goto L_0x003e
        L_0x003c:
            r4 = move-exception
            r5 = 0
        L_0x003e:
            if (r5 == 0) goto L_0x004a
            r5.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r5 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.urbanairship.C36059m.m148407c(r5, r0, r1)
        L_0x004a:
            throw r4
        L_0x004b:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to find properties file: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.util.C9655i0.m36167e(android.content.Context, java.lang.String):com.urbanairship.util.i0");
    }

    @C0359n0
    /* renamed from: h */
    public static C9655i0 m36168h(@C0359n0 Context context, @C0359n0 Properties properties) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (String next : properties.stringPropertyNames()) {
            String property = properties.getProperty(next);
            if (property != null) {
                property = property.trim();
            }
            if (!C9669o0.m36224e(property)) {
                arrayList.add(next);
                hashMap.put(next, property);
            }
        }
        return new C9655i0(context, arrayList, hashMap);
    }

    /* renamed from: a */
    public long mo19608a(@C0359n0 String str, long j) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return j;
        }
        return Long.parseLong(d);
    }

    /* renamed from: b */
    public boolean mo19609b(@C0359n0 String str, boolean z) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return z;
        }
        return Boolean.parseBoolean(d);
    }

    /* renamed from: c */
    public int mo19610c(@C0359n0 String str, int i) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return i;
        }
        return Integer.parseInt(d);
    }

    @C0363p0
    /* renamed from: d */
    public String mo19611d(@C0359n0 String str) {
        return this.f26466b.get(str);
    }

    @C0363p0
    /* renamed from: f */
    public String[] mo19612f(@C0359n0 String str) {
        String str2 = this.f26466b.get(str);
        if (str2 == null) {
            return new String[0];
        }
        return str2.split("[, ]+");
    }

    /* renamed from: g */
    public int mo19613g(@C0359n0 String str) {
        return this.f26467c.getResources().getIdentifier(mo19611d(str), "raw", this.f26467c.getPackageName());
    }

    public int getCount() {
        return this.f26465a.size();
    }

    @C0363p0
    public String getName(int i) {
        return this.f26465a.get(i);
    }

    /* renamed from: i */
    public int mo19616i(@C0359n0 String str) {
        return this.f26467c.getResources().getIdentifier(mo19611d(str), "drawable", this.f26467c.getPackageName());
    }

    @C0354l
    /* renamed from: j */
    public int mo19617j(@C0359n0 String str, @C0354l int i) {
        String d = mo19611d(str);
        if (C9669o0.m36224e(d)) {
            return i;
        }
        return Color.parseColor(d);
    }

    @C0359n0
    /* renamed from: k */
    public String mo19618k(@C0359n0 String str, @C0359n0 String str2) {
        String d = mo19611d(str);
        return d == null ? str2 : d;
    }
}
