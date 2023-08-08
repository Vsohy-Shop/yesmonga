package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.AccountListCategory;
import com.carrefour.fid.android.core.type.AccountListType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.a */
public final class C38453a {

    /* renamed from: c */
    public static final int f97570c = 0;
    @C12580l

    /* renamed from: a */
    public final AccountListCategory f97571a;
    @C12580l

    /* renamed from: b */
    public final AccountListType f97572b;

    public C38453a() {
        this((AccountListCategory) null, (AccountListType) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C38453a m159508d(C38453a aVar, AccountListCategory accountListCategory, AccountListType accountListType, int i, Object obj) {
        if ((i & 1) != 0) {
            accountListCategory = aVar.f97571a;
        }
        if ((i & 2) != 0) {
            accountListType = aVar.f97572b;
        }
        return aVar.mo121991c(accountListCategory, accountListType);
    }

    @C12580l
    /* renamed from: a */
    public final AccountListCategory mo121989a() {
        return this.f97571a;
    }

    @C12580l
    /* renamed from: b */
    public final AccountListType mo121990b() {
        return this.f97572b;
    }

    @C12579k
    /* renamed from: c */
    public final C38453a mo121991c(@C12580l AccountListCategory accountListCategory, @C12580l AccountListType accountListType) {
        return new C38453a(accountListCategory, accountListType);
    }

    @C12580l
    /* renamed from: e */
    public final AccountListCategory mo121992e() {
        return this.f97571a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38453a)) {
            return false;
        }
        C38453a aVar = (C38453a) obj;
        return this.f97571a == aVar.f97571a && Intrinsics.areEqual((Object) this.f97572b, (Object) aVar.f97572b);
    }

    @C12580l
    /* renamed from: f */
    public final AccountListType mo121994f() {
        return this.f97572b;
    }

    public int hashCode() {
        AccountListCategory accountListCategory = this.f97571a;
        int i = 0;
        int hashCode = (accountListCategory == null ? 0 : accountListCategory.hashCode()) * 31;
        AccountListType accountListType = this.f97572b;
        if (accountListType != null) {
            i = accountListType.hashCode();
        }
        return hashCode + i;
    }

    @C12579k
    public String toString() {
        AccountListCategory accountListCategory = this.f97571a;
        AccountListType accountListType = this.f97572b;
        return "AccountListItemModel(category=" + accountListCategory + ", type=" + accountListType + ")";
    }

    public C38453a(@C12580l AccountListCategory accountListCategory, @C12580l AccountListType accountListType) {
        this.f97571a = accountListCategory;
        this.f97572b = accountListType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38453a(AccountListCategory accountListCategory, AccountListType accountListType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accountListCategory, (i & 2) != 0 ? null : accountListType);
    }
}
