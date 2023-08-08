package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.auto.value.C32455c;
import java.util.Set;

public interface Config {

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    @C32455c
    /* renamed from: androidx.camera.core.impl.Config$a */
    public static abstract class C1421a<T> {
        @C0359n0
        /* renamed from: a */
        public static <T> C1421a<T> m5980a(@C0359n0 String str, @C0359n0 Class<?> cls) {
            return m5981b(str, cls, (Object) null);
        }

        @C0359n0
        /* renamed from: b */
        public static <T> C1421a<T> m5981b(@C0359n0 String str, @C0359n0 Class<?> cls, @C0363p0 Object obj) {
            return new C1436b(str, cls, obj);
        }

        @C0359n0
        /* renamed from: c */
        public abstract String mo5133c();

        @C0363p0
        /* renamed from: d */
        public abstract Object mo5134d();

        @C0359n0
        /* renamed from: e */
        public abstract Class<T> mo5135e();
    }

    /* renamed from: androidx.camera.core.impl.Config$b */
    public interface C1422b {
        /* renamed from: a */
        boolean mo4763a(@C0359n0 C1421a<?> aVar);
    }

    /* renamed from: B */
    static boolean m5970B(@C0359n0 OptionPriority optionPriority, @C0359n0 OptionPriority optionPriority2) {
        OptionPriority optionPriority3 = OptionPriority.ALWAYS_OVERRIDE;
        if (optionPriority == optionPriority3 && optionPriority2 == optionPriority3) {
            return true;
        }
        OptionPriority optionPriority4 = OptionPriority.REQUIRED;
        if (optionPriority == optionPriority4 && optionPriority2 == optionPriority4) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: R */
    static Config m5971R(@C0363p0 Config config, @C0363p0 Config config2) {
        C1586y0 y0Var;
        if (config == null && config2 == null) {
            return C1441c1.m6058a0();
        }
        if (config2 != null) {
            y0Var = C1586y0.m6574e0(config2);
        } else {
            y0Var = C1586y0.m6573d0();
        }
        if (config != null) {
            for (C1421a next : config.mo5129f()) {
                y0Var.mo5544q(next, config.mo5132i(next), config.mo5125b(next));
            }
        }
        return C1441c1.m6059b0(y0Var);
    }

    @C0363p0
    /* renamed from: b */
    <ValueT> ValueT mo5125b(@C0359n0 C1421a<ValueT> aVar);

    /* renamed from: c */
    boolean mo5126c(@C0359n0 C1421a<?> aVar);

    /* renamed from: d */
    void mo5127d(@C0359n0 String str, @C0359n0 C1422b bVar);

    @C0363p0
    /* renamed from: e */
    <ValueT> ValueT mo5128e(@C0359n0 C1421a<ValueT> aVar, @C0359n0 OptionPriority optionPriority);

    @C0359n0
    /* renamed from: f */
    Set<C1421a<?>> mo5129f();

    @C0359n0
    /* renamed from: g */
    Set<OptionPriority> mo5130g(@C0359n0 C1421a<?> aVar);

    @C0363p0
    /* renamed from: h */
    <ValueT> ValueT mo5131h(@C0359n0 C1421a<ValueT> aVar, @C0363p0 ValueT valuet);

    @C0359n0
    /* renamed from: i */
    OptionPriority mo5132i(@C0359n0 C1421a<?> aVar);
}
