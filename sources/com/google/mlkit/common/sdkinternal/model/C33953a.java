package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.C33907d;
import com.google.mlkit.common.model.C33914a;
import com.google.mlkit.common.model.C33918c;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33935d;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.C33970o;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.a */
public class C33953a {

    /* renamed from: h */
    public static final C40777k f82398h = new C40777k("CustomModelLoader", "");
    @C0323b0("CustomModelLoader.class")

    /* renamed from: i */
    public static final Map<String, C33953a> f82399i = new HashMap();

    /* renamed from: a */
    public final C33947j f82400a;
    @C0363p0

    /* renamed from: b */
    public final C33918c f82401b;
    @C0363p0

    /* renamed from: c */
    public final C33914a f82402c;
    @C0363p0

    /* renamed from: d */
    public final C33959f f82403d;
    @C0363p0

    /* renamed from: e */
    public final C33960g f82404e;

    /* renamed from: f */
    public final C42477p8 f82405f;

    /* renamed from: g */
    public boolean f82406g;

    @C40473a
    /* renamed from: com.google.mlkit.common.sdkinternal.model.a$a */
    public interface C33954a {
        @C40473a
        /* renamed from: a */
        boolean mo98752a(@RecentlyNonNull C33918c cVar) throws MlKitException;

        @C40473a
        /* renamed from: b */
        void mo98753b() throws MlKitException;
    }

