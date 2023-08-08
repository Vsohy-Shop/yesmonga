package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.C1455g1;
import androidx.camera.core.impl.Config;

/* renamed from: androidx.camera.core.internal.e */
public interface C1611e<T> extends C1455g1 {
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: r */
    public static final Config.C1421a<String> f4537r = Config.C1421a.m5980a("camerax.core.target.name", String.class);
    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: s */
    public static final Config.C1421a<Class<?>> f4538s = Config.C1421a.m5980a("camerax.core.target.class", Class.class);

    /* renamed from: androidx.camera.core.internal.e$a */
    public interface C1612a<T, B> {
        @C0359n0
        /* renamed from: f */
        B mo4855f(@C0359n0 String str);

        @C0359n0
        /* renamed from: l */
        B mo4859l(@C0359n0 Class<T> cls);
    }

    @C0363p0
    /* renamed from: O */
    Class<T> mo5599O(@C0363p0 Class<T> cls) {
        return (Class) mo5131h(f4538s, cls);
    }

    @C0359n0
    /* renamed from: T */
    String mo5600T() {
        return (String) mo5125b(f4537r);
    }

    @C0359n0
    /* renamed from: s */
    Class<T> mo5601s() {
        return (Class) mo5125b(f4538s);
    }

    @C0363p0
    /* renamed from: v */
    String mo5602v(@C0363p0 String str) {
        return (String) mo5131h(f4537r, str);
    }
}
