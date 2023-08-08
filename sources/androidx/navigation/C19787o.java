package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.o */
public final class C19787o {
    @C12579k

    /* renamed from: a */
    public final C19769n0<Object> f50629a;

    /* renamed from: b */
    public final boolean f50630b;

    /* renamed from: c */
    public final boolean f50631c;
    @C12580l

    /* renamed from: d */
    public final Object f50632d;

    /* renamed from: androidx.navigation.o$a */
    public static final class C19788a {
        @C12580l

        /* renamed from: a */
        public C19769n0<Object> f50633a;

        /* renamed from: b */
        public boolean f50634b;
        @C12580l

        /* renamed from: c */
        public Object f50635c;

        /* renamed from: d */
        public boolean f50636d;

        @C12579k
        /* renamed from: a */
        public final C19787o mo58545a() {
            C19769n0<Object> n0Var = this.f50633a;
            if (n0Var == null) {
                n0Var = C19769n0.f50610c.mo58517c(this.f50635c);
            }
            return new C19787o(n0Var, this.f50634b, this.f50635c, this.f50636d);
        }

        @C12579k
        /* renamed from: b */
        public final C19788a mo58546b(@C12580l Object obj) {
            this.f50635c = obj;
            this.f50636d = true;
            return this;
        }

        @C12579k
        /* renamed from: c */
        public final C19788a mo58547c(boolean z) {
            this.f50634b = z;
            return this;
        }

        @C12579k
        /* renamed from: d */
        public final <T> C19788a mo58548d(@C12579k C19769n0<T> n0Var) {
            Intrinsics.checkNotNullParameter(n0Var, "type");
            this.f50633a = n0Var;
            return this;
        }
    }

    public C19787o(@C12579k C19769n0<Object> n0Var, boolean z, @C12580l Object obj, boolean z2) {
        boolean z3;
        Intrinsics.checkNotNullParameter(n0Var, "type");
        boolean z4 = false;
        if (n0Var.mo58477f() || !z) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if ((z || !z2 || obj != null) ? true : z4) {
                this.f50629a = n0Var;
                this.f50630b = z;
                this.f50632d = obj;
                this.f50631c = z2;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + n0Var.mo58476c() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((n0Var.mo58476c() + " does not allow nullable values").toString());
    }

    @C12580l
    /* renamed from: a */
    public final Object mo58536a() {
        return this.f50632d;
    }

    @C12579k
    /* renamed from: b */
    public final C19769n0<Object> mo58537b() {
        return this.f50629a;
    }

    /* renamed from: c */
    public final boolean mo58538c() {
        return this.f50631c;
    }

    /* renamed from: d */
    public final boolean mo58539d() {
        return this.f50630b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public final void mo58540e(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (this.f50631c) {
            this.f50629a.mo58480i(bundle, str, this.f50632d);
        }
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) C19787o.class, (Object) obj.getClass())) {
            return false;
        }
        C19787o oVar = (C19787o) obj;
        if (this.f50630b != oVar.f50630b || this.f50631c != oVar.f50631c || !Intrinsics.areEqual((Object) this.f50629a, (Object) oVar.f50629a)) {
            return false;
        }
        Object obj2 = this.f50632d;
        if (obj2 != null) {
            return Intrinsics.areEqual(obj2, oVar.f50632d);
        }
        if (oVar.f50632d == null) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public final boolean mo58542f(@C12579k String str, @C12579k Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (!this.f50630b && bundle.containsKey(str) && bundle.get(str) == null) {
            return false;
        }
        try {
            this.f50629a.mo58475b(bundle, str);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.f50629a.hashCode() * 31) + (this.f50630b ? 1 : 0)) * 31) + (this.f50631c ? 1 : 0)) * 31;
        Object obj = this.f50632d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C19787o.class.getSimpleName());
        sb.append(" Type: " + this.f50629a);
        sb.append(" Nullable: " + this.f50630b);
        if (this.f50631c) {
            sb.append(" DefaultValue: " + this.f50632d);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
