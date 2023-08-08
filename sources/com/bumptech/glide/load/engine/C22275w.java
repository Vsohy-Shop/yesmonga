package com.bumptech.glide.load.engine;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.load.C22108c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.engine.C22216e;
import com.bumptech.glide.load.model.C22323n;
import java.io.IOException;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.w */
public class C22275w implements C22216e, C22216e.C22217a {

    /* renamed from: v */
    public static final String f57269v = "SourceGenerator";

    /* renamed from: a */
    public final C22231f<?> f57270a;

    /* renamed from: b */
    public final C22216e.C22217a f57271b;

    /* renamed from: c */
    public volatile int f57272c;

    /* renamed from: d */
    public volatile C22155b f57273d;

    /* renamed from: e */
    public volatile Object f57274e;

    /* renamed from: f */
    public volatile C22323n.C22324a<?> f57275f;

    /* renamed from: g */
    public volatile C22184c f57276g;

    /* renamed from: com.bumptech.glide.load.engine.w$a */
    public class C22276a implements C22114d.C22115a<Object> {

        /* renamed from: a */
        public final /* synthetic */ C22323n.C22324a f57277a;

        public C22276a(C22323n.C22324a aVar) {
            this.f57277a = aVar;
        }

        /* renamed from: c */
        public void mo65803c(@C0359n0 Exception exc) {
            if (C22275w.this.mo66228e(this.f57277a)) {
                C22275w.this.mo66230g(this.f57277a, exc);
            }
        }

        /* renamed from: f */
        public void mo65804f(@C0363p0 Object obj) {
            if (C22275w.this.mo66228e(this.f57277a)) {
                C22275w.this.mo66229f(this.f57277a, obj);
            }
        }
    }

    public C22275w(C22231f<?> fVar, C22216e.C22217a aVar) {
        this.f57270a = fVar;
        this.f57271b = aVar;
    }

