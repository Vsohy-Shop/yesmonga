package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.C0323b0;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42477p8;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33947j;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.i */
public class C33962i {

    /* renamed from: h */
    public static final C40777k f82442h = new C40777k("RemoteModelLoader", "");
    @C0323b0("RemoteModelLoader.class")

    /* renamed from: i */
    public static final Map<String, C33962i> f82443i = new HashMap();

    /* renamed from: a */
    public final C33947j f82444a;

    /* renamed from: b */
    public final C33920d f82445b;

    /* renamed from: c */
    public final C33959f f82446c;

    /* renamed from: d */
    public final C33960g f82447d;

    /* renamed from: e */
    public final C33963j f82448e;

    /* renamed from: f */
    public final C42477p8 f82449f;

    /* renamed from: g */
    public boolean f82450g = true;

    public C33962i(@C0359n0 C33947j jVar, @C0359n0 C33920d dVar, @C0359n0 ModelValidator modelValidator, @C0359n0 C33963j jVar2, @C0359n0 C33961h hVar) {
        C33960g gVar = new C33960g(jVar, dVar, modelValidator, new C33957d(jVar), hVar);
        this.f82447d = gVar;
        this.f82446c = C33959f.m136653g(jVar, dVar, new C33957d(jVar), gVar, (C33958e) jVar.mo98717a(C33958e.class));
        this.f82448e = jVar2;
        this.f82444a = jVar;
        this.f82445b = dVar;
        this.f82449f = C42324b9.m171414b("common");
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static synchronized C33962i m136688a(@RecentlyNonNull C33947j jVar, @RecentlyNonNull C33920d dVar, @RecentlyNonNull ModelValidator modelValidator, @RecentlyNonNull C33963j jVar2, @RecentlyNonNull C33961h hVar) {
        C33962i iVar;
        synchronized (C33962i.class) {
            String f = dVar.mo98683f();
            Map<String, C33962i> map = f82443i;
            if (!map.containsKey(f)) {
                map.put(f, new C33962i(jVar, dVar, modelValidator, jVar2, hVar));
            }
            iVar = map.get(f);
        }
        return iVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public C33920d mo98800b() {
        return this.f82445b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2 A[Catch:{ Exception -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e A[Catch:{ Exception -> 0x00ee }] */
    @androidx.annotation.C0348i1
    @androidx.annotation.RecentlyNullable
    @com.google.android.gms.common.annotation.C40473a
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.nio.MappedByteBuffer mo98801c() throws com.google.mlkit.common.MlKitException {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.common.internal.k r0 = f82442h     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "Try to load newly downloaded model file."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x0113 }
            boolean r1 = r10.f82450g     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r2 = r10.f82446c     // Catch:{ all -> 0x0113 }
            java.lang.Long r2 = r2.mo98778c()     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r3 = r10.f82446c     // Catch:{ all -> 0x0113 }
            java.lang.String r3 = r3.mo98779d()     // Catch:{ all -> 0x0113 }
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x00c3
            if (r3 != 0) goto L_0x0020
            goto L_0x00c3
        L_0x0020:
            com.google.mlkit.common.sdkinternal.model.f r6 = r10.f82446c     // Catch:{ all -> 0x0113 }
            java.lang.Integer r6 = r6.mo98780e()     // Catch:{ all -> 0x0113 }
            if (r6 != 0) goto L_0x002f
            com.google.mlkit.common.sdkinternal.model.f r1 = r10.f82446c     // Catch:{ all -> 0x0113 }
            r1.mo98784j()     // Catch:{ all -> 0x0113 }
            goto L_0x00cf
        L_0x002f:
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0113 }
            int r8 = r7.length()     // Catch:{ all -> 0x0113 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0113 }
            int r8 = r8 + 22
            r9.<init>(r8)     // Catch:{ all -> 0x0113 }
            java.lang.String r8 = "Download Status code: "
            r9.append(r8)     // Catch:{ all -> 0x0113 }
            r9.append(r7)     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = "RemoteModelLoader"
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0113 }
            r0.mo134430c(r7, r8)     // Catch:{ all -> 0x0113 }
            int r7 = r6.intValue()     // Catch:{ all -> 0x0113 }
            r8 = 8
            if (r7 != r8) goto L_0x00a4
            com.google.mlkit.common.sdkinternal.model.f r2 = r10.f82446c     // Catch:{ all -> 0x0113 }
            java.io.File r2 = r2.mo98788u(r3)     // Catch:{ all -> 0x0113 }
            if (r2 != 0) goto L_0x0060
            goto L_0x00cf
        L_0x0060:
            java.nio.MappedByteBuffer r6 = r10.mo98803e(r2)     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = r2.getParent()     // Catch:{ all -> 0x0113 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0113 }
            java.lang.String r8 = "Moved the downloaded model to private folder successfully: "
            int r9 = r7.length()     // Catch:{ all -> 0x0113 }
            if (r9 == 0) goto L_0x0079
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0113 }
            goto L_0x007e
        L_0x0079:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0113 }
            r7.<init>(r8)     // Catch:{ all -> 0x0113 }
        L_0x007e:
            java.lang.String r8 = "RemoteModelLoader"
            r0.mo134430c(r8, r7)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r7 = r10.f82446c     // Catch:{ all -> 0x0113 }
            r7.mo98786l(r3)     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x00d0
            com.google.mlkit.common.sdkinternal.model.g r1 = r10.f82447d     // Catch:{ all -> 0x0113 }
            boolean r1 = r1.mo98799f(r2)     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r3 = "All old models are deleted."
            r0.mo134430c(r1, r3)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.g r1 = r10.f82447d     // Catch:{ all -> 0x0113 }
            java.io.File r1 = r1.mo98796c(r2)     // Catch:{ all -> 0x0113 }
            java.nio.MappedByteBuffer r6 = r10.mo98803e(r1)     // Catch:{ all -> 0x0113 }
            goto L_0x00d0
        L_0x00a4:
            int r1 = r6.intValue()     // Catch:{ all -> 0x0113 }
            r3 = 16
            if (r1 != r3) goto L_0x00cf
            com.google.android.gms.internal.mlkit_common.p8 r1 = r10.f82449f     // Catch:{ all -> 0x0113 }
            com.google.android.gms.internal.mlkit_common.g8 r3 = com.google.android.gms.internal.mlkit_common.C42510s8.m171652g()     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.model.d r6 = r10.f82445b     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r7 = r10.f82446c     // Catch:{ all -> 0x0113 }
            int r2 = r7.mo98781f(r2)     // Catch:{ all -> 0x0113 }
            r1.mo137762d(r3, r6, r4, r2)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r1 = r10.f82446c     // Catch:{ all -> 0x0113 }
            r1.mo98784j()     // Catch:{ all -> 0x0113 }
            goto L_0x00cf
        L_0x00c3:
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "No new model is downloading."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.f r1 = r10.f82446c     // Catch:{ all -> 0x0113 }
            r1.mo98784j()     // Catch:{ all -> 0x0113 }
        L_0x00cf:
            r6 = r5
        L_0x00d0:
            if (r6 != 0) goto L_0x010e
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "Loading existing model file."
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.model.g r1 = r10.f82447d     // Catch:{ all -> 0x0113 }
            java.lang.String r1 = r1.mo98797d()     // Catch:{ all -> 0x0113 }
            if (r1 != 0) goto L_0x00e9
            java.lang.String r1 = "RemoteModelLoader"
            java.lang.String r2 = "No existing model file"
            r0.mo134430c(r1, r2)     // Catch:{ all -> 0x0113 }
            goto L_0x0111
        L_0x00e9:
            java.nio.MappedByteBuffer r5 = r10.mo98802d(r1)     // Catch:{ Exception -> 0x00ee }
            goto L_0x0111
        L_0x00ee:
            r0 = move-exception
            com.google.mlkit.common.sdkinternal.model.g r2 = r10.f82447d     // Catch:{ all -> 0x0113 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0113 }
            r3.<init>(r1)     // Catch:{ all -> 0x0113 }
            r2.mo98798e(r3)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.j r1 = r10.f82444a     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.sdkinternal.o r1 = com.google.mlkit.common.sdkinternal.C33970o.m136702g(r1)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.model.d r2 = r10.f82445b     // Catch:{ all -> 0x0113 }
            r1.mo98810c(r2)     // Catch:{ all -> 0x0113 }
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException     // Catch:{ all -> 0x0113 }
            java.lang.String r2 = "Failed to load an already downloaded model."
            r3 = 14
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x0113 }
            throw r1     // Catch:{ all -> 0x0113 }
        L_0x010e:
            r10.f82450g = r4     // Catch:{ all -> 0x0113 }
            r5 = r6
        L_0x0111:
            monitor-exit(r10)
            return r5
        L_0x0113:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33962i.mo98801c():java.nio.MappedByteBuffer");
    }

    @C0348i1
    @C0359n0
    /* renamed from: d */
    public final MappedByteBuffer mo98802d(@C0359n0 String str) throws MlKitException {
        return this.f82448e.mo98804a(str);
    }

    /* renamed from: e */
    public final MappedByteBuffer mo98803e(File file) throws MlKitException {
        try {
            return mo98802d(file.getAbsolutePath());
        } catch (Exception e) {
            this.f82447d.mo98798e(file);
            throw new MlKitException("Failed to load newly downloaded model.", 14, e);
        }
    }
}
