package com.carrefour.fid.android.product.presentation.p039ui.bottomsheet;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.product.Gtin;
import com.carrefour.fid.android.domain.models.product.plp.C38115c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a */
public interface C27728a {

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$a */
    public static final class C27729a implements C27728a {

        /* renamed from: b */
        public static final int f67244b = 8;
        @C12579k

        /* renamed from: a */
        public final C38115c f67245a;

        public C27729a(@C12579k C38115c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "product");
            this.f67245a = cVar;
        }

        /* renamed from: c */
        public static /* synthetic */ C27729a m116538c(C27729a aVar, C38115c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.f67245a;
            }
            return aVar.mo80505b(cVar);
        }

        @C12579k
        /* renamed from: a */
        public final C38115c mo80504a() {
            return this.f67245a;
        }

        @C12579k
        /* renamed from: b */
        public final C27729a mo80505b(@C12579k C38115c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "product");
            return new C27729a(cVar);
        }

        @C12579k
        /* renamed from: d */
        public final C38115c mo80506d() {
            return this.f67245a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27729a) && Intrinsics.areEqual((Object) this.f67245a, (Object) ((C27729a) obj).f67245a);
        }

        public int hashCode() {
            return this.f67245a.hashCode();
        }

        @C12579k
        public String toString() {
            C38115c cVar = this.f67245a;
            return "OnAtcPressed(product=" + cVar + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$b */
    public static final class C27730b implements C27728a {

        /* renamed from: c */
        public static final int f67246c = 8;
        @C12579k

        /* renamed from: a */
        public final C38115c f67247a;

        /* renamed from: b */
        public final boolean f67248b;

        public C27730b(@C12579k C38115c cVar, boolean z) {
            Intrinsics.checkNotNullParameter(cVar, "product");
            this.f67247a = cVar;
            this.f67248b = z;
        }

        /* renamed from: d */
        public static /* synthetic */ C27730b m116542d(C27730b bVar, C38115c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = bVar.f67247a;
            }
            if ((i & 2) != 0) {
                z = bVar.f67248b;
            }
            return bVar.mo80512c(cVar, z);
        }

        @C12579k
        /* renamed from: a */
        public final C38115c mo80510a() {
            return this.f67247a;
        }

        /* renamed from: b */
        public final boolean mo80511b() {
            return this.f67248b;
        }

        @C12579k
        /* renamed from: c */
        public final C27730b mo80512c(@C12579k C38115c cVar, boolean z) {
            Intrinsics.checkNotNullParameter(cVar, "product");
            return new C27730b(cVar, z);
        }

        @C12579k
        /* renamed from: e */
        public final C38115c mo80513e() {
            return this.f67247a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27730b)) {
                return false;
            }
            C27730b bVar = (C27730b) obj;
            return Intrinsics.areEqual((Object) this.f67247a, (Object) bVar.f67247a) && this.f67248b == bVar.f67248b;
        }

        /* renamed from: f */
        public final boolean mo80515f() {
            return this.f67248b;
        }

        public int hashCode() {
            int hashCode = this.f67247a.hashCode() * 31;
            boolean z = this.f67248b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            C38115c cVar = this.f67247a;
            boolean z = this.f67248b;
            return "OnFavoritePressed(product=" + cVar + ", isInShoppingList=" + z + ")";
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$c */
    public static final class C27731c implements C27728a {

        /* renamed from: e */
        public static final int f67249e = 8;
        @C12579k

        /* renamed from: a */
        public final String f67250a;

        /* renamed from: b */
        public final int f67251b;

        /* renamed from: c */
        public final int f67252c;
        @C12579k

        /* renamed from: d */
        public final C38115c f67253d;

        public /* synthetic */ C27731c(String str, int i, int i2, C38115c cVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, i2, cVar);
        }

        /* renamed from: f */
        public static /* synthetic */ C27731c m116548f(C27731c cVar, String str, int i, int i2, C38115c cVar2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = cVar.f67250a;
            }
            if ((i3 & 2) != 0) {
                i = cVar.f67251b;
            }
            if ((i3 & 4) != 0) {
                i2 = cVar.f67252c;
            }
            if ((i3 & 8) != 0) {
                cVar2 = cVar.f67253d;
            }
            return cVar.mo80522e(str, i, i2, cVar2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo80518a() {
            return this.f67250a;
        }

        /* renamed from: b */
        public final int mo80519b() {
            return this.f67251b;
        }

        /* renamed from: c */
        public final int mo80520c() {
            return this.f67252c;
        }

        @C12579k
        /* renamed from: d */
        public final C38115c mo80521d() {
            return this.f67253d;
        }

        @C12579k
        /* renamed from: e */
        public final C27731c mo80522e(@C12579k String str, int i, int i2, @C12579k C38115c cVar) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(cVar, "initialProduct");
            return new C27731c(str, i, i2, cVar, (DefaultConstructorMarker) null);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27731c)) {
                return false;
            }
            C27731c cVar = (C27731c) obj;
            return Gtin.m157311e(this.f67250a, cVar.f67250a) && this.f67251b == cVar.f67251b && this.f67252c == cVar.f67252c && Intrinsics.areEqual((Object) this.f67253d, (Object) cVar.f67253d);
        }

        /* renamed from: g */
        public final int mo80524g() {
            return this.f67251b;
        }

        @C12579k
        /* renamed from: h */
        public final String mo80525h() {
            return this.f67250a;
        }

        public int hashCode() {
            return (((((Gtin.m157312g(this.f67250a) * 31) + Integer.hashCode(this.f67251b)) * 31) + Integer.hashCode(this.f67252c)) * 31) + this.f67253d.hashCode();
        }

        @C12579k
        /* renamed from: i */
        public final C38115c mo80527i() {
            return this.f67253d;
        }

        /* renamed from: j */
        public final int mo80528j() {
            return this.f67252c;
        }

        @C12579k
        public String toString() {
            String h = Gtin.m157313h(this.f67250a);
            int i = this.f67251b;
            int i2 = this.f67252c;
            C38115c cVar = this.f67253d;
            return "OnQuantityPressed(gtin=" + h + ", currentQuantity=" + i + ", position=" + i2 + ", initialProduct=" + cVar + ")";
        }

        public C27731c(String str, int i, int i2, C38115c cVar) {
            Intrinsics.checkNotNullParameter(str, "gtin");
            Intrinsics.checkNotNullParameter(cVar, "initialProduct");
            this.f67250a = str;
            this.f67251b = i;
            this.f67252c = i2;
            this.f67253d = cVar;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$d */
    public static final class C27732d implements C27728a {
        @C12579k

        /* renamed from: a */
        public static final C27732d f67254a = new C27732d();

        /* renamed from: b */
        public static final int f67255b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$e */
    public static final class C27733e implements C27728a {
        @C12579k

        /* renamed from: a */
        public static final C27733e f67256a = new C27733e();

        /* renamed from: b */
        public static final int f67257b = 0;
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.product.presentation.ui.bottomsheet.a$f */
    public static final class C27734f implements C27728a {

        /* renamed from: b */
        public static final int f67258b = 8;
        @C12579k

        /* renamed from: a */
        public final Throwable f67259a;

        public C27734f(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.f67259a = th;
        }

        /* renamed from: c */
        public static /* synthetic */ C27734f m116558c(C27734f fVar, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = fVar.f67259a;
            }
            return fVar.mo80531b(th);
        }

        @C12579k
        /* renamed from: a */
        public final Throwable mo80530a() {
            return this.f67259a;
        }

        @C12579k
        /* renamed from: b */
        public final C27734f mo80531b(@C12579k Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            return new C27734f(th);
        }

        @C12579k
        /* renamed from: d */
        public final Throwable mo80532d() {
            return this.f67259a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C27734f) && Intrinsics.areEqual((Object) this.f67259a, (Object) ((C27734f) obj).f67259a);
        }

        public int hashCode() {
            return this.f67259a.hashCode();
        }

        @C12579k
        public String toString() {
            Throwable th = this.f67259a;
            return "OnUpdateError(throwable=" + th + ")";
        }
    }
}
