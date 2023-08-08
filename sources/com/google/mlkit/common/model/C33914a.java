package com.google.mlkit.common.model;

import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.mlkit.common.model.a */
public final class C33914a extends C33920d {

    /* renamed from: g */
    public final C33923f f82302g;

    /* renamed from: com.google.mlkit.common.model.a$a */
    public static class C33915a {
        @C0359n0

        /* renamed from: a */
        public final C33923f f82303a;

        public C33915a(@RecentlyNonNull C33923f fVar) {
            C40843u.m166202l(fVar);
            this.f82303a = fVar;
        }

        @C0359n0
        /* renamed from: a */
        public C33914a mo98656a() {
            return new C33914a(this.f82303a, (C33924g) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C33914a(com.google.mlkit.common.model.C33923f r3, com.google.mlkit.common.model.C33924g r4) {
        /*
            r2 = this;
            java.lang.String r4 = r3.mo98695a()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x000d
            java.lang.String r4 = "no_model_name"
            goto L_0x0011
        L_0x000d:
            java.lang.String r4 = r3.mo98695a()
        L_0x0011:
            r0 = 0
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            r2.<init>(r4, r0, r1)
            r2.f82302g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.model.C33914a.<init>(com.google.mlkit.common.model.f, com.google.mlkit.common.model.g):void");
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: i */
    public C33923f mo98655i() {
        return this.f82302g;
    }
}
