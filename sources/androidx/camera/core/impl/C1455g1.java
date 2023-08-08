package androidx.camera.core.impl;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.Config;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.g1 */
public interface C1455g1 extends Config {
    @C0359n0
    /* renamed from: a */
    Config mo4458a();

    @C0363p0
    /* renamed from: b */
    <ValueT> ValueT mo5125b(@C0359n0 Config.C1421a<ValueT> aVar) {
        return mo4458a().mo5125b(aVar);
    }

    /* renamed from: c */
    boolean mo5126c(@C0359n0 Config.C1421a<?> aVar) {
        return mo4458a().mo5126c(aVar);
    }

    /* renamed from: d */
    void mo5127d(@C0359n0 String str, @C0359n0 Config.C1422b bVar) {
        mo4458a().mo5127d(str, bVar);
    }

    @C0363p0
    /* renamed from: e */
    <ValueT> ValueT mo5128e(@C0359n0 Config.C1421a<ValueT> aVar, @C0359n0 Config.OptionPriority optionPriority) {
        return mo4458a().mo5128e(aVar, optionPriority);
    }

    @C0359n0
    /* renamed from: f */
    Set<Config.C1421a<?>> mo5129f() {
        return mo4458a().mo5129f();
    }

    @C0359n0
    /* renamed from: g */
    Set<Config.OptionPriority> mo5130g(@C0359n0 Config.C1421a<?> aVar) {
        return mo4458a().mo5130g(aVar);
    }

    @C0363p0
    /* renamed from: h */
    <ValueT> ValueT mo5131h(@C0359n0 Config.C1421a<ValueT> aVar, @C0363p0 ValueT valuet) {
        return mo4458a().mo5131h(aVar, valuet);
    }

    @C0359n0
    /* renamed from: i */
    Config.OptionPriority mo5132i(@C0359n0 Config.C1421a<?> aVar) {
        return mo4458a().mo5132i(aVar);
    }
}
