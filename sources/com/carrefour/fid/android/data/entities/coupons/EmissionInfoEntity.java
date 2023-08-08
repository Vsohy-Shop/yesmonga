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

@C11076d0(mo22515d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/coupons/EmissionInfoEntity;", "Ljava/io/Serializable;", "", "a", "b", "c", "d", "", "e", "transmitterId", "date", "channel", "cardId", "isOffline", "f", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "j", "i", "h", "Z", "l", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class EmissionInfoEntity implements Serializable {

    /* renamed from: a */
    public static final int f90073a = 0;
    @C33608c("card_id")
    @C12579k
    @C33606a
    private final String cardId;
    @C33608c("channel")
    @C12579k
    @C33606a
    private final String channel;
    @C33608c("date")
    @C12579k
    @C33606a
    private final String date;
    @C33608c("is_offline")
    @C33606a
    private final boolean isOffline;
    @C33608c("transmitter_id")
    @C12580l
    @C33606a
    private final String transmitterId;

    public EmissionInfoEntity() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* renamed from: g */
    public static /* synthetic */ EmissionInfoEntity m149451g(EmissionInfoEntity emissionInfoEntity, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emissionInfoEntity.transmitterId;
        }
        if ((i & 2) != 0) {
            str2 = emissionInfoEntity.date;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = emissionInfoEntity.channel;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = emissionInfoEntity.cardId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = emissionInfoEntity.isOffline;
        }
        return emissionInfoEntity.mo110941f(str, str5, str6, str7, z);
    }

    @C12580l
    /* renamed from: a */
    public final String mo110935a() {
        return this.transmitterId;
    }

    @C12579k
    /* renamed from: b */
    public final String mo110936b() {
        return this.date;
    }

    @C12579k
    /* renamed from: c */
    public final String mo110937c() {
        return this.channel;
    }

    @C12579k
    /* renamed from: d */
    public final String mo110938d() {
        return this.cardId;
    }

    /* renamed from: e */
    public final boolean mo110939e() {
        return this.isOffline;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmissionInfoEntity)) {
            return false;
        }
        EmissionInfoEntity emissionInfoEntity = (EmissionInfoEntity) obj;
        return Intrinsics.areEqual((Object) this.transmitterId, (Object) emissionInfoEntity.transmitterId) && Intrinsics.areEqual((Object) this.date, (Object) emissionInfoEntity.date) && Intrinsics.areEqual((Object) this.channel, (Object) emissionInfoEntity.channel) && Intrinsics.areEqual((Object) this.cardId, (Object) emissionInfoEntity.cardId) && this.isOffline == emissionInfoEntity.isOffline;
    }

    @C12579k
    /* renamed from: f */
    public final EmissionInfoEntity mo110941f(@C12580l String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "date");
        Intrinsics.checkNotNullParameter(str3, "channel");
        Intrinsics.checkNotNullParameter(str4, "cardId");
        return new EmissionInfoEntity(str, str2, str3, str4, z);
    }

    @C12579k
    /* renamed from: h */
    public final String mo110942h() {
        return this.cardId;
    }

    public int hashCode() {
        String str = this.transmitterId;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.date.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.cardId.hashCode()) * 31;
        boolean z = this.isOffline;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    @C12579k
    /* renamed from: i */
    public final String mo110944i() {
        return this.channel;
    }

    @C12579k
    /* renamed from: j */
    public final String mo110945j() {
        return this.date;
    }

    @C12580l
    /* renamed from: k */
    public final String mo110946k() {
        return this.transmitterId;
    }

    /* renamed from: l */
    public final boolean mo110947l() {
        return this.isOffline;
    }

    @C12579k
    public String toString() {
        String str = this.transmitterId;
        String str2 = this.date;
        String str3 = this.channel;
        String str4 = this.cardId;
        boolean z = this.isOffline;
        return "EmissionInfoEntity(transmitterId=" + str + ", date=" + str2 + ", channel=" + str3 + ", cardId=" + str4 + ", isOffline=" + z + ")";
    }

    public EmissionInfoEntity(@C12580l String str, @C12579k String str2, @C12579k String str3, @C12579k String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "date");
        Intrinsics.checkNotNullParameter(str3, "channel");
        Intrinsics.checkNotNullParameter(str4, "cardId");
        this.transmitterId = str;
        this.date = str2;
        this.channel = str3;
        this.cardId = str4;
        this.isOffline = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EmissionInfoEntity(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000e
            java.lang.String r5 = new java.lang.String
            r5.<init>()
        L_0x000e:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0018
            java.lang.String r6 = new java.lang.String
            r6.<init>()
        L_0x0018:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0022
            java.lang.String r7 = new java.lang.String
            r7.<init>()
        L_0x0022:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0028
            r8 = 0
        L_0x0028:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.entities.coupons.EmissionInfoEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
