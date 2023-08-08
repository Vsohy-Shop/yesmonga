package retrofit2;

import java.io.IOException;
import okhttp3.Request;
import okio.C12516r0;

/* renamed from: retrofit2.b */
public interface C12983b<T> extends Cloneable {
    void cancel();

    C12983b<T> clone();

    C13091w<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    /* renamed from: k1 */
    void mo30458k1(C13008d<T> dVar);

    Request request();

    C12516r0 timeout();
}
