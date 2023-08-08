package com.google.mlkit.common.sdkinternal.model;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42378g8;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.android.gms.internal.mlkit_common.C42510s8;
import com.google.android.gms.internal.mlkit_common.zzgy;
import com.google.android.gms.internal.mlkit_common.zzhe;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.C33916b;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33943h;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.C33949l;
import com.google.mlkit.common.sdkinternal.C33970o;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.f */
public class C33959f {

    /* renamed from: m */
    public static final C40777k f82420m = new C40777k("ModelDownloadManager", "");
    @C0323b0("RemoteModelDownloadManager.class")

    /* renamed from: n */
    public static final Map<C33920d, C33959f> f82421n = new HashMap();
    @C0323b0("this")

    /* renamed from: a */
    public final LongSparseArray<C33968o> f82422a = new LongSparseArray<>();
    @C0323b0("this")

    /* renamed from: b */
    public final LongSparseArray<C31049l<Void>> f82423b = new LongSparseArray<>();

    /* renamed from: c */
    public final C33947j f82424c;
    @C0363p0

    /* renamed from: d */
    public final DownloadManager f82425d;

    /* renamed from: e */
    public final C33920d f82426e;

    /* renamed from: f */
    public final ModelType f82427f;

    /* renamed from: g */
    public final C42477p8 f82428g;

    /* renamed from: h */
    public final C33970o f82429h;

    /* renamed from: i */
    public final C33957d f82430i;
    @C0363p0

    /* renamed from: j */
    public final C33958e f82431j;

    /* renamed from: k */
    public final C33960g f82432k;

    /* renamed from: l */
    public C33916b f82433l;

