package com.carrefour.fid.android.presentation.p035ui.orders.online.view;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel;
import com.carrefour.fid.android.presentation.viewmodels.order.refont.view.SelfCareType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J_\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\n2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000fHÆ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0018\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006<"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/view/OrderOnlineItemModel;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderModel;", "a", "", "b", "", "c", "d", "e", "Lcom/carrefour/fid/android/presentation/ui/orders/online/view/TextStatusVariant;", "f", "", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/SelfCareType;", "g", "", "h", "orderHeaderModel", "hasProgressBar", "targetStep", "maxStep", "textStatus", "textStatusVariant", "listSafeCares", "totalOrder", "i", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderModel;", "n", "()Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderModel;", "Z", "k", "()Z", "I", "o", "()I", "m", "p", "Lcom/carrefour/fid/android/presentation/ui/orders/online/view/TextStatusVariant;", "q", "()Lcom/carrefour/fid/android/presentation/ui/orders/online/view/TextStatusVariant;", "Ljava/util/List;", "l", "()Ljava/util/List;", "v", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "<init>", "(Lcom/carrefour/fid/android/presentation/viewmodels/order/refont/view/OrderHeaderModel;ZIIILcom/carrefour/fid/android/presentation/ui/orders/online/view/TextStatusVariant;Ljava/util/List;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel */
public final class OrderOnlineItemModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<OrderOnlineItemModel> CREATOR = new C25269a();

    /* renamed from: w */
    public static final int f62327w = 8;
    @C12579k

    /* renamed from: a */
    public final OrderHeaderModel f62328a;

    /* renamed from: b */
    public final boolean f62329b;

    /* renamed from: c */
    public final int f62330c;

    /* renamed from: d */
    public final int f62331d;

    /* renamed from: e */
    public final int f62332e;
    @C12579k

    /* renamed from: f */
    public final TextStatusVariant f62333f;
    @C12579k

    /* renamed from: g */
    public final List<SelfCareType> f62334g;
    @C12579k

    /* renamed from: v */
    public final String f62335v;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.view.OrderOnlineItemModel$a */
    public static final class C25269a implements Parcelable.Creator<OrderOnlineItemModel> {
        @C12579k
        /* renamed from: a */
        public final OrderOnlineItemModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            OrderHeaderModel createFromParcel = OrderHeaderModel.CREATOR.createFromParcel(parcel);
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            TextStatusVariant valueOf = TextStatusVariant.valueOf(parcel.readString());
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            while (true) {
                String readString = parcel.readString();
                if (i == readInt4) {
                    return new OrderOnlineItemModel(createFromParcel, z, readInt, readInt2, readInt3, valueOf, arrayList, readString);
                }
                arrayList.add(SelfCareType.valueOf(readString));
                i++;
            }
        }

        @C12579k
        /* renamed from: b */
        public final OrderOnlineItemModel[] newArray(int i) {
            return new OrderOnlineItemModel[i];
        }
    }

    public OrderOnlineItemModel() {
        this((OrderHeaderModel) null, false, 0, 0, 0, (TextStatusVariant) null, (List) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* renamed from: j */
    public static /* synthetic */ OrderOnlineItemModel m109344j(OrderOnlineItemModel orderOnlineItemModel, OrderHeaderModel orderHeaderModel, boolean z, int i, int i2, int i3, TextStatusVariant textStatusVariant, List list, String str, int i4, Object obj) {
        OrderOnlineItemModel orderOnlineItemModel2 = orderOnlineItemModel;
        int i5 = i4;
        return orderOnlineItemModel.mo73697i((i5 & 1) != 0 ? orderOnlineItemModel2.f62328a : orderHeaderModel, (i5 & 2) != 0 ? orderOnlineItemModel2.f62329b : z, (i5 & 4) != 0 ? orderOnlineItemModel2.f62330c : i, (i5 & 8) != 0 ? orderOnlineItemModel2.f62331d : i2, (i5 & 16) != 0 ? orderOnlineItemModel2.f62332e : i3, (i5 & 32) != 0 ? orderOnlineItemModel2.f62333f : textStatusVariant, (i5 & 64) != 0 ? orderOnlineItemModel2.f62334g : list, (i5 & 128) != 0 ? orderOnlineItemModel2.f62335v : str);
    }

    @C12579k
    /* renamed from: a */
    public final OrderHeaderModel mo73686a() {
        return this.f62328a;
    }

    /* renamed from: b */
    public final boolean mo73687b() {
        return this.f62329b;
    }

    /* renamed from: c */
    public final int mo73688c() {
        return this.f62330c;
    }

    /* renamed from: d */
    public final int mo73689d() {
        return this.f62331d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo73691e() {
        return this.f62332e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderOnlineItemModel)) {
            return false;
        }
        OrderOnlineItemModel orderOnlineItemModel = (OrderOnlineItemModel) obj;
        return Intrinsics.areEqual((Object) this.f62328a, (Object) orderOnlineItemModel.f62328a) && this.f62329b == orderOnlineItemModel.f62329b && this.f62330c == orderOnlineItemModel.f62330c && this.f62331d == orderOnlineItemModel.f62331d && this.f62332e == orderOnlineItemModel.f62332e && this.f62333f == orderOnlineItemModel.f62333f && Intrinsics.areEqual((Object) this.f62334g, (Object) orderOnlineItemModel.f62334g) && Intrinsics.areEqual((Object) this.f62335v, (Object) orderOnlineItemModel.f62335v);
    }

    @C12579k
    /* renamed from: f */
    public final TextStatusVariant mo73693f() {
        return this.f62333f;
    }

    @C12579k
    /* renamed from: g */
    public final List<SelfCareType> mo73694g() {
        return this.f62334g;
    }

    @C12579k
    /* renamed from: h */
    public final String mo73695h() {
        return this.f62335v;
    }

    public int hashCode() {
        int hashCode = this.f62328a.hashCode() * 31;
        boolean z = this.f62329b;
        if (z) {
            z = true;
        }
        return ((((((((((((hashCode + (z ? 1 : 0)) * 31) + Integer.hashCode(this.f62330c)) * 31) + Integer.hashCode(this.f62331d)) * 31) + Integer.hashCode(this.f62332e)) * 31) + this.f62333f.hashCode()) * 31) + this.f62334g.hashCode()) * 31) + this.f62335v.hashCode();
    }

    @C12579k
    /* renamed from: i */
    public final OrderOnlineItemModel mo73697i(@C12579k OrderHeaderModel orderHeaderModel, boolean z, int i, int i2, int i3, @C12579k TextStatusVariant textStatusVariant, @C12579k List<? extends SelfCareType> list, @C12579k String str) {
        Intrinsics.checkNotNullParameter(orderHeaderModel, "orderHeaderModel");
        TextStatusVariant textStatusVariant2 = textStatusVariant;
        Intrinsics.checkNotNullParameter(textStatusVariant2, "textStatusVariant");
        List<? extends SelfCareType> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "listSafeCares");
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "totalOrder");
        return new OrderOnlineItemModel(orderHeaderModel, z, i, i2, i3, textStatusVariant2, list2, str2);
    }

    /* renamed from: k */
    public final boolean mo73698k() {
        return this.f62329b;
    }

    @C12579k
    /* renamed from: l */
    public final List<SelfCareType> mo73699l() {
        return this.f62334g;
    }

    /* renamed from: m */
    public final int mo73700m() {
        return this.f62331d;
    }

    @C12579k
    /* renamed from: n */
    public final OrderHeaderModel mo73701n() {
        return this.f62328a;
    }

    /* renamed from: o */
    public final int mo73702o() {
        return this.f62330c;
    }

    /* renamed from: p */
    public final int mo73703p() {
        return this.f62332e;
    }

    @C12579k
    /* renamed from: q */
    public final TextStatusVariant mo73704q() {
        return this.f62333f;
    }

    @C12579k
    /* renamed from: r */
    public final String mo73705r() {
        return this.f62335v;
    }

    @C12579k
    public String toString() {
        OrderHeaderModel orderHeaderModel = this.f62328a;
        boolean z = this.f62329b;
        int i = this.f62330c;
        int i2 = this.f62331d;
        int i3 = this.f62332e;
        TextStatusVariant textStatusVariant = this.f62333f;
        List<SelfCareType> list = this.f62334g;
        String str = this.f62335v;
        return "OrderOnlineItemModel(orderHeaderModel=" + orderHeaderModel + ", hasProgressBar=" + z + ", targetStep=" + i + ", maxStep=" + i2 + ", textStatus=" + i3 + ", textStatusVariant=" + textStatusVariant + ", listSafeCares=" + list + ", totalOrder=" + str + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.f62328a.writeToParcel(parcel, i);
        parcel.writeInt(this.f62329b ? 1 : 0);
        parcel.writeInt(this.f62330c);
        parcel.writeInt(this.f62331d);
        parcel.writeInt(this.f62332e);
        parcel.writeString(this.f62333f.name());
        List<SelfCareType> list = this.f62334g;
        parcel.writeInt(list.size());
        for (SelfCareType name : list) {
            parcel.writeString(name.name());
        }
        parcel.writeString(this.f62335v);
    }

    public OrderOnlineItemModel(@C12579k OrderHeaderModel orderHeaderModel, boolean z, int i, int i2, int i3, @C12579k TextStatusVariant textStatusVariant, @C12579k List<? extends SelfCareType> list, @C12579k String str) {
        Intrinsics.checkNotNullParameter(orderHeaderModel, "orderHeaderModel");
        Intrinsics.checkNotNullParameter(textStatusVariant, "textStatusVariant");
        Intrinsics.checkNotNullParameter(list, "listSafeCares");
        Intrinsics.checkNotNullParameter(str, "totalOrder");
        this.f62328a = orderHeaderModel;
        this.f62329b = z;
        this.f62330c = i;
        this.f62331d = i2;
        this.f62332e = i3;
        this.f62333f = textStatusVariant;
        this.f62334g = list;
        this.f62335v = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OrderOnlineItemModel(com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel r11, boolean r12, int r13, int r14, int r15, com.carrefour.fid.android.presentation.p035ui.orders.online.view.TextStatusVariant r16, java.util.List r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0015
            com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel r1 = new com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 31
            r9 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0016
        L_0x0015:
            r1 = r11
        L_0x0016:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x001c
            r2 = 1
            goto L_0x001d
        L_0x001c:
            r2 = r12
        L_0x001d:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0023
            r3 = 2
            goto L_0x0024
        L_0x0023:
            r3 = r13
        L_0x0024:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002a
            r4 = 3
            goto L_0x002b
        L_0x002a:
            r4 = r14
        L_0x002b:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0033
            r5 = 2131953374(0x7f1306de, float:1.9543217E38)
            goto L_0x0034
        L_0x0033:
            r5 = r15
        L_0x0034:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x003b
            com.carrefour.fid.android.presentation.ui.orders.online.view.TextStatusVariant r6 = com.carrefour.fid.android.presentation.p035ui.orders.online.view.TextStatusVariant.Green
            goto L_0x003d
        L_0x003b:
            r6 = r16
        L_0x003d:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0046
            java.util.List r7 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0048
        L_0x0046:
            r7 = r17
        L_0x0048:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "125,00€"
            goto L_0x0051
        L_0x004f:
            r0 = r18
        L_0x0051:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.orders.online.view.OrderOnlineItemModel.<init>(com.carrefour.fid.android.presentation.viewmodels.order.refont.view.OrderHeaderModel, boolean, int, int, int, com.carrefour.fid.android.presentation.ui.orders.online.view.TextStatusVariant, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
