package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import okio.C12500m;
import okio.C12506n0;
import okio.C12521t;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, mo22516d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/t;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/d2;", "write", "flush", "close", "", "hasErrors", "Z", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lkotlin/jvm/functions/l;", "getOnException", "()Lkotlin/jvm/functions/l;", "Lokio/n0;", "delegate", "<init>", "(Lokio/n0;Lkotlin/jvm/functions/l;)V", "okhttp"}, mo22517k = 1, mo22518mv = {1, 4, 0})
public class FaultHidingSink extends C12521t {
    private boolean hasErrors;
    @C12579k
    private final C11300l<IOException, C11079d2> onException;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(@C12579k C12506n0 n0Var, @C12579k C11300l<? super IOException, C11079d2> lVar) {
        super(n0Var);
        Intrinsics.checkNotNullParameter(n0Var, "delegate");
        Intrinsics.checkNotNullParameter(lVar, "onException");
        this.onException = lVar;
    }

    public void close() {
        if (!this.hasErrors) {
            try {
                super.close();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    public void flush() {
        if (!this.hasErrors) {
            try {
                super.flush();
            } catch (IOException e) {
                this.hasErrors = true;
                this.onException.invoke(e);
            }
        }
    }

    @C12579k
    public final C11300l<IOException, C11079d2> getOnException() {
        return this.onException;
    }

    public void write(@C12579k C12500m mVar, long j) {
        Intrinsics.checkNotNullParameter(mVar, "source");
        if (this.hasErrors) {
            mVar.skip(j);
            return;
        }
        try {
            super.write(mVar, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
