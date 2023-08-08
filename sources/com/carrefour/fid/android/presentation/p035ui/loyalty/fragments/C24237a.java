package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.a */
public final class C24237a implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C24238a f60625c = new C24238a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f60626d = 0;

    /* renamed from: a */
    public final boolean f60627a;

    /* renamed from: b */
    public final boolean f60628b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.a$a */
    public static final class C24238a {
        public /* synthetic */ C24238a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C24237a mo70945a(@C12579k Bundle bundle) {
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C24237a.class.getClassLoader());
            boolean z2 = false;
            if (bundle.containsKey("isAttachCard")) {
                z = bundle.getBoolean("isAttachCard");
            } else {
                z = false;
            }
            if (bundle.containsKey("isCreateCard")) {
                z2 = bundle.getBoolean("isCreateCard");
            }
            return new C24237a(z, z2);
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C24237a mo70946b(@C12579k C19456p0 p0Var) {
            Boolean bool;
            Boolean bool2;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("isAttachCard")) {
                bool = (Boolean) p0Var.mo57648h("isAttachCard");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"isAttachCard\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            if (p0Var.mo57647f("isCreateCard")) {
                bool2 = (Boolean) p0Var.mo57648h("isCreateCard");
                if (bool2 == null) {
                    throw new IllegalArgumentException("Argument \"isCreateCard\" of type boolean does not support null values");
                }
            } else {
                bool2 = Boolean.FALSE;
            }
            return new C24237a(bool.booleanValue(), bool2.booleanValue());
        }

        public C24238a() {
        }
    }

    public C24237a() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C24237a m106676d(C24237a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f60627a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.f60628b;
        }
        return aVar.mo70937c(z, z2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C24237a m106677e(@C12579k C19456p0 p0Var) {
        return f60625c.mo70946b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C24237a fromBundle(@C12579k Bundle bundle) {
        return f60625c.mo70945a(bundle);
    }

    /* renamed from: a */
    public final boolean mo70935a() {
        return this.f60627a;
    }

    /* renamed from: b */
    public final boolean mo70936b() {
        return this.f60628b;
    }

    @C12579k
    /* renamed from: c */
    public final C24237a mo70937c(boolean z, boolean z2) {
        return new C24237a(z, z2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24237a)) {
            return false;
        }
        C24237a aVar = (C24237a) obj;
        return this.f60627a == aVar.f60627a && this.f60628b == aVar.f60628b;
    }

    /* renamed from: f */
    public final boolean mo70939f() {
        return this.f60627a;
    }

    /* renamed from: g */
    public final boolean mo70940g() {
        return this.f60628b;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo70941h() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isAttachCard", this.f60627a);
        bundle.putBoolean("isCreateCard", this.f60628b);
        return bundle;
    }

    public int hashCode() {
        boolean z = this.f60627a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f60628b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo70943i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("isAttachCard", Boolean.valueOf(this.f60627a));
        p0Var.mo57656q("isCreateCard", Boolean.valueOf(this.f60628b));
        return p0Var;
    }

    @C12579k
    public String toString() {
        boolean z = this.f60627a;
        boolean z2 = this.f60628b;
        return "BaseLoyaltyFragmentArgs(isAttachCard=" + z + ", isCreateCard=" + z2 + ")";
    }

    public C24237a(boolean z, boolean z2) {
        this.f60627a = z;
        this.f60628b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24237a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
