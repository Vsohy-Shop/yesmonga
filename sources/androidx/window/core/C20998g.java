package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.window.core.g */
public final class C20998g<T> extends SpecificationComputer<T> {
    @C12579k

    /* renamed from: b */
    public final T f54166b;
    @C12579k

    /* renamed from: c */
    public final String f54167c;
    @C12579k

    /* renamed from: d */
    public final SpecificationComputer.VerificationMode f54168d;
    @C12579k

    /* renamed from: e */
    public final C20997f f54169e;

    public C20998g(@C12579k T t, @C12579k String str, @C12579k SpecificationComputer.VerificationMode verificationMode, @C12579k C20997f fVar) {
        Intrinsics.checkNotNullParameter(t, "value");
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(fVar, "logger");
        this.f54166b = t;
        this.f54167c = str;
        this.f54168d = verificationMode;
        this.f54169e = fVar;
    }

    @C12579k
    /* renamed from: a */
    public T mo62743a() {
        return this.f54166b;
    }

    @C12579k
    /* renamed from: c */
    public SpecificationComputer<T> mo62745c(@C12579k String str, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(lVar, "condition");
        if (lVar.invoke(this.f54166b).booleanValue()) {
            return this;
        }
        return new C20995e(this.f54166b, this.f54167c, str, this.f54169e, this.f54168d);
    }

    @C12579k
    /* renamed from: d */
    public final C20997f mo62783d() {
        return this.f54169e;
    }

    @C12579k
    /* renamed from: e */
    public final String mo62784e() {
        return this.f54167c;
    }

    @C12579k
    /* renamed from: f */
    public final T mo62785f() {
        return this.f54166b;
    }

    @C12579k
    /* renamed from: g */
    public final SpecificationComputer.VerificationMode mo62786g() {
        return this.f54168d;
    }
}
