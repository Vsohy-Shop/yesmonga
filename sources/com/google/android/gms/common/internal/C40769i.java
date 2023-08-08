package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.C40713g;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40477a;
import com.google.android.gms.common.api.C40507i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C40546f;
import com.google.android.gms.common.api.internal.C40609q;
import com.google.android.gms.common.internal.C40747e;
import com.google.android.gms.common.util.C40974d0;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

@C40473a
/* renamed from: com.google.android.gms.common.internal.i */
public abstract class C40769i<T extends IInterface> extends C40747e<T> implements C40477a.C40489f, C40803q0 {
    @C0363p0

    /* renamed from: P */
    public static volatile Executor f103877P;

    /* renamed from: M */
    public final C40756f f103878M;

    /* renamed from: N */
    public final Set f103879N;
    @C0363p0

    /* renamed from: O */
    public final Account f103880O;

    @C40473a
    @C40974d0
    public C40769i(@C0359n0 Context context, @C0359n0 Handler handler, int i, @C0359n0 C40756f fVar) {
        super(context, handler, C40773j.m165914d(context), C40713g.m165640x(), i, (C40747e.C40748a) null, (C40747e.C40749b) null);
        this.f103878M = (C40756f) C40843u.m166202l(fVar);
        this.f103880O = fVar.mo134381b();
        this.f103879N = mo134413t0(fVar.mo134384e());
    }

    @C0363p0
    /* renamed from: C */
    public final Account mo134331C() {
        return this.f103880O;
    }

    @C0363p0
    /* renamed from: E */
    public final Executor mo134333E() {
        return null;
    }

    @C40473a
    @C0359n0
    /* renamed from: L */
    public final Set<Scope> mo134339L() {
        return this.f103879N;
    }

    @C40473a
    @C0359n0
    /* renamed from: j */
    public Feature[] mo133677j() {
        return new Feature[0];
    }

    @C40473a
    @C0359n0
    /* renamed from: o */
    public Set<Scope> mo133680o() {
        return mo87660m() ? this.f103879N : Collections.emptySet();
    }

    @C40473a
    @C0359n0
    /* renamed from: r0 */
    public final C40756f mo134411r0() {
        return this.f103878M;
    }

    @C40473a
    @C0359n0
    /* renamed from: s0 */
    public Set<Scope> mo134412s0(@C0359n0 Set<Scope> set) {
        return set;
    }

    /* renamed from: t0 */
    public final Set mo134413t0(@C0359n0 Set set) {
        Set<Scope> s0 = mo134412s0(set);
        for (Scope contains : s0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return s0;
    }

    @C40473a
    public C40769i(@C0359n0 Context context, @C0359n0 Looper looper, int i, @C0359n0 C40756f fVar) {
        this(context, looper, C40773j.m165914d(context), C40713g.m165640x(), i, fVar, (C40546f) null, (C40609q) null);
    }

    @C40473a
    @Deprecated
    public C40769i(@C0359n0 Context context, @C0359n0 Looper looper, int i, @C0359n0 C40756f fVar, @C0359n0 C40507i.C40509b bVar, @C0359n0 C40507i.C40510c cVar) {
        this(context, looper, i, fVar, (C40546f) bVar, (C40609q) cVar);
    }

    @C40473a
    public C40769i(@C0359n0 Context context, @C0359n0 Looper looper, int i, @C0359n0 C40756f fVar, @C0359n0 C40546f fVar2, @C0359n0 C40609q qVar) {
        this(context, looper, C40773j.m165914d(context), C40713g.m165640x(), i, fVar, (C40546f) C40843u.m166202l(fVar2), (C40609q) C40843u.m166202l(qVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.util.C40974d0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40769i(@androidx.annotation.C0359n0 android.content.Context r11, @androidx.annotation.C0359n0 android.os.Looper r12, @androidx.annotation.C0359n0 com.google.android.gms.common.internal.C40773j r13, @androidx.annotation.C0359n0 com.google.android.gms.common.C40713g r14, int r15, @androidx.annotation.C0359n0 com.google.android.gms.common.internal.C40756f r16, @androidx.annotation.C0363p0 com.google.android.gms.common.api.internal.C40546f r17, @androidx.annotation.C0363p0 com.google.android.gms.common.api.internal.C40609q r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.o0 r3 = new com.google.android.gms.common.internal.o0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.p0 r0 = new com.google.android.gms.common.internal.p0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo134392m()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f103878M = r0
            android.accounts.Account r1 = r16.mo134381b()
            r9.f103880O = r1
            java.util.Set r0 = r16.mo134384e()
            java.util.Set r0 = r10.mo134413t0(r0)
            r9.f103879N = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C40769i.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.j, com.google.android.gms.common.g, int, com.google.android.gms.common.internal.f, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.q):void");
    }
}