    public C33953a(@C0359n0 C33947j jVar, @C0363p0 C33918c cVar, @C0363p0 C33914a aVar) {
        if (aVar != null) {
            C33960g gVar = new C33960g(jVar, aVar, (ModelValidator) null, new C33957d(jVar), new C33907d(jVar, aVar.mo98683f()));
            this.f82404e = gVar;
            this.f82403d = C33959f.m136653g(jVar, aVar, new C33957d(jVar), gVar, (C33958e) jVar.mo98717a(C33958e.class));
            this.f82406g = true;
        } else {
            this.f82404e = null;
            this.f82403d = null;
        }
        this.f82400a = jVar;
        this.f82401b = cVar;
        this.f82402c = aVar;
        this.f82405f = C42324b9.m171414b("common");
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: e */
    public static synchronized C33953a m136618e(@RecentlyNonNull C33947j jVar, @C0363p0 C33918c cVar, @C0363p0 C33914a aVar) {
        String str;
        C33953a aVar2;
        synchronized (C33953a.class) {
            if (aVar == null) {
                str = ((C33918c) C40843u.m166202l(cVar)).toString();
            } else {
                str = aVar.mo98683f();
            }
            Map<String, C33953a> map = f82399i;
            if (!map.containsKey(str)) {
                map.put(str, new C33953a(jVar, cVar, aVar));
            }
            aVar2 = map.get(str);
        }
        return aVar2;
    }

    @C0348i1
    /* renamed from: i */
    public static final C33918c m136619i(File file) {
        if (file.isDirectory()) {
            C33918c.C33919a aVar = new C33918c.C33919a();
            aVar.mo98673c(new File(file.getAbsolutePath(), C33935d.f82353c).toString());
            return aVar.mo98671a();
        }
        C33918c.C33919a aVar2 = new C33918c.C33919a();
        aVar2.mo98672b(file.getAbsolutePath());
        return aVar2.mo98671a();
    }

    @C0348i1
    @C0344h1
    @RecentlyNullable
    @C40473a
    /* renamed from: a */
    public synchronized C33918c mo98745a() throws MlKitException {
        f82398h.mo134430c("CustomModelLoader", "Try to get the latest existing model file.");
        File g = mo98750g();
        if (g == null) {
            return null;
        }
        return m136619i(g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b9 A[SYNTHETIC, Splitter:B:27:0x00b9] */
    @androidx.annotation.C0348i1
    @androidx.annotation.C0344h1
    @androidx.annotation.RecentlyNullable
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.mlkit.common.model.C33918c mo98746b() throws com.google.mlkit.common.MlKitException {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.common.internal.k r0 = f82398h     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "Try to get newly downloaded model file."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.sdkinternal.model.f r1 = r8.f82403d     // Catch:{ all -> 0x00bf }
            java.lang.Object r1 = com.google.android.gms.common.internal.C40843u.m166202l(r1)     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.sdkinternal.model.f r1 = (com.google.mlkit.common.sdkinternal.model.C33959f) r1     // Catch:{ all -> 0x00bf }
            java.lang.Long r1 = r1.mo98778c()     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.sdkinternal.model.f r2 = r8.f82403d     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = r2.mo98779d()     // Catch:{ all -> 0x00bf }
            r3 = 0
            if (r1 == 0) goto L_0x00aa
            if (r2 != 0) goto L_0x0023
            goto L_0x00aa
        L_0x0023:
            com.google.mlkit.common.sdkinternal.model.f r4 = r8.f82403d     // Catch:{ all -> 0x00bf }
            java.lang.Integer r4 = r4.mo98780e()     // Catch:{ all -> 0x00bf }
            if (r4 != 0) goto L_0x0030
            r8.mo98751h()     // Catch:{ all -> 0x00bf }
            goto L_0x00b4
        L_0x0030:
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00bf }
            int r6 = r5.length()     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            int r6 = r6 + 22
            r7.<init>(r6)     // Catch:{ all -> 0x00bf }
            java.lang.String r6 = "Download Status code: "
            r7.append(r6)     // Catch:{ all -> 0x00bf }
            r7.append(r5)     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "CustomModelLoader"
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00bf }
            r0.mo134430c(r5, r6)     // Catch:{ all -> 0x00bf }
            int r5 = r4.intValue()     // Catch:{ all -> 0x00bf }
            r6 = 8
            if (r5 != r6) goto L_0x0086
            com.google.mlkit.common.sdkinternal.model.f r1 = r8.f82403d     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r1.mo98788u(r2)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0061
            goto L_0x00b4
        L_0x0061:
            java.lang.String r4 = r1.getParent()     // Catch:{ all -> 0x00bf }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00bf }
            java.lang.String r5 = "Moved the downloaded model to private folder successfully: "
            int r6 = r4.length()     // Catch:{ all -> 0x00bf }
            if (r6 == 0) goto L_0x0076
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x00bf }
            goto L_0x007b
        L_0x0076:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00bf }
            r4.<init>(r5)     // Catch:{ all -> 0x00bf }
        L_0x007b:
            java.lang.String r5 = "CustomModelLoader"
            r0.mo134430c(r5, r4)     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.sdkinternal.model.f r0 = r8.f82403d     // Catch:{ all -> 0x00bf }
            r0.mo98786l(r2)     // Catch:{ all -> 0x00bf }
            goto L_0x00b5
        L_0x0086:
            int r0 = r4.intValue()     // Catch:{ all -> 0x00bf }
            r2 = 16
            if (r0 != r2) goto L_0x00b4
            com.google.android.gms.internal.mlkit_common.p8 r0 = r8.f82405f     // Catch:{ all -> 0x00bf }
            com.google.android.gms.internal.mlkit_common.g8 r2 = com.google.android.gms.internal.mlkit_common.C42510s8.m171652g()     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.model.a r4 = r8.f82402c     // Catch:{ all -> 0x00bf }
            java.lang.Object r4 = com.google.android.gms.common.internal.C40843u.m166202l(r4)     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.model.d r4 = (com.google.mlkit.common.model.C33920d) r4     // Catch:{ all -> 0x00bf }
            com.google.mlkit.common.sdkinternal.model.f r5 = r8.f82403d     // Catch:{ all -> 0x00bf }
            int r1 = r5.mo98781f(r1)     // Catch:{ all -> 0x00bf }
            r5 = 0
            r0.mo137762d(r2, r4, r5, r1)     // Catch:{ all -> 0x00bf }
            r8.mo98751h()     // Catch:{ all -> 0x00bf }
            goto L_0x00b4
        L_0x00aa:
            java.lang.String r1 = "CustomModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x00bf }
            r8.mo98751h()     // Catch:{ all -> 0x00bf }
        L_0x00b4:
            r1 = r3
        L_0x00b5:
            if (r1 != 0) goto L_0x00b9
            monitor-exit(r8)
            return r3
        L_0x00b9:
            com.google.mlkit.common.model.c r0 = m136619i(r1)     // Catch:{ all -> 0x00bf }
            monitor-exit(r8)
            return r0
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33953a.mo98746b():com.google.mlkit.common.model.c");
    }

    @C0348i1
    @C0344h1
    @C40473a
    /* renamed from: c */
    public void mo98747c() throws MlKitException {
        File g = mo98750g();
        if (g != null) {
            ((C33960g) C40843u.m166202l(this.f82404e)).mo98798e(g);
            C33970o.m136702g(this.f82400a).mo98810c((C33920d) C40843u.m166202l(this.f82402c));
        }
    }

    @C0348i1
    @C0344h1
    @C40473a
    /* renamed from: d */
    public void mo98748d(@RecentlyNonNull C33918c cVar) throws MlKitException {
        File parentFile = new File((String) C40843u.m166202l(cVar.mo98664a())).getParentFile();
        if (((C33960g) C40843u.m166202l(this.f82404e)).mo98799f((File) C40843u.m166202l(parentFile))) {
            f82398h.mo134430c("CustomModelLoader", "All old models are deleted.");
            this.f82404e.mo98796c(parentFile);
            return;
        }
        f82398h.mo134432e("CustomModelLoader", "Failed to delete old models");
    }

    @C0348i1
    @C40473a
    /* renamed from: f */
    public synchronized void mo98749f(@RecentlyNonNull C33954a aVar) throws MlKitException {
        C33918c cVar;
        C33918c cVar2 = this.f82401b;
        if (cVar2 == null) {
            cVar2 = mo98746b();
        }
        if (cVar2 == null) {
            cVar2 = mo98745a();
        }
        if (cVar != null) {
            while (!aVar.mo98752a(cVar)) {
                if (this.f82402c != null) {
                    mo98747c();
                    cVar = mo98745a();
                    continue;
                } else {
                    cVar = null;
                    continue;
                }
                if (cVar == null) {
                    aVar.mo98753b();
                    return;
                }
            }
            if (this.f82402c != null && this.f82406g) {
                mo98748d((C33918c) C40843u.m166202l(cVar));
                this.f82406g = false;
            }
            aVar.mo98753b();
            return;
        }
        throw new MlKitException("Model is not available.", 14);
    }

    @C0348i1
    @C0363p0
    /* renamed from: g */
    public final File mo98750g() throws MlKitException {
        String d = ((C33960g) C40843u.m166202l(this.f82404e)).mo98797d();
        if (d == null) {
            f82398h.mo134430c("CustomModelLoader", "No existing model file");
            return null;
        }
        File file = new File(d);
        File[] listFiles = file.listFiles();
        if (((File[]) C40843u.m166202l(listFiles)).length == 1) {
            return listFiles[0];
        }
        return file;
    }

    @C0348i1
    /* renamed from: h */
    public final void mo98751h() throws MlKitException {
        ((C33959f) C40843u.m166202l(this.f82403d)).mo98784j();
    }
}
