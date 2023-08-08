package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.work.impl.model.m */
public final class C21237m {
    @C12579k

    /* renamed from: a */
    public final String f54784a;

    /* renamed from: b */
    public final int f54785b;

    public C21237m(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        this.f54784a = str;
        this.f54785b = i;
    }

    /* renamed from: d */
    public static /* synthetic */ C21237m m98085d(C21237m mVar, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mVar.f54784a;
        }
        if ((i2 & 2) != 0) {
            i = mVar.f54785b;
        }
        return mVar.mo63434c(str, i);
    }

    @C12579k
    /* renamed from: a */
    public final String mo63432a() {
        return this.f54784a;
    }

    /* renamed from: b */
    public final int mo63433b() {
        return this.f54785b;
    }

    @C12579k
    /* renamed from: c */
    public final C21237m mo63434c(@C12579k String str, int i) {
        Intrinsics.checkNotNullParameter(str, "workSpecId");
        return new C21237m(str, i);
    }

    /* renamed from: e */
    public final int mo63435e() {
        return this.f54785b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21237m)) {
            return false;
        }
        C21237m mVar = (C21237m) obj;
        return Intrinsics.areEqual((Object) this.f54784a, (Object) mVar.f54784a) && this.f54785b == mVar.f54785b;
    }

    @C12579k
    /* renamed from: f */
    public final String mo63437f() {
        return this.f54784a;
    }

    public int hashCode() {
        return (this.f54784a.hashCode() * 31) + Integer.hashCode(this.f54785b);
    }

    @C12579k
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f54784a + ", generation=" + this.f54785b + ')';
    }
}
