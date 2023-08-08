package com.carrefour.sslpinning;

import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo22516d2 = {"Lcom/carrefour/sslpinning/CarrefourCertificatePinnerGeneratorException;", "Ljava/lang/Exception;", "", "details", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sslpinning_release"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public final class CarrefourCertificatePinnerGeneratorException extends Exception {
    @C12580l
    private final String details;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CarrefourCertificatePinnerGeneratorException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    @C12580l
    /* renamed from: a */
    public final String mo67310a() {
        return this.details;
    }

    public CarrefourCertificatePinnerGeneratorException(@C12579k String str, @C12580l String str2) {
        super(str);
        this.details = str2;
    }
}
