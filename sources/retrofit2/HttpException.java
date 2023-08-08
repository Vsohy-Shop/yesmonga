package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final transient C13091w<?> f31971a;
    private final int code;
    private final String message;

    public HttpException(C13091w<?> wVar) {
        super(m56258b(wVar));
        this.code = wVar.mo30573b();
        this.message = wVar.mo30577h();
        this.f31971a = wVar;
    }

    /* renamed from: b */
    public static String m56258b(C13091w<?> wVar) {
        Objects.requireNonNull(wVar, "response == null");
        return "HTTP " + wVar.mo30573b() + " " + wVar.mo30577h();
    }

    /* renamed from: a */
    public int mo30431a() {
        return this.code;
    }

    /* renamed from: c */
    public String mo30432c() {
        return this.message;
    }

    @Nullable
    /* renamed from: d */
    public C13091w<?> mo30433d() {
        return this.f31971a;
    }
}
