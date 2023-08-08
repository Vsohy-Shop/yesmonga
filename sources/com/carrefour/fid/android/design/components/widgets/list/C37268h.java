package com.carrefour.fid.android.design.components.widgets.list;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.design.components.widgets.list.h */
public final class C37268h extends C37269i {

    /* renamed from: f */
    public static final int f93479f = 0;
    @C12579k

    /* renamed from: b */
    public final String f93480b;

    /* renamed from: c */
    public final boolean f93481c;

    /* renamed from: d */
    public final boolean f93482d;
    @C12580l

    /* renamed from: e */
    public final C11289a<C11079d2> f93483e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37268h(String str, boolean z, boolean z2, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, (i & 8) != 0 ? null : aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C37268h m152944f(C37268h hVar, String str, boolean z, boolean z2, C11289a<C11079d2> aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hVar.f93480b;
        }
        if ((i & 2) != 0) {
            z = hVar.f93481c;
        }
        if ((i & 4) != 0) {
            z2 = hVar.f93482d;
        }
        if ((i & 8) != 0) {
            aVar = hVar.f93483e;
        }
        return hVar.mo113509e(str, z, z2, aVar);
    }

    @C12579k
    /* renamed from: a */
    public final String mo113505a() {
        return this.f93480b;
    }

    /* renamed from: b */
    public final boolean mo113506b() {
        return this.f93481c;
    }

    /* renamed from: c */
    public final boolean mo113507c() {
        return this.f93482d;
    }

    @C12580l
    /* renamed from: d */
    public final C11289a<C11079d2> mo113508d() {
        return this.f93483e;
    }

    @C12579k
    /* renamed from: e */
    public final C37268h mo113509e(@C12579k String str, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(str, "text");
        return new C37268h(str, z, z2, aVar);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37268h)) {
            return false;
        }
        C37268h hVar = (C37268h) obj;
        return Intrinsics.areEqual((Object) this.f93480b, (Object) hVar.f93480b) && this.f93481c == hVar.f93481c && this.f93482d == hVar.f93482d && Intrinsics.areEqual((Object) this.f93483e, (Object) hVar.f93483e);
    }

    @C12580l
    /* renamed from: g */
    public final C11289a<C11079d2> mo113511g() {
        return this.f93483e;
    }

    @C12579k
    /* renamed from: h */
    public final String mo113512h() {
        return this.f93480b;
    }

    public int hashCode() {
        int hashCode = this.f93480b.hashCode() * 31;
        boolean z = this.f93481c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f93482d;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        C11289a<C11079d2> aVar = this.f93483e;
        return i2 + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: i */
    public final boolean mo113514i() {
        return this.f93482d;
    }

    /* renamed from: j */
    public final boolean mo113515j() {
        return this.f93481c;
    }

    @C12579k
    public String toString() {
        String str = this.f93480b;
        boolean z = this.f93481c;
        boolean z2 = this.f93482d;
        C11289a<C11079d2> aVar = this.f93483e;
        return "ListItemQuantityUI(text=" + str + ", isSelected=" + z + ", isLoading=" + z2 + ", onItemClicked=" + aVar + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37268h(@C12579k String str, boolean z, boolean z2, @C12580l C11289a<C11079d2> aVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "text");
        this.f93480b = str;
        this.f93481c = z;
        this.f93482d = z2;
        this.f93483e = aVar;
    }
}
