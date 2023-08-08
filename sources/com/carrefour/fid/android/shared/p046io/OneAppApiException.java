package com.carrefour.fid.android.shared.p046io;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0017\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0002\u0019$B\u0007¢\u0006\u0004\b \u0010!B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010\u0010B\u001d\b\u0016\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/OneAppApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "networkCode", "Lkotlin/d2;", "i", "Lokhttp3/ResponseBody;", "error", "e", "", "exceptionCode", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "h", "(Ljava/lang/Object;)V", "exceptionCodeValue", "I", "d", "()I", "j", "(I)V", "errorBody", "Lokhttp3/ResponseBody;", "a", "()Lokhttp3/ResponseBody;", "f", "(Lokhttp3/ResponseBody;)V", "errorCode", "b", "g", "<init>", "()V", "httpErrorCode", "(ILokhttp3/ResponseBody;)V", "OneAppApiExceptionCode", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.io.OneAppApiException */
public class OneAppApiException extends Exception {

    /* renamed from: E0 */
    public static final int f70504E0 = 100;

    /* renamed from: F0 */
    public static final int f70505F0 = 6666;

    /* renamed from: G0 */
    public static final int f70506G0 = 123;

    /* renamed from: H0 */
    public static final int f70507H0 = 124;

    /* renamed from: I0 */
    public static final int f70508I0 = 602;

    /* renamed from: J0 */
    public static final int f70509J0 = 603;

    /* renamed from: K0 */
    public static final int f70510K0 = 3;

    /* renamed from: L0 */
    public static final int f70511L0 = 127;

    /* renamed from: M0 */
    public static final int f70512M0 = 900;

    /* renamed from: X */
    public static final int f70513X = 1014;

    /* renamed from: Y */
    public static final int f70514Y = 1005;

    /* renamed from: Z */
    public static final int f70515Z = 1004;
    @C12579k

    /* renamed from: a */
    public static final C28791a f70516a = new C28791a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final int f70517b = 8;

    /* renamed from: c */
    public static final int f70518c = 400;

    /* renamed from: d */
    public static final int f70519d = 401;

    /* renamed from: e */
    public static final int f70520e = 403;

    /* renamed from: f */
    public static final int f70521f = 404;

    /* renamed from: g */
    public static final int f70522g = 409;

    /* renamed from: v */
    public static final int f70523v = 500;

    /* renamed from: w */
    public static final int f70524w = 502;

    /* renamed from: x */
    public static final int f70525x = 503;

    /* renamed from: y */
    public static final int f70526y = 204;

    /* renamed from: z */
    public static final int f70527z = 1001;
    @C12580l
    private ResponseBody errorBody;
    private int errorCode;
    @C12580l
    private Object exceptionCode;
    private int exceptionCodeValue;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001a\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, mo22516d2 = {"Lcom/carrefour/fid/android/shared/io/OneAppApiException$OneAppApiExceptionCode;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "v", "w", "x", "y", "z", "X", "Y", "Z", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.shared.io.OneAppApiException$OneAppApiExceptionCode */
    public enum OneAppApiExceptionCode {
        NetworkError,
        BadRequestError,
        ForbiddenAccessError,
        AuthenticationFailure,
        ServerNotResponding,
        BadGetaway,
        DBError,
        ServiceInitError,
        EmptyResponse,
        Conflict,
        NotFound,
        ParameterMissing,
        RunTimeException,
        IncorrectCard,
        CompteInactif,
        CardMediaError,
        InvalidCard,
        FidNotFound,
        SuccessCreateCard,
        BlockedCard,
        MidFidOtpError,
        SecretCodeNotSecured,
        BalanceError
    }

    /* renamed from: com.carrefour.fid.android.shared.io.OneAppApiException$a */
    public static final class C28791a {
        public /* synthetic */ C28791a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C28791a() {
        }
    }

    public OneAppApiException() {
        this.exceptionCodeValue = f70505F0;
    }

    @C12580l
    /* renamed from: a */
    public ResponseBody mo83798a() {
        return this.errorBody;
    }

    /* renamed from: b */
    public int mo83799b() {
        return this.errorCode;
    }

    @C12580l
    /* renamed from: c */
    public Object mo83800c() {
        return this.exceptionCode;
    }

    /* renamed from: d */
    public int mo83801d() {
        return this.exceptionCodeValue;
    }

    /* renamed from: e */
    public final void mo83802e(ResponseBody responseBody) {
        mo83803f(responseBody);
    }

    /* renamed from: f */
    public void mo83803f(@C12580l ResponseBody responseBody) {
        this.errorBody = responseBody;
    }

    /* renamed from: g */
    public void mo83804g(int i) {
        this.errorCode = i;
    }

    /* renamed from: h */
    public void mo83805h(@C12580l Object obj) {
        this.exceptionCode = obj;
    }

    /* renamed from: i */
    public final void mo83806i(int i) {
        if (i == 3) {
            mo83805h(OneAppApiExceptionCode.FidNotFound);
        } else if (i == 100) {
            mo83805h(OneAppApiExceptionCode.InvalidCard);
        } else if (i == 127) {
            mo83805h(OneAppApiExceptionCode.BalanceError);
        } else if (i == 204) {
            mo83805h(OneAppApiExceptionCode.EmptyResponse);
        } else if (i != 409) {
            if (i != 500) {
                if (i == 900) {
                    mo83805h(OneAppApiExceptionCode.SuccessCreateCard);
                } else if (i == 1001 || i == 1014) {
                    mo83805h(OneAppApiExceptionCode.IncorrectCard);
                } else if (i == 123) {
                    mo83805h(OneAppApiExceptionCode.BlockedCard);
                } else if (i == 124) {
                    mo83805h(OneAppApiExceptionCode.InvalidCard);
                } else if (i == 400) {
                    mo83805h(OneAppApiExceptionCode.BadRequestError);
                } else if (i == 401) {
                    mo83805h(OneAppApiExceptionCode.AuthenticationFailure);
                } else if (i == 403) {
                    mo83805h(OneAppApiExceptionCode.ForbiddenAccessError);
                } else if (i == 404) {
                    mo83805h(OneAppApiExceptionCode.NotFound);
                } else if (i == 502) {
                    mo83805h(OneAppApiExceptionCode.BadGetaway);
                } else if (i != 503) {
                    if (i == 602) {
                        mo83805h(OneAppApiExceptionCode.MidFidOtpError);
                    } else if (i == 603) {
                        mo83805h(OneAppApiExceptionCode.SecretCodeNotSecured);
                    } else if (i == 1004) {
                        mo83805h(OneAppApiExceptionCode.CardMediaError);
                    } else if (i == 1005) {
                        mo83805h(OneAppApiExceptionCode.CompteInactif);
                    }
                }
            }
            mo83805h(OneAppApiExceptionCode.ServerNotResponding);
        } else {
            mo83805h(OneAppApiExceptionCode.Conflict);
        }
        mo83807j(i);
    }

    /* renamed from: j */
    public void mo83807j(int i) {
        this.exceptionCodeValue = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OneAppApiException(@C12579k Object obj) {
        this();
        Intrinsics.checkNotNullParameter(obj, "exceptionCode");
        mo83805h(obj);
    }

    public OneAppApiException(int i, @C12580l ResponseBody responseBody) {
        this();
        mo83806i(i);
        mo83802e(responseBody);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OneAppApiException(int i, ResponseBody responseBody, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : responseBody);
    }
}
