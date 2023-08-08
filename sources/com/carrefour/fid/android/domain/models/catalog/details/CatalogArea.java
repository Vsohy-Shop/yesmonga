package com.carrefour.fid.android.domain.models.catalog.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/catalog/details/CatalogArea;", "Landroid/os/Parcelable;", "", "a", "b", "c", "d", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "e", "x", "y", "height", "width", "product", "f", "", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "i", "()I", "j", "getHeight", "getWidth", "Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "h", "()Lcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;", "<init>", "(IIIILcom/carrefour/fid/android/domain/models/catalog/productdetails/CatalogProduct;)V", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
public final class CatalogArea implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<CatalogArea> CREATOR = new C37980a();

    /* renamed from: a */
    public final int f95565a;

    /* renamed from: b */
    public final int f95566b;

    /* renamed from: c */
    public final int f95567c;

    /* renamed from: d */
    public final int f95568d;
    @C12580l

    /* renamed from: e */
    public final CatalogProduct f95569e;

    /* renamed from: com.carrefour.fid.android.domain.models.catalog.details.CatalogArea$a */
    public static final class C37980a implements Parcelable.Creator<CatalogArea> {
        @C12579k
        /* renamed from: a */
        public final CatalogArea createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CatalogArea(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : CatalogProduct.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final CatalogArea[] newArray(int i) {
            return new CatalogArea[i];
        }
    }

    public CatalogArea() {
        this(0, 0, 0, 0, (CatalogProduct) null, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ CatalogArea m156235g(CatalogArea catalogArea, int i, int i2, int i3, int i4, CatalogProduct catalogProduct, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = catalogArea.f95565a;
        }
        if ((i5 & 2) != 0) {
            i2 = catalogArea.f95566b;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = catalogArea.f95567c;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = catalogArea.f95568d;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            catalogProduct = catalogArea.f95569e;
        }
        return catalogArea.mo117101f(i, i6, i7, i8, catalogProduct);
    }

    /* renamed from: a */
    public final int mo117094a() {
        return this.f95565a;
    }

    /* renamed from: b */
    public final int mo117095b() {
        return this.f95566b;
    }

    /* renamed from: c */
    public final int mo117096c() {
        return this.f95567c;
    }

    /* renamed from: d */
    public final int mo117097d() {
        return this.f95568d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final CatalogProduct mo117099e() {
        return this.f95569e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArea)) {
            return false;
        }
        CatalogArea catalogArea = (CatalogArea) obj;
        return this.f95565a == catalogArea.f95565a && this.f95566b == catalogArea.f95566b && this.f95567c == catalogArea.f95567c && this.f95568d == catalogArea.f95568d && Intrinsics.areEqual((Object) this.f95569e, (Object) catalogArea.f95569e);
    }

    @C12579k
    /* renamed from: f */
    public final CatalogArea mo117101f(int i, int i2, int i3, int i4, @C12580l CatalogProduct catalogProduct) {
        return new CatalogArea(i, i2, i3, i4, catalogProduct);
    }

    public final int getHeight() {
        return this.f95567c;
    }

    public final int getWidth() {
        return this.f95568d;
    }

    @C12580l
    /* renamed from: h */
    public final CatalogProduct mo117104h() {
        return this.f95569e;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f95565a) * 31) + Integer.hashCode(this.f95566b)) * 31) + Integer.hashCode(this.f95567c)) * 31) + Integer.hashCode(this.f95568d)) * 31;
        CatalogProduct catalogProduct = this.f95569e;
        return hashCode + (catalogProduct == null ? 0 : catalogProduct.hashCode());
    }

    /* renamed from: i */
    public final int mo117106i() {
        return this.f95565a;
    }

    /* renamed from: j */
    public final int mo117107j() {
        return this.f95566b;
    }

    @C12579k
    public String toString() {
        int i = this.f95565a;
        int i2 = this.f95566b;
        int i3 = this.f95567c;
        int i4 = this.f95568d;
        CatalogProduct catalogProduct = this.f95569e;
        return "CatalogArea(x=" + i + ", y=" + i2 + ", height=" + i3 + ", width=" + i4 + ", product=" + catalogProduct + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f95565a);
        parcel.writeInt(this.f95566b);
        parcel.writeInt(this.f95567c);
        parcel.writeInt(this.f95568d);
        CatalogProduct catalogProduct = this.f95569e;
        if (catalogProduct == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        catalogProduct.writeToParcel(parcel, i);
    }

    public CatalogArea(int i, int i2, int i3, int i4, @C12580l CatalogProduct catalogProduct) {
        this.f95565a = i;
        this.f95566b = i2;
        this.f95567c = i3;
        this.f95568d = i4;
        this.f95569e = catalogProduct;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogArea(int r4, int r5, int r6, int r7, com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r7
        L_0x001c:
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.models.catalog.details.CatalogArea.<init>(int, int, int, int, com.carrefour.fid.android.domain.models.catalog.productdetails.CatalogProduct, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
