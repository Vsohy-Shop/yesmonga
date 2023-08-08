package com.contentsquare.android.sdk;

import android.content.Context;
import android.support.p002v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.contentsquare.android.sdk.pd */
public class C14621pd {

    /* renamed from: a */
    public final C14451jd f36201a;

    /* renamed from: b */
    public final long f36202b;

    /* renamed from: c */
    public final C14453jf f36203c;

    /* renamed from: d */
    public final AtomicInteger f36204d;

    /* renamed from: e */
    public final String f36205e;

    public C14621pd(Context context) {
        this(new C14451jd(), context.getFilesDir().getAbsolutePath(), 20971520);
    }

    /* renamed from: a */
    public void mo36166a() {
        String str;
        long k = this.f36201a.mo35666k(this.f36205e);
        this.f36203c.mo35674c("current size of path %s is %d bytes", this.f36205e, Long.valueOf(k));
        if (this.f36202b < k && (str = this.f36205e) != null) {
            this.f36203c.mo35674c("space used on path %s has reached %d bytes. it will be deleted", str, Long.valueOf(k));
            this.f36201a.mo35662g(new File(this.f36205e));
        }
    }

    /* renamed from: b */
    public void mo36167b(long j) {
        String str = this.f36205e + File.separator + j;
        this.f36203c.mo35674c("deleting file on path: %s", str);
        if (!this.f36201a.mo35663h(str)) {
            this.f36203c.mo35677f("failed to delete file for, file %d in path %s", Long.valueOf(j), str);
        }
    }

    /* renamed from: c */
    public void mo36168c(C14754tf tfVar) {
        String str = this.f36205e + File.separator + mo36169d();
        this.f36203c.mo35674c("Storing file to path: %s", str);
        String str2 = this.f36205e;
        if (str2 != null) {
            this.f36201a.mo35671p(str2);
        }
        this.f36201a.mo35661f(str, tfVar.mo36543d(), true);
    }

    /* renamed from: d */
    public final long mo36169d() {
        return (System.currentTimeMillis() << 19) + (((long) this.f36204d.incrementAndGet()) % PlaybackStateCompat.f479U0);
    }

    /* renamed from: e */
    public C14754tf mo36170e(long j) {
        this.f36203c.mo35674c("Retrieving file content for id %d ", Long.valueOf(j));
        return C14754tf.m63594a(this.f36201a.mo35672q(this.f36205e + File.separator + j));
    }

    /* renamed from: f */
    public List<Long> mo36171f() {
        ArrayList arrayList = new ArrayList();
        String[] o = this.f36201a.mo35670o(this.f36205e);
        if (o == null) {
            this.f36203c.mo35681l("error while listing folder, returning an empty array.", new Object[0]);
        } else {
            for (String str : o) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str)));
                } catch (NumberFormatException e) {
                    this.f36203c.mo35678g(e, "Failed to parse the file name %s to Long", str);
                }
            }
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public C14621pd(C14451jd jdVar, String str, long j) {
        this.f36203c = new C14453jf("ReplayStorageManager");
        this.f36204d = new AtomicInteger(0);
        this.f36201a = jdVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("cs");
        sb.append(str2);
        sb.append("replay");
        this.f36205e = sb.toString();
        this.f36202b = j;
    }
}
