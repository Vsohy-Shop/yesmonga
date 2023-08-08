package com.carrefour.fid.android.presentation.p035ui.scan;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import com.carrefour.fid.android.shared.constant.C28547h2;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.scan.b */
public final class C25709b implements C19764l {
    @C12579k

    /* renamed from: c */
    public static final C25710a f63006c = new C25710a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f63007d = 0;
    @C12580l

    /* renamed from: a */
    public final String f63008a;
    @C12580l

    /* renamed from: b */
    public final String f63009b;

    /* renamed from: com.carrefour.fid.android.presentation.ui.scan.b$a */
    public static final class C25710a {
        public /* synthetic */ C25710a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C25709b mo74676a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C25709b.class.getClassLoader());
            String str2 = null;
            if (bundle.containsKey(C28547h2.f69319g)) {
                str = bundle.getString(C28547h2.f69319g);
            } else {
                str = null;
            }
            if (bundle.containsKey(C28547h2.f69320h)) {
                str2 = bundle.getString(C28547h2.f69320h);
            }
            return new C25709b(str, str2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.presentation.p035ui.scan.C25709b mo74677b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "slotId"
                boolean r1 = r5.mo57647f(r0)
                r2 = 0
                if (r1 == 0) goto L_0x0015
                java.lang.Object r0 = r5.mo57648h(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0016
            L_0x0015:
                r0 = r2
            L_0x0016:
                java.lang.String r1 = "facilityServiceId"
                boolean r3 = r5.mo57647f(r1)
                if (r3 == 0) goto L_0x0025
                java.lang.Object r5 = r5.mo57648h(r1)
                r2 = r5
                java.lang.String r2 = (java.lang.String) r2
            L_0x0025:
                com.carrefour.fid.android.presentation.ui.scan.b r5 = new com.carrefour.fid.android.presentation.ui.scan.b
                r5.<init>(r0, r2)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.scan.C25709b.C25710a.mo74677b(androidx.lifecycle.p0):com.carrefour.fid.android.presentation.ui.scan.b");
        }

        public C25710a() {
        }
    }

    public C25709b() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C25709b m110393d(C25709b bVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f63008a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f63009b;
        }
        return bVar.mo74668c(str, str2);
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C25709b m110394e(@C12579k C19456p0 p0Var) {
        return f63006c.mo74677b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C25709b fromBundle(@C12579k Bundle bundle) {
        return f63006c.mo74676a(bundle);
    }

    @C12580l
    /* renamed from: a */
    public final String mo74666a() {
        return this.f63008a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo74667b() {
        return this.f63009b;
    }

    @C12579k
    /* renamed from: c */
    public final C25709b mo74668c(@C12580l String str, @C12580l String str2) {
        return new C25709b(str, str2);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25709b)) {
            return false;
        }
        C25709b bVar = (C25709b) obj;
        return Intrinsics.areEqual((Object) this.f63008a, (Object) bVar.f63008a) && Intrinsics.areEqual((Object) this.f63009b, (Object) bVar.f63009b);
    }

    @C12580l
    /* renamed from: f */
    public final String mo74670f() {
        return this.f63009b;
    }

    @C12580l
    /* renamed from: g */
    public final String mo74671g() {
        return this.f63008a;
    }

    @C12579k
    /* renamed from: h */
    public final Bundle mo74672h() {
        Bundle bundle = new Bundle();
        bundle.putString(C28547h2.f69319g, this.f63008a);
        bundle.putString(C28547h2.f69320h, this.f63009b);
        return bundle;
    }

    public int hashCode() {
        String str = this.f63008a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f63009b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    /* renamed from: i */
    public final C19456p0 mo74674i() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q(C28547h2.f69319g, this.f63008a);
        p0Var.mo57656q(C28547h2.f69320h, this.f63009b);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f63008a;
        String str2 = this.f63009b;
        return "BarcodeScannerFragmentArgs(slotId=" + str + ", facilityServiceId=" + str2 + ")";
    }

    public C25709b(@C12580l String str, @C12580l String str2) {
        this.f63008a = str;
        this.f63009b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25709b(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
