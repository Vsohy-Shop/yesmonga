package com.carrefour.fid.android.loyalty.presentation.models;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/presentation/models/TransactionModel;", "", "id", "", "creationDate", "amount", "", "cardId", "canal", "storeId", "cashRegister", "status", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getCanal", "()Ljava/lang/String;", "getCardId", "getCashRegister", "getCreationDate", "getId", "getStatus", "getStoreId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class TransactionModel {
    private final double amount;
    @C12579k
    private final String canal;
    @C12579k
    private final String cardId;
    @C12579k
    private final String cashRegister;
    @C12579k
    private final String creationDate;
    @C12579k

    /* renamed from: id */
    private final String f97020id;
    @C12579k
    private final String status;
    @C12579k
    private final String storeId;

    public TransactionModel(@C12579k String str, @C12579k String str2, double d, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "creationDate");
        Intrinsics.checkNotNullParameter(str3, "cardId");
        Intrinsics.checkNotNullParameter(str4, C28534f.f69160j);
        Intrinsics.checkNotNullParameter(str5, "storeId");
        Intrinsics.checkNotNullParameter(str6, "cashRegister");
        Intrinsics.checkNotNullParameter(str7, "status");
        this.f97020id = str;
        this.creationDate = str2;
        this.amount = d;
        this.cardId = str3;
        this.canal = str4;
        this.storeId = str5;
        this.cashRegister = str6;
        this.status = str7;
    }

    public static /* synthetic */ TransactionModel copy$default(TransactionModel transactionModel, String str, String str2, double d, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        TransactionModel transactionModel2 = transactionModel;
        int i2 = i;
        return transactionModel.copy((i2 & 1) != 0 ? transactionModel2.f97020id : str, (i2 & 2) != 0 ? transactionModel2.creationDate : str2, (i2 & 4) != 0 ? transactionModel2.amount : d, (i2 & 8) != 0 ? transactionModel2.cardId : str3, (i2 & 16) != 0 ? transactionModel2.canal : str4, (i2 & 32) != 0 ? transactionModel2.storeId : str5, (i2 & 64) != 0 ? transactionModel2.cashRegister : str6, (i2 & 128) != 0 ? transactionModel2.status : str7);
    }

    @C12579k
    public final String component1() {
        return this.f97020id;
    }

    @C12579k
    public final String component2() {
        return this.creationDate;
    }

    public final double component3() {
        return this.amount;
    }

    @C12579k
    public final String component4() {
        return this.cardId;
    }

    @C12579k
    public final String component5() {
        return this.canal;
    }

    @C12579k
    public final String component6() {
        return this.storeId;
    }

    @C12579k
    public final String component7() {
        return this.cashRegister;
    }

    @C12579k
    public final String component8() {
        return this.status;
    }

    @C12579k
    public final TransactionModel copy(@C12579k String str, @C12579k String str2, double d, @C12579k String str3, @C12579k String str4, @C12579k String str5, @C12579k String str6, @C12579k String str7) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "creationDate");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "cardId");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, C28534f.f69160j);
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "storeId");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "cashRegister");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "status");
        return new TransactionModel(str, str2, d, str8, str9, str10, str11, str12);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionModel)) {
            return false;
        }
        TransactionModel transactionModel = (TransactionModel) obj;
        return Intrinsics.areEqual((Object) this.f97020id, (Object) transactionModel.f97020id) && Intrinsics.areEqual((Object) this.creationDate, (Object) transactionModel.creationDate) && Double.compare(this.amount, transactionModel.amount) == 0 && Intrinsics.areEqual((Object) this.cardId, (Object) transactionModel.cardId) && Intrinsics.areEqual((Object) this.canal, (Object) transactionModel.canal) && Intrinsics.areEqual((Object) this.storeId, (Object) transactionModel.storeId) && Intrinsics.areEqual((Object) this.cashRegister, (Object) transactionModel.cashRegister) && Intrinsics.areEqual((Object) this.status, (Object) transactionModel.status);
    }

    public final double getAmount() {
        return this.amount;
    }

    @C12579k
    public final String getCanal() {
        return this.canal;
    }

    @C12579k
    public final String getCardId() {
        return this.cardId;
    }

    @C12579k
    public final String getCashRegister() {
        return this.cashRegister;
    }

    @C12579k
    public final String getCreationDate() {
        return this.creationDate;
    }

    @C12579k
    public final String getId() {
        return this.f97020id;
    }

    @C12579k
    public final String getStatus() {
        return this.status;
    }

    @C12579k
    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return (((((((((((((this.f97020id.hashCode() * 31) + this.creationDate.hashCode()) * 31) + Double.hashCode(this.amount)) * 31) + this.cardId.hashCode()) * 31) + this.canal.hashCode()) * 31) + this.storeId.hashCode()) * 31) + this.cashRegister.hashCode()) * 31) + this.status.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.f97020id;
        String str2 = this.creationDate;
        double d = this.amount;
        String str3 = this.cardId;
        String str4 = this.canal;
        String str5 = this.storeId;
        String str6 = this.cashRegister;
        String str7 = this.status;
        return "TransactionModel(id=" + str + ", creationDate=" + str2 + ", amount=" + d + ", cardId=" + str3 + ", canal=" + str4 + ", storeId=" + str5 + ", cashRegister=" + str6 + ", status=" + str7 + ")";
    }
}
