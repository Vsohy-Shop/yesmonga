package com.carrefour.fid.android.presentation.viewmodels.order.refont.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0324b1;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\n\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010!\"\u0004\b#\u0010$R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderModel;", "Landroid/os/Parcelable;", "", "a", "b", "", "c", "d", "", "e", "icon", "title", "orderNumber", "dateTime", "hasDateTime", "f", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "j", "()I", "l", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "h", "m", "(Ljava/lang/String;)V", "Z", "i", "()Z", "n", "(Z)V", "<init>", "(IILjava/lang/String;Ljava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderHeaderModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderHeaderModel> CREATOR = new C27078a();

    /* renamed from: f */
    public static final int f65857f = 8;

    /* renamed from: a */
    public final int f65858a;

    /* renamed from: b */
    public final int f65859b;
    @C12579k

    /* renamed from: c */
    public final String f65860c;
    @C12579k

    /* renamed from: d */
    public String f65861d;

    /* renamed from: e */
    public boolean f65862e;

    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel$a */
    public static final class C27078a implements Parcelable.Creator<OrderHeaderModel> {
        @C12579k
        /* renamed from: a */
        public final OrderHeaderModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderHeaderModel(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @C12579k
        /* renamed from: b */
        public final OrderHeaderModel[] newArray(int i) {
            return new OrderHeaderModel[i];
        }
    }

    public OrderHeaderModel() {
        this(0, 0, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ OrderHeaderModel m114487g(OrderHeaderModel orderHeaderModel, int i, int i2, String str, String str2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = orderHeaderModel.f65858a;
        }
        if ((i3 & 2) != 0) {
            i2 = orderHeaderModel.f65859b;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = orderHeaderModel.f65860c;
        }
        String str3 = str;
        if ((i3 & 8) != 0) {
            str2 = orderHeaderModel.f65861d;
        }
        String str4 = str2;
        if ((i3 & 16) != 0) {
            z = orderHeaderModel.f65862e;
        }
        return orderHeaderModel.mo78708f(i, i4, str3, str4, z);
    }

    /* renamed from: a */
    public final int mo78701a() {
        return this.f65858a;
    }

    /* renamed from: b */
    public final int mo78702b() {
        return this.f65859b;
    }

    @C12579k
    /* renamed from: c */
    public final String mo78703c() {
        return this.f65860c;
    }

    @C12579k
    /* renamed from: d */
    public final String mo78704d() {
        return this.f65861d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo78706e() {
        return this.f65862e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderHeaderModel)) {
            return false;
        }
        OrderHeaderModel orderHeaderModel = (OrderHeaderModel) obj;
        return this.f65858a == orderHeaderModel.f65858a && this.f65859b == orderHeaderModel.f65859b && Intrinsics.areEqual((Object) this.f65860c, (Object) orderHeaderModel.f65860c) && Intrinsics.areEqual((Object) this.f65861d, (Object) orderHeaderModel.f65861d) && this.f65862e == orderHeaderModel.f65862e;
    }

    @C12579k
    /* renamed from: f */
    public final OrderHeaderModel mo78708f(@C0375v int i, @C0324b1 int i2, @C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "orderNumber");
        Intrinsics.checkNotNullParameter(str2, "dateTime");
        return new OrderHeaderModel(i, i2, str, str2, z);
    }

    @C12579k
    /* renamed from: h */
    public final String mo78709h() {
        return this.f65861d;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f65858a) * 31) + Integer.hashCode(this.f65859b)) * 31) + this.f65860c.hashCode()) * 31) + this.f65861d.hashCode()) * 31;
        boolean z = this.f65862e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo78711i() {
        return this.f65862e;
    }

    /* renamed from: j */
    public final int mo78712j() {
        return this.f65858a;
    }

    @C12579k
    /* renamed from: k */
    public final String mo78713k() {
        return this.f65860c;
    }

    /* renamed from: l */
    public final int mo78714l() {
        return this.f65859b;
    }

    /* renamed from: m */
    public final void mo78715m(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f65861d = str;
    }

    /* renamed from: n */
    public final void mo78716n(boolean z) {
        this.f65862e = z;
    }

    @C12579k
    public String toString() {
        int i = this.f65858a;
        int i2 = this.f65859b;
        String str = this.f65860c;
        String str2 = this.f65861d;
        boolean z = this.f65862e;
        return "OrderHeaderModel(icon=" + i + ", title=" + i2 + ", orderNumber=" + str + ", dateTime=" + str2 + ", hasDateTime=" + z + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f65858a);
        parcel.writeInt(this.f65859b);
        parcel.writeString(this.f65860c);
        parcel.writeString(this.f65861d);
        parcel.writeInt(this.f65862e ? 1 : 0);
    }

    public OrderHeaderModel(@C0375v int i, @C0324b1 int i2, @C12579k String str, @C12579k String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "orderNumber");
        Intrinsics.checkNotNullParameter(str2, "dateTime");
        this.f65858a = i;
        this.f65859b = i2;
        this.f65860c = str;
        this.f65861d = str2;
        this.f65862e = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderHeaderModel(int r4, int r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0007
            r4 = 2131231697(0x7f0803d1, float:1.8079482E38)
        L_0x0007:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000e
            r5 = 2131953386(0x7f1306ea, float:1.9543242E38)
        L_0x000e:
            r10 = r5
            r5 = r9 & 4
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r6
        L_0x0018:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0023
            r8 = 1
        L_0x0023:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel.<init>(int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
