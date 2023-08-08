package com.carrefour.fid.android.catalogs.presentation.p065ui;

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
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.b */
public final class C39480b implements C19764l {
    @C12579k

    /* renamed from: b */
    public static final C39481a f100985b = new C39481a((DefaultConstructorMarker) null);

    /* renamed from: c */
    public static final int f100986c = 0;

    /* renamed from: a */
    public final boolean f100987a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.b$a */
    public static final class C39481a {
        public /* synthetic */ C39481a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C39480b mo130614a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C39480b.class.getClassLoader());
            if (bundle.containsKey(C28958a.f70992g)) {
                z = bundle.getBoolean(C28958a.f70992g);
            } else {
                z = true;
            }
            return new C39480b(z);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C39480b mo130615b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f(C28958a.f70992g)) {
                bool = (Boolean) p0Var.mo57648h(C28958a.f70992g);
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"forceStoreIfExist\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.TRUE;
            }
            return new C39480b(bool.booleanValue());
        }

        public C39481a() {
        }
    }

    public C39480b() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public static /* synthetic */ C39480b m161729c(C39480b bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f100987a;
        }
        return bVar.mo130607b(z);
    }

    @C12579k
    @C11384m
    /* renamed from: d */
    public static final C39480b m161730d(@C12579k C19456p0 p0Var) {
        return f100985b.mo130615b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C39480b fromBundle(@C12579k Bundle bundle) {
        return f100985b.mo130614a(bundle);
    }

    /* renamed from: a */
    public final boolean mo130606a() {
        return this.f100987a;
    }

    @C12579k
    /* renamed from: b */
    public final C39480b mo130607b(boolean z) {
        return new C39480b(z);
    }

    /* renamed from: e */
    public final boolean mo130608e() {
        return this.f100987a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39480b) && this.f100987a == ((C39480b) obj).f100987a;
    }

    @C12579k
    /* renamed from: f */
    public final Bundle mo130610f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C28958a.f70992g, this.f100987a);
        return bundle;
    }

    @C12579k
    /* renamed from: g */
    public final C19456p0 mo130611g() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C28958a.f70992g, Boolean.valueOf(this.f100987a));
        return p0Var;
    }

    public int hashCode() {
        boolean z = this.f100987a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f100987a;
        return "CatalogBuilderFragmentArgs(forceStoreIfExist=" + z + ")";
    }

    public C39480b(boolean z) {
        this.f100987a = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39480b(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
