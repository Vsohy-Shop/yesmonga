package com.carrefour.fid.android.product.presentation.p039ui.details.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import com.carrefour.fid.android.domain.models.product.AllergenType;
import com.carrefour.fid.android.domain.models.product.NutritionalItem;
import com.carrefour.fid.android.product.presentation.p039ui.details.ProductDetailsSubComponentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0006\u0010 \u001a\u00020\t\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0018\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\u000f\u0012\b\u0010*\u001a\u0004\u0018\u00010&¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010%\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b\n\u0010\u0013R\u0019\u0010*\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)¨\u0006-"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductComposition;", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/ProductDetailsSubComponent;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;", "a", "Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;", "g", "()Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;", "ingredientsLabel", "", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "ingredientsDescription", "c", "i", "nutritionalLabel", "", "Lcom/carrefour/fid/android/domain/models/product/NutritionalItem;", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "nutritionalData", "e", "allergensLabel", "Lcom/carrefour/fid/android/domain/models/product/AllergenType;", "allergens", "alcoholVolumeLabel", "v", "alcoholVolumeDescription", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/AllergoBoxSubComponent;", "w", "Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/AllergoBoxSubComponent;", "()Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/AllergoBoxSubComponent;", "allergoBox", "<init>", "(Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;Ljava/lang/String;Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;Ljava/util/List;Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;Ljava/util/List;Lcom/carrefour/fid/android/product/presentation/ui/details/ProductDetailsSubComponentType;Ljava/lang/String;Lcom/carrefour/fid/android/product/presentation/ui/details/adapter/AllergoBoxSubComponent;)V", "product_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C12187d
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductComposition */
public final class ProductComposition extends ProductDetailsSubComponent {
    @C12579k
    public static final Parcelable.Creator<ProductComposition> CREATOR = new C27765a();
    @C12579k

    /* renamed from: a */
    public final ProductDetailsSubComponentType f67328a;
    @C12579k

    /* renamed from: b */
    public final String f67329b;
    @C12579k

    /* renamed from: c */
    public final ProductDetailsSubComponentType f67330c;
    @C12580l

    /* renamed from: d */
    public final List<NutritionalItem> f67331d;
    @C12579k

    /* renamed from: e */
    public final ProductDetailsSubComponentType f67332e;
    @C12579k

    /* renamed from: f */
    public final List<AllergenType> f67333f;
    @C12579k

    /* renamed from: g */
    public final ProductDetailsSubComponentType f67334g;
    @C12579k

    /* renamed from: v */
    public final String f67335v;
    @C12580l

    /* renamed from: w */
    public final AllergoBoxSubComponent f67336w;

    /* renamed from: com.carrefour.fid.android.product.presentation.ui.details.adapter.ProductComposition$a */
    public static final class C27765a implements Parcelable.Creator<ProductComposition> {
        @C12579k
        /* renamed from: a */
        public final ProductComposition createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ProductDetailsSubComponentType valueOf = ProductDetailsSubComponentType.valueOf(parcel.readString());
            String readString = parcel.readString();
            ProductDetailsSubComponentType valueOf2 = ProductDetailsSubComponentType.valueOf(parcel.readString());
            AllergoBoxSubComponent allergoBoxSubComponent = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(ProductComposition.class.getClassLoader()));
                }
            }
            ProductDetailsSubComponentType valueOf3 = ProductDetailsSubComponentType.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(AllergenType.valueOf(parcel.readString()));
            }
            ProductDetailsSubComponentType valueOf4 = ProductDetailsSubComponentType.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                allergoBoxSubComponent = AllergoBoxSubComponent.CREATOR.createFromParcel(parcel);
            }
            return new ProductComposition(valueOf, readString, valueOf2, arrayList, valueOf3, arrayList2, valueOf4, readString2, allergoBoxSubComponent);
        }

        @C12579k
        /* renamed from: b */
        public final ProductComposition[] newArray(int i) {
            return new ProductComposition[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductComposition(@C12579k ProductDetailsSubComponentType productDetailsSubComponentType, @C12579k String str, @C12579k ProductDetailsSubComponentType productDetailsSubComponentType2, @C12580l List<NutritionalItem> list, @C12579k ProductDetailsSubComponentType productDetailsSubComponentType3, @C12579k List<? extends AllergenType> list2, @C12579k ProductDetailsSubComponentType productDetailsSubComponentType4, @C12579k String str2, @C12580l AllergoBoxSubComponent allergoBoxSubComponent) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(productDetailsSubComponentType, "ingredientsLabel");
        Intrinsics.checkNotNullParameter(str, "ingredientsDescription");
        Intrinsics.checkNotNullParameter(productDetailsSubComponentType2, "nutritionalLabel");
        Intrinsics.checkNotNullParameter(productDetailsSubComponentType3, "allergensLabel");
        Intrinsics.checkNotNullParameter(list2, "allergens");
        Intrinsics.checkNotNullParameter(productDetailsSubComponentType4, "alcoholVolumeLabel");
        Intrinsics.checkNotNullParameter(str2, "alcoholVolumeDescription");
        this.f67328a = productDetailsSubComponentType;
        this.f67329b = str;
        this.f67330c = productDetailsSubComponentType2;
        this.f67331d = list;
        this.f67332e = productDetailsSubComponentType3;
        this.f67333f = list2;
        this.f67334g = productDetailsSubComponentType4;
        this.f67335v = str2;
        this.f67336w = allergoBoxSubComponent;
    }

    @C12579k
    /* renamed from: a */
    public final String mo80653a() {
        return this.f67335v;
    }

    @C12579k
    /* renamed from: b */
    public final ProductDetailsSubComponentType mo80654b() {
        return this.f67334g;
    }

    @C12579k
    /* renamed from: c */
    public final List<AllergenType> mo80655c() {
        return this.f67333f;
    }

    @C12579k
    /* renamed from: d */
    public final ProductDetailsSubComponentType mo80656d() {
        return this.f67332e;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final AllergoBoxSubComponent mo80658e() {
        return this.f67336w;
    }

    @C12579k
    /* renamed from: f */
    public final String mo80659f() {
        return this.f67329b;
    }

    @C12579k
    /* renamed from: g */
    public final ProductDetailsSubComponentType mo80660g() {
        return this.f67328a;
    }

    @C12580l
    /* renamed from: h */
    public final List<NutritionalItem> mo80661h() {
        return this.f67331d;
    }

    @C12579k
    /* renamed from: i */
    public final ProductDetailsSubComponentType mo80662i() {
        return this.f67330c;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f67328a.name());
        parcel.writeString(this.f67329b);
        parcel.writeString(this.f67330c.name());
        List<NutritionalItem> list = this.f67331d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (NutritionalItem writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeString(this.f67332e.name());
        List<AllergenType> list2 = this.f67333f;
        parcel.writeInt(list2.size());
        for (AllergenType name : list2) {
            parcel.writeString(name.name());
        }
        parcel.writeString(this.f67334g.name());
        parcel.writeString(this.f67335v);
        AllergoBoxSubComponent allergoBoxSubComponent = this.f67336w;
        if (allergoBoxSubComponent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        allergoBoxSubComponent.writeToParcel(parcel, i);
    }
}
