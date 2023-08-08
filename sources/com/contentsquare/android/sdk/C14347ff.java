package com.contentsquare.android.sdk;

import android.content.Context;
import androidx.core.util.C17994n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.ff */
public class C14347ff {

    /* renamed from: a */
    public final C14451jd f35442a;

    /* renamed from: b */
    public final String f35443b;

    /* renamed from: c */
    public final C14453jf f35444c;

    /* renamed from: d */
    public final String f35445d;

    /* renamed from: e */
    public final C14872y0 f35446e;

    /* renamed from: f */
    public String f35447f;

    /* renamed from: g */
    public int f35448g;

    /* renamed from: h */
    public int f35449h;

    /* renamed from: i */
    public int f35450i;

    public C14347ff(Context context, C14872y0 y0Var) {
        this(new C14451jd(), context.getFilesDir().getAbsolutePath(), y0Var);
    }

    /* renamed from: a */
    public final String mo35248a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35445d);
        String str = File.separator;
        sb.append(str);
        sb.append("evts");
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo35249b() {
        this.f35442a.mo35671p(this.f35447f);
        this.f35442a.mo35667l(new File(mo35255h()));
    }

    /* renamed from: c */
    public synchronized void mo35250c(int i, int i2) {
        C14451jd jdVar = this.f35442a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35445d);
        String str = File.separator;
        sb.append(str);
        sb.append("evts");
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        if (!jdVar.mo35663h(sb.toString())) {
            this.f35444c.mo35677f("failed to delete file for session %d, bucket %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
        mo35257j(i);
    }

    /* renamed from: d */
    public final void mo35251d(List<C17994n<Integer, Integer>> list, int i, int[] iArr) {
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i != this.f35449h || i2 != iArr.length - 1) {
                list.add(new C17994n(Integer.valueOf(i), Integer.valueOf(iArr[i2])));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[Catch:{ JSONException -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ JSONException -> 0x0017 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35252e(org.json.JSONObject r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.mo35264q()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "sn"
            boolean r0 = r5.has(r0)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "sn"
            int r0 = r5.getInt(r0)     // Catch:{ JSONException -> 0x0017 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0017 }
            goto L_0x003a
        L_0x0017:
            r0 = move-exception
            com.contentsquare.android.sdk.jf r1 = r4.f35444c     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r2.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = "Error getting the session number : "
            r2.append(r3)     // Catch:{ all -> 0x0063 }
            r2.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r3 = " for the event = "
            r2.append(r3)     // Catch:{ all -> 0x0063 }
            r2.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0063 }
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0063 }
            r1.mo35678g(r0, r2, r3)     // Catch:{ all -> 0x0063 }
        L_0x0039:
            r0 = 0
        L_0x003a:
            if (r0 == 0) goto L_0x0054
            int r1 = r0.intValue()     // Catch:{ all -> 0x0063 }
            int r2 = r4.f35449h     // Catch:{ all -> 0x0063 }
            if (r1 == r2) goto L_0x0054
            int r1 = r0.intValue()     // Catch:{ all -> 0x0063 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0063 }
            int r0 = r4.mo35259l(r0)     // Catch:{ all -> 0x0063 }
            r4.mo35253f(r5, r1, r0)     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x0054:
            int r0 = r4.f35449h     // Catch:{ all -> 0x0063 }
            int r1 = r4.f35448g     // Catch:{ all -> 0x0063 }
            r4.mo35253f(r5, r0, r1)     // Catch:{ all -> 0x0063 }
            int r5 = r4.f35450i     // Catch:{ all -> 0x0063 }
            int r5 = r5 + 1
            r4.f35450i = r5     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C14347ff.mo35252e(org.json.JSONObject):void");
    }

    /* renamed from: f */
    public final synchronized void mo35253f(JSONObject jSONObject, int i, int i2) {
        String jSONObject2 = jSONObject.toString();
        this.f35444c.mo35674c("Storing json to Session %s, bucket %d: %s", Integer.valueOf(i), Integer.valueOf(i2), jSONObject2);
        this.f35442a.mo35671p(mo35248a(i));
        String m = mo35260m(i, i2);
        this.f35442a.mo35660e(m, jSONObject2.replace("\n", "") + "\n");
    }

    /* renamed from: g */
    public final int[] mo35254g(String str) {
        String[] o = this.f35442a.mo35670o(str);
        if (o == null) {
            this.f35444c.mo35681l("error while listing folder, returning an empty array.", new Object[0]);
            return new int[0];
        }
        int[] iArr = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            String str2 = o[i];
            try {
                iArr[i] = Integer.parseInt(str2);
            } catch (NumberFormatException e) {
                iArr[i] = -1;
                this.f35444c.mo35678g(e, "Failed to parse the file name %s to integer", str2);
            }
        }
        return iArr;
    }

    /* renamed from: h */
    public String mo35255h() {
        return mo35260m(this.f35449h, this.f35448g);
    }

    /* renamed from: i */
    public synchronized List<JSONObject> mo35256i(int i, int i2) {
        ArrayList arrayList;
        this.f35444c.mo35674c("Retrieving bucket content for session %s bucket %d ", Integer.valueOf(i), Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35445d);
        String str = File.separator;
        sb.append(str);
        sb.append("evts");
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        List<String> r = this.f35442a.mo35673r(sb.toString());
        arrayList = new ArrayList(r.size());
        for (String jSONObject : r) {
            try {
                arrayList.add(new JSONObject(jSONObject));
            } catch (JSONException e) {
                this.f35444c.mo35678g(e, "!! DATALOSS !! Failed to serialize string to JSon Object", new Object[0]);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public final void mo35257j(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35445d);
        String str = File.separator;
        sb.append(str);
        sb.append("evts");
        sb.append(str);
        sb.append(i);
        String sb2 = sb.toString();
        String[] o = this.f35442a.mo35670o(sb2);
        if (o == null || o.length == 0) {
            this.f35442a.mo35663h(sb2);
        }
    }

    /* renamed from: k */
    public int mo35258k() {
        return this.f35450i;
    }

    /* renamed from: l */
    public final int mo35259l(int i) {
        String[] o = this.f35442a.mo35670o(mo35248a(i));
        if (o == null) {
            o = new String[0];
        }
        int i2 = 0;
        for (String str : o) {
            try {
                i2 = Math.max(Integer.parseInt(str), i2);
            } catch (NumberFormatException unused) {
                this.f35444c.mo35677f("[initBucketNumberAndSize] trying to convert the bucket : %s to an integer but failed", str);
            }
        }
        return i2;
    }

    /* renamed from: m */
    public final String mo35260m(int i, int i2) {
        return mo35248a(i) + File.separator + i2;
    }

    /* renamed from: n */
    public synchronized List<C17994n<Integer, Integer>> mo35261n() {
        LinkedList linkedList;
        mo35264q();
        linkedList = new LinkedList();
        String str = this.f35445d + File.separator + "evts";
        int[] g = mo35254g(str);
        Arrays.sort(g);
        for (int i : g) {
            if (i >= 0) {
                String str2 = str + File.separator + i;
                if (this.f35442a.mo35669n(str2)) {
                    mo35251d(linkedList, i, mo35254g(str2));
                } else {
                    this.f35444c.mo35677f("Failed getting a writable folder at path %s", Integer.valueOf(i));
                }
            }
        }
        return linkedList;
    }

    /* renamed from: o */
    public final void mo35262o() {
        int l = mo35259l(this.f35449h);
        this.f35448g = l;
        this.f35450i = l == 0 ? 0 : this.f35442a.mo35673r(mo35255h()).size();
    }

    /* renamed from: p */
    public synchronized void mo35263p() {
        this.f35448g++;
        this.f35450i = 0;
        mo35249b();
    }

    /* renamed from: q */
    public final void mo35264q() {
        int p = this.f35446e.mo36894p();
        if (this.f35449h != p) {
            this.f35447f = mo35248a(p);
            this.f35449h = p;
            mo35262o();
        }
    }

    public C14347ff(C14451jd jdVar, String str, C14872y0 y0Var) {
        this.f35444c = new C14453jf("EventStorageManager");
        this.f35448g = 0;
        this.f35449h = -1;
        this.f35450i = 0;
        this.f35442a = jdVar;
        this.f35443b = str;
        this.f35445d = str + File.separator + "cs";
        this.f35446e = y0Var;
        mo35264q();
    }
}
