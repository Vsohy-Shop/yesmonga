package com.carrefour.fid.android.presentation.p035ui.account.menu.compose;

import androidx.annotation.C0375v;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.menu.compose.b */
public final class C23139b {

    /* renamed from: e */
    public static final int f58813e = 0;
    @C12580l

    /* renamed from: a */
    public final String f58814a;
    @C12580l

    /* renamed from: b */
    public final Integer f58815b;
    @C12580l

    /* renamed from: c */
    public final C15240j2 f58816c;
    @C12579k

    /* renamed from: d */
    public final C11289a<C11079d2> f58817d;

    public /* synthetic */ C23139b(String str, @C0375v Integer num, C15240j2 j2Var, C11289a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, j2Var, aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C23139b m103720f(C23139b bVar, String str, Integer num, C15240j2 j2Var, C11289a<C11079d2> aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f58814a;
        }
        if ((i & 2) != 0) {
            num = bVar.f58815b;
        }
        if ((i & 4) != 0) {
            j2Var = bVar.f58816c;
        }
        if ((i & 8) != 0) {
            aVar = bVar.f58817d;
        }
        return bVar.mo67901e(str, num, j2Var, aVar);
    }

    @C12580l
    /* renamed from: a */
    public final String mo67897a() {
        return this.f58814a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo67898b() {
        return this.f58815b;
    }

    @C12580l
    /* renamed from: c */
    public final C15240j2 mo67899c() {
        return this.f58816c;
    }

    @C12579k
    /* renamed from: d */
    public final C11289a<C11079d2> mo67900d() {
        return this.f58817d;
    }

    @C12579k
    /* renamed from: e */
    public final C23139b mo67901e(@C12580l String str, @C0375v @C12580l Integer num, @C12580l C15240j2 j2Var, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onItemClicked");
        return new C23139b(str, num, j2Var, aVar, (DefaultConstructorMarker) null);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23139b)) {
            return false;
        }
        C23139b bVar = (C23139b) obj;
        return Intrinsics.areEqual((Object) this.f58814a, (Object) bVar.f58814a) && Intrinsics.areEqual((Object) this.f58815b, (Object) bVar.f58815b) && Intrinsics.areEqual((Object) this.f58816c, (Object) bVar.f58816c) && Intrinsics.areEqual((Object) this.f58817d, (Object) bVar.f58817d);
    }

    @C12580l
    /* renamed from: g */
    public final Integer mo67903g() {
        return this.f58815b;
    }

    @C12580l
    /* renamed from: h */
    public final C15240j2 mo67904h() {
        return this.f58816c;
    }

    public int hashCode() {
        String str = this.f58814a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f58815b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        C15240j2 j2Var = this.f58816c;
        if (j2Var != null) {
            i = C15240j2.m66056K(j2Var.mo42833M());
        }
        return ((hashCode2 + i) * 31) + this.f58817d.hashCode();
    }

    @C12580l
    /* renamed from: i */
    public final String mo67906i() {
        return this.f58814a;
    }

    @C12579k
    /* renamed from: j */
    public final C11289a<C11079d2> mo67907j() {
        return this.f58817d;
    }

    @C12579k
    public String toString() {
        String str = this.f58814a;
        Integer num = this.f58815b;
        C15240j2 j2Var = this.f58816c;
        C11289a<C11079d2> aVar = this.f58817d;
        return "AccountMenuOption(label=" + str + ", icon=" + num + ", iconTint=" + j2Var + ", onItemClicked=" + aVar + ")";
    }

    public C23139b(String str, Integer num, C15240j2 j2Var, C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "onItemClicked");
        this.f58814a = str;
        this.f58815b = num;
        this.f58816c = j2Var;
        this.f58817d = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23139b(String str, Integer num, C15240j2 j2Var, C11289a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new String() : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : j2Var, aVar, (DefaultConstructorMarker) null);
    }
}
