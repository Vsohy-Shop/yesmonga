package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/OffersListException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorCode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/carrefour/fid/android/domain/models/OffersListExceptionTitle;", "errorTitle$delegate", "Lkotlin/z;", "c", "()Lcom/carrefour/fid/android/domain/models/OffersListExceptionTitle;", "errorTitle", "Lcom/carrefour/fid/android/domain/models/OffersListExceptionMessage;", "errorMessage$delegate", "b", "()Lcom/carrefour/fid/android/domain/models/OffersListExceptionMessage;", "errorMessage", "<init>", "(Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class OffersListException extends Exception {

    /* renamed from: a */
    public static final int f95224a = 8;
    @C12580l
    private final String errorCode;
    @C12579k
    private final C11677z errorMessage$delegate;
    @C12579k
    private final C11677z errorTitle$delegate;

    public OffersListException() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    @C12580l
    /* renamed from: a */
    public final String mo116086a() {
        return this.errorCode;
    }

    @C12580l
    /* renamed from: b */
    public final OffersListExceptionMessage mo116087b() {
        return (OffersListExceptionMessage) this.errorMessage$delegate.getValue();
    }

    @C12579k
    /* renamed from: c */
    public final OffersListExceptionTitle mo116088c() {
        return (OffersListExceptionTitle) this.errorTitle$delegate.getValue();
    }

    public OffersListException(@C12580l String str) {
        super(str);
        this.errorCode = str;
        this.errorTitle$delegate = C10864b0.m38748c(new OffersListException$errorTitle$2(this));
        this.errorMessage$delegate = C10864b0.m38748c(new OffersListException$errorMessage$2(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersListException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
