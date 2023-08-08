package com.carrefour.fid.android.domain.models.favorites.shoppinglist;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.d */
public interface C38033d {

    /* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.d$a */
    public static final class C38034a implements C38033d {
        @C12579k

        /* renamed from: a */
        public final String f95871a;
        @C12579k

        /* renamed from: b */
        public final String f95872b;
        @C12579k

        /* renamed from: c */
        public final ShoppingListSyncState f95873c;

        public C38034a() {
            this((String) null, (String) null, (ShoppingListSyncState) null, 7, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public static /* synthetic */ C38034a m156814g(C38034a aVar, String str, String str2, ShoppingListSyncState shoppingListSyncState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f95871a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f95872b;
            }
            if ((i & 4) != 0) {
                shoppingListSyncState = aVar.f95873c;
            }
            return aVar.mo117730f(str, str2, shoppingListSyncState);
        }

        @C12579k
        /* renamed from: a */
        public String mo117724a() {
            return this.f95872b;
        }

        @C12579k
        /* renamed from: b */
        public ShoppingListSyncState mo117725b() {
            return this.f95873c;
        }

        @C12579k
        /* renamed from: c */
        public final String mo117726c() {
            return this.f95871a;
        }

        @C12579k
        /* renamed from: d */
        public final String mo117727d() {
            return this.f95872b;
        }

        @C12579k
        /* renamed from: e */
        public final ShoppingListSyncState mo117728e() {
            return this.f95873c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38034a)) {
                return false;
            }
            C38034a aVar = (C38034a) obj;
            return Intrinsics.areEqual((Object) this.f95871a, (Object) aVar.f95871a) && Intrinsics.areEqual((Object) this.f95872b, (Object) aVar.f95872b) && this.f95873c == aVar.f95873c;
        }

        @C12579k
        /* renamed from: f */
        public final C38034a mo117730f(@C12579k String str, @C12579k String str2, @C12579k ShoppingListSyncState shoppingListSyncState) {
            Intrinsics.checkNotNullParameter(str, "idInShoppingList");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            Intrinsics.checkNotNullParameter(shoppingListSyncState, "syncState");
            return new C38034a(str, str2, shoppingListSyncState);
        }

        @C12579k
        /* renamed from: h */
        public final String mo117731h() {
            return this.f95871a;
        }

        public int hashCode() {
            return (((this.f95871a.hashCode() * 31) + this.f95872b.hashCode()) * 31) + this.f95873c.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f95871a;
            String str2 = this.f95872b;
            ShoppingListSyncState shoppingListSyncState = this.f95873c;
            return "Synced(idInShoppingList=" + str + ", gtin=" + str2 + ", syncState=" + shoppingListSyncState + ")";
        }

        public C38034a(@C12579k String str, @C12579k String str2, @C12579k ShoppingListSyncState shoppingListSyncState) {
            Intrinsics.checkNotNullParameter(str, "idInShoppingList");
            Intrinsics.checkNotNullParameter(str2, "gtin");
            Intrinsics.checkNotNullParameter(shoppingListSyncState, "syncState");
            this.f95871a = str;
            this.f95872b = str2;
            this.f95873c = shoppingListSyncState;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38034a(String str, String str2, ShoppingListSyncState shoppingListSyncState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ShoppingListSyncState.SYNCED : shoppingListSyncState);
        }
    }

    /* renamed from: com.carrefour.fid.android.domain.models.favorites.shoppinglist.d$b */
    public static final class C38035b implements C38033d {
        @C12579k

        /* renamed from: a */
        public final String f95874a;
        @C12579k

        /* renamed from: b */
        public final ShoppingListSyncState f95875b;

        public C38035b() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public static /* synthetic */ C38035b m156822e(C38035b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f95874a;
            }
            return bVar.mo117735d(str);
        }

        @C12579k
        /* renamed from: a */
        public String mo117724a() {
            return this.f95874a;
        }

        @C12579k
        /* renamed from: b */
        public ShoppingListSyncState mo117725b() {
            return this.f95875b;
        }

        @C12579k
        /* renamed from: c */
        public final String mo117734c() {
            return this.f95874a;
        }

        @C12579k
        /* renamed from: d */
        public final C38035b mo117735d(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            return new C38035b(str);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C38035b) && Intrinsics.areEqual((Object) this.f95874a, (Object) ((C38035b) obj).f95874a);
        }

        public int hashCode() {
            return this.f95874a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f95874a;
            return "Syncing(gtin=" + str + ")";
        }

        public C38035b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            this.f95874a = str;
            this.f95875b = ShoppingListSyncState.SYNCING;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38035b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    @C12579k
    /* renamed from: a */
    String mo117724a();

    @C12579k
    /* renamed from: b */
    ShoppingListSyncState mo117725b();
}