    @C0344h1
    public C33959f(@C0359n0 C33947j jVar, @C0359n0 C33920d dVar, @C0359n0 C33957d dVar2, @C0359n0 C33960g gVar, @C0363p0 C33958e eVar, @C0359n0 C42477p8 p8Var) {
        this.f82424c = jVar;
        this.f82427f = dVar.mo98681e();
        this.f82426e = dVar;
        DownloadManager downloadManager = (DownloadManager) jVar.mo98718b().getSystemService("download");
        this.f82425d = downloadManager;
        this.f82428g = p8Var;
        if (downloadManager == null) {
            f82420m.mo134430c("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.f82430i = dVar2;
        this.f82429h = C33970o.m136702g(jVar);
        this.f82431j = eVar;
        this.f82432k = gVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: g */
    public static synchronized C33959f m136653g(@RecentlyNonNull C33947j jVar, @RecentlyNonNull C33920d dVar, @RecentlyNonNull C33957d dVar2, @RecentlyNonNull C33960g gVar, @C0363p0 C33958e eVar) {
        C33959f fVar;
        synchronized (C33959f.class) {
            Map<C33920d, C33959f> map = f82421n;
            if (!map.containsKey(dVar)) {
                map.put(dVar, new C33959f(jVar, dVar, dVar2, gVar, eVar, C42324b9.m171414b("common")));
            }
            fVar = map.get(dVar);
        }
        return fVar;
    }

    @C0348i1
    @C0363p0
    /* renamed from: A */
    public final synchronized Long mo98775A(@C0359n0 C33949l lVar, @C0359n0 C33916b bVar) throws MlKitException {
        C40843u.m166203m(bVar, "DownloadConditions can not be null");
        String d = this.f82429h.mo98811d(this.f82426e);
        Integer e = mo98780e();
        if (d == null || !d.equals(lVar.mo98722a()) || e == null) {
            C40777k kVar = f82420m;
            kVar.mo134430c("ModelDownloadManager", "Need to download a new model.");
            mo98784j();
            DownloadManager.Request request = new DownloadManager.Request(lVar.mo98725d());
            if (this.f82430i.mo98770i(lVar.mo98723b(), lVar.mo98724c())) {
                kVar.mo134430c("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.f82428g.mo137763e(C42510s8.m171652g(), this.f82426e, zzgy.NO_ERROR, false, lVar.mo98724c(), zzhe.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(bVar.mo98657a());
            if (bVar.mo98658b()) {
                request.setAllowedNetworkTypes(2);
            }
            return mo98793z(request, lVar);
        }
        Integer e2 = mo98780e();
        if (e2 == null || !(e2.intValue() == 8 || e2.intValue() == 16)) {
            C42477p8 p8Var = this.f82428g;
            C42378g8 g = C42510s8.m171652g();
            C33920d dVar = this.f82426e;
            p8Var.mo137763e(g, dVar, zzgy.NO_ERROR, false, dVar.mo98681e(), zzhe.DOWNLOADING);
        }
        f82420m.mo134430c("ModelDownloadManager", "New model is already in downloading, do nothing.");
        return null;
    }

    @RecentlyNonNull
    @C0348i1
    @C40473a
    /* renamed from: a */
    public C31047k<Void> mo98776a() {
        MlKitException mlKitException;
        C33949l lVar;
        this.f82428g.mo137763e(C42510s8.m171652g(), this.f82426e, zzgy.NO_ERROR, false, ModelType.UNKNOWN, zzhe.EXPLICITLY_REQUESTED);
        Long l = null;
        try {
            lVar = mo98787s();
            mlKitException = null;
        } catch (MlKitException e) {
            mlKitException = e;
            lVar = null;
        }
        try {
            Integer e2 = mo98780e();
            Long c = mo98778c();
            if (!mo98783i()) {
                if (e2 == null || e2.intValue() != 8) {
                    if (e2 != null && e2.intValue() == 16) {
                        MlKitException x = mo98791x(c);
                        mo98784j();
                        return C31053n.m124524f(x);
                    } else if (e2 == null || (!(e2.intValue() == 4 || e2.intValue() == 2 || e2.intValue() == 1) || c == null || mo98779d() == null)) {
                        if (lVar != null) {
                            l = mo98775A(lVar, this.f82433l);
                        }
                        if (l == null) {
                            return C31053n.m124524f(new MlKitException("Failed to schedule the download task", 13, mlKitException));
                        }
                        return mo98789v(l.longValue());
                    } else {
                        C42477p8 p8Var = this.f82428g;
                        C42378g8 g = C42510s8.m171652g();
                        C33920d dVar = this.f82426e;
                        p8Var.mo137763e(g, dVar, zzgy.NO_ERROR, false, dVar.mo98681e(), zzhe.DOWNLOADING);
                        return mo98789v(c.longValue());
                    }
                }
            }
            if (lVar != null) {
                Long A = mo98775A(lVar, this.f82433l);
                if (A != null) {
                    return mo98789v(A.longValue());
                }
                f82420m.mo134435h("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return C31053n.m124525g(null);
        } catch (MlKitException e3) {
            return C31053n.m124524f(new MlKitException("Failed to ensure the model is downloaded.", 13, e3));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        f82420m.mo134432e("ModelDownloadManager", "Downloaded file is not found");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.RecentlyNullable
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.os.ParcelFileDescriptor mo98777b() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.mo98778c()     // Catch:{ all -> 0x0022 }
            android.app.DownloadManager r1 = r5.f82425d     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            long r3 = r0.longValue()     // Catch:{ FileNotFoundException -> 0x0015 }
            android.os.ParcelFileDescriptor r2 = r1.openDownloadedFile(r3)     // Catch:{ FileNotFoundException -> 0x0015 }
            goto L_0x001e
        L_0x0015:
            com.google.android.gms.common.internal.k r0 = f82420m     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r3 = "Downloaded file is not found"
            r0.mo134432e(r1, r3)     // Catch:{ all -> 0x0022 }
        L_0x001e:
            monitor-exit(r5)
            return r2
        L_0x0020:
            monitor-exit(r5)
            return r2
        L_0x0022:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33959f.mo98777b():android.os.ParcelFileDescriptor");
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: c */
    public synchronized Long mo98778c() {
        return this.f82429h.mo98812e(this.f82426e);
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: d */
    public synchronized String mo98779d() {
        return this.f82429h.mo98811d(this.f82426e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[SYNTHETIC, Splitter:B:20:0x0048] */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.RecentlyNullable
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Integer mo98780e() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Long r0 = r8.mo98778c()     // Catch:{ all -> 0x007e }
            android.app.DownloadManager r1 = r8.f82425d     // Catch:{ all -> 0x007e }
            r2 = 0
            if (r1 == 0) goto L_0x007c
            if (r0 != 0) goto L_0x000e
            goto L_0x007c
        L_0x000e:
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            r4 = 1
            long[] r5 = new long[r4]     // Catch:{ all -> 0x007e }
            long r6 = r0.longValue()     // Catch:{ all -> 0x007e }
            r0 = 0
            r5[r0] = r6     // Catch:{ all -> 0x007e }
            android.app.DownloadManager$Query r0 = r3.setFilterById(r5)     // Catch:{ all -> 0x007e }
            android.database.Cursor r0 = r1.query(r0)     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x003e
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ all -> 0x003c }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r1 = move-exception
            goto L_0x0073
        L_0x003e:
            r1 = r2
        L_0x003f:
            if (r1 != 0) goto L_0x0048
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ all -> 0x007e }
        L_0x0046:
            monitor-exit(r8)
            return r2
        L_0x0048:
            int r3 = r1.intValue()     // Catch:{ all -> 0x003c }
            r5 = 2
            if (r3 == r5) goto L_0x006d
            int r3 = r1.intValue()     // Catch:{ all -> 0x003c }
            r5 = 4
            if (r3 == r5) goto L_0x006d
            int r3 = r1.intValue()     // Catch:{ all -> 0x003c }
            if (r3 == r4) goto L_0x006d
            int r3 = r1.intValue()     // Catch:{ all -> 0x003c }
            r4 = 8
            if (r3 == r4) goto L_0x006d
            int r3 = r1.intValue()     // Catch:{ all -> 0x003c }
            r4 = 16
            if (r3 == r4) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r2 = r1
        L_0x006e:
            r0.close()     // Catch:{ all -> 0x007e }
            monitor-exit(r8)
            return r2
        L_0x0073:
            r0.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x007e }
        L_0x007b:
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r8)
            return r2
        L_0x007e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33959f.mo98780e():java.lang.Integer");
    }

    @C40473a
    /* renamed from: f */
    public int mo98781f(@RecentlyNonNull Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.f82425d;
        Cursor cursor = null;
        if (!(downloadManager == null || l == null)) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    @C0348i1
    @C40473a
    /* renamed from: h */
    public boolean mo98782h() throws MlKitException {
        try {
            if (mo98783i()) {
                return true;
            }
        } catch (MlKitException unused) {
            f82420m.mo134430c("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long c = mo98778c();
        String d = mo98779d();
        if (c == null || d == null) {
            f82420m.mo134430c("ModelDownloadManager", "No new model is downloading.");
            mo98784j();
            return false;
        }
        Integer e = mo98780e();
        C40777k kVar = f82420m;
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Download Status code: ");
        sb.append(valueOf);
        kVar.mo134430c("ModelDownloadManager", sb.toString());
        if (e == null) {
            mo98784j();
            return false;
        } else if (!C40808s.m166010b(e, 8) || mo98788u(d) == null) {
            return false;
        } else {
            return true;
        }
    }

    @C40473a
    /* renamed from: i */
    public boolean mo98783i() throws MlKitException {
        return this.f82430i.mo98770i(this.f82426e.mo98683f(), this.f82427f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo98784j() throws com.google.mlkit.common.MlKitException {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.mo98778c()     // Catch:{ all -> 0x0065 }
            android.app.DownloadManager r1 = r5.f82425d     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0063
            if (r0 != 0) goto L_0x000c
            goto L_0x0063
        L_0x000c:
            com.google.android.gms.common.internal.k r1 = f82420m     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0065 }
            int r3 = r2.length()     // Catch:{ all -> 0x0065 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            int r3 = r3 + 44
            r4.<init>(r3)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "Cancel or remove existing downloading task: "
            r4.append(r3)     // Catch:{ all -> 0x0065 }
            r4.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0065 }
            r1.mo134430c(r2, r3)     // Catch:{ all -> 0x0065 }
            android.app.DownloadManager r1 = r5.f82425d     // Catch:{ all -> 0x0065 }
            r2 = 1
            long[] r2 = new long[r2]     // Catch:{ all -> 0x0065 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0065 }
            r0 = 0
            r2[r0] = r3     // Catch:{ all -> 0x0065 }
            int r0 = r1.remove(r2)     // Catch:{ all -> 0x0065 }
            if (r0 > 0) goto L_0x0049
            java.lang.Integer r0 = r5.mo98780e()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            monitor-exit(r5)
            return
        L_0x0049:
            com.google.mlkit.common.sdkinternal.model.d r0 = r5.f82430i     // Catch:{ all -> 0x0065 }
            com.google.mlkit.common.model.d r1 = r5.f82426e     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r1.mo98683f()     // Catch:{ all -> 0x0065 }
            com.google.mlkit.common.model.d r2 = r5.f82426e     // Catch:{ all -> 0x0065 }
            com.google.mlkit.common.sdkinternal.ModelType r2 = r2.mo98681e()     // Catch:{ all -> 0x0065 }
            r0.mo98764c(r1, r2)     // Catch:{ all -> 0x0065 }
            com.google.mlkit.common.sdkinternal.o r0 = r5.f82429h     // Catch:{ all -> 0x0065 }
            com.google.mlkit.common.model.d r1 = r5.f82426e     // Catch:{ all -> 0x0065 }
            r0.mo98808a(r1)     // Catch:{ all -> 0x0065 }
            monitor-exit(r5)
            return
        L_0x0063:
            monitor-exit(r5)
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33959f.mo98784j():void");
    }

    @C40473a
    /* renamed from: k */
    public void mo98785k(@RecentlyNonNull C33916b bVar) {
        C40843u.m166203m(bVar, "DownloadConditions can not be null");
        this.f82433l = bVar;
    }

    @C40473a
    /* renamed from: l */
    public synchronized void mo98786l(@RecentlyNonNull String str) throws MlKitException {
        this.f82429h.mo98821o(this.f82426e, str);
        mo98784j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        return r1;
     */
    @androidx.annotation.C0348i1
    @androidx.annotation.C0363p0
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.mlkit.common.sdkinternal.C33949l mo98787s() throws com.google.mlkit.common.MlKitException {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.mo98783i()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x001b
            com.google.android.gms.internal.mlkit_common.p8 r1 = r9.f82428g     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.mlkit_common.g8 r2 = com.google.android.gms.internal.mlkit_common.C42510s8.m171652g()     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.model.d r3 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.mlkit_common.zzgy r4 = com.google.android.gms.internal.mlkit_common.zzgy.NO_ERROR     // Catch:{ all -> 0x00c8 }
            r5 = 0
            com.google.mlkit.common.sdkinternal.ModelType r6 = r3.mo98681e()     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.mlkit_common.zzhe r7 = com.google.android.gms.internal.mlkit_common.zzhe.LIVE     // Catch:{ all -> 0x00c8 }
            r1.mo137763e(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c8 }
        L_0x001b:
            com.google.mlkit.common.sdkinternal.model.e r1 = r9.f82431j     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00be
            com.google.mlkit.common.model.d r2 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.sdkinternal.l r1 = r1.mo98774a(r2)     // Catch:{ all -> 0x00c8 }
            r2 = 0
            if (r1 != 0) goto L_0x002a
            monitor-exit(r9)
            return r2
        L_0x002a:
            com.google.mlkit.common.sdkinternal.j r3 = r9.f82424c     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.model.d r4 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            java.lang.String r5 = r1.mo98722a()     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.sdkinternal.o r6 = com.google.mlkit.common.sdkinternal.C33970o.m136702g(r3)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r6.mo98813f(r4)     // Catch:{ all -> 0x00c8 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x00c8 }
            r5 = 0
            r7 = 1
            if (r4 == 0) goto L_0x005f
            android.content.Context r3 = r3.mo98718b()     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = com.google.mlkit.common.sdkinternal.C33933c.m136569a(r3)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r6.mo98818l()     // Catch:{ all -> 0x00c8 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x005f
            com.google.android.gms.common.internal.k r3 = f82420m     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = "ModelDownloadManager"
            java.lang.String r6 = "The model is incompatible with TFLite and the app is not upgraded, do not download"
            r3.mo134432e(r4, r6)     // Catch:{ all -> 0x00c8 }
            r3 = r5
            goto L_0x0060
        L_0x005f:
            r3 = r7
        L_0x0060:
            if (r0 != 0) goto L_0x0069
            com.google.mlkit.common.sdkinternal.o r4 = r9.f82429h     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.model.d r6 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            r4.mo98810c(r6)     // Catch:{ all -> 0x00c8 }
        L_0x0069:
            com.google.mlkit.common.sdkinternal.j r4 = r9.f82424c     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.model.d r6 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            java.lang.String r8 = r1.mo98722a()     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.sdkinternal.o r4 = com.google.mlkit.common.sdkinternal.C33970o.m136702g(r4)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r4.mo98814h(r6)     // Catch:{ all -> 0x00c8 }
            boolean r4 = r8.equals(r4)     // Catch:{ all -> 0x00c8 }
            r4 = r4 ^ r7
            if (r3 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0085
            if (r4 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            monitor-exit(r9)
            return r1
        L_0x0087:
            r5 = r4
        L_0x0088:
            if (r0 == 0) goto L_0x0090
            r0 = r5 ^ r3
            if (r0 == 0) goto L_0x0090
            monitor-exit(r9)
            return r2
        L_0x0090:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x00c8 }
            com.google.mlkit.common.model.d r1 = r9.f82426e     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = r1.mo98679c()     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c8 }
            int r2 = r2.length()     // Catch:{ all -> 0x00c8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            int r2 = r2 + 46
            r3.<init>(r2)     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "The model "
            r3.append(r2)     // Catch:{ all -> 0x00c8 }
            r3.append(r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = " is incompatible with TFLite runtime"
            r3.append(r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00c8 }
            r2 = 100
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00be:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase."
            r2 = 14
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33959f.mo98787s():com.google.mlkit.common.sdkinternal.l");
    }

    @RecentlyNullable
    /* renamed from: u */
    public final File mo98788u(@RecentlyNonNull String str) throws MlKitException {
        C40777k kVar = f82420m;
        kVar.mo134430c("ModelDownloadManager", "Model downloaded successfully");
        this.f82428g.mo137763e(C42510s8.m171652g(), this.f82426e, zzgy.NO_ERROR, true, this.f82427f, zzhe.SUCCEEDED);
        ParcelFileDescriptor b = mo98777b();
        if (b == null) {
            mo98784j();
            return null;
        }
        kVar.mo134430c("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.f82432k.mo98795b(b, str, this.f82426e);
        } finally {
            mo98784j();
        }
    }

    /* renamed from: v */
    public final C31047k<Void> mo98789v(long j) {
        this.f82424c.mo98718b().registerReceiver(mo98792y(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), (String) null, C33943h.m136576b().mo98711a());
        return mo98790w(j).mo87741a();
    }

    /* renamed from: w */
    public final synchronized C31049l<Void> mo98790w(long j) {
        C31049l<Void> lVar = this.f82423b.get(j);
        if (lVar != null) {
            return lVar;
        }
        C31049l<Void> lVar2 = new C31049l<>();
        this.f82423b.put(j, lVar2);
        return lVar2;
    }

    /* renamed from: x */
    public final MlKitException mo98791x(@C0363p0 Long l) {
        DownloadManager downloadManager = this.f82425d;
        Cursor cursor = null;
        if (!(downloadManager == null || l == null)) {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        int i = 13;
        String str = "Model downloading failed";
        if (cursor != null && cursor.moveToFirst()) {
            int i2 = cursor.getInt(cursor.getColumnIndex("reason"));
            if (i2 == 1006) {
                str = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                StringBuilder sb = new StringBuilder(84);
                sb.append("Model downloading failed due to error code: ");
                sb.append(i2);
                sb.append(" from Android DownloadManager");
                str = sb.toString();
            }
        }
        return new MlKitException(str, i);
    }

    /* renamed from: y */
    public final synchronized C33968o mo98792y(long j) {
        C33968o oVar = this.f82422a.get(j);
        if (oVar != null) {
            return oVar;
        }
        C33968o oVar2 = new C33968o(this, j, mo98790w(j), (C33967n) null);
        this.f82422a.put(j, oVar2);
        return oVar2;
    }

    @C0363p0
    /* renamed from: z */
    public final synchronized Long mo98793z(@C0359n0 DownloadManager.Request request, @C0359n0 C33949l lVar) {
        DownloadManager downloadManager = this.f82425d;
        if (downloadManager == null) {
            return null;
        }
        long enqueue = downloadManager.enqueue(request);
        C40777k kVar = f82420m;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Schedule a new downloading task: ");
        sb.append(enqueue);
        kVar.mo134430c("ModelDownloadManager", sb.toString());
        this.f82429h.mo98819m(enqueue, lVar);
        this.f82428g.mo137763e(C42510s8.m171652g(), this.f82426e, zzgy.NO_ERROR, false, lVar.mo98724c(), zzhe.SCHEDULED);
        return Long.valueOf(enqueue);
    }
}
