package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.io.Serializable;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/StorePetrolInfoPojo;", "Ljava/io/Serializable;", "()V", "dateOfSave", "", "getDateOfSave", "()J", "setDateOfSave", "(J)V", "gasStation", "Lcom/carrefour/fid/android/cms/data/entities/GasStation;", "getGasStation", "()Lcom/carrefour/fid/android/cms/data/entities/GasStation;", "setGasStation", "(Lcom/carrefour/fid/android/cms/data/entities/GasStation;)V", "id", "getId", "setId", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public class StorePetrolInfoPojo implements Serializable {
    private long dateOfSave;
    @C33608c("gas_station")
    @C12580l
    private GasStation gasStation;

    /* renamed from: id */
    private long f102040id;

    public final long getDateOfSave() {
        return this.dateOfSave;
    }

    @C12580l
    public final GasStation getGasStation() {
        return this.gasStation;
    }

    public final long getId() {
        return this.f102040id;
    }

    public final void setDateOfSave(long j) {
        this.dateOfSave = j;
    }

    public final void setGasStation(@C12580l GasStation gasStation2) {
        this.gasStation = gasStation2;
    }

    public final void setId(long j) {
        this.f102040id = j;
    }
}