    /* renamed from: a */
    public boolean mo65922a() {
        if (this.f57274e != null) {
            Object obj = this.f57274e;
            this.f57274e = null;
            try {
                if (!mo66226c(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f57273d != null && this.f57273d.mo65922a()) {
            return true;
        }
        this.f57273d = null;
        this.f57275f = null;
        boolean z = false;
        while (!z && mo66227d()) {
            List<C22323n.C22324a<?>> g = this.f57270a.mo66098g();
            int i = this.f57272c;
            this.f57272c = i + 1;
            this.f57275f = g.get(i);
            if (this.f57275f != null && (this.f57270a.mo66096e().mo66123c(this.f57275f.f57342c.mo65792d()) || this.f57270a.mo66112u(this.f57275f.f57342c.mo65784a()))) {
                mo66231h(this.f57275f);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo65857b(C22108c cVar, Exception exc, C22114d<?> dVar, DataSource dataSource) {
        this.f57271b.mo65857b(cVar, exc, dVar, this.f57275f.f57342c.mo65792d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66226c(java.lang.Object r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = com.bumptech.glide.util.C22628i.m102603b()
            r3 = 0
            com.bumptech.glide.load.engine.f<?> r4 = r11.f57270a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.data.e r4 = r4.mo66106o(r12)     // Catch:{ all -> 0x00cf }
            java.lang.Object r5 = r4.mo65777a()     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.f<?> r6 = r11.f57270a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.a r6 = r6.mo66108q(r5)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.d r7 = new com.bumptech.glide.load.engine.d     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.f<?> r8 = r11.f57270a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.f r8 = r8.mo66102k()     // Catch:{ all -> 0x00cf }
            r7.<init>(r6, r5, r8)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.c r5 = new com.bumptech.glide.load.engine.c     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.model.n$a<?> r8 = r11.f57275f     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.c r8 = r8.f57340a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.f<?> r9 = r11.f57270a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.c r9 = r9.mo66107p()     // Catch:{ all -> 0x00cf }
            r5.<init>(r8, r9)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.f<?> r8 = r11.f57270a     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.cache.a r8 = r8.mo66095d()     // Catch:{ all -> 0x00cf }
            r8.mo66022a(r5, r7)     // Catch:{ all -> 0x00cf }
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r0, r7)     // Catch:{ all -> 0x00cf }
            java.lang.String r9 = ", data: "
            if (r7 == 0) goto L_0x006a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r7.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = "Finished encoding source to cache, key: "
            r7.append(r10)     // Catch:{ all -> 0x00cf }
            r7.append(r5)     // Catch:{ all -> 0x00cf }
            r7.append(r9)     // Catch:{ all -> 0x00cf }
            r7.append(r12)     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = ", encoder: "
            r7.append(r10)     // Catch:{ all -> 0x00cf }
            r7.append(r6)     // Catch:{ all -> 0x00cf }
            java.lang.String r6 = ", duration: "
            r7.append(r6)     // Catch:{ all -> 0x00cf }
            double r1 = com.bumptech.glide.util.C22628i.m102602a(r1)     // Catch:{ all -> 0x00cf }
            r7.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x006a:
            java.io.File r1 = r8.mo66023b(r5)     // Catch:{ all -> 0x00cf }
            r2 = 1
            if (r1 == 0) goto L_0x008c
            r11.f57276g = r5     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.b r12 = new com.bumptech.glide.load.engine.b     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.c r0 = r0.f57340a     // Catch:{ all -> 0x00cf }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.f<?> r1 = r11.f57270a     // Catch:{ all -> 0x00cf }
            r12.<init>(r0, r1, r11)     // Catch:{ all -> 0x00cf }
            r11.f57273d = r12     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.model.n$a<?> r12 = r11.f57275f
            com.bumptech.glide.load.data.d<Data> r12 = r12.f57342c
            r12.mo65789b()
            return r2
        L_0x008c:
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Attempt to write: "
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            com.bumptech.glide.load.engine.c r1 = r11.f57276g     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            r0.append(r9)     // Catch:{ all -> 0x00cf }
            r0.append(r12)     // Catch:{ all -> 0x00cf }
            java.lang.String r12 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r0.append(r12)     // Catch:{ all -> 0x00cf }
        L_0x00ad:
            com.bumptech.glide.load.engine.e$a r12 = r11.f57271b     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.c r5 = r0.f57340a     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = r4.mo65777a()     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.data.d<Data> r7 = r0.f57342c     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f57342c     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.DataSource r8 = r0.mo65792d()     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.c r9 = r0.f57340a     // Catch:{ all -> 0x00cc }
            r4 = r12
            r4.mo65870r(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cc }
            return r3
        L_0x00cc:
            r12 = move-exception
            r3 = r2
            goto L_0x00d0
        L_0x00cf:
            r12 = move-exception
        L_0x00d0:
            if (r3 != 0) goto L_0x00d9
            com.bumptech.glide.load.model.n$a<?> r0 = r11.f57275f
            com.bumptech.glide.load.data.d<Data> r0 = r0.f57342c
            r0.mo65789b()
        L_0x00d9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C22275w.mo66226c(java.lang.Object):boolean");
    }

    public void cancel() {
        C22323n.C22324a<?> aVar = this.f57275f;
        if (aVar != null) {
            aVar.f57342c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo66227d() {
        return this.f57272c < this.f57270a.mo66098g().size();
    }

    /* renamed from: e */
    public boolean mo66228e(C22323n.C22324a<?> aVar) {
        C22323n.C22324a<?> aVar2 = this.f57275f;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: f */
    public void mo66229f(C22323n.C22324a<?> aVar, Object obj) {
        C22234h e = this.f57270a.mo66096e();
        if (obj == null || !e.mo66123c(aVar.f57342c.mo65792d())) {
            C22216e.C22217a aVar2 = this.f57271b;
            C22108c cVar = aVar.f57340a;
            C22114d<Data> dVar = aVar.f57342c;
            aVar2.mo65870r(cVar, obj, dVar, dVar.mo65792d(), this.f57276g);
            return;
        }
        this.f57274e = obj;
        this.f57271b.mo65869q();
    }

    /* renamed from: g */
    public void mo66230g(C22323n.C22324a<?> aVar, @C0359n0 Exception exc) {
        C22216e.C22217a aVar2 = this.f57271b;
        C22184c cVar = this.f57276g;
        C22114d<Data> dVar = aVar.f57342c;
        aVar2.mo65857b(cVar, exc, dVar, dVar.mo65792d());
    }

    /* renamed from: h */
    public final void mo66231h(C22323n.C22324a<?> aVar) {
        this.f57275f.f57342c.mo65793e(this.f57270a.mo66103l(), new C22276a(aVar));
    }

    /* renamed from: q */
    public void mo65869q() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: r */
    public void mo65870r(C22108c cVar, Object obj, C22114d<?> dVar, DataSource dataSource, C22108c cVar2) {
        this.f57271b.mo65870r(cVar, obj, dVar, this.f57275f.f57342c.mo65792d(), cVar);
    }
}
