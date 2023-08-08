package com.carrefour.fid.android.data.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OHMSlotInfoEntity;", "", "slotId", "", "slotBeginDate", "slotEndDate", "slotCutOff", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSlotBeginDate", "()Ljava/lang/String;", "getSlotCutOff", "getSlotEndDate", "getSlotId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
@C8567o(parameters = 0)
public final class OHMSlotInfoEntity {
    public static final int $stable = 0;
    @C33608c("slot_date_begin")
    @C12579k
    private final String slotBeginDate;
    @C33608c("slot_cut_off")
    @C12579k
    private final String slotCutOff;
    @C33608c("slot_date_end")
    @C12579k
    private final String slotEndDate;
    @C33608c("slot_id")
    @C12579k
    private final String slotId;

    public OHMSlotInfoEntity(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str2, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str3, "slotEndDate");
        Intrinsics.checkNotNullParameter(str4, "slotCutOff");
        this.slotId = str;
        this.slotBeginDate = str2;
        this.slotEndDate = str3;
        this.slotCutOff = str4;
    }

    public static /* synthetic */ OHMSlotInfoEntity copy$default(OHMSlotInfoEntity oHMSlotInfoEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oHMSlotInfoEntity.slotId;
        }
        if ((i & 2) != 0) {
            str2 = oHMSlotInfoEntity.slotBeginDate;
        }
        if ((i & 4) != 0) {
            str3 = oHMSlotInfoEntity.slotEndDate;
        }
        if ((i & 8) != 0) {
            str4 = oHMSlotInfoEntity.slotCutOff;
        }
        return oHMSlotInfoEntity.copy(str, str2, str3, str4);
    }

    @C12579k
    public final String component1() {
        return this.slotId;
    }

    @C12579k
    public final String component2() {
        return this.slotBeginDate;
    }

    @C12579k
    public final String component3() {
        return this.slotEndDate;
    }

    @C12579k
    public final String component4() {
        return this.slotCutOff;
    }

    @C12579k
    public final OHMSlotInfoEntity copy(@C12579k String str, @C12579k String str2, @C12579k String str3, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69319g);
        Intrinsics.checkNotNullParameter(str2, "slotBeginDate");
        Intrinsics.checkNotNullParameter(str3, "slotEndDate");
        Intrinsics.checkNotNullParameter(str4, "slotCutOff");
        return new OHMSlotInfoEntity(str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OHMSlotInfoEntity)) {
            return false;
        }
        OHMSlotInfoEntity oHMSlotInfoEntity = (OHMSlotInfoEntity) obj;
        return Intrinsics.areEqual((Object) this.slotId, (Object) oHMSlotInfoEntity.slotId) && Intrinsics.areEqual((Object) this.slotBeginDate, (Object) oHMSlotInfoEntity.slotBeginDate) && Intrinsics.areEqual((Object) this.slotEndDate, (Object) oHMSlotInfoEntity.slotEndDate) && Intrinsics.areEqual((Object) this.slotCutOff, (Object) oHMSlotInfoEntity.slotCutOff);
    }

    @C12579k
    public final String getSlotBeginDate() {
        return this.slotBeginDate;
    }

    @C12579k
    public final String getSlotCutOff() {
        return this.slotCutOff;
    }

    @C12579k
    public final String getSlotEndDate() {
        return this.slotEndDate;
    }

    @C12579k
    public final String getSlotId() {
        return this.slotId;
    }

    public int hashCode() {
        return (((((this.slotId.hashCode() * 31) + this.slotBeginDate.hashCode()) * 31) + this.slotEndDate.hashCode()) * 31) + this.slotCutOff.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.slotId;
        String str2 = this.slotBeginDate;
        String str3 = this.slotEndDate;
        String str4 = this.slotCutOff;
        return "OHMSlotInfoEntity(slotId=" + str + ", slotBeginDate=" + str2 + ", slotEndDate=" + str3 + ", slotCutOff=" + str4 + ")";
    }
}
