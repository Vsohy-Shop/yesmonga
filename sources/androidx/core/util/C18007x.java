package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.core.util.x */
public interface C18007x<T> {
    /* access modifiers changed from: private */
    /* renamed from: c */
    /* synthetic */ boolean m81783c(Object obj) {
        return !test(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    /* synthetic */ boolean m81785e(C18007x xVar, Object obj) {
        return test(obj) || xVar.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    static <T> C18007x<T> isEqual(@SuppressLint({"MissingNullability"}) Object obj) {
        if (obj == null) {
            return new C18003t();
        }
        return new C18004u(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    /* synthetic */ boolean m81789j(C18007x xVar, Object obj) {
        return test(obj) && xVar.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: k */
    static <T> C18007x<T> m81790k(@SuppressLint({"MissingNullability"}) C18007x<? super T> xVar) {
        Objects.requireNonNull(xVar);
        return xVar.negate();
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: b */
    C18007x<T> mo52471b(@SuppressLint({"MissingNullability"}) C18007x<? super T> xVar) {
        Objects.requireNonNull(xVar);
        return new C18005v(this, xVar);
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: f */
    C18007x<T> mo52472f(@SuppressLint({"MissingNullability"}) C18007x<? super T> xVar) {
        Objects.requireNonNull(xVar);
        return new C18002s(this, xVar);
    }

    @SuppressLint({"MissingNullability"})
    C18007x<T> negate() {
        return new C18006w(this);
    }

    boolean test(T t);
}
