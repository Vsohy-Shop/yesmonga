package com.carrefour.fid.android;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.storelocator.configurations.C28958a;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.p0 */
public final class C14062p0 implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C14063a f34487c = new C14063a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f34488d = 0;

    /* renamed from: a */
    public final int f34489a;

    /* renamed from: b */
    public final boolean f34490b;

    /* renamed from: com.carrefour.fid.android.p0$a */
    public static final class C14063a {
        public /* synthetic */ C14063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C14062p0 mo34325a(@C12579k Bundle bundle) {
            int i;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C14062p0.class.getClassLoader());
            if (bundle.containsKey("sourceGraphId")) {
                i = bundle.getInt("sourceGraphId");
            } else {
                i = R.id.store_graph;
            }
            if (bundle.containsKey(C28958a.f70992g)) {
                z = bundle.getBoolean(C28958a.f70992g);
            } else {
                z = false;
            }
            return new C14062p0(i, z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C14062p0 mo34326b(@C12579k C19456p0 p0Var) {
            Integer num;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("sourceGraphId")) {
                num = (Integer) p0Var.mo57648h("sourceGraphId");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"sourceGraphId\" of type reference does not support null values");
                }
            } else {
                num = Integer.valueOf(R.id.store_graph);
            }
            if (p0Var.mo57647f(C28958a.f70992g)) {
                bool = (Boolean) p0Var.mo57648h(C28958a.f70992g);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"forceStoreIfExist\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new C14062p0(num.intValue(), bool.booleanValue());
        }

        public C14063a() {
        }
    }

    public C14062p0() {
        this(0, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C14062p0 m60583d(C14062p0 p0Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = p0Var.f34489a;
        }
        if ((i2 & 2) != 0) {
            z = p0Var.f34490b;
        }
        return p0Var.mo34317c(i, z);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C14062p0 m60584e(@C12579k C19456p0 p0Var) {
        return f34487c.mo34326b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C14062p0 fromBundle(@C12579k Bundle bundle) {
        return f34487c.mo34325a(bundle);
    }

    /* renamed from: a */
    public final int mo34315a() {
        return this.f34489a;
    }

    /* renamed from: b */
    public final boolean mo34316b() {
        return this.f34490b;
    }

    @C12579k
    /* renamed from: c */
    public final C14062p0 mo34317c(int i, boolean z) {
        return new C14062p0(i, z);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14062p0)) {
            return false;
        }
        C14062p0 p0Var = (C14062p0) obj;
        return this.f34489a == p0Var.f34489a && this.f34490b == p0Var.f34490b;
    }

    /* renamed from: f */
    public final boolean mo34319f() {
        return this.f34490b;
    }

    /* renamed from: g */
    public final int mo34320g() {
        return this.f34489a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo34321h() {
        Bundle bundle = new Bundle();
        bundle.putInt("sourceGraphId", this.f34489a);
        bundle.putBoolean(C28958a.f70992g, this.f34490b);
        return bundle;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f34489a) * 31;
        boolean z = this.f34490b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo34323i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("sourceGraphId", Integer.valueOf(this.f34489a));
        p0Var.mo57656q(C28958a.f70992g, Boolean.valueOf(this.f34490b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        int i = this.f34489a;
        boolean z = this.f34490b;
        return "StoreGraphArgs(sourceGraphId=" + i + ", forceStoreIfExist=" + z + ")";
    }

    public C14062p0(int i, boolean z) {
        this.f34489a = i;
        this.f34490b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14062p0(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.id.store_graph : i, (i2 & 2) != 0 ? false : z);
    }
}
