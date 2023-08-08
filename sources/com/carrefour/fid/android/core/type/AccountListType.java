package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u001d\b\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType;", "Landroid/os/Parcelable;", "", "a", "I", "()I", "iconResId", "b", "labelResId", "<init>", "(II)V", "Catalog", "Frequent", "Memos", "MemosRecommendedProducts", "Order", "Shopping", "Lcom/carrefour/fid/android/core/type/AccountListType$Catalog;", "Lcom/carrefour/fid/android/core/type/AccountListType$Frequent;", "Lcom/carrefour/fid/android/core/type/AccountListType$Memos;", "Lcom/carrefour/fid/android/core/type/AccountListType$MemosRecommendedProducts;", "Lcom/carrefour/fid/android/core/type/AccountListType$Order;", "Lcom/carrefour/fid/android/core/type/AccountListType$Shopping;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class AccountListType implements Parcelable {

    /* renamed from: c */
    public static final int f89761c = 0;

    /* renamed from: a */
    public final int f89762a;

    /* renamed from: b */
    public final int f89763b;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$Catalog;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Catalog extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<Catalog> CREATOR = new C36339a();
        @C12579k

        /* renamed from: d */
        public static final Catalog f89764d = new Catalog();

        /* renamed from: e */
        public static final int f89765e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$Catalog$a */
        public static final class C36339a implements Parcelable.Creator<Catalog> {
            @C12579k
            /* renamed from: a */
            public final Catalog createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Catalog.f89764d;
            }

            @C12579k
            /* renamed from: b */
            public final Catalog[] newArray(int i) {
                return new Catalog[i];
            }
        }

        public Catalog() {
            super(R.drawable.ic_list, R.string.shopping_my_list_catalog, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$Frequent;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Frequent extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<Frequent> CREATOR = new C36340a();
        @C12579k

        /* renamed from: d */
        public static final Frequent f89766d = new Frequent();

        /* renamed from: e */
        public static final int f89767e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$Frequent$a */
        public static final class C36340a implements Parcelable.Creator<Frequent> {
            @C12579k
            /* renamed from: a */
            public final Frequent createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Frequent.f89766d;
            }

            @C12579k
            /* renamed from: b */
            public final Frequent[] newArray(int i) {
                return new Frequent[i];
            }
        }

        public Frequent() {
            super(R.drawable.ic_purchase_frequent, R.string.shopping_title_frequent_sales, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$Memos;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Memos extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<Memos> CREATOR = new C36341a();
        @C12579k

        /* renamed from: d */
        public static final Memos f89768d = new Memos();

        /* renamed from: e */
        public static final int f89769e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$Memos$a */
        public static final class C36341a implements Parcelable.Creator<Memos> {
            @C12579k
            /* renamed from: a */
            public final Memos createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Memos.f89768d;
            }

            @C12579k
            /* renamed from: b */
            public final Memos[] newArray(int i) {
                return new Memos[i];
            }
        }

        public Memos() {
            super(R.drawable.ic_list, R.string.shopping_my_list_memos, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$MemosRecommendedProducts;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class MemosRecommendedProducts extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<MemosRecommendedProducts> CREATOR = new C36342a();
        @C12579k

        /* renamed from: d */
        public static final MemosRecommendedProducts f89770d = new MemosRecommendedProducts();

        /* renamed from: e */
        public static final int f89771e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$MemosRecommendedProducts$a */
        public static final class C36342a implements Parcelable.Creator<MemosRecommendedProducts> {
            @C12579k
            /* renamed from: a */
            public final MemosRecommendedProducts createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MemosRecommendedProducts.f89770d;
            }

            @C12579k
            /* renamed from: b */
            public final MemosRecommendedProducts[] newArray(int i) {
                return new MemosRecommendedProducts[i];
            }
        }

        public MemosRecommendedProducts() {
            super(R.drawable.ic_list, R.string.shopping_my_list_memos, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$Order;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Order extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<Order> CREATOR = new C36343a();
        @C12579k

        /* renamed from: d */
        public static final Order f89772d = new Order();

        /* renamed from: e */
        public static final int f89773e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$Order$a */
        public static final class C36343a implements Parcelable.Creator<Order> {
            @C12579k
            /* renamed from: a */
            public final Order createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Order.f89772d;
            }

            @C12579k
            /* renamed from: b */
            public final Order[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order() {
            super(R.drawable.ic_purchase, R.string.shopping_title_last_order, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/AccountListType$Shopping;", "Lcom/carrefour/fid/android/core/type/AccountListType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Shopping extends AccountListType {
        @C12579k
        public static final Parcelable.Creator<Shopping> CREATOR = new C36344a();
        @C12579k

        /* renamed from: d */
        public static final Shopping f89774d = new Shopping();

        /* renamed from: e */
        public static final int f89775e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.AccountListType$Shopping$a */
        public static final class C36344a implements Parcelable.Creator<Shopping> {
            @C12579k
            /* renamed from: a */
            public final Shopping createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Shopping.f89774d;
            }

            @C12579k
            /* renamed from: b */
            public final Shopping[] newArray(int i) {
                return new Shopping[i];
            }
        }

        public Shopping() {
            super(R.drawable.ic_add_list, R.string.shopping_list_omnicanale_title, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ AccountListType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    /* renamed from: a */
    public final int mo108406a() {
        return this.f89762a;
    }

    /* renamed from: b */
    public final int mo108407b() {
        return this.f89763b;
    }

    public AccountListType(@C0375v int i, @C0324b1 int i2) {
        this.f89762a = i;
        this.f89763b = i2;
    }
}
