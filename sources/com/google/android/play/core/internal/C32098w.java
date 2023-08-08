package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitcompat.C32133a;
import com.google.android.play.core.splitcompat.C32137e;
import com.google.android.play.core.splitcompat.C32150r;
import com.google.android.play.core.splitinstall.C32174i0;
import com.google.android.play.core.splitinstall.C32178k0;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.internal.w */
public final class C32098w implements C32178k0 {

    /* renamed from: a */
    public final Context f78307a;

    /* renamed from: b */
    public final C32137e f78308b;

    /* renamed from: c */
    public final C32104y f78309c;

    /* renamed from: d */
    public final Executor f78310d;

    /* renamed from: e */
    public final C32150r f78311e;

    public C32098w(Context context, Executor executor, C32104y yVar, C32137e eVar, C32150r rVar) {
        this.f78307a = context;
        this.f78308b = eVar;
        this.f78309c = yVar;
        this.f78310d = executor;
        this.f78311e = rVar;
    }

    /* renamed from: c */
    public static /* synthetic */ void m129970c(C32098w wVar, C32174i0 i0Var) {
        try {
            if (!C32133a.m130052a(C32150r.m130103c(wVar.f78307a))) {
                i0Var.mo92976b(-12);
            } else {
                i0Var.mo92974a();
            }
        } catch (Exception unused) {
            i0Var.mo92976b(-12);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m129971d(C32098w wVar, List list, C32174i0 i0Var) {
        Integer e = wVar.mo92839e(list);
        if (e != null) {
            if (e.intValue() == 0) {
                i0Var.mo92975b();
            } else {
                i0Var.mo92976b(e.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo92838a(List<Intent> list, C32174i0 i0Var) {
        if (C32133a.m130053b()) {
            this.f78310d.execute(new C32095v(this, list, i0Var));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.support.annotation.Nullable
    @com.google.android.play.core.splitinstall.model.C32183a
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer mo92839e(java.util.List<android.content.Intent> r12) {
        /*
            r11 = this;
            r0 = -13
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00fe }
            com.google.android.play.core.splitcompat.e r2 = r11.f78308b     // Catch:{ Exception -> 0x00fe }
            java.io.File r2 = r2.mo92891f()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r3 = "rw"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00fe }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ Exception -> 0x00fe }
            r2 = 0
            java.nio.channels.FileLock r3 = r1.tryLock()     // Catch:{ OverlappingFileLockException -> 0x001c }
            goto L_0x001d
        L_0x0019:
            r12 = move-exception
            goto L_0x00ed
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x00f8
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00e4 }
        L_0x0023:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x00e4 }
            r4 = 0
            if (r2 == 0) goto L_0x00a8
            java.lang.Object r2 = r12.next()     // Catch:{ Exception -> 0x00e4 }
            android.content.Intent r2 = (android.content.Intent) r2     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r5 = "split_id"
            java.lang.String r5 = r2.getStringExtra(r5)     // Catch:{ Exception -> 0x00e4 }
            android.content.Context r6 = r11.f78307a     // Catch:{ Exception -> 0x00e4 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x00e4 }
            android.net.Uri r2 = r2.getData()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r7 = "r"
            android.content.res.AssetFileDescriptor r2 = r6.openAssetFileDescriptor(r2, r7)     // Catch:{ Exception -> 0x00e4 }
            com.google.android.play.core.splitcompat.e r6 = r11.f78308b     // Catch:{ Exception -> 0x00e4 }
            java.io.File r6 = r6.mo92887b(r5)     // Catch:{ Exception -> 0x00e4 }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r7 == 0) goto L_0x005f
            long r7 = r6.length()     // Catch:{ Exception -> 0x00e4 }
            long r9 = r2.getLength()     // Catch:{ Exception -> 0x00e4 }
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r7 != 0) goto L_0x0023
        L_0x0065:
            com.google.android.play.core.splitcompat.e r7 = r11.f78308b     // Catch:{ Exception -> 0x00e4 }
            java.io.File r5 = r7.mo92888c(r5)     // Catch:{ Exception -> 0x00e4 }
            boolean r5 = r5.exists()     // Catch:{ Exception -> 0x00e4 }
            if (r5 != 0) goto L_0x0023
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e4 }
            java.io.FileInputStream r2 = r2.createInputStream()     // Catch:{ Exception -> 0x00e4 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x00e4 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x009e }
            r2.<init>(r6)     // Catch:{ all -> 0x009e }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0094 }
        L_0x0083:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x0094 }
            if (r7 <= 0) goto L_0x008d
            r2.write(r6, r4, r7)     // Catch:{ all -> 0x0094 }
            goto L_0x0083
        L_0x008d:
            r2.close()     // Catch:{ all -> 0x009e }
            r5.close()     // Catch:{ Exception -> 0x00e4 }
            goto L_0x0023
        L_0x0094:
            r12 = move-exception
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r2 = move-exception
            com.google.android.play.core.internal.C32029a1.m129765a(r12, r2)     // Catch:{ all -> 0x009e }
        L_0x009d:
            throw r12     // Catch:{ all -> 0x009e }
        L_0x009e:
            r12 = move-exception
            r5.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r2 = move-exception
            com.google.android.play.core.internal.C32029a1.m129765a(r12, r2)     // Catch:{ Exception -> 0x00e4 }
        L_0x00a7:
            throw r12     // Catch:{ Exception -> 0x00e4 }
        L_0x00a8:
            com.google.android.play.core.splitcompat.e r12 = r11.f78308b     // Catch:{  }
            java.io.File r12 = r12.mo92892g()     // Catch:{  }
            java.io.File[] r12 = r12.listFiles()     // Catch:{  }
            r2 = -11
            com.google.android.play.core.internal.y r5 = r11.f78309c     // Catch:{ Exception -> 0x00e2 }
            boolean r5 = r5.mo92843a(r12)     // Catch:{ Exception -> 0x00e2 }
            if (r5 == 0) goto L_0x00e2
            com.google.android.play.core.internal.y r5 = r11.f78309c     // Catch:{ Exception -> 0x00e2 }
            boolean r12 = r5.mo92844b(r12)     // Catch:{ Exception -> 0x00e2 }
            if (r12 == 0) goto L_0x00e2
            com.google.android.play.core.splitcompat.e r12 = r11.f78308b     // Catch:{  }
            java.io.File r12 = r12.mo92892g()     // Catch:{  }
            java.io.File[] r12 = r12.listFiles()     // Catch:{  }
            java.util.Arrays.sort(r12)     // Catch:{  }
            int r2 = r12.length     // Catch:{  }
        L_0x00d2:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00e5
            r5 = r12[r2]     // Catch:{  }
            com.google.android.play.core.splitcompat.e r6 = r11.f78308b     // Catch:{  }
            java.io.File r6 = r6.mo92889d(r5)     // Catch:{  }
            r5.renameTo(r6)     // Catch:{  }
            goto L_0x00d2
        L_0x00e2:
            r4 = r2
            goto L_0x00e5
        L_0x00e4:
            r4 = r0
        L_0x00e5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0019 }
            r3.release()     // Catch:{ all -> 0x0019 }
            goto L_0x00f8
        L_0x00ed:
            if (r1 == 0) goto L_0x00f7
            r1.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r1 = move-exception
            com.google.android.play.core.internal.C32029a1.m129765a(r12, r1)     // Catch:{ Exception -> 0x00fe }
        L_0x00f7:
            throw r12     // Catch:{ Exception -> 0x00fe }
        L_0x00f8:
            if (r1 == 0) goto L_0x00fd
            r1.close()     // Catch:{ Exception -> 0x00fe }
        L_0x00fd:
            return r2
        L_0x00fe:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C32098w.mo92839e(java.util.List):java.lang.Integer");
    }
}
