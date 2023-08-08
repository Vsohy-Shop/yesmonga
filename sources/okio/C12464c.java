package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "changed in Okio 2.x")
/* renamed from: okio.c */
public final class C12464c {
    @C12579k

    /* renamed from: a */
    public static final C12464c f30401a = new C12464c();

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @C12579k
    /* renamed from: a */
    public final C12506n0 mo27179a(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return C12465c0.m50478a(file);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @C12579k
    /* renamed from: b */
    public final C12506n0 mo27180b() {
        return C12465c0.m50479b();
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @C12579k
    /* renamed from: c */
    public final C12505n mo27181c(@C12579k C12506n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "sink");
        return C12465c0.m50480c(n0Var);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "source.buffer()", imports = {"okio.buffer"}))
    @C12579k
    /* renamed from: d */
    public final C12507o mo27182d(@C12579k C12510p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "source");
        return C12465c0.m50481d(p0Var);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "file.sink()", imports = {"okio.sink"}))
    @C12579k
    /* renamed from: e */
    public final C12506n0 mo27183e(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return C12467d0.m50517p(file, false, 1, (Object) null);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @C12579k
    /* renamed from: f */
    public final C12506n0 mo27184f(@C12579k OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return C12465c0.m50491n(outputStream);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "socket.sink()", imports = {"okio.sink"}))
    @C12579k
    /* renamed from: g */
    public final C12506n0 mo27185g(@C12579k Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return C12465c0.m50492o(socket);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @C12579k
    /* renamed from: h */
    public final C12506n0 mo27186h(@C12579k Path path, @C12579k OpenOption... openOptionArr) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return C12465c0.m50493p(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "file.source()", imports = {"okio.source"}))
    @C12579k
    /* renamed from: i */
    public final C12510p0 mo27187i(@C12579k File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return C12465c0.m50495r(file);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "inputStream.source()", imports = {"okio.source"}))
    @C12579k
    /* renamed from: j */
    public final C12510p0 mo27188j(@C12579k InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return C12465c0.m50496s(inputStream);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "socket.source()", imports = {"okio.source"}))
    @C12579k
    /* renamed from: k */
    public final C12510p0 mo27189k(@C12579k Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        return C12465c0.m50497t(socket);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @C11587t0(expression = "path.source(*options)", imports = {"okio.source"}))
    @C12579k
    /* renamed from: l */
    public final C12510p0 mo27190l(@C12579k Path path, @C12579k OpenOption... openOptionArr) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return C12465c0.m50498u(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}
