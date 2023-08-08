package com.carrefour.fid.android.catalogs.core.type;

import androidx.annotation.C0324b1;
import com.carrefour.fid.android.catalogs.C39364b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/catalogs/core/type/CatalogsType;", "", "", "Lcom/carrefour/fid/android/catalogs/core/type/CatalogStoreFormat;", "formats", "Ljava/util/List;", "r", "()Ljava/util/List;", "", "title", "I", "w", "()I", "catalogsPosition", "q", "y", "(I)V", "<init>", "(Ljava/lang/String;ILjava/util/List;II)V", "a", "b", "c", "catalogs_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum CatalogsType {
    HYPERMARCHE(C10976s.m41419k(CatalogStoreFormat.HYPER), C39364b.C39383s.catalog_menu_filter_hyper, 0, 4, (int) null),
    f100746b(C10976s.m41419k(CatalogStoreFormat.f100738c), C39364b.C39383s.catalog_menu_filter_market, 0, 4, (int) null),
    PROXI(CollectionsKt__CollectionsKt.m40448L(CatalogStoreFormat.CITY, CatalogStoreFormat.f100740e, CatalogStoreFormat.CONTACT, CatalogStoreFormat.CONTACT_MARCHE, CatalogStoreFormat.DRIVE), C39364b.C39383s.catalog_menu_filter_proxi, 0, 4, (int) null);
    
    private int catalogsPosition;
    @C12579k
    private final List<CatalogStoreFormat> formats;
    private final int title;

    /* access modifiers changed from: public */
    CatalogsType(List<? extends CatalogStoreFormat> list, @C0324b1 int i, int i2) {
        this.formats = list;
        this.title = i;
        this.catalogsPosition = i2;
    }

    /* renamed from: q */
    public final int mo130271q() {
        return this.catalogsPosition;
    }

    @C12579k
    /* renamed from: r */
    public final List<CatalogStoreFormat> mo130272r() {
        return this.formats;
    }

    /* renamed from: w */
    public final int mo130273w() {
        return this.title;
    }

    /* renamed from: y */
    public final void mo130274y(int i) {
        this.catalogsPosition = i;
    }
}
