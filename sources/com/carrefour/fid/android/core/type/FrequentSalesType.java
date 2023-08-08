package com.carrefour.fid.android.core.type;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.browser.customtabs.C0903b;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.ecommerce.utils.C38212b;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FrequentSalesType;", "Landroid/os/Parcelable;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "value", "", "I", "()I", "position", "<init>", "(Ljava/lang/String;I)V", "Mixte", "Offline", "Online", "Unknown", "Lcom/carrefour/fid/android/core/type/FrequentSalesType$Mixte;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType$Offline;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType$Online;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType$Unknown;", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public abstract class FrequentSalesType implements Parcelable {

    /* renamed from: c */
    public static final int f89847c = 0;
    @C12579k

    /* renamed from: a */
    public final String f89848a;

    /* renamed from: b */
    public final int f89849b;

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FrequentSalesType$Mixte;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Mixte extends FrequentSalesType {
        @C12579k
        public static final Parcelable.Creator<Mixte> CREATOR = new C36352a();
        @C12579k

        /* renamed from: d */
        public static final Mixte f89850d = new Mixte();

        /* renamed from: e */
        public static final int f89851e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.FrequentSalesType$Mixte$a */
        public static final class C36352a implements Parcelable.Creator<Mixte> {
            @C12579k
            /* renamed from: a */
            public final Mixte createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Mixte.f89850d;
            }

            @C12579k
            /* renamed from: b */
            public final Mixte[] newArray(int i) {
                return new Mixte[i];
            }
        }

        public Mixte() {
            super(C38212b.f96791K, -1, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FrequentSalesType$Offline;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Offline extends FrequentSalesType {
        @C12579k
        public static final Parcelable.Creator<Offline> CREATOR = new C36353a();
        @C12579k

        /* renamed from: d */
        public static final Offline f89852d = new Offline();

        /* renamed from: e */
        public static final int f89853e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.FrequentSalesType$Offline$a */
        public static final class C36353a implements Parcelable.Creator<Offline> {
            @C12579k
            /* renamed from: a */
            public final Offline createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Offline.f89852d;
            }

            @C12579k
            /* renamed from: b */
            public final Offline[] newArray(int i) {
                return new Offline[i];
            }
        }

        public Offline() {
            super("offline", 1, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FrequentSalesType$Online;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Online extends FrequentSalesType {
        @C12579k
        public static final Parcelable.Creator<Online> CREATOR = new C36354a();
        @C12579k

        /* renamed from: d */
        public static final Online f89854d = new Online();

        /* renamed from: e */
        public static final int f89855e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.FrequentSalesType$Online$a */
        public static final class C36354a implements Parcelable.Creator<Online> {
            @C12579k
            /* renamed from: a */
            public final Online createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Online.f89854d;
            }

            @C12579k
            /* renamed from: b */
            public final Online[] newArray(int i) {
                return new Online[i];
            }
        }

        public Online() {
            super(C0903b.f2827g, 0, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001¨\u0006\u000b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/type/FrequentSalesType$Unknown;", "Lcom/carrefour/fid/android/core/type/FrequentSalesType;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    @C8567o(parameters = 0)
    @C12187d
    public static final class Unknown extends FrequentSalesType {
        @C12579k
        public static final Parcelable.Creator<Unknown> CREATOR = new C36355a();
        @C12579k

        /* renamed from: d */
        public static final Unknown f89856d = new Unknown();

        /* renamed from: e */
        public static final int f89857e = 0;

        /* renamed from: com.carrefour.fid.android.core.type.FrequentSalesType$Unknown$a */
        public static final class C36355a implements Parcelable.Creator<Unknown> {
            @C12579k
            /* renamed from: a */
            public final Unknown createFromParcel(@C12579k Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f89856d;
            }

            @C12579k
            /* renamed from: b */
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown() {
            super("unknown", -1, (DefaultConstructorMarker) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@C12579k Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ FrequentSalesType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* renamed from: a */
    public final int mo108479a() {
        return this.f89849b;
    }

    @C12579k
    /* renamed from: b */
    public final String mo108480b() {
        return this.f89848a;
    }

    public FrequentSalesType(String str, int i) {
        this.f89848a = str;
        this.f89849b = i;
    }
}
