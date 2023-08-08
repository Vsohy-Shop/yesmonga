package com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.catalogs.presentation.models.C39452e;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import com.carrefour.fid.android.shared.base.C28505u;
import java.util.List;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b */
public final class C39654b {
    @C12579k

    /* renamed from: a */
    public static final C39654b f101271a = new C39654b();

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$a */
    public interface C39655a extends C28505u.C28506a {
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c */
    public interface C39660c extends C28505u.C28507b {

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c$a */
        public static final class C39661a implements C39660c {
            @C12579k

            /* renamed from: a */
            public static final C39661a f101277a = new C39661a();

            /* renamed from: b */
            public static final int f101278b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c$b */
        public static final class C39662b implements C39660c {
            @C12579k

            /* renamed from: a */
            public static final C39662b f101279a = new C39662b();

            /* renamed from: b */
            public static final int f101280b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c$c */
        public static final class C39663c implements C39660c {
            @C12579k

            /* renamed from: a */
            public static final C39663c f101281a = new C39663c();

            /* renamed from: b */
            public static final int f101282b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c$d */
        public static final class C39664d implements C39660c {
            @C12579k

            /* renamed from: a */
            public static final C39664d f101283a = new C39664d();

            /* renamed from: b */
            public static final int f101284b = 0;
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$c$e */
        public static final class C39665e implements C39660c {

            /* renamed from: b */
            public static final int f101285b = 8;
            @C12579k

            /* renamed from: a */
            public final CatalogProduct f101286a;

            public C39665e(@C12579k CatalogProduct catalogProduct) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                this.f101286a = catalogProduct;
            }

            /* renamed from: c */
            public static /* synthetic */ C39665e m162099c(C39665e eVar, CatalogProduct catalogProduct, int i, Object obj) {
                if ((i & 1) != 0) {
                    catalogProduct = eVar.f101286a;
                }
                return eVar.mo130939b(catalogProduct);
            }

            @C12579k
            /* renamed from: a */
            public final CatalogProduct mo130938a() {
                return this.f101286a;
            }

            @C12579k
            /* renamed from: b */
            public final C39665e mo130939b(@C12579k CatalogProduct catalogProduct) {
                Intrinsics.checkNotNullParameter(catalogProduct, "product");
                return new C39665e(catalogProduct);
            }

            @C12579k
            /* renamed from: d */
            public final CatalogProduct mo130940d() {
                return this.f101286a;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39665e) && Intrinsics.areEqual((Object) this.f101286a, (Object) ((C39665e) obj).f101286a);
            }

            public int hashCode() {
                return this.f101286a.hashCode();
            }

            @C12579k
            public String toString() {
                CatalogProduct catalogProduct = this.f101286a;
                return "RemoveProduct(product=" + catalogProduct + ")";
            }
        }
    }

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b */
    public interface C39656b extends C28505u.C28509d {

        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b$b */
        public static final class C39658b {
            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            /* renamed from: a */
            public static C28505u.C28509d m162098a(@C12579k C39656b bVar) {
                return C28505u.C28509d.C28510a.m118428a(bVar);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b$c */
        public static final class C39659c implements C39656b {
            @C12579k

            /* renamed from: b */
            public static final C39659c f101275b = new C39659c();

            /* renamed from: c */
            public static final int f101276c = 0;

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39658b.m162098a(this);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.b$b$a */
        public static final class C39657a implements C39656b {

            /* renamed from: d */
            public static final int f101272d = 8;
            @C12579k

            /* renamed from: b */
            public final List<C39452e> f101273b;
            @C12580l

            /* renamed from: c */
            public final C37999a f101274c;

            public C39657a(@C12579k List<C39452e> list, @C12580l C37999a aVar) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.f101273b = list;
                this.f101274c = aVar;
            }

            /* renamed from: h */
            public static /* synthetic */ C39657a m162092h(C39657a aVar, List<C39452e> list, C37999a aVar2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = aVar.f101273b;
                }
                if ((i & 2) != 0) {
                    aVar2 = aVar.f101274c;
                }
                return aVar.mo130933g(list, aVar2);
            }

            @C12579k
            /* renamed from: e */
            public final List<C39452e> mo130930e() {
                return this.f101273b;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C39657a)) {
                    return false;
                }
                C39657a aVar = (C39657a) obj;
                return Intrinsics.areEqual((Object) this.f101273b, (Object) aVar.f101273b) && Intrinsics.areEqual((Object) this.f101274c, (Object) aVar.f101274c);
            }

            @C12580l
            /* renamed from: f */
            public final C37999a mo130932f() {
                return this.f101274c;
            }

            @C12579k
            /* renamed from: g */
            public final C39657a mo130933g(@C12579k List<C39452e> list, @C12580l C37999a aVar) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new C39657a(list, aVar);
            }

            public int hashCode() {
                int hashCode = this.f101273b.hashCode() * 31;
                C37999a aVar = this.f101274c;
                return hashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            @C12580l
            /* renamed from: i */
            public final C37999a mo130935i() {
                return this.f101274c;
            }

            @C12579k
            /* renamed from: j */
            public final List<C39452e> mo130936j() {
                return this.f101273b;
            }

            @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
            @C12579k
            public C28505u.C28509d reset() {
                return C39658b.m162098a(this);
            }

            @C12579k
            public String toString() {
                List<C39452e> list = this.f101273b;
                C37999a aVar = this.f101274c;
                return "CatalogProductListContent(list=" + list + ", criteoBanner=" + aVar + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C39657a(List list, C37999a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : aVar);
            }
        }
    }
}
