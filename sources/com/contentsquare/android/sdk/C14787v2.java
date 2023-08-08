package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14359g4;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.contentsquare.android.sdk.v2 */
public class C14787v2 {

    /* renamed from: b */
    public static boolean f36667b = true;

    /* renamed from: c */
    public static volatile C14787v2 f36668c;

    /* renamed from: d */
    public static final C14787v2 f36669d = new C14787v2(true);

    /* renamed from: a */
    public final Map<C14788a, C14359g4.C14364e<?, ?>> f36670a;

    /* renamed from: com.contentsquare.android.sdk.v2$a */
    public static final class C14788a {

        /* renamed from: a */
        public final Object f36671a;

        /* renamed from: b */
        public final int f36672b;

        public C14788a(Object obj, int i) {
            this.f36671a = obj;
            this.f36672b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14788a)) {
                return false;
            }
            C14788a aVar = (C14788a) obj;
            return this.f36671a == aVar.f36671a && this.f36672b == aVar.f36672b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f36671a) * 65535) + this.f36672b;
        }
    }

    public C14787v2() {
        this.f36670a = new HashMap();
    }

    /* renamed from: a */
    public static C14787v2 m63752a() {
        C14787v2 v2Var = f36668c;
        if (v2Var == null) {
            synchronized (C14787v2.class) {
                v2Var = f36668c;
                if (v2Var == null) {
                    v2Var = f36667b ? C14168a2.m60805a() : f36669d;
                    f36668c = v2Var;
                }
            }
        }
        return v2Var;
    }

    /* renamed from: b */
    public <ContainingType extends C14218ba> C14359g4.C14364e<ContainingType, ?> mo36615b(ContainingType containingtype, int i) {
        return this.f36670a.get(new C14788a(containingtype, i));
    }

    public C14787v2(boolean z) {
        this.f36670a = Collections.emptyMap();
    }
}
