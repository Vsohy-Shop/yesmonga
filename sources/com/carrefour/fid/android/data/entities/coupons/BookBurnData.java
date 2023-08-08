package com.carrefour.fid.android.data.entities.coupons;

import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33606a;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\b¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;", "Ljava/io/Serializable;", "", "a", "b", "c", "", "d", "()Ljava/lang/Boolean;", "burnedDate", "channel", "cardId", "isOffline", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/data/entities/coupons/BookBurnData;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "i", "h", "Ljava/lang/Boolean;", "j", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class BookBurnData implements Serializable {

    /* renamed from: a */
    public static final int f90067a = 0;
    @C33608c("date")
    @C12580l
    @C33606a
    private final String burnedDate;
    @C33608c("card_id")
    @C12580l
    @C33606a
    private final String cardId;
    @C33608c("channel")
    @C12580l
    @C33606a
    private final String channel;
    @C33608c("is_offline")
    @C12580l
    @C33606a
    private final Boolean isOffline;

    public BookBurnData() {
        this((String) null, (String) null, (String) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: f */
    public static /* synthetic */ BookBurnData m149383f(BookBurnData bookBurnData, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bookBurnData.burnedDate;
        }
        if ((i & 2) != 0) {
            str2 = bookBurnData.channel;
        }
        if ((i & 4) != 0) {
            str3 = bookBurnData.cardId;
        }
        if ((i & 8) != 0) {
            bool = bookBurnData.isOffline;
        }
        return bookBurnData.mo110863e(str, str2, str3, bool);
    }

    @C12580l
    /* renamed from: a */
    public final String mo110859a() {
        return this.burnedDate;
    }

    @C12580l
    /* renamed from: b */
    public final String mo110860b() {
        return this.channel;
    }

    @C12580l
    /* renamed from: c */
    public final String mo110861c() {
        return this.cardId;
    }

    @C12580l
    /* renamed from: d */
    public final Boolean mo110862d() {
        return this.isOffline;
    }

    @C12579k
    /* renamed from: e */
    public final BookBurnData mo110863e(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Boolean bool) {
        return new BookBurnData(str, str2, str3, bool);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookBurnData)) {
            return false;
        }
        BookBurnData bookBurnData = (BookBurnData) obj;
        return Intrinsics.areEqual((Object) this.burnedDate, (Object) bookBurnData.burnedDate) && Intrinsics.areEqual((Object) this.channel, (Object) bookBurnData.channel) && Intrinsics.areEqual((Object) this.cardId, (Object) bookBurnData.cardId) && Intrinsics.areEqual((Object) this.isOffline, (Object) bookBurnData.isOffline);
    }

    @C12580l
    /* renamed from: g */
    public final String mo110865g() {
        return this.burnedDate;
    }

    @C12580l
    /* renamed from: h */
    public final String mo110866h() {
        return this.cardId;
    }

    public int hashCode() {
        String str = this.burnedDate;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isOffline;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    @C12580l
    /* renamed from: i */
    public final String mo110868i() {
        return this.channel;
    }

    @C12580l
    /* renamed from: j */
    public final Boolean mo110869j() {
        return this.isOffline;
    }

    @C12579k
    public String toString() {
        String str = this.burnedDate;
        String str2 = this.channel;
        String str3 = this.cardId;
        Boolean bool = this.isOffline;
        return "BookBurnData(burnedDate=" + str + ", channel=" + str2 + ", cardId=" + str3 + ", isOffline=" + bool + ")";
    }

    public BookBurnData(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l Boolean bool) {
        this.burnedDate = str;
        this.channel = str2;
        this.cardId = str3;
        this.isOffline = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BookBurnData(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
