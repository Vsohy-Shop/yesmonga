package com.carrefour.fid.android.presentation.p035ui.orders.online.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0005JF\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u0005¨\u0006)"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;", "Landroid/os/Parcelable;", "", "a", "b", "()Ljava/lang/Integer;", "", "c", "d", "e", "title", "textContent", "isCloseable", "isInfoVariant", "textAction", "f", "(ILjava/lang/Integer;ZZLjava/lang/Integer;)Lcom/carrefour/fid/android/presentation/ui/orders/online/model/NotificationModel;", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "I", "j", "()I", "Ljava/lang/Integer;", "i", "Z", "k", "()Z", "l", "h", "<init>", "(ILjava/lang/Integer;ZZLjava/lang/Integer;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel */
public final class NotificationModel implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<NotificationModel> CREATOR = new C25225a();

    /* renamed from: f */
    public static final int f62111f = 0;

    /* renamed from: a */
    public final int f62112a;
    @C12580l

    /* renamed from: b */
    public final Integer f62113b;

    /* renamed from: c */
    public final boolean f62114c;

    /* renamed from: d */
    public final boolean f62115d;
    @C12580l

    /* renamed from: e */
    public final Integer f62116e;

    /* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.model.NotificationModel$a */
    public static final class C25225a implements Parcelable.Creator<NotificationModel> {
        @C12579k
        /* renamed from: a */
        public final NotificationModel createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new NotificationModel(readInt, valueOf, z2, z, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @C12579k
        /* renamed from: b */
        public final NotificationModel[] newArray(int i) {
            return new NotificationModel[i];
        }
    }

    public NotificationModel(int i, @C12580l Integer num, boolean z, boolean z2, @C12580l Integer num2) {
        this.f62112a = i;
        this.f62113b = num;
        this.f62114c = z;
        this.f62115d = z2;
        this.f62116e = num2;
    }

    /* renamed from: g */
    public static /* synthetic */ NotificationModel m108990g(NotificationModel notificationModel, int i, Integer num, boolean z, boolean z2, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notificationModel.f62112a;
        }
        if ((i2 & 2) != 0) {
            num = notificationModel.f62113b;
        }
        Integer num3 = num;
        if ((i2 & 4) != 0) {
            z = notificationModel.f62114c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = notificationModel.f62115d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            num2 = notificationModel.f62116e;
        }
        return notificationModel.mo73307f(i, num3, z3, z4, num2);
    }

    /* renamed from: a */
    public final int mo73300a() {
        return this.f62112a;
    }

    @C12580l
    /* renamed from: b */
    public final Integer mo73301b() {
        return this.f62113b;
    }

    /* renamed from: c */
    public final boolean mo73302c() {
        return this.f62114c;
    }

    /* renamed from: d */
    public final boolean mo73303d() {
        return this.f62115d;
    }

    public int describeContents() {
        return 0;
    }

    @C12580l
    /* renamed from: e */
    public final Integer mo73305e() {
        return this.f62116e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationModel)) {
            return false;
        }
        NotificationModel notificationModel = (NotificationModel) obj;
        return this.f62112a == notificationModel.f62112a && Intrinsics.areEqual((Object) this.f62113b, (Object) notificationModel.f62113b) && this.f62114c == notificationModel.f62114c && this.f62115d == notificationModel.f62115d && Intrinsics.areEqual((Object) this.f62116e, (Object) notificationModel.f62116e);
    }

    @C12579k
    /* renamed from: f */
    public final NotificationModel mo73307f(int i, @C12580l Integer num, boolean z, boolean z2, @C12580l Integer num2) {
        return new NotificationModel(i, num, z, z2, num2);
    }

    @C12580l
    /* renamed from: h */
    public final Integer mo73308h() {
        return this.f62116e;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f62112a) * 31;
        Integer num = this.f62113b;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f62114c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f62115d;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Integer num2 = this.f62116e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final Integer mo73310i() {
        return this.f62113b;
    }

    /* renamed from: j */
    public final int mo73311j() {
        return this.f62112a;
    }

    /* renamed from: k */
    public final boolean mo73312k() {
        return this.f62114c;
    }

    /* renamed from: l */
    public final boolean mo73313l() {
        return this.f62115d;
    }

    @C12579k
    public String toString() {
        int i = this.f62112a;
        Integer num = this.f62113b;
        boolean z = this.f62114c;
        boolean z2 = this.f62115d;
        Integer num2 = this.f62116e;
        return "NotificationModel(title=" + i + ", textContent=" + num + ", isCloseable=" + z + ", isInfoVariant=" + z2 + ", textAction=" + num2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.f62112a);
        Integer num = this.f62113b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.f62114c ? 1 : 0);
        parcel.writeInt(this.f62115d ? 1 : 0);
        Integer num2 = this.f62116e;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationModel(int i, Integer num, boolean z, boolean z2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? true : z2, num2);
    }
}
